package dev.denimred.templatemod.fabric;

import dev.denimred.templatemod.TemplateMod;
import net.fabricmc.api.ModInitializer;
import org.jetbrains.annotations.ApiStatus;

public final class TemplateModFabric implements ModInitializer {
    @Override
    @ApiStatus.Internal
    public void onInitialize() {
        TemplateMod.init();
    }
}
