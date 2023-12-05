plugins { mod.conventions.impl }

architectury { forge() }

loom.forge {
    convertAccessWideners.set(true)
    mixinConfig("templatemod-common.mixins.json")
    mixinConfig("templatemod.mixins.json")
}

dependencies {
    forge(libs.forge)
    modApi(libs.architectury.forge)
}

tasks.processResources { filesMatching("META-INF/mods.toml") { expand("version" to project.version) } }
