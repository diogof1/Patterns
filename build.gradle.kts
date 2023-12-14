plugins {
    id("java")
}

group = "com.diogof1.tetris"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("org.mockito:mockito-core:3.7.7")
}

tasks.test {
    useJUnitPlatform()
}