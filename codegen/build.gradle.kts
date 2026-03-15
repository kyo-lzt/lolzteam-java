plugins {
    java
    application
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(libs.jackson.databind)
}

application {
    mainClass.set("com.lolzteam.codegen.Main")
}

tasks.named<JavaExec>("run") {
    workingDir = rootProject.projectDir
}
