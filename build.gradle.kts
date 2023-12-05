plugins { base }

group = "dev.denimred"
version = "1.0.0-SNAPSHOT"
base.archivesName.set("templatemod")

tasks {
    val consolidate by registering(Copy::class) {
        duplicatesStrategy = DuplicatesStrategy.INCLUDE
        val all = subprojects.map { it.tasks }
        val remapped = all.map { it.named("remapJar") } + all.map { it.named("remapSourcesJar") }
        dependsOn(remapped)
        from(remapped)
        into(base.libsDirectory)
    }

    assemble { dependsOn(consolidate) }
}
