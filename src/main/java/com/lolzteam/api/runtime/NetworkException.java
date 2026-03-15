package com.lolzteam.api.runtime;

public final class NetworkException extends LolzteamException {

	public NetworkException(Throwable cause) {
		super(cause.getMessage() != null ? cause.getMessage() : "Network error", cause);
	}
}
