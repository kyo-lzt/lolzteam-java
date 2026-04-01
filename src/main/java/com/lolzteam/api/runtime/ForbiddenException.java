package com.lolzteam.api.runtime;

import java.net.http.HttpHeaders;

public final class ForbiddenException extends HttpException {

  public ForbiddenException(int statusCode, String responseBody, HttpHeaders headers) {
    super(statusCode, responseBody, headers);
  }
}
