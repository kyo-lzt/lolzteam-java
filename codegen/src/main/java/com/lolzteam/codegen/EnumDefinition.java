package com.lolzteam.codegen;

import java.util.List;

/**
 * A detected enum type from an OpenAPI schema parameter or body field.
 *
 * @param typeName  PascalCase Java enum class name
 * @param valueType "string" or "integer"
 * @param values    raw enum values as strings
 */
record EnumDefinition(String typeName, String valueType, List<String> values) {
}
