package com.lolzteam.api.runtime;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class RateLimiterTest {

  @Test
  void allowsRequestsWithinLimit() {
    var limiter = new RateLimiter(100);
    for (int i = 0; i < 5; i++) {
      limiter.acquire();
    }
    limiter.shutdown();
  }

  @Test
  void rateLimitsAfterBurst() {
    var limiter = new RateLimiter(3);
    long start = System.currentTimeMillis();

    // Exhaust all tokens
    for (int i = 0; i < 3; i++) {
      limiter.acquire();
    }

    // Next acquire should delay
    limiter.acquire();
    long elapsed = System.currentTimeMillis() - start;
    assertTrue(elapsed >= 500, "Should have waited for token refill, took " + elapsed + "ms");
    limiter.shutdown();
  }
}
