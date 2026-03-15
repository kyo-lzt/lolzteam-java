package com.lolzteam.codegen;

import java.util.List;

/**
 * A single variant in a discriminated oneOf body schema.
 *
 * @param discriminatorValue the value of the discriminator property for this variant (e.g. "client_credentials", "1")
 * @param title              human-readable title from the schema (e.g. "Client Credentials")
 * @param properties         the properties specific to this variant (excluding the discriminator)
 */
record OneOfVariant(
	String discriminatorValue,
	String title,
	List<BodyProperty> properties
) {
}
