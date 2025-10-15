pluginManagement {
	repositories {
		maven {
			name = "GTNH Maven"
			url = uri("https://nexus.gtnewhorizons.com/repository/public/")
			mavenContent {
				includeGroup("com.gtnewhorizons")
				includeGroup("com.gtnewhorizons.retrofuturagradle")
			}
		}
		mavenLocal()
		mavenCentral()
		gradlePluginPortal()
	}
}

plugins {
	id("org.gradle.toolchains.foojay-resolver-convention") version "latest.release"
}
