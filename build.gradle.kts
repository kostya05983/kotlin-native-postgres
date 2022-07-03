// build.gradle.kts
plugins {
    kotlin("multiplatform") version "1.7.0"
}

repositories {
    mavenCentral()
}

kotlin {
    linuxX64("native") { // on macOS
        binaries {
            executable()
        }
    }
}

tasks.withType<Wrapper> {
    gradleVersion = "6.7.1"
    distributionType = Wrapper.DistributionType.BIN
}