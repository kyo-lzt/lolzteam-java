package com.lolzteam.codegen;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Scans parsed groups for parameters/body fields with enum values and builds
 * deduplicated enum definitions. Resolves name conflicts by prefixing with the
 * operation group when the same param name maps to different value sets.
 */
final class EnumCollector {

	private EnumCollector() {
	}

	/**
	 * An enum occurrence tied to a specific param/body field.
	 */
	record EnumOccurrence(String group, String paramName, String valueType, List<String> values) {
	}

	/**
	 * Result of collecting enums: definitions to emit + a lookup from (operationId, paramName) to enum type name.
	 */
	record CollectResult(
		Map<String, EnumDefinition> definitions,
		Map<String, String> paramToEnumType
	) {
		/**
		 * Look up the enum type name for a given operationId + param name combo.
		 * Returns null if no enum applies.
		 */
		String resolve(String operationId, String paramName) {
			var key = operationId + ":" + paramName;
			return paramToEnumType.get(key);
		}
	}

	static CollectResult collect(List<ParsedGroup> groups) {
		// Step 1: gather all enum occurrences with their operation context
		var occurrences = new ArrayList<OccurrenceWithOpId>();
		for (var group : groups) {
			for (var method : group.methods()) {
				for (var param : method.params().queryParams()) {
					var enumValues = parseEnumValues(param.type());
					if (enumValues != null) {
						occurrences.add(new OccurrenceWithOpId(
							method.operationId(), group.groupName(), param.name(),
							detectValueType(enumValues), enumValues
						));
					}
				}
				for (var prop : method.bodyProperties()) {
					var enumValues = parseEnumValues(prop.type());
					if (enumValues != null) {
						occurrences.add(new OccurrenceWithOpId(
							method.operationId(), group.groupName(), prop.name(),
							detectValueType(enumValues), enumValues
						));
					}
				}
			}
		}

		// Step 2: group by param name, detect conflicts (same name, different value sets)
		var byParamName = new LinkedHashMap<String, List<OccurrenceWithOpId>>();
		for (var occ : occurrences) {
			byParamName.computeIfAbsent(occ.paramName, k -> new ArrayList<>()).add(occ);
		}

		var definitions = new LinkedHashMap<String, EnumDefinition>();
		var paramToEnumType = new LinkedHashMap<String, String>();

		for (var entry : byParamName.entrySet()) {
			var paramName = entry.getKey();
			var occs = entry.getValue();

			// Group by distinct value set
			var distinctValueSets = new LinkedHashMap<List<String>, List<OccurrenceWithOpId>>();
			for (var occ : occs) {
				distinctValueSets.computeIfAbsent(occ.values, k -> new ArrayList<>()).add(occ);
			}

			if (distinctValueSets.size() == 1) {
				// No conflict: single enum type for this param name
				var first = occs.get(0);
				var enumTypeName = paramNameToEnumTypeName(paramName);
				var def = new EnumDefinition(enumTypeName, first.valueType, first.values);
				definitions.put(enumTypeName, def);
				for (var occ : occs) {
					paramToEnumType.put(occ.operationId + ":" + occ.paramName, enumTypeName);
				}
			} else {
				// Conflict: prefix with group name, disambiguate further if needed
				var usedNames = new java.util.HashSet<String>();
				for (var vsEntry : distinctValueSets.entrySet()) {
					var values = vsEntry.getKey();
					var groupOccs = vsEntry.getValue();

					var representativeGroup = groupOccs.get(0).group;
					var baseName = Naming.capitalizeFirst(representativeGroup)
						+ paramNameToEnumTypeName(paramName);

					// If base name already used, append method name from operationId
					var enumTypeName = baseName;
					if (!usedNames.add(enumTypeName)) {
						var opParts = groupOccs.get(0).operationId.split("\\.");
						var methodSuffix = opParts.length > 1
							? Naming.capitalizeFirst(opParts[opParts.length - 1])
							: "";
						enumTypeName = baseName + methodSuffix;
						usedNames.add(enumTypeName);
					}

					var def = new EnumDefinition(enumTypeName, groupOccs.get(0).valueType, values);
					definitions.put(enumTypeName, def);
					for (var occ : groupOccs) {
						paramToEnumType.put(occ.operationId + ":" + occ.paramName, enumTypeName);
					}
				}
			}
		}

		return new CollectResult(definitions, paramToEnumType);
	}

	/**
	 * Parse the intermediate type string produced by schemaToTypeString to extract enum values.
	 * Enum types look like: {@code "rub" | "uah"} (string) or {@code integer} with the raw values
	 * captured in the type string as literals like {@code 0 | 2 | 21}.
	 * Returns null if the type is not an enum.
	 */
	private static List<String> parseEnumValues(String typeString) {
		if (typeString == null || typeString.isEmpty()) return null;

		var parts = typeString.split("\\s*\\|\\s*");
		if (parts.length < 1) return null;

		var values = new ArrayList<String>();
		for (var part : parts) {
			var trimmed = part.trim();
			if (trimmed.startsWith("\"") && trimmed.endsWith("\"")) {
				// String literal: strip quotes
				values.add(trimmed.substring(1, trimmed.length() - 1));
			} else if (trimmed.matches("-?\\d+")) {
				// Integer literal
				values.add(trimmed);
			} else {
				// Not a simple enum (could be union of types like "string | integer")
				return null;
			}
		}
		return values;
	}

	/**
	 * Detect whether enum values are strings or integers.
	 */
	private static String detectValueType(List<String> values) {
		for (var v : values) {
			if (!v.matches("-?\\d+")) return "string";
		}
		return "integer";
	}

	/**
	 * Convert a snake_case param name to a PascalCase enum type name.
	 */
	private static String paramNameToEnumTypeName(String paramName) {
		var sanitized = Naming.sanitizeName(paramName);
		var camel = Naming.snakeToCamel(sanitized);
		var result = Naming.capitalizeFirst(camel);
		// Ensure valid Java identifier start
		if (!result.isEmpty() && Character.isDigit(result.charAt(0))) {
			result = "_" + result;
		}
		return result;
	}

	private record OccurrenceWithOpId(
		String operationId, String group, String paramName,
		String valueType, List<String> values
	) {
	}
}
