package com.lolzteam.api.runtime;

import java.net.http.HttpHeaders;

public non-sealed class HttpException extends LolzteamException {

	private final int statusCode;
	private final String responseBody;
	private final HttpHeaders headers;

	public HttpException(int statusCode, String responseBody, HttpHeaders headers) {
		super("HTTP " + statusCode);
		this.statusCode = statusCode;
		this.responseBody = responseBody;
		this.headers = headers;
	}

	public int statusCode() {
		return statusCode;
	}

	public String responseBody() {
		return responseBody;
	}

	public HttpHeaders headers() {
		return headers;
	}

	public static HttpException create(int statusCode, String body, HttpHeaders headers) {
		return switch (statusCode) {
			case 429 -> new RateLimitException(body, headers);
			case 401, 403 -> new AuthException(statusCode, body, headers);
			case 404 -> new NotFoundException(body, headers);
			case 500, 502, 503, 504 -> new ServerException(statusCode, body, headers);
			default -> new HttpException(statusCode, body, headers);
		};
	}
}
