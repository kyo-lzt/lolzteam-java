package com.lolzteam.api.runtime;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConfigTest {

  @Test
  void builderCreatesConfig() {
    var config =
        ClientConfig.builder("my-token")
            .baseUrl("https://example.com")
            .proxy(new ProxyConfig("http://proxy:8080"))
            .rateLimit(new RateLimitConfig(100))
            .build();

    assertEquals("my-token", config.token());
    assertEquals("https://example.com", config.baseUrl());
    assertNotNull(config.proxy());
    assertEquals("http://proxy:8080", config.proxy().url());
    assertEquals(100, config.rateLimit().requestsPerMinute());
  }

  @Test
  void defaultRetryConfig() {
    var config = ClientConfig.builder("t").build();
    assertEquals(3, config.retry().maxRetries());
  }

  @Test
  void proxyRejectsInvalidUrl() {
    assertThrows(
        ConfigException.class,
        () ->
            new LolzteamHttpClient(
                ClientConfig.builder("t")
                    .baseUrl("https://example.com")
                    .proxy(new ProxyConfig("not a url"))
                    .build()));
  }

  @Test
  void proxyRejectsUnsupportedScheme() {
    assertThrows(
        ConfigException.class,
        () ->
            new LolzteamHttpClient(
                ClientConfig.builder("t")
                    .baseUrl("https://example.com")
                    .proxy(new ProxyConfig("ftp://proxy:8080"))
                    .build()));
  }

  @Test
  void proxyAcceptsHttpProxy() {
    var client =
        new LolzteamHttpClient(
            ClientConfig.builder("t")
                .baseUrl("https://example.com")
                .proxy(new ProxyConfig("http://proxy:8080"))
                .build());
    client.close();
  }

  @Test
  void proxyAcceptsSocks5Proxy() {
    var client =
        new LolzteamHttpClient(
            ClientConfig.builder("t")
                .baseUrl("https://example.com")
                .proxy(new ProxyConfig("socks5://proxy:1080"))
                .build());
    client.close();
  }
}
