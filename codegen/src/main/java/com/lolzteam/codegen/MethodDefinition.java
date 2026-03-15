package com.lolzteam.codegen;

import java.util.List;

record MethodDefinition(
	String operationId,
	String methodName,
	String httpMethod,
	String path,
	OperationParameters params,
	List<BodyProperty> bodyProperties,
	boolean hasBody,
	boolean bodyRequired,
	String responseType,
	boolean bodyIsArray,
	String bodyArrayItemType,
	String bodyEncoding
) {
}
