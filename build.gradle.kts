plugins {
    `java-library`
    `maven-publish`
    id("com.diffplug.spotless") version "7.0.2"
}

spotless {
    java {
        targetExclude("src/main/java/com/lolzteam/api/generated/**")
        googleJavaFormat()
        removeUnusedImports()
    }
}

group = "com.lolzteam"
version = findProperty("version") as String? ?: "0.0.0-dev"

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

repositories {
    mavenCentral()
}

dependencies {
    api(libs.jackson.databind)

    testImplementation(libs.junit.api)
    testRuntimeOnly(libs.junit.engine)
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<JavaCompile> {
    options.compilerArgs.addAll(listOf("-Xlint:all,-serial", "-Werror"))
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["java"])
            pom {
                name.set("lolzteam-java")
                description.set("Java API wrapper for Lolzteam Forum and Market")
                url.set("https://github.com/kyo-lzt/lolzteam-java")
                licenses {
                    license {
                        name.set("MIT")
                        url.set("https://opensource.org/licenses/MIT")
                    }
                }
            }
        }
    }
}
