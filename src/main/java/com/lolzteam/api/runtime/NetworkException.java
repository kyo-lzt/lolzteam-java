package com.lolzteam.api.runtime;

public final class NetworkException extends LolzteamException {

  public NetworkException(Throwable cause) {
    super(cause.getMessage() != null ? cause.getMessage() : "Network error", cause);
  }

  public NetworkException(String message, Throwable cause) {
    super(message, cause);
  }

  public boolean isTransient() {
    Throwable cause = getCause();
    if (cause instanceof java.net.http.HttpTimeoutException
        || cause instanceof java.net.ConnectException) {
      return true;
    }
    // Java HttpClient reuses connections that the server may have already closed.
    // This manifests as an IOException with "header parser received no bytes".
    if (cause instanceof java.io.IOException) {
      String msg = cause.getMessage();
      if (msg != null && msg.contains("header parser received no bytes")) {
        return true;
      }
    }
    return false;
  }
}
