@file:Suppress("UnstableApiUsage")

// https://github.com/gradle/gradle/issues/15383
val libs = the<org.gradle.accessors.dm.LibrariesForLibs>()

plugins {
    id("architectury-plugin")
    id("dev.architectury.loom")
    `java-library`
}

group = rootProject.group
version = rootProject.version
base.archivesName.set(rootProject.base.archivesName)

loom { silentMojangMappingsLicense() }

architectury { minecraft = libs.versions.minecraft.get() }

repositories {
    maven("https://maven.parchmentmc.net/") {
        name = "ParchmentMC (Mappings)"
        content { includeGroup(libs.parchment.orNull?.group!!) }
    }
}

dependencies {
    minecraft(libs.minecraft)
    mappings(loom.layered {
        officialMojangMappings()
        parchment(variantOf(libs.parchment) { artifactType("zip") })
    })
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = sourceCompatibility
    withSourcesJar()
}

tasks {
    withType<JavaCompile> {
        options.encoding = "UTF-8"
        options.release.set(17)
    }

    withType<AbstractArchiveTask> {
        archiveClassifier.set(project.name + "-" + libs.versions.minecraft.get() + archiveClassifier.map { "-$it" }.getOrElse(""))
        isReproducibleFileOrder = true
        isPreserveFileTimestamps = false
    }
}
