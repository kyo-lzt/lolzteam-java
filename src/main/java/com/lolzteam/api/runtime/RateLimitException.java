package com.lolzteam.api.runtime;

import java.net.http.HttpHeaders;
import java.time.Duration;
import java.time.Instant;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public final class RateLimitException extends HttpException {

  private final Duration retryAfter;

  public RateLimitException(String responseBody, HttpHeaders headers) {
    super(429, responseBody, headers);
    this.retryAfter = parseRetryAfter(headers);
  }

  public Duration retryAfter() {
    return retryAfter;
  }

  private static Duration parseRetryAfter(HttpHeaders headers) {
    var value = headers.firstValue("Retry-After").orElse(null);
    if (value == null) {
      return null;
    }
    try {
      return Duration.ofSeconds(Long.parseLong(value));
    } catch (NumberFormatException e) {
      try {
        var date = ZonedDateTime.parse(value, DateTimeFormatter.RFC_1123_DATE_TIME);
        var delta = Duration.between(Instant.now(), date.toInstant());
        return delta.isNegative() ? null : delta;
      } catch (Exception ignored) {
        return null;
      }
    }
  }
}
