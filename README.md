# lolzteam-java

[![License: MIT](https://img.shields.io/badge/License-MIT-blue.svg)](LICENSE)
[![CI](https://github.com/kyo-lzt/lolzteam-java/actions/workflows/ci.yml/badge.svg)](https://github.com/kyo-lzt/lolzteam-java/actions)

Java API wrapper for the [Lolzteam](https://lolz.live) Forum and Market APIs. **266 endpoints** (151 Forum + 115 Market) with sync and async support, auto-generated from OpenAPI specifications.

## Features

- **Complete API coverage** -- 266 endpoints across Forum and Market clients
- **Auto-generated** -- clients and types generated from OpenAPI 3.1.0 specs, always in sync
- **Dual sync/async** -- every method has a `CompletableFuture`-based async counterpart
- **Proxy support** -- HTTP proxy with authentication
- **Retry logic** -- exponential backoff with jitter, respects `Retry-After` headers
- **Rate limiting** -- thread-safe token bucket implementation
- **Typed exceptions** -- sealed exception hierarchy
- **Minimal dependencies** -- only `jackson-databind` at runtime

## Quick Start

Requires **Java 17+**.

```sh
git clone https://github.com/kyo-lzt/lolzteam-java.git
cd lolzteam-java
./gradlew build
```

## Usage

```java
import com.lolzteam.api.runtime.ClientConfig;
import com.lolzteam.api.generated.forum.ForumClient;
import com.lolzteam.api.generated.market.MarketClient;

var config = ClientConfig.builder("your_token").build();
var forum = new ForumClient(config);
var market = new MarketClient(config);

// Sync
var threads = forum.threads().list();
var items = market.category().all();

// Async
forum.threads().listAsync()
    .thenAccept(result -> System.out.println(result));

forum.close();
market.close();
```

Every endpoint method has an async variant suffixed with `Async` that returns `CompletableFuture<JsonNode>`.

Forum API groups: `oAuth`, `assets`, `categories`, `forums`, `links`, `pages`, `navigation`, `threads`, `posts`, `users`, `profilePosts`, `conversations`, `notifications`, `tags`, `search`, `batch`, `chatbox`, `forms`.

Market API groups: `category`, `list`, `managing`, `profile`, `cart`, `purchasing`, `customDiscounts`, `publishing`, `payments`, `autoPayments`, `proxy`, `imap`, `batch`.

## Configuration

```java
var config = ClientConfig.builder("your_token")
    .baseUrl("https://prod-api.lolz.live")
    .proxy(new ProxyConfig("http://user:pass@127.0.0.1:8080"))
    .retry(new RetryConfig(5, Duration.ofSeconds(1), Duration.ofSeconds(30)))
    .rateLimit(new RateLimitConfig(200))
    .searchRateLimit(new RateLimitConfig(30))
    .timeout(Duration.ofSeconds(15))
    .onRetry(info -> System.out.printf("Retry #%d: %s %s%n", info.attempt(), info.method(), info.path()))
    .build();
```

| Parameter | Type | Default | Description |
|-----------|------|---------|-------------|
| `token` | `String` | *required* | API access token |
| `baseUrl` | `String` | per-client | Override base URL |
| `proxy` | `ProxyConfig` | `null` | HTTP proxy URL |
| `retry` | `RetryConfig` | 3 retries, 1s base, 30s max | Retry behavior |
| `rateLimit` | `RateLimitConfig` | Forum: 300/min, Market: 120/min | Requests per minute |
| `searchRateLimit` | `RateLimitConfig` | Market: 20/min | Search requests per minute |
| `timeout` | `Duration` | `null` | Request timeout |
| `onRetry` | `Consumer<RetryInfo>` | `null` | Callback on each retry attempt |

## Retry Logic

Failed requests are retried automatically for transient errors. The delay uses exponential backoff with jitter. `Retry-After` header on 429 responses is respected.

| Status | Retried | Behavior |
|--------|---------|----------|
| 429 | Yes | Uses `Retry-After` header if present |
| 502, 503, 504 | Yes | Exponential backoff with jitter |
| Network errors | Yes | Timeout and connection errors |
| 401, 403 | No | Thrown immediately |
| 404 | No | Thrown immediately |

Delay formula: `min(baseDelay * 2^attempt + random(0, baseDelay), maxDelay)`

```java
// Disable retry
var client = ForumClient.builder()
    .token("...")
    .retry(null)
    .build();

// onRetry callback
var client = ForumClient.builder()
    .token("...")
    .retry(RetryConfig.builder()
        .onRetry(info -> System.out.printf("Retry #%d%n", info.attempt()))
        .build())
    .build();
```

## Proxy

Route requests through an HTTP proxy:

```java
var config = ClientConfig.builder("your_token")
    .proxy(new ProxyConfig("http://user:pass@127.0.0.1:8080"))
    .build();
```

## Error Handling

All exceptions extend the sealed class `LolzteamException`:

```java
try {
    var result = forum.threads().list();
} catch (AuthException e) {
    System.err.println("Invalid or expired token");
} catch (RateLimitException e) {
    System.err.println("Rate limited, retry after: " + e.retryAfter());
} catch (NotFoundException e) {
    System.err.println("Resource not found");
} catch (ServerException e) {
    System.err.println("Server error: " + e.statusCode());
} catch (HttpException e) {
    System.err.println("HTTP " + e.statusCode() + ": " + e.responseBody());
}
```

Error hierarchy:

```
LolzteamException (sealed)
├── HttpException
│   ├── RateLimitException    (429)
│   ├── AuthException         (401, 403)
│   ├── NotFoundException     (404)
│   └── ServerException       (500, 502, 503)
├── NetworkException
└── ConfigException
```

## Rate Limits

The built-in rate limiter uses a token bucket algorithm. Thread-safe, works with both sync and async calls. When the bucket is empty, sync calls block and async calls suspend until tokens refill -- no requests are dropped.

| Client | Default limit |
|--------|---------------|
| Forum  | 300 req/min   |
| Market | 120 req/min   |
| Market (search) | 20 req/min |

```java
var client = MarketClient.builder()
    .token("...")
    .searchRateLimit(new RateLimitConfig(30))
    .build();
```

## Code Generation

Clients and types are auto-generated from OpenAPI 3.1.0 specs in `schemas/`:

```sh
./gradlew :codegen:run
```

| Input | Output |
|-------|--------|
| `schemas/forum.json` | `generated/forum/ForumClient.java`, `Types.java` |
| `schemas/market.json` | `generated/market/MarketClient.java`, `Types.java` |

Generator source is in `codegen/`.

## Project Structure

```
schemas/                        OpenAPI 3.1.0 specifications
codegen/                        Code generator (Gradle subproject)
src/
  main/java/com/lolzteam/api/
    runtime/                    HTTP client, config, retry, rate limiter, exceptions
    generated/
      forum/                    ForumClient + types (auto-generated)
      market/                   MarketClient + types (auto-generated)
  test/                         JUnit 5 tests
build.gradle.kts
```

## Commands

```sh
./gradlew build           # Build the project
./gradlew test            # Run tests
./gradlew :codegen:run    # Generate clients from OpenAPI specs
```

## License

[MIT](LICENSE)
