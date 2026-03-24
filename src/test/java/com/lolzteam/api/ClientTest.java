package com.lolzteam.api;

import static org.junit.jupiter.api.Assertions.*;

import com.lolzteam.api.generated.forum.ForumClient;
import com.lolzteam.api.generated.market.MarketClient;
import com.lolzteam.api.runtime.AuthException;
import com.lolzteam.api.runtime.ClientConfig;
import com.lolzteam.api.runtime.LolzteamHttpClient;
import com.lolzteam.api.runtime.NotFoundException;
import com.lolzteam.api.runtime.RateLimitException;
import com.lolzteam.api.runtime.RequestOptions;
import com.lolzteam.api.runtime.RetryConfig;
import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.time.Duration;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ClientTest {

  private HttpServer server;
  private String baseUrl;

  @BeforeEach
  void setUp() throws IOException {
    server = HttpServer.create(new InetSocketAddress(0), 0);
    server.setExecutor(null);
    server.start();
    baseUrl = "http://localhost:" + server.getAddress().getPort();
  }

  @AfterEach
  void tearDown() {
    server.stop(0);
  }

  private static final RetryConfig NO_RETRY =
      new RetryConfig(0, Duration.ofMillis(10), Duration.ofMillis(50));
  private static final RetryConfig FAST_RETRY =
      new RetryConfig(2, Duration.ofMillis(10), Duration.ofMillis(50));

  private LolzteamHttpClient client(String token, RetryConfig retry) {
    return new LolzteamHttpClient(
        ClientConfig.builder(token).baseUrl(baseUrl).retry(retry).build());
  }

  @Test
  void successfulRequestSendsBearerAuth() {
    var capturedAuth = new AtomicReference<String>();
    server.createContext(
        "/test",
        exchange -> {
          capturedAuth.set(exchange.getRequestHeaders().getFirst("Authorization"));
          var body = "{}";
          exchange.getResponseHeaders().add("Content-Type", "application/json");
          exchange.sendResponseHeaders(200, body.length());
          exchange.getResponseBody().write(body.getBytes());
          exchange.close();
        });

    try (var c = client("my-secret-token", NO_RETRY)) {
      c.request(new RequestOptions("GET", "/test"));
      assertEquals("Bearer my-secret-token", capturedAuth.get());
    }
  }

  @Test
  void authException401() {
    server.createContext(
        "/test",
        exchange -> {
          var body = "{\"error\":\"unauthorized\"}";
          exchange.getResponseHeaders().add("Content-Type", "application/json");
          exchange.sendResponseHeaders(401, body.length());
          exchange.getResponseBody().write(body.getBytes());
          exchange.close();
        });

    try (var c = client("t", NO_RETRY)) {
      assertThrows(AuthException.class, () -> c.request(new RequestOptions("GET", "/test")));
    }
  }

  @Test
  void notFoundException404() {
    server.createContext(
        "/test",
        exchange -> {
          var body = "{\"error\":\"not found\"}";
          exchange.getResponseHeaders().add("Content-Type", "application/json");
          exchange.sendResponseHeaders(404, body.length());
          exchange.getResponseBody().write(body.getBytes());
          exchange.close();
        });

    try (var c = client("t", NO_RETRY)) {
      assertThrows(NotFoundException.class, () -> c.request(new RequestOptions("GET", "/test")));
    }
  }

  @Test
  void rateLimitException429() {
    server.createContext(
        "/test",
        exchange -> {
          var body = "{\"error\":\"rate limited\"}";
          exchange.getResponseHeaders().add("Content-Type", "application/json");
          exchange.sendResponseHeaders(429, body.length());
          exchange.getResponseBody().write(body.getBytes());
          exchange.close();
        });

    try (var c = client("t", NO_RETRY)) {
      assertThrows(RateLimitException.class, () -> c.request(new RequestOptions("GET", "/test")));
    }
  }

  @Test
  void retryOn429ThenSuccess() {
    var attempts = new AtomicInteger(0);
    server.createContext(
        "/test",
        exchange -> {
          exchange.getResponseHeaders().add("Content-Type", "application/json");
          if (attempts.incrementAndGet() == 1) {
            exchange.getResponseHeaders().add("Retry-After", "0");
            var body = "{\"error\":\"rate limited\"}";
            exchange.sendResponseHeaders(429, body.length());
            exchange.getResponseBody().write(body.getBytes());
          } else {
            var body = "{\"status\":\"ok\"}";
            exchange.sendResponseHeaders(200, body.length());
            exchange.getResponseBody().write(body.getBytes());
          }
          exchange.close();
        });

    try (var c = client("t", FAST_RETRY)) {
      var result = c.request(new RequestOptions("GET", "/test"));
      assertEquals(2, attempts.get());
      assertTrue(result.toString().contains("ok"));
    }
  }

  @Test
  void retryOn502ThenSuccess() {
    var attempts = new AtomicInteger(0);
    server.createContext(
        "/test",
        exchange -> {
          exchange.getResponseHeaders().add("Content-Type", "application/json");
          if (attempts.incrementAndGet() == 1) {
            var body = "{\"error\":\"bad gateway\"}";
            exchange.sendResponseHeaders(502, body.length());
            exchange.getResponseBody().write(body.getBytes());
          } else {
            var body = "{\"status\":\"ok\"}";
            exchange.sendResponseHeaders(200, body.length());
            exchange.getResponseBody().write(body.getBytes());
          }
          exchange.close();
        });

    try (var c = client("t", FAST_RETRY)) {
      var result = c.request(new RequestOptions("GET", "/test"));
      assertEquals(2, attempts.get());
      assertTrue(result.toString().contains("ok"));
    }
  }

  @Test
  void pathParameterSubstitution() {
    var capturedPath = new AtomicReference<String>();
    server.createContext(
        "/categories/42",
        exchange -> {
          capturedPath.set(exchange.getRequestURI().getPath());
          var body = "{}";
          exchange.getResponseHeaders().add("Content-Type", "application/json");
          exchange.sendResponseHeaders(200, body.length());
          exchange.getResponseBody().write(body.getBytes());
          exchange.close();
        });

    try (var c = client("t", NO_RETRY)) {
      c.request(new RequestOptions("GET", "/categories/42"));
      assertEquals("/categories/42", capturedPath.get());
    }
  }

  @Test
  void forumClientCanBeInstantiated() {
    try (var forum =
        new ForumClient(
            ClientConfig.builder("test-token").baseUrl(baseUrl).retry(NO_RETRY).build())) {
      assertNotNull(forum.categories());
      assertNotNull(forum.forums());
    }
  }

  @Test
  void marketClientCanBeInstantiated() {
    try (var market =
        new MarketClient(
            ClientConfig.builder("test-token").baseUrl(baseUrl).retry(NO_RETRY).build())) {
      assertNotNull(market.category());
      assertNotNull(market.profile());
    }
  }
}
