package com.lolzteam.codegen;

import java.util.List;

record BodyExtractionResult(
	List<BodyProperty> properties,
	boolean bodyIsArray,
	String bodyArrayItemType,
	String bodyEncoding,
	DiscriminatedUnion discriminatedUnion
) {

	BodyExtractionResult(List<BodyProperty> properties) {
		this(properties, false, null, "form", null);
	}

	BodyExtractionResult(List<BodyProperty> properties, boolean bodyIsArray, String bodyArrayItemType, String bodyEncoding) {
		this(properties, bodyIsArray, bodyArrayItemType, bodyEncoding, null);
	}
}
