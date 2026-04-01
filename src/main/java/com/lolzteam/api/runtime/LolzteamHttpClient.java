package com.lolzteam.api.runtime;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.deser.BeanDeserializerModifier;
import com.fasterxml.jackson.databind.deser.DeserializationProblemHandler;
import com.fasterxml.jackson.databind.deser.std.DelegatingDeserializer;
import com.fasterxml.jackson.databind.module.SimpleModule;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.net.Authenticator;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public final class LolzteamHttpClient implements Closeable {

  private final String baseUrl;
  private final String token;
  private final RetryConfig retryConfig;
  private final Duration timeout;
  private final Consumer<RetryInfo> onRetry;
  private final RateLimiter rateLimiter;
  private final RateLimiter searchRateLimiter;
  private final HttpClient client;
  private final boolean ownsClient;
  private final ObjectMapper objectMapper;

  public LolzteamHttpClient(ClientConfig config) {
    this(config, null);
  }

  public LolzteamHttpClient(ClientConfig config, HttpClient httpClient) {
    if (config.baseUrl() == null || config.baseUrl().isEmpty()) {
      throw new ConfigException("baseUrl is required");
    }
    this.baseUrl = config.baseUrl().replaceAll("/+$", "");
    this.token = config.token();
    this.retryConfig = config.retry();
    this.timeout = config.timeout();
    this.onRetry = config.onRetry();
    this.rateLimiter =
        config.rateLimit() != null ? new RateLimiter(config.rateLimit().requestsPerMinute()) : null;
    this.searchRateLimiter =
        config.searchRateLimit() != null
            ? new RateLimiter(config.searchRateLimit().requestsPerMinute())
            : null;

    this.objectMapper =
        new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    this.objectMapper.addHandler(new TypeMismatchHandler());
    var safeRecordModule = new SimpleModule("LolzteamSafeRecord");
    safeRecordModule.setDeserializerModifier(new SafeRecordDeserializerModifier());
    this.objectMapper.registerModule(safeRecordModule);

    if (httpClient != null) {
      this.client = httpClient;
      this.ownsClient = false;
    } else {
      var builder =
          HttpClient.newBuilder()
              .version(HttpClient.Version.HTTP_1_1)
              .followRedirects(HttpClient.Redirect.NORMAL);

      if (config.timeout() != null) {
        builder.connectTimeout(config.timeout());
      }

      if (config.proxy() != null) {
        var proxyUri = parseProxyUri(config.proxy().url());
        var scheme = proxyUri.getScheme().toLowerCase();
        if ("socks5".equals(scheme)) {
          var port = proxyUri.getPort() != -1 ? proxyUri.getPort() : 1080;
          var addr = new InetSocketAddress(proxyUri.getHost(), port);
          builder.proxy(
              new ProxySelector() {
                @Override
                public List<Proxy> select(URI uri) {
                  return List.of(new Proxy(Proxy.Type.SOCKS, addr));
                }

                @Override
                public void connectFailed(URI uri, SocketAddress sa, IOException ioe) {
                  // no-op
                }
              });
        } else {
          builder.proxy(
              ProxySelector.of(new InetSocketAddress(proxyUri.getHost(), proxyUri.getPort())));
        }

        var userInfo = proxyUri.getRawUserInfo();
        if (userInfo != null && !userInfo.isEmpty()) {
          var colonIdx = userInfo.indexOf(':');
          var username =
              colonIdx >= 0
                  ? URLDecoder.decode(userInfo.substring(0, colonIdx), StandardCharsets.UTF_8)
                  : URLDecoder.decode(userInfo, StandardCharsets.UTF_8);
          var password =
              colonIdx >= 0
                  ? URLDecoder.decode(userInfo.substring(colonIdx + 1), StandardCharsets.UTF_8)
                      .toCharArray()
                  : new char[0];
          var proxyAuth = new PasswordAuthentication(username, password);
          builder.authenticator(
              new Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                  if (getRequestorType() == RequestorType.PROXY) {
                    return proxyAuth;
                  }
                  return null;
                }
              });
        }
      }

      this.client = builder.build();
      this.ownsClient = true;
    }
  }

  public ObjectMapper objectMapper() {
    return objectMapper;
  }

  /** Execute a request and return the raw response body as a String (for text/html endpoints). */
  public String requestRaw(RequestOptions options) {
    if (rateLimiter != null) {
      rateLimiter.acquire();
    }
    if (options.isSearch() && searchRateLimiter != null) {
      searchRateLimiter.acquire();
    }
    if (retryConfig == null) {
      return executeRaw(options);
    }
    return RetryHandler.withRetry(
        retryConfig, onRetry, options.method(), options.path(), () -> executeRaw(options));
  }

  /**
   * Execute an async request and return the raw response body as a String (for text/html
   * endpoints).
   */
  public CompletableFuture<String> requestRawAsync(RequestOptions options) {
    CompletableFuture<Void> rateLimitFuture =
        rateLimiter != null ? rateLimiter.acquireAsync() : CompletableFuture.completedFuture(null);

    CompletableFuture<Void> searchRateLimitFuture =
        options.isSearch() && searchRateLimiter != null
            ? rateLimitFuture.thenCompose(ignored -> searchRateLimiter.acquireAsync())
            : rateLimitFuture;

    if (retryConfig == null) {
      return searchRateLimitFuture.thenCompose(ignored -> executeRawAsync(options));
    }
    return searchRateLimitFuture.thenCompose(
        ignored ->
            RetryHandler.withRetryAsync(
                retryConfig,
                onRetry,
                options.method(),
                options.path(),
                () -> executeRawAsync(options)));
  }

  public JsonNode request(RequestOptions options) {
    if (rateLimiter != null) {
      rateLimiter.acquire();
    }
    if (options.isSearch() && searchRateLimiter != null) {
      searchRateLimiter.acquire();
    }
    if (retryConfig == null) {
      return execute(options);
    }
    return RetryHandler.withRetry(
        retryConfig, onRetry, options.method(), options.path(), () -> execute(options));
  }

  public CompletableFuture<JsonNode> requestAsync(RequestOptions options) {
    CompletableFuture<Void> rateLimitFuture =
        rateLimiter != null ? rateLimiter.acquireAsync() : CompletableFuture.completedFuture(null);

    CompletableFuture<Void> searchRateLimitFuture =
        options.isSearch() && searchRateLimiter != null
            ? rateLimitFuture.thenCompose(ignored -> searchRateLimiter.acquireAsync())
            : rateLimitFuture;

    if (retryConfig == null) {
      return searchRateLimitFuture.thenCompose(ignored -> executeAsync(options));
    }
    return searchRateLimitFuture.thenCompose(
        ignored ->
            RetryHandler.withRetryAsync(
                retryConfig,
                onRetry,
                options.method(),
                options.path(),
                () -> executeAsync(options)));
  }

  private String executeRaw(RequestOptions options) {
    var httpRequest = buildHttpRequest(options);
    try {
      var response = client.send(httpRequest, HttpResponse.BodyHandlers.ofString());
      return handleRawResponse(response);
    } catch (IOException e) {
      if (isStaleConnection(e)) {
        return retryOnStaleConnection(
            options, HttpResponse.BodyHandlers.ofString(), this::handleRawResponse);
      }
      throw new NetworkException(e);
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new NetworkException(e);
    }
  }

  private CompletableFuture<String> executeRawAsync(RequestOptions options) {
    var httpRequest = buildHttpRequest(options);
    return client
        .sendAsync(httpRequest, HttpResponse.BodyHandlers.ofString())
        .thenApply(this::handleRawResponse)
        .exceptionallyCompose(
            error -> {
              var cause =
                  error instanceof java.util.concurrent.CompletionException
                      ? error.getCause()
                      : error;
              if (cause instanceof LolzteamException) {
                return CompletableFuture.failedFuture(cause);
              }
              return CompletableFuture.failedFuture(new NetworkException(cause));
            });
  }

  private JsonNode execute(RequestOptions options) {
    var httpRequest = buildHttpRequest(options);
    try {
      var response = client.send(httpRequest, HttpResponse.BodyHandlers.ofString());
      return handleResponse(response);
    } catch (IOException e) {
      if (isStaleConnection(e)) {
        return retryOnStaleConnection(
            options, HttpResponse.BodyHandlers.ofString(), this::handleResponse);
      }
      throw new NetworkException(e);
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new NetworkException(e);
    }
  }

  private CompletableFuture<JsonNode> executeAsync(RequestOptions options) {
    var httpRequest = buildHttpRequest(options);
    return client
        .sendAsync(httpRequest, HttpResponse.BodyHandlers.ofString())
        .thenApply(this::handleResponse)
        .exceptionallyCompose(
            error -> {
              var cause =
                  error instanceof java.util.concurrent.CompletionException
                      ? error.getCause()
                      : error;
              if (cause instanceof LolzteamException) {
                return CompletableFuture.failedFuture(cause);
              }
              return CompletableFuture.failedFuture(new NetworkException(cause));
            });
  }

  /**
   * Detects stale connection errors from Java's HttpClient. When the server closes a kept-alive
   * connection and the client tries to reuse it, the HTTP/1.1 header parser receives zero bytes.
   */
  private static boolean isStaleConnection(IOException e) {
    String msg = e.getMessage();
    return msg != null && msg.contains("header parser received no bytes");
  }

  /** Retries a request once after a stale connection error, rebuilding the request fresh. */
  private <T> T retryOnStaleConnection(
      RequestOptions options,
      HttpResponse.BodyHandler<String> handler,
      java.util.function.Function<HttpResponse<String>, T> responseHandler) {
    var retried = buildHttpRequest(options);
    try {
      var response = client.send(retried, handler);
      return responseHandler.apply(response);
    } catch (IOException e2) {
      throw new NetworkException(e2);
    } catch (InterruptedException e2) {
      Thread.currentThread().interrupt();
      throw new NetworkException(e2);
    }
  }

  private HttpRequest buildHttpRequest(RequestOptions options) {
    var url = new StringBuilder(baseUrl).append(options.path());
    var queryString = buildQueryString(options.query());
    if (!queryString.isEmpty()) {
      url.append('?').append(queryString);
    }

    var builder =
        HttpRequest.newBuilder()
            .uri(URI.create(url.toString()))
            .header("Authorization", "Bearer " + token);

    if (timeout != null) {
      builder.timeout(timeout);
    }

    var method = options.method().toUpperCase();
    if ("GET".equals(method)) {
      builder.GET();
    } else if (options.bodyEncoding() == BodyEncoding.MULTIPART) {
      var boundary = UUID.randomUUID().toString();
      builder.header("Content-Type", "multipart/form-data; boundary=" + boundary);
      builder.method(method, buildMultipartBody(options, boundary));
    } else if (options.bodyEncoding() == BodyEncoding.JSON && options.body() != null) {
      builder.header("Content-Type", "application/json");
      try {
        var jsonString = objectMapper.writeValueAsString(options.body());
        builder.method(method, HttpRequest.BodyPublishers.ofString(jsonString));
      } catch (IOException e) {
        throw new NetworkException(e);
      }
    } else if (options.body() != null) {
      builder.header("Content-Type", "application/x-www-form-urlencoded");
      builder.method(method, buildFormBody(options.body()));
    } else {
      builder.method(method, HttpRequest.BodyPublishers.noBody());
    }

    return builder.build();
  }

  private HttpRequest.BodyPublisher buildFormBody(JsonNode body) {
    if (body == null || body.isNull() || !body.isObject()) {
      return HttpRequest.BodyPublishers.noBody();
    }
    var parts = new ArrayList<String>();
    flattenJsonToFormParams(body, parts);
    var formData = String.join("&", parts);
    return HttpRequest.BodyPublishers.ofString(formData);
  }

  private HttpRequest.BodyPublisher buildMultipartBody(RequestOptions options, String boundary) {
    var baos = new ByteArrayOutputStream();
    try {
      if (options.body() != null && options.body().isObject()) {
        var fields = options.body().fields();
        while (fields.hasNext()) {
          var entry = fields.next();
          var key = entry.getKey();
          var value = entry.getValue();
          if (value.isNull()) continue;

          if (value.isArray()) {
            for (var item : value) {
              if (!item.isNull()) {
                writeMultipartField(baos, boundary, key, item.asText());
              }
            }
          } else if (value.isObject()) {
            writeMultipartField(baos, boundary, key, value.toString());
          } else {
            writeMultipartField(baos, boundary, key, value.asText());
          }
        }
      }

      for (var entry : options.byteArrayFields().entrySet()) {
        writeMultipartFile(baos, boundary, entry.getKey(), entry.getValue());
      }

      baos.write(("--" + boundary + "--\r\n").getBytes(StandardCharsets.UTF_8));
    } catch (IOException e) {
      throw new NetworkException(e);
    }

    return HttpRequest.BodyPublishers.ofByteArray(baos.toByteArray());
  }

  private void writeMultipartField(
      ByteArrayOutputStream baos, String boundary, String name, String value) throws IOException {
    var header =
        "--" + boundary + "\r\n" + "Content-Disposition: form-data; name=\"" + name + "\"\r\n\r\n";
    baos.write(header.getBytes(StandardCharsets.UTF_8));
    baos.write(value.getBytes(StandardCharsets.UTF_8));
    baos.write("\r\n".getBytes(StandardCharsets.UTF_8));
  }

  private void writeMultipartFile(
      ByteArrayOutputStream baos, String boundary, String name, byte[] data) throws IOException {
    var header =
        "--"
            + boundary
            + "\r\n"
            + "Content-Disposition: form-data; name=\""
            + name
            + "\"; filename=\""
            + name
            + "\"\r\n"
            + "Content-Type: application/octet-stream\r\n\r\n";
    baos.write(header.getBytes(StandardCharsets.UTF_8));
    baos.write(data);
    baos.write("\r\n".getBytes(StandardCharsets.UTF_8));
  }

  private String handleRawResponse(HttpResponse<String> response) {
    var statusCode = response.statusCode();
    var bodyText = response.body();

    if (statusCode < 200 || statusCode >= 300) {
      throw HttpException.create(statusCode, bodyText, response.headers());
    }

    return bodyText;
  }

  private JsonNode handleResponse(HttpResponse<String> response) {
    var statusCode = response.statusCode();
    var bodyText = response.body();

    if (statusCode < 200 || statusCode >= 300) {
      throw HttpException.create(statusCode, bodyText, response.headers());
    }

    try {
      return objectMapper.readTree(bodyText);
    } catch (IOException e) {
      throw new NetworkException(e);
    }
  }

  private String buildQueryString(JsonNode query) {
    if (query == null || query.isNull() || !query.isObject()) {
      return "";
    }
    var parts = new ArrayList<String>();
    Iterator<Map.Entry<String, JsonNode>> fields = query.fields();
    while (fields.hasNext()) {
      var entry = fields.next();
      appendQueryValue(parts, entry.getKey(), entry.getValue());
    }
    return String.join("&", parts);
  }

  private void appendQueryValue(ArrayList<String> parts, String key, JsonNode value) {
    if (value.isNull()) {
      return;
    }
    if (value.isArray()) {
      for (var item : value) {
        appendQueryValue(parts, key, item);
      }
      return;
    }
    if (value.isObject()) {
      return;
    }
    String str;
    if (value.isBoolean()) {
      str = value.asBoolean() ? "1" : "0";
    } else {
      str = value.asText();
    }
    parts.add(encode(key) + "=" + encode(str));
  }

  private void flattenJsonToFormParams(JsonNode body, ArrayList<String> parts) {
    if (!body.isObject()) return;
    Iterator<Map.Entry<String, JsonNode>> fields = body.fields();
    while (fields.hasNext()) {
      var entry = fields.next();
      var key = entry.getKey();
      var value = entry.getValue();
      if (value.isNull()) continue;
      if (value.isArray()) {
        for (var item : value) {
          if (!item.isNull()) {
            parts.add(encode(key) + "=" + encode(item.asText()));
          }
        }
      } else if (value.isObject()) {
        parts.add(encode(key) + "=" + encode(value.toString()));
      } else if (value.isBoolean()) {
        parts.add(encode(key) + "=" + encode(value.asBoolean() ? "1" : "0"));
      } else {
        parts.add(encode(key) + "=" + encode(value.asText()));
      }
    }
  }

  private static String encode(String value) {
    return URLEncoder.encode(value, StandardCharsets.UTF_8);
  }

  /**
   * Handles type mismatches during deserialization by returning sensible defaults instead of
   * throwing. The Lolzteam API occasionally returns mismatched JSON types (e.g. object where array
   * expected, string where number expected).
   */
  private static final class TypeMismatchHandler extends DeserializationProblemHandler {

    @Override
    public Object handleUnexpectedToken(
        DeserializationContext ctxt,
        JavaType targetType,
        JsonToken t,
        JsonParser p,
        String failureMsg)
        throws IOException {
      p.skipChildren();
      return defaultFor(targetType);
    }

    @Override
    public Object handleWeirdStringValue(
        DeserializationContext ctxt, Class<?> targetType, String valueToConvert, String failureMsg)
        throws IOException {
      return defaultForClass(targetType);
    }

    @Override
    public Object handleWeirdNumberValue(
        DeserializationContext ctxt, Class<?> targetType, Number valueToConvert, String failureMsg)
        throws IOException {
      return defaultForClass(targetType);
    }

    @Override
    public Object handleMissingInstantiator(
        DeserializationContext ctxt,
        Class<?> instClass,
        com.fasterxml.jackson.databind.deser.ValueInstantiator vi,
        JsonParser p,
        String msg)
        throws IOException {
      if (instClass.isRecord()) {
        return NOT_HANDLED;
      }
      p.skipChildren();
      return null;
    }

    private static Object defaultFor(JavaType type) {
      if (type == null) return null;
      return defaultForClass(type.getRawClass());
    }

    private static Object defaultForClass(Class<?> raw) {
      if (raw == null) return null;
      if (raw == boolean.class || raw == Boolean.class) return false;
      if (raw == int.class || raw == Integer.class) return 0;
      if (raw == long.class || raw == Long.class) return 0L;
      if (raw == double.class || raw == Double.class) return 0.0d;
      if (raw == float.class || raw == Float.class) return 0.0f;
      if (raw == String.class) return "";
      if (List.class.isAssignableFrom(raw)) return new ArrayList<>();
      return null;
    }
  }

  /**
   * Wraps record deserializers to catch ClassCastExceptions that occur when the API returns a
   * mismatched type that Jackson coerces but then fails to pass to the record constructor.
   */
  private static final class SafeRecordDeserializerModifier extends BeanDeserializerModifier {

    @Override
    public JsonDeserializer<?> modifyDeserializer(
        DeserializationConfig config, BeanDescription beanDesc, JsonDeserializer<?> deserializer) {
      if (beanDesc.getBeanClass().isRecord()) {
        return new SafeRecordDeserializer(deserializer);
      }
      return deserializer;
    }
  }

  private static final class SafeRecordDeserializer extends DelegatingDeserializer {

    SafeRecordDeserializer(JsonDeserializer<?> delegate) {
      super(delegate);
    }

    @Override
    protected JsonDeserializer<?> newDelegatingInstance(JsonDeserializer<?> newDelegate) {
      return new SafeRecordDeserializer(newDelegate);
    }

    @Override
    public Object deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      try {
        return super.deserialize(p, ctxt);
      } catch (ClassCastException e) {
        try {
          return handledType().getDeclaredConstructor().newInstance();
        } catch (Exception ignored) {
          return ctxt.handleInstantiationProblem(handledType(), null, e);
        }
      }
    }
  }

  private static URI parseProxyUri(String url) {
    URI uri;
    try {
      uri = URI.create(url);
    } catch (IllegalArgumentException e) {
      throw new ConfigException("invalid proxy URL: " + url);
    }
    var scheme = uri.getScheme();
    if (scheme == null
        || (!scheme.equalsIgnoreCase("http")
            && !scheme.equalsIgnoreCase("https")
            && !scheme.equalsIgnoreCase("socks5"))) {
      throw new ConfigException(
          "unsupported proxy scheme: "
              + (scheme != null ? scheme : "<none>")
              + ". Supported schemes: http, https, socks5");
    }
    if (uri.getHost() == null || uri.getHost().isEmpty()) {
      throw new ConfigException("proxy URL has no host");
    }
    return uri;
  }

  @Override
  public void close() {
    if (rateLimiter != null) {
      rateLimiter.shutdown();
    }
    if (searchRateLimiter != null) {
      searchRateLimiter.shutdown();
    }
    // Java 17's HttpClient has no close() method. The internal executor and connection
    // pool will be reclaimed by GC. HttpClient.close() was added in Java 21 (JDK-8304165).
    // When the minimum version is bumped to 21+, add: if (ownsClient) client.close();
  }
}
