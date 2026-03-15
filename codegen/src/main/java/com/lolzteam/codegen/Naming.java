package com.lolzteam.codegen;

import java.util.Set;
import java.util.regex.Pattern;

final class Naming {

	private static final Set<String> JAVA_KEYWORDS = Set.of(
		"abstract", "assert", "boolean", "break", "byte", "case", "catch", "char",
		"class", "const", "continue", "default", "do", "double", "else", "enum",
		"extends", "final", "finally", "float", "for", "goto", "if", "implements",
		"import", "instanceof", "int", "interface", "long", "native", "new",
		"package", "private", "protected", "public", "return", "short", "static",
		"strictfp", "super", "switch", "synchronized", "this", "throw", "throws",
		"transient", "try", "void", "volatile", "while"
	);

	private static final Pattern SNAKE_PATTERN = Pattern.compile("_([a-z])");
	private static final Pattern KEBAB_PATTERN1 = Pattern.compile("([a-z0-9])([A-Z])");
	private static final Pattern KEBAB_PATTERN2 = Pattern.compile("([A-Z])([A-Z][a-z])");

	private Naming() {
	}

	/** Extract method name from operationId: everything after first dot, camelCased. */
	static String operationIdToMethod(String operationId) {
		var parts = operationId.split("\\.");
		if (parts.length < 2) return lowercaseFirst(operationId);
		var sb = new StringBuilder();
		for (int i = 1; i < parts.length; i++) {
			var part = parts[i];
			if (i == 1) {
				sb.append(isAllUppercase(part) ? part.toLowerCase() : lowercaseFirst(part));
			} else {
				var p = isAllUppercase(part) ? part.toLowerCase() : part;
				sb.append(capitalizeFirst(p));
			}
		}
		return sb.toString();
	}

	/** Extract group name from operationId: first segment. */
	static String operationIdToGroup(String operationId) {
		var first = operationId.split("\\.")[0];
		var group = lowercaseFirst(first);
		if ("manging".equals(group)) return "managing";
		return group;
	}

	/** Convert tag to camelCase property name. */
	static String groupToPropertyName(String tag) {
		return lowercaseFirst(tag);
	}

	/** Convert tag to class name: PascalCase + "Api". */
	static String groupToClassName(String tag) {
		return capitalizeFirst(tag) + "Api";
	}

	/** Build a type name prefix from group + method. */
	static String buildTypeName(String group, String method) {
		return capitalizeFirst(group) + capitalizeFirst(method);
	}

	static String snakeToCamel(String name) {
		var matcher = SNAKE_PATTERN.matcher(name);
		var sb = new StringBuilder();
		while (matcher.find()) {
			matcher.appendReplacement(sb, matcher.group(1).toUpperCase());
		}
		matcher.appendTail(sb);
		return sb.toString();
	}

	/** Strip trailing [] from parameter names. */
	static String sanitizeName(String name) {
		if (name.endsWith("[]")) {
			return name.substring(0, name.length() - 2);
		}
		return name;
	}

	/** Convert a parameter name to a safe Java identifier. Uses _ suffix for keywords. */
	static String safeJavaName(String name) {
		var camel = snakeToCamel(sanitizeName(name));
		if (!camel.isEmpty() && Character.isDigit(camel.charAt(0))) {
			return "_" + camel;
		}
		if (JAVA_KEYWORDS.contains(camel)) {
			return camel + "_";
		}
		return camel;
	}

	/** Whether a parameter name needs @JsonProperty annotation. */
	static boolean needsJsonProperty(String name) {
		var sanitized = sanitizeName(name);
		var camel = snakeToCamel(sanitized);
		return !name.equals(camel) || !name.equals(sanitized)
			|| (!camel.isEmpty() && Character.isDigit(camel.charAt(0)));
	}

	static String lowercaseFirst(String s) {
		if (s.isEmpty()) return s;
		return Character.toLowerCase(s.charAt(0)) + s.substring(1);
	}

	static String capitalizeFirst(String s) {
		if (s.isEmpty()) return s;
		return Character.toUpperCase(s.charAt(0)) + s.substring(1);
	}

	private static boolean isAllUppercase(String s) {
		return s.length() > 1 && s.equals(s.toUpperCase());
	}
}
