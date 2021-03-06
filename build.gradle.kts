plugins {
    kotlin("multiplatform") version "1.6.21"
    id("org.sonarqube") version "3.3"
}

group = "de.clique.westwood.ktornative"
version = "1.0.0-SNAPSHOT"

repositories {
    mavenCentral()
}

kotlin {
    val hostOs = System.getProperty("os.name")
    val nativeTarget = when {
        hostOs == "Mac OS X" -> macosX64("native")
        hostOs == "Linux" -> linuxX64("native")
        hostOs.startsWith("Windows") -> mingwX64("native")
        else -> throw GradleException("Host OS is not supported in Kotlin/Native.")
    }

    nativeTarget.apply {
        binaries {
            executable {
                entryPoint = "main"
            }
        }
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation("io.ktor:ktor-server-core:2.0.1")
                implementation("io.ktor:ktor-server-cio:2.0.1")
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }
    }
}

sonarqube {
    properties {
        property("sonar.projectKey", "Tait1337_kotlin-native-web-app")
        property("sonar.organization", "tait1337")
        property("sonar.host.url", "https://sonarcloud.io")
    }
}
