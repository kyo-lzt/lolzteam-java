package com.lolzteam.codegen;

record BodyProperty(String name, String type, boolean required, String defaultValue) {

	BodyProperty(String name, String type, boolean required) {
		this(name, type, required, null);
	}
}
