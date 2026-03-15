package com.lolzteam.codegen;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public final class Main {

	public static void main(String[] args) throws IOException {
		var root = new File(System.getProperty("user.dir"));

		var apis = List.of(
			new ApiConfig(
				new File(root, "schemas/forum.json").getAbsolutePath(),
				new File(root, "src/main/java/com/lolzteam/api/generated/forum").getAbsolutePath(),
				"ForumClient",
				"https://prod-api.lolz.live",
				300,
				"forum",
				0
			),
			new ApiConfig(
				new File(root, "schemas/market.json").getAbsolutePath(),
				new File(root, "src/main/java/com/lolzteam/api/generated/market").getAbsolutePath(),
				"MarketClient",
				"https://prod-api.lzt.market",
				120,
				"market",
				20
			)
		);

		var mapper = new ObjectMapper();

		for (var config : apis) {
			System.out.println("Generating " + config.clientName() + "...");

			var rawSpec = mapper.readTree(new File(config.schemaPath()));
			var result = Parser.parseSpec(rawSpec);

			var outDir = new File(config.outputDir());
			if (!outDir.exists() && !outDir.mkdirs()) {
				throw new IOException("Failed to create directory: " + outDir);
			}

			// Clean up old files
			var oldFiles = outDir.listFiles((dir, name) -> name.endsWith(".java"));
			if (oldFiles != null) {
				for (var file : oldFiles) {
					if (file.delete()) {
						System.out.println("  Deleted old " + file.getName());
					}
				}
			}

			// Write Types file
			var typesContent = Emitter.emitJavaTypesFile(
				result.groups(), config.subPackage(), result.componentSchemas()
			);
			writeFile(new File(outDir, "Types.java"), typesContent);
			System.out.println("  Types.java");

			// Write client file
			var clientContent = Emitter.emitJavaClientFile(
				result.groups(),
				config.clientName(),
				config.defaultBaseUrl(),
				config.defaultRateLimit(),
				config.subPackage(),
				config.defaultSearchRateLimit()
			);
			writeFile(new File(outDir, config.clientName() + ".java"), clientContent);
			System.out.println("  " + config.clientName() + ".java");

			var totalOps = result.groups().stream().mapToInt(g -> g.methods().size()).sum();
			System.out.println("  Done: " + result.groups().size() + " groups, " + totalOps + " operations\n");
		}
	}

	private static void writeFile(File file, String content) throws IOException {
		var parent = file.getParentFile();
		if (parent != null && !parent.exists() && !parent.mkdirs()) {
			throw new IOException("Failed to create directory: " + parent);
		}
		java.nio.file.Files.writeString(file.toPath(), content);
	}
}
