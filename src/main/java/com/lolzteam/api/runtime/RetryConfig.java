package com.lolzteam.api.runtime;

import java.time.Duration;

public record RetryConfig(int maxRetries, Duration baseDelay, Duration maxDelay) {

	public RetryConfig() {
		this(3, Duration.ofSeconds(1), Duration.ofSeconds(30));
	}
}
