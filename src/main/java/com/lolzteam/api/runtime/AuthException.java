package com.lolzteam.api.runtime;

import java.net.http.HttpHeaders;

public final class AuthException extends HttpException {

  public AuthException(int statusCode, String responseBody, HttpHeaders headers) {
    super(statusCode, responseBody, headers);
  }
}
