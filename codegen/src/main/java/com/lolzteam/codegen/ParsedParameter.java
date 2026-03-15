package com.lolzteam.codegen;

record ParsedParameter(String name, String type, boolean required, String defaultValue) {

	ParsedParameter(String name, String type, boolean required) {
		this(name, type, required, null);
	}
}
