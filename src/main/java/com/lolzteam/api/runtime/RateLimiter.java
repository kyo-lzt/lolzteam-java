package com.lolzteam.api.runtime;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class RateLimiter {

	private final double maxTokens;
	private final double refillRate;
	private double tokens;
	private long lastRefill;
	private final ScheduledExecutorService scheduler;

	public RateLimiter(int requestsPerMinute) {
		this.maxTokens = requestsPerMinute;
		this.refillRate = requestsPerMinute / 60_000.0;
		this.tokens = maxTokens;
		this.lastRefill = System.currentTimeMillis();
		this.scheduler = Executors.newSingleThreadScheduledExecutor(r -> {
			var t = new Thread(r, "lolzteam-rate-limiter");
			t.setDaemon(true);
			return t;
		});
	}

	public void acquire() {
		synchronized (this) {
			refill();
			while (tokens < 1.0) {
				long waitMs = (long) Math.ceil((1.0 - tokens) / refillRate);
				try {
					wait(waitMs);
				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
					throw new NetworkException("Rate limiter interrupted", e);
				}
				refill();
			}
			tokens -= 1.0;
		}
	}

	public CompletableFuture<Void> acquireAsync() {
		synchronized (this) {
			refill();
			if (tokens >= 1.0) {
				tokens -= 1.0;
				return CompletableFuture.completedFuture(null);
			}
		}
		var future = new CompletableFuture<Void>();
		scheduleAcquire(future);
		return future;
	}

	private void scheduleAcquire(CompletableFuture<Void> future) {
		long waitMs;
		synchronized (this) {
			refill();
			if (tokens >= 1.0) {
				tokens -= 1.0;
				future.complete(null);
				return;
			}
			waitMs = (long) Math.ceil((1.0 - tokens) / refillRate);
		}
		scheduler.schedule(() -> {
			synchronized (this) {
				refill();
				if (tokens >= 1.0) {
					tokens -= 1.0;
					future.complete(null);
					return;
				}
			}
			scheduleAcquire(future);
		}, waitMs, TimeUnit.MILLISECONDS);
	}

	private void refill() {
		long now = System.currentTimeMillis();
		long elapsed = now - lastRefill;
		tokens = Math.min(tokens + elapsed * refillRate, maxTokens);
		lastRefill = now;
	}

	public void shutdown() {
		scheduler.shutdown();
	}
}
