package com.lolzteam.api.runtime;

import static org.junit.jupiter.api.Assertions.*;

import java.net.http.HttpHeaders;
import java.time.Duration;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;

class ExceptionTest {

  private static final HttpHeaders EMPTY_HEADERS = HttpHeaders.of(Map.of(), (a, b) -> true);

  @Test
  void httpExceptionFactory429() {
    var ex = HttpException.create(429, "body", EMPTY_HEADERS);
    assertInstanceOf(RateLimitException.class, ex);
    assertEquals(429, ex.statusCode());
  }

  @Test
  void httpExceptionFactory401() {
    var ex = HttpException.create(401, "body", EMPTY_HEADERS);
    assertInstanceOf(AuthException.class, ex);
  }

  @Test
  void httpExceptionFactory404() {
    var ex = HttpException.create(404, "body", EMPTY_HEADERS);
    assertInstanceOf(NotFoundException.class, ex);
  }

  @Test
  void httpExceptionFactory500() {
    var ex = HttpException.create(500, "body", EMPTY_HEADERS);
    assertInstanceOf(ServerException.class, ex);
  }

  @Test
  void httpExceptionFactory418() {
    var ex = HttpException.create(418, "body", EMPTY_HEADERS);
    assertEquals(HttpException.class, ex.getClass());
  }

  @Test
  void rateLimitExceptionParsesRetryAfter() {
    var headers = HttpHeaders.of(Map.of("Retry-After", List.of("30")), (a, b) -> true);
    var ex = new RateLimitException("body", headers);
    assertEquals(Duration.ofSeconds(30), ex.retryAfter());
  }

  @Test
  void rateLimitExceptionNullRetryAfterWhenMissing() {
    var ex = new RateLimitException("body", EMPTY_HEADERS);
    assertNull(ex.retryAfter());
  }

  @Test
  void configExceptionMessage() {
    var ex = new ConfigException("bad config");
    assertEquals("bad config", ex.getMessage());
  }

  @Test
  void networkExceptionWraps() {
    var cause = new java.io.IOException("connection refused");
    var ex = new NetworkException(cause);
    assertEquals("connection refused", ex.getMessage());
    assertEquals(cause, ex.getCause());
  }
}
