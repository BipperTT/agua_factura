plugins {
    kotlin("jvm") version "1.9.21"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.jetbrains.kotlin:kotlin-test")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
<<<<<<< HEAD
    jvmToolchain(20)
=======
    jvmToolchain(17)
>>>>>>> d5d07c6 (3er Commit: añadir test)
}