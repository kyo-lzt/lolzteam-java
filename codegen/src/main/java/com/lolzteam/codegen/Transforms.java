package com.lolzteam.codegen;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

final class Transforms {

	private static final Pattern ARRAY_TYPE = Pattern.compile("^Array<(.+)>$");

	private Transforms() {
	}

	// ─── Ref Resolution ───────────────────────────────────────────────

	/** Follow a JSON pointer path like #/components/schemas/Foo. */
	static JsonNode resolveRef(String ref, JsonNode spec) {
		var parts = ref.replaceFirst("^#/", "").split("/");
		JsonNode current = spec;
		for (var part : parts) {
			if (!current.isObject()) return null;
			current = current.get(part);
			if (current == null) return null;
		}
		return current;
	}

	/** Shallow $ref resolution. */
	static JsonNode derefShallow(JsonNode value, JsonNode spec) {
		if (value.isObject()) {
			var refNode = value.get("$ref");
			if (refNode != null && refNode.isTextual()) {
				var resolved = resolveRef(refNode.asText(), spec);
				if (resolved != null) {
					return derefShallow(resolved, spec);
				}
			}
		}
		return value;
	}

	/** Recursively resolve all $ref pointers. */
	static JsonNode derefDeep(JsonNode value, JsonNode spec, Set<String> visited) {
		var mapper = new ObjectMapper();
		if (value.isObject()) {
			var refNode = value.get("$ref");
			if (refNode != null && refNode.isTextual()) {
				var ref = refNode.asText();
				if (visited.contains(ref)) {
					return mapper.createObjectNode();
				}
				var newVisited = new HashSet<>(visited);
				newVisited.add(ref);
				var resolved = resolveRef(ref, spec);
				if (resolved == null) return value;
				return derefDeep(resolved, spec, newVisited);
			}
			var obj = mapper.createObjectNode();
			var fields = value.fields();
			while (fields.hasNext()) {
				var entry = fields.next();
				obj.set(entry.getKey(), derefDeep(entry.getValue(), spec, new HashSet<>(visited)));
			}
			return obj;
		}
		if (value.isArray()) {
			var arr = mapper.createArrayNode();
			for (var item : value) {
				arr.add(derefDeep(item, spec, new HashSet<>(visited)));
			}
			return arr;
		}
		return value;
	}

	// ─── OpenAPI Schema → Type String ─────────────────────────────────

	/** Convert an OpenAPI schema to an intermediate type string. */
	static String schemaToTypeString(JsonNode schema, JsonNode spec) {
		if (schema == null) return "unknown";
		if (schema.isObject() && schema.isEmpty()) return "unknown";

		// $ref
		if (schema.isObject()) {
			var refNode = schema.get("$ref");
			if (refNode != null && refNode.isTextual()) {
				var resolved = derefShallow(schema, spec);
				return schemaToTypeString(resolved, spec);
			}
		}

		if (!schema.isObject()) return "unknown";

		// Check type BEFORE enum — for non-string primitives with enum, emit as literal union
		var typeElEarly = schema.get("type");
		var typeEarly = typeElEarly != null && typeElEarly.isTextual() ? typeElEarly.asText() : null;
		if (typeEarly != null && ("integer".equals(typeEarly) || "number".equals(typeEarly) || "boolean".equals(typeEarly))) {
			var enumCheck = schema.get("enum");
			if (enumCheck != null && enumCheck.isArray() && !enumCheck.isEmpty()) {
				var literals = new ArrayList<String>();
				for (var el : enumCheck) {
					literals.add(el.asText());
				}
				return String.join(" | ", literals);
			}
		}

		// enum (string literals)
		var enumValues = schema.get("enum");
		if (enumValues != null && enumValues.isArray() && !enumValues.isEmpty()) {
			var literals = new ArrayList<String>();
			for (var el : enumValues) {
				if (el.isTextual()) {
					literals.add("\"" + el.asText().replace("\\", "\\\\").replace("\"", "\\\"") + "\"");
				} else if (el.isNumber() || el.isBoolean()) {
					literals.add(el.asText());
				}
			}
			if (!literals.isEmpty()) return String.join(" | ", literals);
		}

		// oneOf / anyOf
		var oneOf = schema.get("oneOf");
		if (oneOf != null && oneOf.isArray() && !oneOf.isEmpty()) {
			var types = new ArrayList<String>();
			for (var item : oneOf) types.add(schemaToTypeString(item, spec));
			return String.join(" | ", types);
		}
		var anyOf = schema.get("anyOf");
		if (anyOf != null && anyOf.isArray() && !anyOf.isEmpty()) {
			var types = new ArrayList<String>();
			for (var item : anyOf) types.add(schemaToTypeString(item, spec));
			return String.join(" | ", types);
		}

		// allOf
		var allOf = schema.get("allOf");
		if (allOf != null && allOf.isArray() && !allOf.isEmpty()) {
			var types = new ArrayList<String>();
			for (var item : allOf) types.add(schemaToTypeString(item, spec));
			return String.join(" & ", types);
		}

		// Multi-type array: type: ['string', 'integer']
		var typeEl = schema.get("type");
		if (typeEl != null && typeEl.isArray()) {
			var types = new ArrayList<String>();
			var hasNull = false;
			for (var t : typeEl) {
				var typeStr = t.asText();
				if ("null".equals(typeStr)) {
					hasNull = true;
				} else {
					types.add(primitiveType(typeStr));
				}
			}
			var result = String.join(" | ", types);
			return hasNull ? result + " | null" : result;
		}

		var type = typeEl != null && typeEl.isTextual() ? typeEl.asText() : null;

		if ("array".equals(type)) {
			var itemType = schemaToTypeString(schema.get("items"), spec);
			return "Array<" + itemType + ">";
		}

		if ("object".equals(type) || schema.has("properties")) {
			var props = schema.get("properties");
			if (props == null || !props.isObject() || props.isEmpty()) {
				var addlProps = schema.get("additionalProperties");
				if (addlProps != null && !addlProps.isBoolean() && !addlProps.isTextual()) {
					var valType = schemaToTypeString(addlProps, spec);
					return "Record<string, " + valType + ">";
				}
				return "Record<string, unknown>";
			}
			return "{}";
		}

		if (type != null) return primitiveType(type);

		return "unknown";
	}

	private static String primitiveType(String t) {
		return switch (t) {
			case "string" -> "string";
			case "integer" -> "integer";
			case "number" -> "number";
			case "boolean" -> "boolean";
			case "null" -> "null";
			default -> "unknown";
		};
	}

	/** Map intermediate type string to a native Java type suitable for path parameters. */
	static String toJavaPathParamType(String tsType) {
		// string | integer → StringOrInt
		if (tsType.contains(" | ")) {
			var parts = tsType.split(" \\| ");
			var nonNull = new java.util.ArrayList<String>();
			for (var p : parts) {
				var trimmed = p.trim();
				if (!"null".equals(trimmed)) nonNull.add(trimmed);
			}
			if (nonNull.size() == 2
				&& nonNull.contains("string") && nonNull.contains("integer")) {
				return "com.lolzteam.api.runtime.StringOrInt";
			}
		}
		return switch (tsType) {
			case "integer" -> "long";
			case "string" -> "String";
			case "number" -> "double";
			case "boolean" -> "boolean";
			default -> "String";
		};
	}

	/** Map intermediate type string to Java type. */
	static String toJavaType(String tsType) {
		// allOf intersection types — split on " & " first
		if (tsType.contains(" & ")) {
			var allOfParts = tsType.split(" & ");
			if (allOfParts.length > 1) {
				return "JsonNode";
			}
		}

		// Union types
		if (tsType.contains(" | ")) {
			var parts = tsType.split(" \\| ");
			var nonNull = new ArrayList<String>();
			for (var p : parts) {
				var trimmed = p.trim();
				if (!"null".equals(trimmed)) {
					nonNull.add(trimmed);
				}
			}
			if (nonNull.size() == 1 && parts.length > nonNull.size()) {
				// nullable single type
				return toJavaType(nonNull.get(0));
			}
			// string | integer → StringOrInt
			if (nonNull.size() == 2
				&& nonNull.contains("string") && nonNull.contains("integer")) {
				return "com.lolzteam.api.runtime.StringOrInt";
			}
			// All string literals → String
			if (!nonNull.isEmpty() && nonNull.stream().allMatch(s -> s.startsWith("\"") && s.endsWith("\""))) {
				return "String";
			}
			// All integer literals → Long
			if (!nonNull.isEmpty() && nonNull.stream().allMatch(s -> s.matches("-?\\d+"))) {
				return "Long";
			}
			return "JsonNode";
		}

		// Array<T>
		var arrayMatch = ARRAY_TYPE.matcher(tsType);
		if (arrayMatch.matches()) {
			return "List<" + toJavaType(arrayMatch.group(1)) + ">";
		}

		// Record<string, T> → Map<String, JavaType>
		var recordMatch = Pattern.compile("^Record<string, (.+)>$").matcher(tsType);
		if (recordMatch.matches()) {
			return "Map<String, " + toJavaType(recordMatch.group(1)) + ">";
		}

		// Inline objects
		if (tsType.startsWith("{")) {
			return "JsonNode";
		}

		return switch (tsType) {
			case "string" -> "String";
			case "number" -> "Double";
			case "integer" -> "Long";
			case "boolean" -> "Boolean";
			case "unknown" -> "JsonNode";
			case "Blob" -> "byte[]";
			default -> {
				if (tsType.startsWith("\"") || tsType.matches("^\\d+$")) {
					yield "String";
				}
				yield "JsonNode";
			}
		};
	}

	// ─── Parameter Extraction ─────────────────────────────────────────

	static OperationParameters extractParameters(JsonNode operation, JsonNode spec) {
		var pathParams = new ArrayList<ParsedParameter>();
		var queryParams = new ArrayList<ParsedParameter>();

		var rawParams = operation.get("parameters");
		if (rawParams == null || !rawParams.isArray()) {
			return new OperationParameters(pathParams, queryParams);
		}

		for (var rawParam : rawParams) {
			var param = derefShallow(rawParam, spec);
			if (!param.isObject()) continue;
			var inValue = param.has("in") ? param.get("in").asText() : null;
			if (inValue == null || "header".equals(inValue) || "cookie".equals(inValue)) continue;

			var nameNode = param.get("name");
			if (nameNode == null) continue;
			var name = nameNode.asText();
			var schemaNode = param.get("schema");
			var type = schemaToTypeString(schemaNode, spec);
			var required = param.has("required") && param.get("required").asBoolean(false);
			var defaultValue = extractDefaultValue(schemaNode);

			var parsed = new ParsedParameter(
				name,
				type,
				"path".equals(inValue) || required,
				defaultValue
			);

			if ("path".equals(inValue)) {
				pathParams.add(parsed);
			} else if ("query".equals(inValue)) {
				queryParams.add(parsed);
			}
		}

		return new OperationParameters(pathParams, queryParams);
	}

	// ─── Body Extraction ──────────────────────────────────────────────

	static BodyExtractionResult extractBody(JsonNode operation, JsonNode spec) {
		var empty = new BodyExtractionResult(List.of());

		var rawRequestBody = operation.get("requestBody");
		if (rawRequestBody == null) return empty;

		var requestBody = derefShallow(rawRequestBody, spec);
		if (!requestBody.isObject()) return empty;

		var content = requestBody.get("content");
		if (content == null || !content.isObject()) return empty;

		// 3-way content-type detection
		var hasForm = content.has("application/x-www-form-urlencoded");
		var hasJson = content.has("application/json");
		var hasMultipart = content.has("multipart/form-data");

		String bodyEncoding;
		if (hasMultipart && !hasForm) {
			bodyEncoding = "multipart";
		} else if (hasJson && !hasForm) {
			bodyEncoding = "json";
		} else {
			bodyEncoding = "form";
		}

		// Pick schema from best available content type
		JsonNode mediaType = content.get("application/x-www-form-urlencoded");
		if (mediaType == null) mediaType = content.get("application/json");
		if (mediaType == null) mediaType = content.get("multipart/form-data");
		if (mediaType == null || !mediaType.isObject()) return empty;

		var schema = mediaType.get("schema");
		if (schema == null || !schema.isObject()) return empty;

		// Array body
		var schemaType = schema.has("type") ? schema.get("type").asText() : null;
		if ("array".equals(schemaType) && !schema.has("properties")) {
			var items = schema.get("items");
			var itemType = items != null ? schemaToTypeString(items, spec) : "unknown";
			return new BodyExtractionResult(List.of(), true, itemType, bodyEncoding);
		}

		var bodyProperties = new ArrayList<BodyProperty>();

		// oneOf
		var oneOf = schema.get("oneOf");
		if (oneOf != null && oneOf.isArray()) {
			// Try to detect discriminated union
			var union = detectDiscriminatedUnion(oneOf, spec);

			var allProps = new LinkedHashMap<String, JsonNode>();
			// Collect which property names appear in each variant and their required sets
			var variantPropertyNames = new ArrayList<Set<String>>();
			var variantRequiredSets = new ArrayList<Set<String>>();
			for (var variant : oneOf) {
				if (!variant.isObject()) continue;
				var variantProps = variant.get("properties");
				if (variantProps == null || !variantProps.isObject()) continue;
				var names = new HashSet<String>();
				var fields = variantProps.fields();
				while (fields.hasNext()) {
					var entry = fields.next();
					names.add(entry.getKey());
					allProps.put(entry.getKey(), entry.getValue());
				}
				variantPropertyNames.add(names);
				var reqSet = new HashSet<String>();
				var reqArr = variant.get("required");
				if (reqArr != null && reqArr.isArray()) {
					for (var r : reqArr) {
						reqSet.add(r.asText());
					}
				}
				variantRequiredSets.add(reqSet);
			}
			// A field is required only if present AND required in ALL variants
			for (var entry : allProps.entrySet()) {
				var name = entry.getKey();
				var requiredInAll = true;
				for (int i = 0; i < variantPropertyNames.size(); i++) {
					if (!variantPropertyNames.get(i).contains(name)
						|| !variantRequiredSets.get(i).contains(name)) {
						requiredInAll = false;
						break;
					}
				}
				bodyProperties.add(new BodyProperty(
					entry.getKey(),
					schemaToTypeString(entry.getValue(), spec),
					requiredInAll
				));
			}

			return new BodyExtractionResult(bodyProperties, false, null, bodyEncoding, union);
		} else {
			var properties = schema.get("properties");
			if (properties != null && properties.isObject()) {
				var requiredSet = new HashSet<String>();
				var requiredArr = schema.get("required");
				if (requiredArr != null && requiredArr.isArray()) {
					for (var r : requiredArr) {
						requiredSet.add(r.asText());
					}
				}

				var fields = properties.fields();
				while (fields.hasNext()) {
					var entry = fields.next();
					var name = entry.getKey();
					var propSchema = entry.getValue();
					var format = propSchema.isObject() && propSchema.has("format")
						? propSchema.get("format").asText() : null;
					var type = "binary".equals(format) ? "Blob" : schemaToTypeString(propSchema, spec);
					var defaultVal = extractDefaultValue(propSchema);
					bodyProperties.add(new BodyProperty(name, type, requiredSet.contains(name), defaultVal));
				}
			}
		}

		return new BodyExtractionResult(bodyProperties, false, null, bodyEncoding);
	}

	// ─── Discriminated Union Detection ───────────────────────────────

	/**
	 * Detect if a oneOf array represents a discriminated union.
	 * Returns null if not a discriminated union.
	 *
	 * A discriminated union is detected when every variant has a property with
	 * a single-value enum, and that property name is the same across all variants.
	 */
	static DiscriminatedUnion detectDiscriminatedUnion(JsonNode oneOfArray, JsonNode spec) {
		if (oneOfArray == null || !oneOfArray.isArray() || oneOfArray.size() < 2) return null;

		// Find candidate discriminator: a property that in every variant has a single-value enum
		String discriminatorProp = null;
		String discriminatorType = null;

		for (int i = 0; i < oneOfArray.size(); i++) {
			var variant = oneOfArray.get(i);
			if (!variant.isObject()) return null;
			var props = variant.get("properties");
			if (props == null || !props.isObject()) return null;

			// For the first variant, find all candidates
			if (i == 0) {
				var fields = props.fields();
				while (fields.hasNext()) {
					var entry = fields.next();
					var propSchema = entry.getValue();
					if (propSchema.isObject() && propSchema.has("enum")) {
						var enumArr = propSchema.get("enum");
						if (enumArr.isArray() && enumArr.size() == 1) {
							discriminatorProp = entry.getKey();
							var typeNode = propSchema.get("type");
							discriminatorType = typeNode != null && typeNode.isTextual()
								? typeNode.asText() : "string";
							break;
						}
					}
				}
				if (discriminatorProp == null) return null;
			} else {
				// Verify the candidate exists in this variant with a single-value enum
				var propSchema = props.get(discriminatorProp);
				if (propSchema == null || !propSchema.isObject()) return null;
				var enumArr = propSchema.get("enum");
				if (enumArr == null || !enumArr.isArray() || enumArr.size() != 1) return null;
			}
		}

		// Build variants
		var variants = new ArrayList<OneOfVariant>();
		for (var variant : oneOfArray) {
			var props = variant.get("properties");
			var titleNode = variant.get("title");
			var title = titleNode != null && titleNode.isTextual() ? titleNode.asText() : null;

			var discPropSchema = props.get(discriminatorProp);
			var discValue = discPropSchema.get("enum").get(0).asText();

			// Collect required fields for this variant
			var requiredSet = new HashSet<String>();
			var requiredArr = variant.get("required");
			if (requiredArr != null && requiredArr.isArray()) {
				for (var r : requiredArr) {
					requiredSet.add(r.asText());
				}
			}

			// Collect properties excluding the discriminator
			var variantProps = new ArrayList<BodyProperty>();
			var fields = props.fields();
			while (fields.hasNext()) {
				var entry = fields.next();
				var name = entry.getKey();
				if (name.equals(discriminatorProp)) continue;
				var propSchema = entry.getValue();
				var format = propSchema.isObject() && propSchema.has("format")
					? propSchema.get("format").asText() : null;
				var type = "binary".equals(format) ? "Blob" : schemaToTypeString(propSchema, spec);
				var defaultVal = extractDefaultValue(propSchema);
				variantProps.add(new BodyProperty(name, type, requiredSet.contains(name), defaultVal));
			}

			variants.add(new OneOfVariant(discValue, title, variantProps));
		}

		return new DiscriminatedUnion(discriminatorProp, discriminatorType, variants);
	}

	// ─── Response Extraction ──────────────────────────────────────────

	static String extractResponseType(JsonNode operation, JsonNode spec) {
		var responses = operation.get("responses");
		if (responses == null || !responses.isObject()) return "unknown";
		var rawSuccess = responses.get("200");
		if (rawSuccess == null) rawSuccess = responses.get("201");
		if (rawSuccess == null) return "unknown";
		var success = derefShallow(rawSuccess, spec);
		if (!success.isObject()) return "unknown";
		var content = success.get("content");
		if (content == null || !content.isObject()) return "unknown";
		var jsonContent = content.get("application/json");
		if (jsonContent == null || !jsonContent.isObject()) return "unknown";
		var rawSchema = jsonContent.get("schema");
		if (rawSchema == null) return "unknown";
		var schema = derefShallow(rawSchema, spec);
		return schemaToTypeString(schema, spec);
	}

	// ─── Raw Response Schema Extraction ──────────────────────────────

	/**
	 * Extract the raw (un-dereferenced) response schema from an operation.
	 * This preserves $ref pointers to component schemas.
	 */
	static JsonNode extractRawResponseSchema(JsonNode rawOperation, JsonNode rawSpec) {
		if (rawOperation == null) return null;
		var responses = rawOperation.get("responses");
		if (responses == null || !responses.isObject()) return null;

		var rawSuccess = responses.get("200");
		if (rawSuccess == null) rawSuccess = responses.get("201");
		if (rawSuccess == null) return null;

		// Resolve response-level $ref (e.g. $ref: #/components/responses/SaveChanges)
		var success = derefShallow(rawSuccess, rawSpec);
		if (!success.isObject()) return null;

		var content = success.get("content");
		if (content == null || !content.isObject()) return null;
		var jsonContent = content.get("application/json");
		if (jsonContent == null || !jsonContent.isObject()) return null;
		var schema = jsonContent.get("schema");
		return schema;
	}

	// ─── HTML Response Detection ────────────────────────────────────

	/** Check if an operation returns text/html (not application/json). */
	static boolean isHtmlResponse(JsonNode operation, JsonNode spec) {
		var responses = operation.get("responses");
		if (responses == null || !responses.isObject()) return false;
		var rawSuccess = responses.get("200");
		if (rawSuccess == null) rawSuccess = responses.get("201");
		if (rawSuccess == null) return false;
		var success = derefShallow(rawSuccess, spec);
		if (!success.isObject()) return false;
		var content = success.get("content");
		if (content == null || !content.isObject()) return false;
		return content.has("text/html") && !content.has("application/json");
	}

	// ─── Default Value Extraction ────────────────────────────────────

	/** Extract the "default" value from a schema node as a string, or null if absent. */
	static String extractDefaultValue(JsonNode schema) {
		if (schema == null || !schema.isObject()) return null;
		var defaultNode = schema.get("default");
		if (defaultNode == null || defaultNode.isNull()) return null;
		if (defaultNode.isTextual()) return defaultNode.asText();
		if (defaultNode.isBoolean()) return String.valueOf(defaultNode.asBoolean());
		if (defaultNode.isNumber()) return defaultNode.asText();
		return defaultNode.asText();
	}

	// ─── Method Definition ────────────────────────────────────────────

	static MethodDefinition extractMethodDefinition(
		String operationId,
		String methodName,
		String httpMethod,
		String path,
		JsonNode operation,
		JsonNode rawOperation,
		JsonNode rawSpec
	) {
		var emptySpec = new ObjectMapper().createObjectNode();
		var params = extractParameters(operation, emptySpec);
		var body = extractBody(operation, emptySpec);
		var responseType = extractResponseType(operation, emptySpec);

		var isGet = httpMethod.equalsIgnoreCase("GET");

		// GET requests can't have body — treat body properties as query params
		List<ParsedParameter> effectiveQueryParams;
		if (isGet) {
			var combined = new ArrayList<>(params.queryParams());
			for (var prop : body.properties()) {
				combined.add(new ParsedParameter(prop.name(), prop.type(), false, prop.defaultValue()));
			}
			effectiveQueryParams = combined;
		} else {
			effectiveQueryParams = params.queryParams();
		}

		var rawRequestBody = operation.get("requestBody");
		boolean bodyRequired;
		if (isGet) {
			bodyRequired = false;
		} else if (rawRequestBody != null) {
			var rb = derefShallow(rawRequestBody, emptySpec);
			bodyRequired = rb.isObject() && rb.has("required") && rb.get("required").asBoolean(false);
		} else {
			bodyRequired = false;
		}

		// Extract raw response schema (preserves $refs to component schemas)
		var rawResponseSchema = extractRawResponseSchema(rawOperation, rawSpec);

		// Detect text/html response
		var htmlResponse = isHtmlResponse(operation, emptySpec);

		return new MethodDefinition(
			operationId,
			methodName,
			httpMethod.toUpperCase(),
			path,
			new OperationParameters(params.pathParams(), effectiveQueryParams),
			isGet ? List.of() : body.properties(),
			!isGet && rawRequestBody != null,
			bodyRequired,
			responseType,
			!isGet && body.bodyIsArray(),
			isGet ? null : body.bodyArrayItemType(),
			isGet ? "form" : body.bodyEncoding(),
			rawResponseSchema,
			isGet ? null : body.discriminatedUnion(),
			htmlResponse
		);
	}
}
