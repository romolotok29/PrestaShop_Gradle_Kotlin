plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("com.codeborne:selenide:7.3.3")
    testImplementation("org.wiremock:wiremock:3.9.0")
    testImplementation("org.springframework.boot:spring-boot-starter-test:3.3.2")
}

tasks.test {
    useJUnitPlatform()
}