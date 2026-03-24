package com.lolzteam.codegen;

import com.fasterxml.jackson.databind.JsonNode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

final class Emitter {

	private static final String PACKAGE = "com.lolzteam.api.generated";

	private Emitter() {
	}

	/**
	 * Convert a schema default value + Java type into a Java literal for use in constructors.
	 * Returns "null" when no default is present.
	 */
	private static String defaultLiteral(String defaultValue, String javaType) {
		return defaultLiteral(defaultValue, javaType, null, null);
	}

	/**
	 * Convert a schema default value + Java type into a Java literal for use in constructors.
	 * When enumTypeName and enums are provided, resolves enum variant names.
	 */
	private static String defaultLiteral(
		String defaultValue, String javaType,
		String enumTypeName, EnumCollector.CollectResult enums
	) {
		if (defaultValue == null) return "null";
		return switch (javaType) {
			case "String" -> "\"" + escapeJavaString(defaultValue) + "\"";
			case "Long", "long" -> {
				try {
					Long.parseLong(defaultValue);
					yield defaultValue + "L";
				} catch (NumberFormatException e) {
					yield "null";
				}
			}
			case "Double", "double" -> {
				try {
					Double.parseDouble(defaultValue);
					yield defaultValue + "D";
				} catch (NumberFormatException e) {
					yield "null";
				}
			}
			case "Boolean", "boolean" -> {
				if ("true".equalsIgnoreCase(defaultValue) || "1".equals(defaultValue)) {
					yield "true";
				} else if ("false".equalsIgnoreCase(defaultValue) || "0".equals(defaultValue)) {
					yield "false";
				}
				yield "null";
			}
			default -> {
				// Enum types — resolve variant name from enum definition
				if (enumTypeName != null && enums != null) {
					var def = enums.definitions().get(enumTypeName);
					if (def != null && def.values().contains(defaultValue)) {
						var isInteger = "integer".equals(def.valueType());
						var variantName = isInteger
							? integerVariantName(defaultValue)
							: stringVariantName(defaultValue);
						yield enumTypeName + "." + variantName;
					}
				}
				yield "null";
			}
		};
	}

	// ─── Types File ───────────────────────────────────────────────────

	private static String emitQueryParamsClass(
		String group, MethodDefinition method, EnumCollector.CollectResult enums
	) {
		if (method.params().queryParams().isEmpty()) return null;

		var typeName = Naming.buildTypeName(group, method.methodName()) + "Params";
		var sb = new StringBuilder();
		sb.append("\tpublic record ").append(typeName).append("(\n");

		var props = new ArrayList<String>();
		for (var param : method.params().queryParams()) {
			var enumTypeName = enums.resolve(method.operationId(), param.name());
			var javaType = enumTypeName != null ? enumTypeName : Transforms.toJavaType(param.type());
			var fieldName = Naming.safeJavaName(param.name());
			var annotation = Naming.needsJsonProperty(param.name())
				? "\t\t@JsonProperty(\"" + param.name() + "\") "
				: "\t\t";
			var doc = param.defaultValue() != null
				? "\t\t/** Default: " + param.defaultValue() + " */\n"
				: "";
			props.add(doc + annotation + javaType + " " + fieldName);
		}
		sb.append(String.join(",\n", props)).append("\n");
		sb.append("\t) {\n");

		// Convenience constructor: required-only if there are optional params
		var hasOptional = method.params().queryParams().stream().anyMatch(p -> !p.required());
		if (hasOptional) {
			var requiredParams = method.params().queryParams().stream()
				.filter(ParsedParameter::required)
				.toList();
			if (!requiredParams.isEmpty()) {
				// Constructor with required params only
				sb.append("\t\tpublic ").append(typeName).append("(");
				var reqSig = requiredParams.stream()
					.map(p -> {
						var et = enums.resolve(method.operationId(), p.name());
						var jt = et != null ? et : Transforms.toJavaType(p.type());
						return jt + " " + Naming.safeJavaName(p.name());
					})
					.collect(Collectors.joining(", "));
				sb.append(reqSig).append(") {\n");
				sb.append("\t\t\tthis(");
				var allArgs = method.params().queryParams().stream()
					.map(p -> {
						if (p.required()) return Naming.safeJavaName(p.name());
						var et = enums.resolve(method.operationId(), p.name());
						var jt = et != null ? et : Transforms.toJavaType(p.type());
						return defaultLiteral(p.defaultValue(), jt, et, enums);
					})
					.collect(Collectors.joining(", "));
				sb.append(allArgs).append(");\n");
				sb.append("\t\t}\n");
			} else {
				// All optional: no-arg constructor
				sb.append("\t\tpublic ").append(typeName).append("() {\n");
				sb.append("\t\t\tthis(");
				var defaults = method.params().queryParams().stream()
					.map(p -> {
						var et = enums.resolve(method.operationId(), p.name());
						var jt = et != null ? et : Transforms.toJavaType(p.type());
						return defaultLiteral(p.defaultValue(), jt, et, enums);
					})
					.collect(Collectors.joining(", "));
				sb.append(defaults).append(");\n");
				sb.append("\t\t}\n");
			}
		}

		sb.append("\t}");
		return sb.toString();
	}

	private static String emitBodyClass(
		String group, MethodDefinition method, EnumCollector.CollectResult enums
	) {
		if (!method.hasBody()) return null;

		var typeName = Naming.buildTypeName(group, method.methodName()) + "Body";

		// Discriminated union → sealed interface + variant records
		if (method.discriminatedUnion() != null) {
			return emitDiscriminatedUnionBody(typeName, method, enums);
		}

		// Array body
		if (method.bodyIsArray()) {
			// Java doesn't have typealias, so we skip array body types
			// The method will accept List<T> directly
			return null;
		}

		if (method.bodyProperties().isEmpty()) return null;

		var hasByteArrayFields = method.bodyProperties().stream().anyMatch(p -> "Blob".equals(p.type()));

		var sb = new StringBuilder();
		sb.append("\tpublic record ").append(typeName).append("(\n");

		var props = new ArrayList<String>();
		for (var prop : method.bodyProperties()) {
			var enumTypeName = enums.resolve(method.operationId(), prop.name());
			var javaType = enumTypeName != null
				? enumTypeName
				: ("Blob".equals(prop.type()) ? "byte[]" : Transforms.toJavaType(prop.type()));
			var fieldName = Naming.safeJavaName(prop.name());
			String annotation;
			if (!hasByteArrayFields && Naming.needsJsonProperty(prop.name())) {
				annotation = "\t\t@JsonProperty(\"" + prop.name() + "\") ";
			} else {
				annotation = "\t\t";
			}
			var doc = prop.defaultValue() != null
				? "\t\t/** Default: " + prop.defaultValue() + " */\n"
				: "";
			props.add(doc + annotation + javaType + " " + fieldName);
		}
		sb.append(String.join(",\n", props)).append("\n");
		sb.append("\t) {\n");

		// No-required-args constructor if there are optional params
		var hasOptional = method.bodyProperties().stream().anyMatch(p -> !p.required());
		if (hasOptional) {
			var requiredProps = method.bodyProperties().stream()
				.filter(BodyProperty::required)
				.toList();
			if (!requiredProps.isEmpty()) {
				sb.append("\t\tpublic ").append(typeName).append("(");
				var reqParams = requiredProps.stream()
					.map(p -> {
						var et = enums.resolve(method.operationId(), p.name());
						var jt = et != null ? et
							: ("Blob".equals(p.type()) ? "byte[]" : Transforms.toJavaType(p.type()));
						return jt + " " + Naming.safeJavaName(p.name());
					})
					.collect(Collectors.joining(", "));
				sb.append(reqParams).append(") {\n");
				sb.append("\t\t\tthis(");
				var allArgs = method.bodyProperties().stream()
					.map(p -> {
						if (p.required()) return Naming.safeJavaName(p.name());
						var et = enums.resolve(method.operationId(), p.name());
						var jt = et != null ? et
							: ("Blob".equals(p.type()) ? "byte[]" : Transforms.toJavaType(p.type()));
						return defaultLiteral(p.defaultValue(), jt, et, enums);
					})
					.collect(Collectors.joining(", "));
				sb.append(allArgs).append(");\n");
				sb.append("\t\t}\n");
			} else {
				sb.append("\t\tpublic ").append(typeName).append("() {\n");
				sb.append("\t\t\tthis(");
				var nulls = method.bodyProperties().stream()
					.map(p -> {
						var et = enums.resolve(method.operationId(), p.name());
						var jt = et != null ? et
							: ("Blob".equals(p.type()) ? "byte[]" : Transforms.toJavaType(p.type()));
						return defaultLiteral(p.defaultValue(), jt, et, enums);
					})
					.collect(Collectors.joining(", "));
				sb.append(nulls).append(");\n");
				sb.append("\t\t}\n");
			}
		}

		sb.append("\t}");
		return sb.toString();
	}

	private static String emitDiscriminatedUnionBody(
		String typeName, MethodDefinition method, EnumCollector.CollectResult enums
	) {
		var union = method.discriminatedUnion();
		var sb = new StringBuilder();

		// Build variant class names
		var variantNames = new ArrayList<String>();
		for (var variant : union.variants()) {
			variantNames.add(typeName + discriminatorValueToSuffix(variant.discriminatorValue()));
		}

		// Sealed interface with Jackson polymorphism annotations
		var isIntegerDiscriminator = "integer".equals(union.discriminatorType());

		sb.append("\t@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = \"")
			.append(union.discriminatorProperty()).append("\")\n");
		sb.append("\t@JsonSubTypes({\n");
		for (int i = 0; i < union.variants().size(); i++) {
			var variant = union.variants().get(i);
			var variantClassName = variantNames.get(i);
			var comma = i < union.variants().size() - 1 ? "," : "";
			if (isIntegerDiscriminator) {
				sb.append("\t\t@JsonSubTypes.Type(value = ").append(variantClassName)
					.append(".class, name = \"").append(variant.discriminatorValue()).append("\")").append(comma).append("\n");
			} else {
				sb.append("\t\t@JsonSubTypes.Type(value = ").append(variantClassName)
					.append(".class, name = \"").append(variant.discriminatorValue()).append("\")").append(comma).append("\n");
			}
		}
		sb.append("\t})\n");
		sb.append("\tpublic sealed interface ").append(typeName).append(" permits\n");
		sb.append("\t\t").append(String.join(", ", variantNames)).append(" {\n");
		sb.append("\t}\n");

		// Emit each variant record
		for (int i = 0; i < union.variants().size(); i++) {
			var variant = union.variants().get(i);
			var variantClassName = variantNames.get(i);

			sb.append("\n");
			sb.append("\t@JsonTypeName(\"").append(variant.discriminatorValue()).append("\")\n");
			sb.append("\tpublic record ").append(variantClassName).append("(\n");

			var props = new ArrayList<String>();
			for (var prop : variant.properties()) {
				var enumTypeName = enums.resolve(method.operationId(), prop.name());
				var javaType = enumTypeName != null ? enumTypeName : Transforms.toJavaType(prop.type());
				var fieldName = Naming.safeJavaName(prop.name());
				String annotation;
				if (Naming.needsJsonProperty(prop.name())) {
					annotation = "\t\t@JsonProperty(\"" + prop.name() + "\") ";
				} else {
					annotation = "\t\t";
				}
				if (!prop.required()) {
					javaType = boxType(javaType);
				}
				var doc = prop.defaultValue() != null
					? "\t\t/** Default: " + prop.defaultValue() + " */\n"
					: "";
				props.add(doc + annotation + javaType + " " + fieldName);
			}
			sb.append(String.join(",\n", props)).append("\n");
			sb.append("\t) implements ").append(typeName).append(" {\n");

			// Convenience constructor with only required params
			var hasOptional = variant.properties().stream().anyMatch(p -> !p.required());
			if (hasOptional) {
				var requiredProps = variant.properties().stream()
					.filter(BodyProperty::required)
					.toList();
				if (!requiredProps.isEmpty()) {
					sb.append("\t\tpublic ").append(variantClassName).append("(");
					var reqParams = requiredProps.stream()
						.map(p -> {
							var et = enums.resolve(method.operationId(), p.name());
							var jt = et != null ? et : Transforms.toJavaType(p.type());
							return jt + " " + Naming.safeJavaName(p.name());
						})
						.collect(Collectors.joining(", "));
					sb.append(reqParams).append(") {\n");
					sb.append("\t\t\tthis(");
					var allArgs = variant.properties().stream()
						.map(p -> {
							if (p.required()) return Naming.safeJavaName(p.name());
							var et = enums.resolve(method.operationId(), p.name());
							var jt = et != null ? et : Transforms.toJavaType(p.type());
							return defaultLiteral(p.defaultValue(), jt, et, enums);
						})
						.collect(Collectors.joining(", "));
					sb.append(allArgs).append(");\n");
					sb.append("\t\t}\n");
				} else {
					sb.append("\t\tpublic ").append(variantClassName).append("() {\n");
					sb.append("\t\t\tthis(");
					var nulls = variant.properties().stream()
						.map(p -> {
							var et = enums.resolve(method.operationId(), p.name());
							var jt = et != null ? et : Transforms.toJavaType(p.type());
							return defaultLiteral(p.defaultValue(), jt, et, enums);
						})
						.collect(Collectors.joining(", "));
					sb.append(nulls).append(");\n");
					sb.append("\t\t}\n");
				}
			}

			sb.append("\t}");
		}

		return sb.toString();
	}

	/**
	 * Convert a discriminator value to a PascalCase suffix for the variant class name.
	 * e.g. "client_credentials" → "ClientCredentials", "1" → "V1"
	 */
	private static String discriminatorValueToSuffix(String value) {
		if (value.matches("-?\\d+")) {
			return "V" + value;
		}
		return Naming.capitalizeFirst(Naming.snakeToCamel(value));
	}

	// ─── Enum Generation ────────────────────────────────────────────

	private static String emitEnumClass(EnumDefinition def) {
		var sb = new StringBuilder();
		var isInteger = "integer".equals(def.valueType());
		var javaValueType = isInteger ? "long" : "String";

		sb.append("\tpublic enum ").append(def.typeName()).append(" {\n");

		var variants = new ArrayList<String>();
		for (var value : def.values()) {
			var variantName = isInteger ? integerVariantName(value) : stringVariantName(value);
			var literal = isInteger ? value + "L" : "\"" + escapeJavaString(value) + "\"";
			variants.add("\t\t" + variantName + "(" + literal + ")");
		}
		sb.append(String.join(",\n", variants)).append(";\n\n");

		sb.append("\t\tprivate final ").append(javaValueType).append(" value;\n\n");
		sb.append("\t\t").append(def.typeName()).append("(").append(javaValueType).append(" value) {\n");
		sb.append("\t\t\tthis.value = value;\n");
		sb.append("\t\t}\n\n");
		sb.append("\t\t@JsonValue\n");
		sb.append("\t\tpublic ").append(javaValueType).append(" getValue() {\n");
		sb.append("\t\t\treturn value;\n");
		sb.append("\t\t}\n");
		sb.append("\t}");
		return sb.toString();
	}

	private static String integerVariantName(String value) {
		if (value.startsWith("-")) {
			return "V_" + value.substring(1);
		}
		return "V" + value;
	}

	private static String stringVariantName(String value) {
		// Convert to UPPER_SNAKE_CASE
		var result = value
			.replaceAll("([a-z0-9])([A-Z])", "$1_$2")
			.replaceAll("[^a-zA-Z0-9]", "_")
			.toUpperCase();
		// Ensure starts with letter
		if (!result.isEmpty() && Character.isDigit(result.charAt(0))) {
			result = "V_" + result;
		}
		if (result.isEmpty()) {
			result = "EMPTY";
		}
		return result;
	}

	private static String escapeJavaString(String s) {
		return s.replace("\\", "\\\\").replace("\"", "\\\"");
	}

	// ─── Response Record Generation ──────────────────────────────────

	/**
	 * Represents a field in a generated response record.
	 */
	private record ResponseField(String jsonName, String javaName, String javaType, boolean required) {
	}

	/**
	 * Resolve a property schema to a Java type, respecting component schema $refs.
	 */
	private static String resolvePropertyType(
		JsonNode propSchema, Set<String> componentSchemaNames, JsonNode rawSpec,
		String parentTypeName, String propName, List<String> nestedRecords
	) {
		if (propSchema == null) return "JsonNode";

		// Direct $ref to component schema
		if (propSchema.isObject() && propSchema.has("$ref")) {
			var ref = propSchema.get("$ref").asText();
			if (ref.startsWith("#/components/schemas/")) {
				var schemaName = ref.substring("#/components/schemas/".length());
				if (componentSchemaNames.contains(schemaName)) {
					return schemaName;
				}
			}
		}

		if (!propSchema.isObject()) return "JsonNode";

		// Array type
		var typeNode = propSchema.get("type");
		if (typeNode != null && typeNode.isTextual() && "array".equals(typeNode.asText())) {
			var items = propSchema.get("items");
			if (items != null) {
				var itemType = resolvePropertyType(
					items, componentSchemaNames, rawSpec,
					parentTypeName, propName, nestedRecords
				);
				return "List<" + boxType(itemType) + ">";
			}
			return "List<JsonNode>";
		}

		// Multi-type array: type: ['string', 'integer']
		if (typeNode != null && typeNode.isArray()) {
			var nonNullTypes = new ArrayList<String>();
			for (var t : typeNode) {
				var ts = t.asText();
				if (!"null".equals(ts)) nonNullTypes.add(ts);
			}
			if (nonNullTypes.size() == 2
				&& nonNullTypes.contains("string") && nonNullTypes.contains("integer")) {
				return "com.lolzteam.api.runtime.StringOrInt";
			}
			return "JsonNode";
		}

		// oneOf / anyOf → JsonNode (union)
		if (propSchema.has("oneOf") || propSchema.has("anyOf")) {
			return "JsonNode";
		}

		// allOf → JsonNode
		if (propSchema.has("allOf")) {
			return "JsonNode";
		}

		// enum with string values → String
		var enumNode = propSchema.get("enum");
		if (enumNode != null && enumNode.isArray() && !enumNode.isEmpty()) {
			return "String";
		}

		var type = typeNode != null && typeNode.isTextual() ? typeNode.asText() : null;

		if ("object".equals(type) || propSchema.has("properties")) {
			var props = propSchema.get("properties");
			if (props != null && props.isObject() && !props.isEmpty()
				&& parentTypeName != null && propName != null && nestedRecords != null) {
				// Generate a nested record for inline objects with properties
				var nestedName = parentTypeName
					+ Naming.capitalizeFirst(Naming.snakeToCamel(Naming.sanitizeName(propName)));
				var nestedRecord = buildNestedRecord(
					nestedName, propSchema, componentSchemaNames, rawSpec, nestedRecords
				);
				nestedRecords.add(nestedRecord);
				return nestedName;
			}
			return "JsonNode";
		}

		if (type != null) {
			return switch (type) {
				case "string" -> "String";
				case "integer" -> "long";
				case "number" -> "double";
				case "boolean" -> "boolean";
				default -> "JsonNode";
			};
		}

		return "JsonNode";
	}

	/**
	 * Build a nested record definition string for an inline object schema.
	 */
	private static String buildNestedRecord(
		String recordName, JsonNode schema, Set<String> componentSchemaNames,
		JsonNode rawSpec, List<String> nestedRecords
	) {
		var properties = schema.get("properties");

		var requiredSet = new HashSet<String>();
		var requiredArr = schema.get("required");
		if (requiredArr != null && requiredArr.isArray()) {
			for (var r : requiredArr) {
				requiredSet.add(r.asText());
			}
		}

		var sb = new StringBuilder();
		sb.append("\t@JsonIgnoreProperties(ignoreUnknown = true)\n");
		sb.append("\tpublic record ").append(recordName).append("(\n");

		var props = new ArrayList<String>();
		var seenJavaNames = new HashSet<String>();
		var propFields = properties.fields();
		while (propFields.hasNext()) {
			var entry = propFields.next();
			var jsonName = entry.getKey();
			var propSchema = entry.getValue();
			var javaName = Naming.safeJavaName(jsonName);
			if (!seenJavaNames.add(javaName)) continue; // skip duplicate Java names
			var required = requiredSet.contains(jsonName);

			var javaType = resolvePropertyType(
				propSchema, componentSchemaNames, rawSpec,
				recordName, jsonName, nestedRecords
			);
			if (!required) {
				javaType = boxType(javaType);
			}

			var annotation = Naming.needsJsonProperty(jsonName)
				? "\t\t@JsonProperty(\"" + jsonName + "\") "
				: "\t\t";
			if (!required && needsNullableAnnotation(javaType)) {
				annotation = annotation + "@Nullable ";
			}
			props.add(annotation + javaType + " " + javaName);
		}
		sb.append(String.join(",\n", props)).append("\n");
		sb.append("\t) {}");
		return sb.toString();
	}

	/**
	 * Box primitive types for use in generics.
	 */
	private static String boxType(String type) {
		return switch (type) {
			case "long" -> "Long";
			case "double" -> "Double";
			case "boolean" -> "Boolean";
			default -> type;
		};
	}

	private static final Set<String> BOXED_PRIMITIVES = Set.of("Long", "Double", "Boolean");

	/**
	 * Whether an optional reference-type field needs a @Nullable annotation.
	 * Boxed primitives already signal optionality via boxing (long → Long).
	 * Primitives are never optional. Reference types need @Nullable.
	 */
	private static boolean needsNullableAnnotation(String javaType) {
		if (BOXED_PRIMITIVES.contains(javaType)) return false;
		if ("long".equals(javaType) || "double".equals(javaType) || "boolean".equals(javaType)) {
			return false;
		}
		return true;
	}

	/**
	 * Result of extracting response fields, including any nested record definitions.
	 */
	private record ExtractedResponseFields(List<ResponseField> fields, List<String> nestedRecords) {
	}

	/**
	 * Extract response fields from a raw response schema.
	 * Returns null if the schema can't be converted to typed fields (fallback to JsonNode).
	 */
	private static ExtractedResponseFields extractResponseFields(
		JsonNode rawSchema, Set<String> componentSchemaNames, JsonNode rawSpec,
		String parentTypeName, List<String> nestedRecords
	) {
		if (rawSchema == null || !rawSchema.isObject()) return null;

		// If the schema itself is a $ref, resolve it to the component schema
		if (rawSchema.has("$ref")) {
			var ref = rawSchema.get("$ref").asText();
			if (ref.startsWith("#/components/schemas/") && rawSpec != null) {
				var schemaName = ref.substring("#/components/schemas/".length());
				var resolved = rawSpec.at("/components/schemas/" + schemaName);
				if (resolved != null && !resolved.isMissingNode()) {
					return extractResponseFields(
						resolved, componentSchemaNames, rawSpec,
						parentTypeName, nestedRecords
					);
				}
			}
			return null;
		}

		var properties = rawSchema.get("properties");
		if (properties == null || !properties.isObject() || properties.isEmpty()) return null;

		var requiredSet = new HashSet<String>();
		var requiredArr = rawSchema.get("required");
		if (requiredArr != null && requiredArr.isArray()) {
			for (var r : requiredArr) {
				requiredSet.add(r.asText());
			}
		}

		var fields = new ArrayList<ResponseField>();
		var seenJavaNames = new HashSet<String>();
		var propFields = properties.fields();
		while (propFields.hasNext()) {
			var entry = propFields.next();
			var jsonName = entry.getKey();
			var propSchema = entry.getValue();
			var javaName = Naming.safeJavaName(jsonName);
			if (!seenJavaNames.add(javaName)) continue; // skip duplicate Java names
			var required = requiredSet.contains(jsonName);

			var javaType = resolvePropertyType(
				propSchema, componentSchemaNames, rawSpec,
				parentTypeName, jsonName, nestedRecords
			);

			// For optional primitive fields, use boxed types
			if (!required) {
				javaType = boxType(javaType);
			}

			fields.add(new ResponseField(jsonName, javaName, javaType, required));
		}

		return new ExtractedResponseFields(fields, nestedRecords);
	}

	private static String emitResponseRecord(
		String group, MethodDefinition method,
		Set<String> componentSchemaNames, JsonNode rawSpec
	) {
		var typeName = Naming.buildTypeName(group, method.methodName()) + "Response";
		var rawSchema = method.rawResponseSchema();

		var nestedRecords = new ArrayList<String>();
		var result = extractResponseFields(
			rawSchema, componentSchemaNames, rawSpec, typeName, nestedRecords
		);

		if (result == null || result.fields().isEmpty()) {
			// Fallback to opaque JsonNode
			var sb = new StringBuilder();
			sb.append("\t@JsonIgnoreProperties(ignoreUnknown = true)\n");
			sb.append("\tpublic record ").append(typeName).append("(JsonNode data) {\n");
			sb.append("\t\t@JsonCreator(mode = JsonCreator.Mode.DELEGATING)\n");
			sb.append("\t\tpublic ").append(typeName).append(" {}\n");
			sb.append("\t}");
			return sb.toString();
		}

		var sb = new StringBuilder();
		sb.append("\t@JsonIgnoreProperties(ignoreUnknown = true)\n");
		sb.append("\tpublic record ").append(typeName).append("(\n");

		var props = new ArrayList<String>();
		for (var field : result.fields()) {
			var annotation = Naming.needsJsonProperty(field.jsonName())
				? "\t\t@JsonProperty(\"" + field.jsonName() + "\") "
				: "\t\t";
			if (!field.required() && needsNullableAnnotation(field.javaType())) {
				annotation = annotation + "@Nullable ";
			}
			props.add(annotation + field.javaType() + " " + field.javaName());
		}
		sb.append(String.join(",\n", props)).append("\n");
		sb.append("\t) {}");

		// Append nested records after the response record
		for (var nested : result.nestedRecords()) {
			sb.append("\n\n").append(nested);
		}

		return sb.toString();
	}

	// ─── Component Schema Record Generation ──────────────────────────

	private static String emitComponentSchemaRecord(
		String schemaName, JsonNode schema, Set<String> componentSchemaNames, JsonNode rawSpec
	) {
		if (schema == null || !schema.isObject()) return null;

		var properties = schema.get("properties");
		if (properties == null || !properties.isObject() || properties.isEmpty()) return null;

		// Skip schemas that are just enums or primitives
		var typeNode = schema.get("type");
		if (typeNode != null && typeNode.isTextual()) {
			var type = typeNode.asText();
			if (!"object".equals(type)) return null;
		}
		// Multi-type schemas
		if (typeNode != null && typeNode.isArray()) return null;

		var requiredSet = new HashSet<String>();
		var requiredArr = schema.get("required");
		if (requiredArr != null && requiredArr.isArray()) {
			for (var r : requiredArr) {
				requiredSet.add(r.asText());
			}
		}

		var nestedRecords = new ArrayList<String>();

		var sb = new StringBuilder();
		sb.append("\t@JsonIgnoreProperties(ignoreUnknown = true)\n");
		sb.append("\tpublic record ").append(schemaName).append("(\n");

		var props = new ArrayList<String>();
		var seenJavaNames = new HashSet<String>();
		var propFields = properties.fields();
		while (propFields.hasNext()) {
			var entry = propFields.next();
			var jsonName = entry.getKey();
			var propSchema = entry.getValue();
			var javaName = Naming.safeJavaName(jsonName);
			if (!seenJavaNames.add(javaName)) continue; // skip duplicate Java names
			var required = requiredSet.contains(jsonName);

			var javaType = resolvePropertyType(
				propSchema, componentSchemaNames, rawSpec,
				schemaName, jsonName, nestedRecords
			);
			if (!required) {
				javaType = boxType(javaType);
			}

			var annotation = Naming.needsJsonProperty(jsonName)
				? "\t\t@JsonProperty(\"" + jsonName + "\") "
				: "\t\t";
			if (!required && needsNullableAnnotation(javaType)) {
				annotation = annotation + "@Nullable ";
			}
			props.add(annotation + javaType + " " + javaName);
		}
		sb.append(String.join(",\n", props)).append("\n");
		sb.append("\t) {}");

		// Append nested records after the parent record
		for (var nested : nestedRecords) {
			sb.append("\n\n").append(nested);
		}

		return sb.toString();
	}

	// ─── Types File Assembly ─────────────────────────────────────────

	static String emitJavaTypesFile(
		List<ParsedGroup> groups, String subPackage, Map<String, JsonNode> componentSchemas,
		EnumCollector.CollectResult enums
	) {
		var sb = new StringBuilder();
		var fullPackage = PACKAGE + "." + subPackage;

		// Build the set of component schema names for reference resolution
		var componentSchemaNames = new HashSet<>(componentSchemas.keySet());

		// We need a dummy rawSpec for resolvePropertyType — component schemas reference each other
		// Build a minimal spec node with just the schemas section
		var mapper = new com.fasterxml.jackson.databind.ObjectMapper();
		var rawSpec = mapper.createObjectNode();
		var components = mapper.createObjectNode();
		var schemasNode = mapper.createObjectNode();
		for (var entry : componentSchemas.entrySet()) {
			schemasNode.set(entry.getKey(), entry.getValue());
		}
		components.set("schemas", schemasNode);
		rawSpec.set("components", components);

		sb.append("// Auto-generated. Do not edit manually.\n\n");
		sb.append("package ").append(fullPackage).append(";\n\n");
		sb.append("import com.fasterxml.jackson.annotation.JsonCreator;\n");
		sb.append("import com.fasterxml.jackson.annotation.JsonIgnoreProperties;\n");
		sb.append("import com.fasterxml.jackson.annotation.JsonProperty;\n");
		sb.append("import com.fasterxml.jackson.annotation.JsonSubTypes;\n");
		sb.append("import com.fasterxml.jackson.annotation.JsonTypeInfo;\n");
		sb.append("import com.fasterxml.jackson.annotation.JsonTypeName;\n");
		sb.append("import com.fasterxml.jackson.annotation.JsonValue;\n");
		sb.append("import com.fasterxml.jackson.databind.JsonNode;\n");
		sb.append("import com.lolzteam.api.runtime.Nullable;\n");
		sb.append("import java.util.List;\n");
		sb.append("import java.util.Map;\n\n");

		sb.append("public final class Types {\n\n");
		sb.append("\tprivate Types() {\n\t}\n\n");

		// Emit enum types
		if (!enums.definitions().isEmpty()) {
			sb.append("\t// ─── Enums ───────────────────────────────────────────────────\n\n");
			for (var def : enums.definitions().values()) {
				sb.append(emitEnumClass(def)).append("\n\n");
			}
		}

		// Emit component schema records first
		var hasComponentSchemas = false;
		for (var entry : componentSchemas.entrySet()) {
			var record = emitComponentSchemaRecord(
				entry.getKey(), entry.getValue(), componentSchemaNames, rawSpec
			);
			if (record != null) {
				if (!hasComponentSchemas) {
					sb.append("\t// ─── Component Schemas ────────────────────────────────────────\n\n");
					hasComponentSchemas = true;
				}
				sb.append("\t").append(record.replace("\n", "\n\t")).append("\n\n");
			}
		}

		// Emit group types
		for (var group : groups) {
			var className = Naming.groupToClassName(group.groupName());
			var groupTypes = new ArrayList<String>();

			for (var method : group.methods()) {
				var queryType = emitQueryParamsClass(group.groupName(), method, enums);
				if (queryType != null) groupTypes.add(queryType);

				var bodyType = emitBodyClass(group.groupName(), method, enums);
				if (bodyType != null) groupTypes.add(bodyType);

				groupTypes.add(emitResponseRecord(
					group.groupName(), method, componentSchemaNames, rawSpec
				));
			}

			if (!groupTypes.isEmpty()) {
				sb.append("\t// ─── ").append(className).append(" Types ────────────────────────────────────────\n\n");
				sb.append("\tpublic static final class ").append(className).append("Types {\n\n");
				sb.append("\t\tprivate ").append(className).append("Types() {\n\t\t}\n\n");
				// Add extra indentation to nested types
				for (var typeStr : groupTypes) {
					sb.append("\t").append(typeStr.replace("\n", "\n\t")).append("\n\n");
				}
				sb.append("\t}\n\n");
			}
		}

		sb.append("}\n");

		return sb.toString();
	}

	// ─── Client File ──────────────────────────────────────────────────

	private static String buildPathExpression(String path) {
		if (!path.contains("{")) return "\"" + path + "\"";
		// Replace {param} with " + paramName + "
		var result = path.replaceAll("\\{([^}]+)}", "\" + " + "PLACEHOLDER_$1" + " + \"");
		// Now fix the placeholder with actual camelCase names
		var sb = new StringBuilder();
		int i = 0;
		while (i < result.length()) {
			int start = result.indexOf("PLACEHOLDER_", i);
			if (start == -1) {
				sb.append(result.substring(i));
				break;
			}
			sb.append(result, i, start);
			var end = result.indexOf(" + \"", start);
			if (end == -1) end = result.length();
			var paramName = result.substring(start + "PLACEHOLDER_".length(), end);
			sb.append(Naming.snakeToCamel(paramName));
			i = end;
		}
		var expr = "\"" + sb + "\"";
		// Clean up empty concatenations
		expr = expr.replace("\"\" + ", "").replace(" + \"\"", "");
		return expr;
	}

	private static String bodyEncodingLiteral(String encoding) {
		return switch (encoding) {
			case "json" -> "com.lolzteam.api.runtime.BodyEncoding.JSON";
			case "multipart" -> "com.lolzteam.api.runtime.BodyEncoding.MULTIPART";
			default -> "com.lolzteam.api.runtime.BodyEncoding.FORM";
		};
	}

	private static String emitJavaMethod(String group, MethodDefinition method, boolean isAsync) {
		var sb = new StringBuilder();
		var typeName = Naming.buildTypeName(group, method.methodName());
		var className = Naming.groupToClassName(group);

		// Build argument list
		var args = new ArrayList<String>();

		// Path params
		for (var param : method.params().pathParams()) {
			var javaType = Transforms.toJavaPathParamType(param.type());
			args.add(javaType + " " + Naming.snakeToCamel(param.name()));
		}

		// Body param
		var bodyTypeName = "Types." + className + "Types." + typeName + "Body";
		var hasBodyType = method.hasBody() && (!method.bodyProperties().isEmpty() || method.bodyIsArray());
		if (hasBodyType) {
			if (method.bodyIsArray()) {
				var itemType = Transforms.toJavaType(method.bodyArrayItemType() != null ? method.bodyArrayItemType() : "unknown");
				bodyTypeName = "List<" + itemType + ">";
			}
			args.add(bodyTypeName + " body");
		}

		// Query params
		var queryTypeName = "Types." + className + "Types." + typeName + "Params";
		var hasQueryType = !method.params().queryParams().isEmpty();
		if (hasQueryType) {
			args.add(queryTypeName + " params");
		}

		var argStr = String.join(", ", args);
		var pathExpr = buildPathExpression(method.path());

		var responseTypeName = "Types." + className + "Types." + typeName + "Response";
		var isHtml = method.htmlResponse();
		var returnType = isHtml
			? (isAsync ? "CompletableFuture<String>" : "String")
			: (isAsync ? "CompletableFuture<" + responseTypeName + ">" : responseTypeName);
		var methodSuffix = isAsync ? "Async" : "";
		var httpMethod = isAsync ? "requestAsync" : "request";

		sb.append("\tpublic ").append(returnType).append(" ").append(method.methodName())
			.append(methodSuffix).append("(").append(argStr).append(") {\n");

		var hasByteArrayFields = method.bodyProperties().stream().anyMatch(p -> "Blob".equals(p.type()));
		var isMultipart = "multipart".equals(method.bodyEncoding());

		var isSearch = group.equalsIgnoreCase("category");

		if (isHtml) {
			// text/html endpoints — return raw String via requestRaw
			var rawMethod = isAsync ? "requestRawAsync" : "requestRaw";
			sb.append("\t\treturn http.").append(rawMethod).append("(new RequestOptions(\n");
			sb.append("\t\t\t\"").append(method.httpMethod()).append("\",\n");
			sb.append("\t\t\t").append(pathExpr).append(",\n");
			if (hasQueryType) {
				sb.append("\t\t\tparams != null ? mapper.valueToTree(params) : null,\n");
			} else {
				sb.append("\t\t\tnull,\n");
			}
			sb.append("\t\t\tnull,\n");
			sb.append("\t\t\t").append(bodyEncodingLiteral(method.bodyEncoding())).append(",\n");
			sb.append("\t\t\tjava.util.Map.of(),\n");
			sb.append("\t\t\t/* isSearch */ ").append(isSearch).append("\n");
			sb.append("\t\t));\n");
		} else if (isMultipart && hasByteArrayFields) {
			emitMultipartByteArrayMethod(sb, method, typeName, className, pathExpr, hasQueryType, hasBodyType, httpMethod, isSearch, isAsync, responseTypeName);
		} else {
			var encodingLiteral = bodyEncodingLiteral(method.bodyEncoding());
			if (isAsync) {
				sb.append("\t\treturn http.requestAsync(new RequestOptions(\n");
			} else {
				sb.append("\t\treturn mapper.convertValue(http.request(new RequestOptions(\n");
			}
			sb.append("\t\t\t\"").append(method.httpMethod()).append("\",\n");
			sb.append("\t\t\t").append(pathExpr).append(",\n");

			if (hasQueryType) {
				sb.append("\t\t\tparams != null ? mapper.valueToTree(params) : null,\n");
			} else {
				sb.append("\t\t\tnull,\n");
			}

			if (hasBodyType) {
				if (method.bodyRequired()) {
					sb.append("\t\t\tmapper.valueToTree(body),\n");
				} else {
					sb.append("\t\t\tbody != null ? mapper.valueToTree(body) : null,\n");
				}
				sb.append("\t\t\t").append(encodingLiteral).append(",\n");
				sb.append("\t\t\tjava.util.Map.of(),\n");
			} else {
				sb.append("\t\t\tnull,\n");
				sb.append("\t\t\t").append(encodingLiteral).append(",\n");
				sb.append("\t\t\tjava.util.Map.of(),\n");
			}

			sb.append("\t\t\t/* isSearch */ ").append(isSearch).append("\n");
			if (isAsync) {
				sb.append("\t\t)).thenApply(node -> mapper.convertValue(node, ").append(responseTypeName).append(".class));\n");
			} else {
				sb.append("\t\t)), ").append(responseTypeName).append(".class);\n");
			}
		}

		sb.append("\t}");
		return sb.toString();
	}

	private static void emitMultipartByteArrayMethod(
		StringBuilder sb, MethodDefinition method, String typeName, String className,
		String pathExpr, boolean hasQueryType, boolean hasBodyType, String httpMethod, boolean isSearch,
		boolean isAsync, String responseTypeName
	) {
		var serializableProps = method.bodyProperties().stream()
			.filter(p -> !"Blob".equals(p.type()))
			.toList();
		var byteArrayFieldNames = method.bodyProperties().stream()
			.filter(p -> "Blob".equals(p.type()))
			.map(BodyProperty::name)
			.toList();

		var indent = method.bodyRequired() ? "\t\t" : "\t\t\t";

		Runnable emitBody = () -> {
			// Build JsonNode from non-ByteArray fields
			if (!serializableProps.isEmpty()) {
				sb.append(indent).append("var jsonBody = mapper.createObjectNode();\n");
				for (var prop : serializableProps) {
					var camelName = Naming.snakeToCamel(Naming.sanitizeName(prop.name()));
					if (prop.required()) {
						sb.append(indent).append("jsonBody.putPOJO(\"").append(prop.name()).append("\", body.").append(camelName).append("());\n");
					} else {
						sb.append(indent).append("if (body.").append(camelName).append("() != null) jsonBody.putPOJO(\"").append(prop.name()).append("\", body.").append(camelName).append("());\n");
					}
				}
			}

			// Build byteArrayFields map — use LinkedHashMap for deterministic order
			sb.append(indent).append("var byteFields = new java.util.LinkedHashMap<String, byte[]>();\n");
			for (var name : byteArrayFieldNames) {
				var camelName = Naming.snakeToCamel(Naming.sanitizeName(name));
				var prop = method.bodyProperties().stream().filter(p -> p.name().equals(name)).findFirst().orElse(null);
				if (prop != null && prop.required()) {
					sb.append(indent).append("byteFields.put(\"").append(name).append("\", body.").append(camelName).append("());\n");
				} else {
					sb.append(indent).append("if (body.").append(camelName).append("() != null) byteFields.put(\"").append(name).append("\", body.").append(camelName).append("());\n");
				}
			}

			if (isAsync) {
				sb.append(indent).append("return http.requestAsync(new RequestOptions(\n");
			} else {
				sb.append(indent).append("return mapper.convertValue(http.request(new RequestOptions(\n");
			}
			sb.append(indent).append("\t\"").append(method.httpMethod()).append("\",\n");
			sb.append(indent).append("\t").append(pathExpr).append(",\n");

			if (hasQueryType) {
				sb.append(indent).append("\tparams != null ? mapper.valueToTree(params) : null,\n");
			} else {
				sb.append(indent).append("\tnull,\n");
			}

			if (!serializableProps.isEmpty()) {
				sb.append(indent).append("\tjsonBody,\n");
			} else {
				sb.append(indent).append("\tnull,\n");
			}
			sb.append(indent).append("\tcom.lolzteam.api.runtime.BodyEncoding.MULTIPART,\n");
			sb.append(indent).append("\tbyteFields,\n");
			sb.append(indent).append("\t/* isSearch */ ").append(isSearch).append("\n");
			if (isAsync) {
				sb.append(indent).append(")).thenApply(node -> mapper.convertValue(node, ").append(responseTypeName).append(".class));\n");
			} else {
				sb.append(indent).append(")), ").append(responseTypeName).append(".class);\n");
			}
		};

		if (method.bodyRequired()) {
			emitBody.run();
		} else {
			sb.append("\t\tif (body != null) {\n");
			emitBody.run();
			sb.append("\t\t} else {\n");
			if (isAsync) {
				sb.append("\t\t\treturn http.requestAsync(new RequestOptions(\n");
			} else {
				sb.append("\t\t\treturn mapper.convertValue(http.request(new RequestOptions(\n");
			}
			sb.append("\t\t\t\t\"").append(method.httpMethod()).append("\",\n");
			sb.append("\t\t\t\t").append(pathExpr).append(",\n");
			if (hasQueryType) {
				sb.append("\t\t\t\tparams != null ? mapper.valueToTree(params) : null,\n");
			} else {
				sb.append("\t\t\t\tnull,\n");
			}
			sb.append("\t\t\t\tnull,\n");
			sb.append("\t\t\t\tcom.lolzteam.api.runtime.BodyEncoding.MULTIPART,\n");
			sb.append("\t\t\t\tjava.util.Map.of(),\n");
			sb.append("\t\t\t\t/* isSearch */ ").append(isSearch).append("\n");
			if (isAsync) {
				sb.append("\t\t\t)).thenApply(node -> mapper.convertValue(node, ").append(responseTypeName).append(".class));\n");
			} else {
				sb.append("\t\t\t)), ").append(responseTypeName).append(".class);\n");
			}
			sb.append("\t\t}\n");
		}
	}

	private static String emitOverloadWithoutParams(ParsedGroup group, MethodDefinition method, boolean isAsync) {
		var typeName = Naming.buildTypeName(group.groupName(), method.methodName());
		var className = Naming.groupToClassName(group.groupName());
		var sb = new StringBuilder();

		// Build reduced argument list (no params/body or only required)
		var args = new ArrayList<String>();
		var callArgs = new ArrayList<String>();

		// Path params always required
		for (var param : method.params().pathParams()) {
			var javaType = Transforms.toJavaPathParamType(param.type());
			var name = Naming.snakeToCamel(param.name());
			args.add(javaType + " " + name);
			callArgs.add(name);
		}

		var hasBodyType = method.hasBody() && (!method.bodyProperties().isEmpty() || method.bodyIsArray());
		if (hasBodyType && method.bodyRequired()) {
			var bodyTypeName = "Types." + className + "Types." + typeName + "Body";
			if (method.bodyIsArray()) {
				var itemType = Transforms.toJavaType(method.bodyArrayItemType() != null ? method.bodyArrayItemType() : "unknown");
				bodyTypeName = "List<" + itemType + ">";
			}
			args.add(bodyTypeName + " body");
			callArgs.add("body");
		} else if (hasBodyType) {
			callArgs.add("null");
		}

		var hasQueryType = !method.params().queryParams().isEmpty();
		if (hasQueryType) {
			callArgs.add("null");
		}

		var responseTypeName = "Types." + className + "Types." + typeName + "Response";
		var isHtml = method.htmlResponse();
		var returnType = isHtml
			? (isAsync ? "CompletableFuture<String>" : "String")
			: (isAsync ? "CompletableFuture<" + responseTypeName + ">" : responseTypeName);
		var methodSuffix = isAsync ? "Async" : "";

		sb.append("\tpublic ").append(returnType).append(" ").append(method.methodName())
			.append(methodSuffix).append("(").append(String.join(", ", args)).append(") {\n");
		sb.append("\t\treturn ").append(method.methodName()).append(methodSuffix)
			.append("(").append(String.join(", ", callArgs)).append(");\n");
		sb.append("\t}");

		return sb.toString();
	}

	private static boolean needsOverload(MethodDefinition method) {
		var hasBodyType = method.hasBody() && (!method.bodyProperties().isEmpty() || method.bodyIsArray());
		var hasQueryType = !method.params().queryParams().isEmpty();
		// Need overload if there are optional body or query params
		return (hasBodyType && !method.bodyRequired()) || hasQueryType;
	}

	private static String emitGroupClass(ParsedGroup group) {
		var className = Naming.groupToClassName(group.groupName());
		var sb = new StringBuilder();

		sb.append("public static class ").append(className).append(" {\n\n");
		sb.append("\tprivate final LolzteamHttpClient http;\n");
		sb.append("\tprivate final com.fasterxml.jackson.databind.ObjectMapper mapper;\n\n");
		sb.append("\tpublic ").append(className).append("(LolzteamHttpClient http) {\n");
		sb.append("\t\tthis.http = http;\n");
		sb.append("\t\tthis.mapper = http.objectMapper();\n");
		sb.append("\t}\n");

		for (var method : group.methods()) {
			// Sync full method
			sb.append("\n");
			sb.append(emitJavaMethod(group.groupName(), method, false));
			sb.append("\n");

			// Sync overload without optional params
			if (needsOverload(method)) {
				sb.append("\n");
				sb.append(emitOverloadWithoutParams(group, method, false));
				sb.append("\n");
			}

			// Async full method
			sb.append("\n");
			sb.append(emitJavaMethod(group.groupName(), method, true));
			sb.append("\n");

			// Async overload without optional params
			if (needsOverload(method)) {
				sb.append("\n");
				sb.append(emitOverloadWithoutParams(group, method, true));
				sb.append("\n");
			}
		}

		sb.append("}\n");
		return sb.toString();
	}

	static String emitJavaClientFile(
		List<ParsedGroup> groups,
		String clientName,
		String defaultBaseUrl,
		int defaultRateLimit,
		String subPackage,
		int defaultSearchRateLimit
	) {
		var fullPackage = PACKAGE + "." + subPackage;
		var sb = new StringBuilder();

		sb.append("// Auto-generated. Do not edit manually.\n\n");
		sb.append("package ").append(fullPackage).append(";\n\n");
		sb.append("import com.fasterxml.jackson.databind.JsonNode;\n");
		sb.append("import com.lolzteam.api.runtime.ClientConfig;\n");
		sb.append("import com.lolzteam.api.runtime.LolzteamHttpClient;\n");
		sb.append("import com.lolzteam.api.runtime.RateLimitConfig;\n");
		sb.append("import com.lolzteam.api.runtime.RequestOptions;\n\n");
		sb.append("import java.io.Closeable;\n");
		sb.append("import java.util.List;\n");
		sb.append("import java.util.concurrent.CompletableFuture;\n\n");

		// Main client class
		sb.append("public class ").append(clientName).append(" implements Closeable {\n\n");

		// Group API classes (as public static inner classes)
		for (var group : groups) {
			var groupClass = emitGroupClass(group);
			// Add one level of indentation to nest inside client class
			sb.append("\t").append(groupClass.replace("\n", "\n\t").stripTrailing()).append("\n\n");
		}

		// Properties
		for (var group : groups) {
			var propClassName = Naming.groupToClassName(group.groupName());
			var propName = Naming.groupToPropertyName(group.groupName());
			sb.append("\tprivate final ").append(propClassName).append(" ").append(propName).append(";\n");
		}

		sb.append("\n\tprivate final LolzteamHttpClient http;\n\n");

		// Constructor
		sb.append("\tpublic ").append(clientName).append("(ClientConfig config) {\n");
		sb.append("\t\tvar resolvedConfig = config.withBaseUrl(\n");
		sb.append("\t\t\tconfig.baseUrl() != null ? config.baseUrl() : \"").append(defaultBaseUrl).append("\"\n");
		sb.append("\t\t).withRateLimit(\n");
		sb.append("\t\t\tconfig.rateLimit() != null ? config.rateLimit() : new RateLimitConfig(").append(defaultRateLimit).append(")\n");
		sb.append("\t\t);\n");
		if (defaultSearchRateLimit > 0) {
			sb.append("\t\tresolvedConfig = resolvedConfig.withSearchRateLimit(\n");
			sb.append("\t\t\tconfig.searchRateLimit() != null ? config.searchRateLimit() : new RateLimitConfig(").append(defaultSearchRateLimit).append(")\n");
			sb.append("\t\t);\n");
		}
		sb.append("\t\tthis.http = new LolzteamHttpClient(resolvedConfig);\n\n");

		for (var group : groups) {
			var propClassName = Naming.groupToClassName(group.groupName());
			var propName = Naming.groupToPropertyName(group.groupName());
			sb.append("\t\tthis.").append(propName).append(" = new ").append(propClassName).append("(http);\n");
		}

		sb.append("\t}\n\n");

		// Getters
		for (var group : groups) {
			var propClassName = Naming.groupToClassName(group.groupName());
			var propName = Naming.groupToPropertyName(group.groupName());
			sb.append("\tpublic ").append(propClassName).append(" ").append(propName).append("() {\n");
			sb.append("\t\treturn ").append(propName).append(";\n");
			sb.append("\t}\n\n");
		}

		// Close
		sb.append("\t@Override\n");
		sb.append("\tpublic void close() {\n");
		sb.append("\t\thttp.close();\n");
		sb.append("\t}\n");

		sb.append("}\n");

		return sb.toString();
	}
}
