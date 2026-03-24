package com.lolzteam.api.runtime;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.IOException;
import java.util.Objects;

/**
 * Represents a value that can be either a String or an integer (long). Used for OpenAPI schemas
 * with {@code type: ['string', 'integer']}.
 */
@JsonDeserialize(using = StringOrInt.Deserializer.class)
@JsonSerialize(using = StringOrInt.Serializer.class)
public sealed interface StringOrInt {

  /** Returns the value as a String, converting if necessary. */
  String asString();

  /**
   * Returns the value as a long. Throws NumberFormatException if the string value is not numeric.
   */
  long asLong();

  /** Returns true if this holds a string value. */
  boolean isString();

  /** Returns true if this holds an integer value. */
  boolean isInteger();

  static StringOrInt of(String value) {
    return new StringValue(value);
  }

  static StringOrInt of(long value) {
    return new IntValue(value);
  }

  record StringValue(String value) implements StringOrInt {
    public StringValue {
      Objects.requireNonNull(value, "value must not be null");
    }

    @Override
    public String asString() {
      return value;
    }

    @Override
    public long asLong() {
      return Long.parseLong(value);
    }

    @Override
    public boolean isString() {
      return true;
    }

    @Override
    public boolean isInteger() {
      return false;
    }

    @Override
    public String toString() {
      return value;
    }
  }

  record IntValue(long value) implements StringOrInt {
    @Override
    public String asString() {
      return Long.toString(value);
    }

    @Override
    public long asLong() {
      return value;
    }

    @Override
    public boolean isString() {
      return false;
    }

    @Override
    public boolean isInteger() {
      return true;
    }

    @Override
    public String toString() {
      return Long.toString(value);
    }
  }

  final class Deserializer extends JsonDeserializer<StringOrInt> {
    @Override
    public StringOrInt deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      return switch (p.currentToken()) {
        case VALUE_NUMBER_INT -> new IntValue(p.getLongValue());
        case VALUE_STRING -> new StringValue(p.getText());
        default ->
            throw ctxt.weirdStringException(
                p.getText(), StringOrInt.class, "Expected string or integer");
      };
    }
  }

  final class Serializer extends JsonSerializer<StringOrInt> {
    @Override
    public void serialize(StringOrInt value, JsonGenerator gen, SerializerProvider serializers)
        throws IOException {
      if (value instanceof IntValue iv) {
        gen.writeNumber(iv.value());
      } else if (value instanceof StringValue sv) {
        gen.writeString(sv.value());
      }
    }
  }
}
