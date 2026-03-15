package com.lolzteam.codegen;

import java.util.List;

record BodyExtractionResult(
	List<BodyProperty> properties,
	boolean bodyIsArray,
	String bodyArrayItemType,
	String bodyEncoding
) {

	BodyExtractionResult(List<BodyProperty> properties) {
		this(properties, false, null, "form");
	}
}
