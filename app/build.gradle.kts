buildscript {
    repositories {
        mavenCentral()  // Define the repository for the Kotlin Gradle plugin
    }
    dependencies { classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:2.0.20") }
}

plugins {
    id("buildlogic.java-application-conventions")
}

apply(plugin = "java")
apply(plugin = "kotlin")

repositories {
    mavenCentral()  // Define repository for project dependencies
}

dependencies {
    implementation("org.apache.commons:commons-text")
    implementation(project(":utilities"))
}

application {
    // Define the main class for the application.
    mainClass = "org.example.app.App"
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib:2.0.20")
    implementation("com.github.javafaker:javafaker:1.0.2")
    implementation("com.fasterxml.jackson.core:jackson-databind:2.16.2")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.16.2")
    implementation("org.apache.kafka:kafka-clients:3.6.1")
}