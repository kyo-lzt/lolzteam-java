package com.lolzteam.api.runtime;

import java.net.http.HttpHeaders;
import java.time.Duration;

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
			return null;
		}
	}
}
