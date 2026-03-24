package com.lolzteam.api.runtime;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
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
