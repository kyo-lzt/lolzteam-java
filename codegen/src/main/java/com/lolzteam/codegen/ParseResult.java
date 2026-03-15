package com.lolzteam.codegen;

import java.util.List;

record ParseResult(List<ParsedGroup> groups, String baseUrl) {
}
