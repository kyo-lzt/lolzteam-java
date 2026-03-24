plugins {
    `java-library`
    id("com.vanniktech.maven.publish") version "0.36.0"
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

mavenPublishing {
    publishToMavenCentral(automaticRelease = true)
    signAllPublications()

    coordinates("com.lolzteam", "lolzteam-java", version.toString())

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
        developers {
            developer {
                id.set("kyo-lzt")
                name.set("kyo-lzt")
                url.set("https://github.com/kyo-lzt")
            }
        }
        scm {
            url.set("https://github.com/kyo-lzt/lolzteam-java")
            connection.set("scm:git:git://github.com/kyo-lzt/lolzteam-java.git")
            developerConnection.set("scm:git:ssh://git@github.com/kyo-lzt/lolzteam-java.git")
        }
    }
}
