package com.lolzteam.codegen;

import com.fasterxml.jackson.databind.JsonNode;

import java.util.List;
import java.util.Map;

record ParseResult(
	List<ParsedGroup> groups,
	String baseUrl,
	Map<String, JsonNode> componentSchemas
) {
}
