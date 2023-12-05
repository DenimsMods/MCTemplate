@file:Suppress("GradlePackageVersionRange")

plugins { `kotlin-dsl` }

repositories {
    gradlePluginPortal()
    maven("https://repo.spongepowered.org/repository/maven-public/") { name = "Sponge" }
    maven("https://maven.architectury.dev/") { name = "Architectury" }
    maven("https://maven.fabricmc.net/") { name = "Fabric" }
}

// https://github.com/gradle/gradle/issues/15383
dependencies {
    implementation(files(libs.javaClass.superclass.protectionDomain.codeSource.location))
    libs.versions.apply {
        implementation("architectury-plugin:architectury-plugin.gradle.plugin:" + architectury.plugin.get())
        implementation("dev.architectury:architectury-loom:" + architectury.loom.get())
    }
}
