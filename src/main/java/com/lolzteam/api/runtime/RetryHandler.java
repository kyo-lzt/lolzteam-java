package com.lolzteam.api.runtime;

import java.time.Duration;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.function.Supplier;

public final class RetryHandler {

	private static final ScheduledExecutorService SCHEDULER =
		Executors.newSingleThreadScheduledExecutor(r -> {
			var t = new Thread(r, "lolzteam-retry");
			t.setDaemon(true);
			return t;
		});

	private RetryHandler() {
	}

	public static <T> T withRetry(
		RetryConfig config,
		Consumer<RetryInfo> onRetry,
		String method,
		String path,
		Callable<T> block
	) {
		Throwable lastError = null;
		for (int attempt = 0; attempt <= config.maxRetries(); attempt++) {
			try {
				return block.call();
			} catch (Exception e) {
				lastError = e;
				if (!isRetryable(e) || attempt == config.maxRetries()) {
					if (e instanceof RuntimeException re) {
						throw re;
					}
					throw new RuntimeException(e);
				}
				long delayMs = computeDelay(attempt, config, e);
				if (onRetry != null && e instanceof LolzteamException le) {
					onRetry.accept(new RetryInfo(attempt + 1, Duration.ofMillis(delayMs), le, method, path));
				}
				try {
					Thread.sleep(delayMs);
				} catch (InterruptedException ie) {
					Thread.currentThread().interrupt();
					throw new RuntimeException("Retry interrupted", ie);
				}
			}
		}
		if (lastError instanceof RuntimeException re) {
			throw re;
		}
		throw new RuntimeException(lastError);
	}

	public static <T> CompletableFuture<T> withRetryAsync(
		RetryConfig config,
		Consumer<RetryInfo> onRetry,
		String method,
		String path,
		Supplier<CompletableFuture<T>> block
	) {
		return retryAttempt(config, onRetry, method, path, block, 0);
	}

	private static <T> CompletableFuture<T> retryAttempt(
		RetryConfig config,
		Consumer<RetryInfo> onRetry,
		String method,
		String path,
		Supplier<CompletableFuture<T>> block,
		int attempt
	) {
		return block.get().exceptionallyCompose(error -> {
			var cause = unwrap(error);
			if (!isRetryable(cause) || attempt >= config.maxRetries()) {
				return CompletableFuture.failedFuture(cause);
			}
			long delayMs = computeDelay(attempt, config, cause);
			if (onRetry != null && cause instanceof LolzteamException le) {
				onRetry.accept(new RetryInfo(attempt + 1, Duration.ofMillis(delayMs), le, method, path));
			}
			var delayed = new CompletableFuture<T>();
			SCHEDULER.schedule(
				() -> retryAttempt(config, onRetry, method, path, block, attempt + 1)
					.whenComplete((result, ex) -> {
						if (ex != null) {
							delayed.completeExceptionally(unwrap(ex));
						} else {
							delayed.complete(result);
						}
					}),
				delayMs,
				TimeUnit.MILLISECONDS
			);
			return delayed;
		});
	}

	private static boolean isRetryable(Throwable error) {
		if (error instanceof RateLimitException) {
			return true;
		}
		if (error instanceof ServerException se) {
			return se.statusCode() == 502 || se.statusCode() == 503 || se.statusCode() == 504;
		}
		if (error instanceof NetworkException ne && ne.isTransient()) {
			return true;
		}
		return false;
	}

	private static long computeDelay(int attempt, RetryConfig config, Throwable error) {
		if (error instanceof RateLimitException rle && rle.retryAfter() != null) {
			return Math.min(rle.retryAfter().toMillis(), config.maxDelay().toMillis());
		}
		long exponential = config.baseDelay().toMillis() * (1L << attempt);
		long jitter = (long) (ThreadLocalRandom.current().nextDouble() * config.baseDelay().toMillis());
		return Math.min(exponential + jitter, config.maxDelay().toMillis());
	}

	private static Throwable unwrap(Throwable t) {
		if (t instanceof java.util.concurrent.CompletionException ce && ce.getCause() != null) {
			return ce.getCause();
		}
		return t;
	}
}
