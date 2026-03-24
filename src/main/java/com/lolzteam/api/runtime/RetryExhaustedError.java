package com.lolzteam.api.runtime;

public final class RetryExhaustedError extends LolzteamException {

  private final int attempts;
  private final Throwable lastError;

  public RetryExhaustedError(int attempts, Throwable lastError) {
    super("Request failed after " + attempts + " attempts: " + lastError.getMessage(), lastError);
    this.attempts = attempts;
    this.lastError = lastError;
  }

  public int getAttempts() {
    return attempts;
  }

  public Throwable getLastError() {
    return lastError;
  }
}
