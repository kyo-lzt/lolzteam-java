package com.lolzteam.api.runtime;

import java.net.http.HttpHeaders;

public final class NotFoundException extends HttpException {

  public NotFoundException(String responseBody, HttpHeaders headers) {
    super(404, responseBody, headers);
  }
}
