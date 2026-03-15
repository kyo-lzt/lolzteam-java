package com.lolzteam.codegen;

import java.util.List;

record ParsedGroup(String groupName, List<MethodDefinition> methods) {
}
