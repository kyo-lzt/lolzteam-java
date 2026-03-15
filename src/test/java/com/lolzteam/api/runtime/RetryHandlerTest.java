package com.lolzteam.api.runtime;

import org.junit.jupiter.api.Test;

import java.net.http.HttpHeaders;
import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class RetryHandlerTest {

	private static final RetryConfig FAST_RETRY = new RetryConfig(2, Duration.ofMillis(10), Duration.ofMillis(50));
	private static final HttpHeaders EMPTY_HEADERS = HttpHeaders.of(Map.of(), (a, b) -> true);

	@Test
	void retriesOnRateLimitException() {
		var attempts = new AtomicInteger(0);
		var result = RetryHandler.withRetry(FAST_RETRY, () -> {
			if (attempts.incrementAndGet() < 3) {
				throw new RateLimitException("rate limited", EMPTY_HEADERS);
			}
			return "success";
		});
		assertEquals("success", result);
		assertEquals(3, attempts.get());
	}

	@Test
	void retriesOnServerException502() {
		var attempts = new AtomicInteger(0);
		var result = RetryHandler.withRetry(FAST_RETRY, () -> {
			if (attempts.incrementAndGet() < 2) {
				throw new ServerException(502, "bad gateway", EMPTY_HEADERS);
			}
			return "ok";
		});
		assertEquals("ok", result);
		assertEquals(2, attempts.get());
	}

	@Test
	void doesNotRetryOnAuthException() {
		var attempts = new AtomicInteger(0);
		assertThrows(AuthException.class, () ->
			RetryHandler.withRetry(FAST_RETRY, () -> {
				attempts.incrementAndGet();
				throw new AuthException(401, "unauthorized", EMPTY_HEADERS);
			})
		);
		assertEquals(1, attempts.get());
	}

	@Test
	void doesNotRetryOnNotFoundException() {
		var attempts = new AtomicInteger(0);
		assertThrows(NotFoundException.class, () ->
			RetryHandler.withRetry(FAST_RETRY, () -> {
				attempts.incrementAndGet();
				throw new NotFoundException("not found", EMPTY_HEADERS);
			})
		);
		assertEquals(1, attempts.get());
	}

	@Test
	void throwsAfterMaxRetriesExhausted() {
		var attempts = new AtomicInteger(0);
		assertThrows(RateLimitException.class, () ->
			RetryHandler.withRetry(FAST_RETRY, () -> {
				attempts.incrementAndGet();
				throw new RateLimitException("rate limited", EMPTY_HEADERS);
			})
		);
		assertEquals(3, attempts.get()); // initial + 2 retries
	}

	@Test
	void asyncRetries() {
		var attempts = new AtomicInteger(0);
		var future = RetryHandler.withRetryAsync(FAST_RETRY, () -> {
			if (attempts.incrementAndGet() < 3) {
				var f = new java.util.concurrent.CompletableFuture<String>();
				f.completeExceptionally(new RateLimitException("rate limited", EMPTY_HEADERS));
				return f;
			}
			return java.util.concurrent.CompletableFuture.completedFuture("async-ok");
		});
		assertEquals("async-ok", future.join());
		assertEquals(3, attempts.get());
	}
}
