plugins { mod.conventions.common }

architectury { common(rootProject.childProjects.keys.filter { it != project.name }) }

loom { accessWidenerPath.set(sourceSets.main.get().resources.find { it.extension == "accesswidener" }) }

dependencies {
    modImplementation(libs.fabric.loader) // Used for @Environment and mixin dep
    modApi(libs.architectury.common)
}
