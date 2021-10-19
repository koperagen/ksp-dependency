plugins {
    kotlin("jvm") version "1.5.30"
    id("com.google.devtools.ksp") version "1.5.30-1.0.0"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    mavenLocal()
}

dependencies {
    implementation(kotlin("stdlib"))
    ksp("org.jetbrains.kotlinx.dataframe:symbol-processor:0.8.0-dev")
}