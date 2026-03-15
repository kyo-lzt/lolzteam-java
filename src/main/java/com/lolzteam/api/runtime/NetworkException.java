package com.lolzteam.api.runtime;

public final class NetworkException extends LolzteamException {

	public NetworkException(Throwable cause) {
		super(cause.getMessage() != null ? cause.getMessage() : "Network error", cause);
	}

	public boolean isTransient() {
		Throwable cause = getCause();
		return cause instanceof java.net.http.HttpTimeoutException ||
			cause instanceof java.net.ConnectException;
	}
}
