package com.lolzteam.codegen;

import java.util.List;

/**
 * Describes a discriminated oneOf body schema.
 *
 * @param discriminatorProperty JSON property name used as discriminator (e.g. "grant_type", "form_id")
 * @param discriminatorType     "string" or "integer"
 * @param variants              ordered list of variants
 */
record DiscriminatedUnion(
	String discriminatorProperty,
	String discriminatorType,
	List<OneOfVariant> variants
) {
}
