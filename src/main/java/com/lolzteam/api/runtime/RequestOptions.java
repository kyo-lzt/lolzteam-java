package com.lolzteam.api.runtime;

import com.fasterxml.jackson.databind.JsonNode;
import java.util.Map;

public record RequestOptions(
    String method,
    String path,
    JsonNode query,
    JsonNode body,
    BodyEncoding bodyEncoding,
    Map<String, byte[]> byteArrayFields,
    boolean isSearch) {

  public RequestOptions(String method, String path) {
    this(method, path, null, null, BodyEncoding.FORM, Map.of(), false);
  }

  public RequestOptions(String method, String path, JsonNode query, JsonNode body) {
    this(method, path, query, body, BodyEncoding.FORM, Map.of(), false);
  }

  public RequestOptions(
      String method,
      String path,
      JsonNode query,
      JsonNode body,
      BodyEncoding bodyEncoding,
      Map<String, byte[]> byteArrayFields) {
    this(method, path, query, body, bodyEncoding, byteArrayFields, false);
  }
}
