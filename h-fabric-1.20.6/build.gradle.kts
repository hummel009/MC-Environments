import java.time.LocalDate
import java.time.format.DateTimeFormatter

plugins {
	id("fabric-loom") version "1.10-SNAPSHOT"
}

group = "com.github.hummel"
version = LocalDate.now().format(DateTimeFormatter.ofPattern("yy.MM.dd"))

dependencies {
	minecraft("com.mojang:minecraft:1.20.6")
	mappings(loom.officialMojangMappings())
	modImplementation("net.fabricmc:fabric-loader:0.16.14")
	modImplementation("net.fabricmc.fabric-api:fabric-api:0.100.8+1.20.6")
}

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(21)
	}
}

tasks {
	withType<JavaCompile> {
		options.encoding = "UTF-8"
	}
}
