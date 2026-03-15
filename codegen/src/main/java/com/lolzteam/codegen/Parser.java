package com.lolzteam.codegen;

import com.fasterxml.jackson.databind.JsonNode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

final class Parser {

	private static final List<String> HTTP_METHODS = List.of("get", "post", "put", "delete", "patch");

	private Parser() {
	}

	static ParseResult parseSpec(JsonNode rawSpec) {
		// Resolve all $refs first
		var spec = Transforms.derefDeep(rawSpec, rawSpec, new HashSet<>());

		var paths = spec.get("paths");
		if (paths == null || !paths.isObject()) {
			return new ParseResult(List.of(), "https://localhost");
		}

		var groupMap = new LinkedHashMap<String, List<MethodDefinition>>();

		var pathFields = paths.fields();
		while (pathFields.hasNext()) {
			var pathEntry = pathFields.next();
			var path = pathEntry.getKey();
			var pathItem = pathEntry.getValue();
			if (!pathItem.isObject()) continue;

			for (var method : HTTP_METHODS) {
				var operation = pathItem.get(method);
				if (operation == null || !operation.isObject()) continue;

				var operationIdNode = operation.get("operationId");
				if (operationIdNode == null || !operationIdNode.isTextual()) continue;
				var operationId = operationIdNode.asText();

				var group = Naming.operationIdToGroup(operationId);
				var methodName = Naming.operationIdToMethod(operationId);

				var methodDef = Transforms.extractMethodDefinition(
					operationId, methodName, method, path, operation
				);

				groupMap.computeIfAbsent(group, k -> new ArrayList<>()).add(methodDef);
			}
		}

		var groups = new ArrayList<ParsedGroup>();
		for (var entry : groupMap.entrySet()) {
			groups.add(new ParsedGroup(entry.getKey(), entry.getValue()));
		}

		var servers = spec.get("servers");
		var baseUrl = "https://localhost";
		if (servers != null && servers.isArray() && !servers.isEmpty()) {
			var firstServer = servers.get(0);
			if (firstServer.isObject() && firstServer.has("url")) {
				baseUrl = firstServer.get("url").asText();
			}
		}

		return new ParseResult(groups, baseUrl);
	}
}
