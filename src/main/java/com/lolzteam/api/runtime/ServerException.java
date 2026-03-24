package com.lolzteam.api.runtime;

import java.net.http.HttpHeaders;

public final class ServerException extends HttpException {

  public ServerException(int statusCode, String responseBody, HttpHeaders headers) {
    super(statusCode, responseBody, headers);
  }
}
