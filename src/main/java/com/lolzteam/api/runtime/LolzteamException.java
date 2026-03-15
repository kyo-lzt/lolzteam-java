package com.lolzteam.api.runtime;

public sealed class LolzteamException extends RuntimeException
	permits HttpException, NetworkException, ConfigException, RetryExhaustedError {

	protected LolzteamException(String message) {
		super(message);
	}

	protected LolzteamException(String message, Throwable cause) {
		super(message, cause);
	}
}
