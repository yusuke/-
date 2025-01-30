plugins {
	java
	id("org.springframework.boot") version "3.2.5"
	id("io.spring.dependency-management") version "1.1.5"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"

java {
	sourceCompatibility = JavaVersion.VERSION_17
}

tasks.withType<JavaCompile> {
	options.encoding = "UTF-8"
}

tasks.withType<Test> {
	useJUnitPlatform()
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("com.h2database:h2")
	implementation("org.springframework.boot:spring-boot-starter-actuator")
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
	implementation("org.springframework.boot:spring-boot-starter-thymeleaf")
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("org.junit.jupiter:junit-jupiter:5.10.2")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.named<Test>("test") {
	useJUnitPlatform()
}
