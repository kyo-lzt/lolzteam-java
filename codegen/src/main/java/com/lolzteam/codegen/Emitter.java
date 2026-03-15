package com.lolzteam.codegen;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

final class Emitter {

	private static final String PACKAGE = "com.lolzteam.api.generated";

	private Emitter() {
	}

	// ─── Types File ───────────────────────────────────────────────────

	private static String emitQueryParamsClass(String group, MethodDefinition method) {
		if (method.params().queryParams().isEmpty()) return null;

		var typeName = Naming.buildTypeName(group, method.methodName()) + "Params";
		var sb = new StringBuilder();
		sb.append("\tpublic record ").append(typeName).append("(\n");

		var props = new ArrayList<String>();
		for (var param : method.params().queryParams()) {
			var javaType = Transforms.toJavaType(param.type());
			var fieldName = Naming.safeJavaName(param.name());
			var annotation = Naming.needsJsonProperty(param.name())
				? "\t\t@JsonProperty(\"" + param.name() + "\") "
				: "\t\t";
			props.add(annotation + javaType + " " + fieldName);
		}
		sb.append(String.join(",\n", props)).append("\n");
		sb.append("\t) {\n");

		// Builder-style static factory for optional params
		sb.append("\t\tpublic ").append(typeName).append("() {\n");
		sb.append("\t\t\tthis(");
		var defaults = method.params().queryParams().stream()
			.map(p -> "null")
			.collect(Collectors.joining(", "));
		sb.append(defaults);
		sb.append(");\n");
		sb.append("\t\t}\n");
		sb.append("\t}");
		return sb.toString();
	}

	private static String emitBodyClass(String group, MethodDefinition method) {
		if (!method.hasBody()) return null;

		var typeName = Naming.buildTypeName(group, method.methodName()) + "Body";

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
			var javaType = "Blob".equals(prop.type()) ? "byte[]" : Transforms.toJavaType(prop.type());
			var fieldName = Naming.safeJavaName(prop.name());
			String annotation;
			if (!hasByteArrayFields && Naming.needsJsonProperty(prop.name())) {
				annotation = "\t\t@JsonProperty(\"" + prop.name() + "\") ";
			} else {
				annotation = "\t\t";
			}
			props.add(annotation + javaType + " " + fieldName);
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
						var jt = "Blob".equals(p.type()) ? "byte[]" : Transforms.toJavaType(p.type());
						return jt + " " + Naming.safeJavaName(p.name());
					})
					.collect(Collectors.joining(", "));
				sb.append(reqParams).append(") {\n");
				sb.append("\t\t\tthis(");
				var allArgs = method.bodyProperties().stream()
					.map(p -> p.required() ? Naming.safeJavaName(p.name()) : "null")
					.collect(Collectors.joining(", "));
				sb.append(allArgs).append(");\n");
				sb.append("\t\t}\n");
			} else {
				sb.append("\t\tpublic ").append(typeName).append("() {\n");
				sb.append("\t\t\tthis(");
				var nulls = method.bodyProperties().stream()
					.map(p -> "null")
					.collect(Collectors.joining(", "));
				sb.append(nulls).append(");\n");
				sb.append("\t\t}\n");
			}
		}

		sb.append("\t}");
		return sb.toString();
	}

	private static String emitResponseRecord(String group, MethodDefinition method) {
		var typeName = Naming.buildTypeName(group, method.methodName()) + "Response";
		var sb = new StringBuilder();
		sb.append("\tpublic record ").append(typeName).append("(JsonNode data) {\n");
		sb.append("\t\t@JsonCreator(mode = JsonCreator.Mode.DELEGATING)\n");
		sb.append("\t\tpublic ").append(typeName).append(" {}\n");
		sb.append("\t}");
		return sb.toString();
	}

	static String emitJavaTypesFile(List<ParsedGroup> groups, String subPackage) {
		var sb = new StringBuilder();
		var fullPackage = PACKAGE + "." + subPackage;

		sb.append("// Auto-generated. Do not edit manually.\n\n");
		sb.append("package ").append(fullPackage).append(";\n\n");
		sb.append("import com.fasterxml.jackson.annotation.JsonCreator;\n");
		sb.append("import com.fasterxml.jackson.annotation.JsonProperty;\n");
		sb.append("import com.fasterxml.jackson.databind.JsonNode;\n");
		sb.append("import java.util.List;\n\n");

		sb.append("public final class Types {\n\n");
		sb.append("\tprivate Types() {\n\t}\n\n");

		for (var group : groups) {
			var className = Naming.groupToClassName(group.groupName());
			var groupTypes = new ArrayList<String>();

			for (var method : group.methods()) {
				var queryType = emitQueryParamsClass(group.groupName(), method);
				if (queryType != null) groupTypes.add(queryType);

				var bodyType = emitBodyClass(group.groupName(), method);
				if (bodyType != null) groupTypes.add(bodyType);

				groupTypes.add(emitResponseRecord(group.groupName(), method));
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
		var returnType = isAsync ? "CompletableFuture<" + responseTypeName + ">" : responseTypeName;
		var methodSuffix = isAsync ? "Async" : "";
		var httpMethod = isAsync ? "requestAsync" : "request";

		sb.append("\tpublic ").append(returnType).append(" ").append(method.methodName())
			.append(methodSuffix).append("(").append(argStr).append(") {\n");

		var hasByteArrayFields = method.bodyProperties().stream().anyMatch(p -> "Blob".equals(p.type()));
		var isMultipart = "multipart".equals(method.bodyEncoding());

		var isSearch = group.equalsIgnoreCase("category");

		if (isMultipart && hasByteArrayFields) {
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

			// Build byteArrayFields map
			sb.append(indent).append("var byteFields = new java.util.HashMap<String, byte[]>();\n");
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
		var returnType = isAsync ? "CompletableFuture<" + responseTypeName + ">" : responseTypeName;
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
