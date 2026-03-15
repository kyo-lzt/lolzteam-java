package com.lolzteam.api.runtime;

public record ClientConfig(
	String token,
	String baseUrl,
	ProxyConfig proxy,
	RetryConfig retry,
	RateLimitConfig rateLimit,
	RateLimitConfig searchRateLimit
) {

	public static Builder builder(String token) {
		return new Builder(token);
	}

	public ClientConfig withBaseUrl(String baseUrl) {
		return new ClientConfig(token, baseUrl, proxy, retry, rateLimit, searchRateLimit);
	}

	public ClientConfig withRateLimit(RateLimitConfig rateLimit) {
		return new ClientConfig(token, baseUrl, proxy, retry, rateLimit, searchRateLimit);
	}

	public ClientConfig withSearchRateLimit(RateLimitConfig searchRateLimit) {
		return new ClientConfig(token, baseUrl, proxy, retry, rateLimit, searchRateLimit);
	}

	public static final class Builder {
		private final String token;
		private String baseUrl;
		private ProxyConfig proxy;
		private RetryConfig retry = new RetryConfig();
		private RateLimitConfig rateLimit;
		private RateLimitConfig searchRateLimit;

		private Builder(String token) {
			this.token = token;
		}

		public Builder baseUrl(String baseUrl) {
			this.baseUrl = baseUrl;
			return this;
		}

		public Builder proxy(ProxyConfig proxy) {
			this.proxy = proxy;
			return this;
		}

		public Builder retry(RetryConfig retry) {
			this.retry = retry;
			return this;
		}

		public Builder rateLimit(RateLimitConfig rateLimit) {
			this.rateLimit = rateLimit;
			return this;
		}

		public Builder searchRateLimit(RateLimitConfig searchRateLimit) {
			this.searchRateLimit = searchRateLimit;
			return this;
		}

		public ClientConfig build() {
			return new ClientConfig(token, baseUrl, proxy, retry, rateLimit, searchRateLimit);
		}
	}
}
