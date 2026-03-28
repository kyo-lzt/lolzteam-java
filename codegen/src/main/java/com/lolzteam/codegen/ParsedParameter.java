package com.lolzteam.codegen;

record ParsedParameter(String name, String type, boolean required, String defaultValue, String description) {

	ParsedParameter(String name, String type, boolean required, String defaultValue) {
		this(name, type, required, defaultValue, null);
	}

	ParsedParameter(String name, String type, boolean required) {
		this(name, type, required, null, null);
	}
}
