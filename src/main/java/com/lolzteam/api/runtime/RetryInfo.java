package com.lolzteam.api.runtime;

import java.time.Duration;

public record RetryInfo(int attempt, Duration delay, LolzteamException error, String method, String path) {
}
