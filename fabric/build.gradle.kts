plugins { mod.conventions.impl }

architectury { fabric() }

dependencies {
    modImplementation(libs.fabric.loader)
    modApi(libs.fabric.api)
    modApi(libs.architectury.fabric)
}

tasks.processResources { filesMatching("fabric.mod.json") { expand("version" to project.version) } }
