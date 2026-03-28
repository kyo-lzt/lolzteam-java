package com.lolzteam.codegen;

record BodyProperty(String name, String type, boolean required, String defaultValue, String description) {

	BodyProperty(String name, String type, boolean required, String defaultValue) {
		this(name, type, required, defaultValue, null);
	}

	BodyProperty(String name, String type, boolean required) {
		this(name, type, required, null, null);
	}
}
