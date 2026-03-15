package com.lolzteam.codegen;

record ApiConfig(
	String schemaPath,
	String outputDir,
	String clientName,
	String defaultBaseUrl,
	int defaultRateLimit,
	String subPackage,
	int defaultSearchRateLimit
) {
}
