// https://github.com/gradle/gradle/issues/15383
val libs = the<org.gradle.accessors.dm.LibrariesForLibs>()

plugins { id("mod.conventions.common") }

architectury { platformSetupLoomIde() }

loom { accessWidenerPath.set(project(":common").loom.accessWidenerPath) }

dependencies { implementation(project(":common")) }

tasks {
    val common by project(":common").sourceSets.main
    withType<JavaCompile>().configureEach { source(common.allSource) }
    named<Jar>("sourcesJar") { from(common.allSource) }
    processResources {
        from(common.resources)
        inputs.property("version", project.version)
    }
}
