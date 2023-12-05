package dev.denimred.templatemod.forge;

import dev.architectury.platform.forge.EventBuses;
import dev.denimred.templatemod.TemplateMod;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.jetbrains.annotations.ApiStatus;

@Mod(TemplateMod.ID)
public final class TemplateModForge {
    @ApiStatus.Internal
    public TemplateModForge() {
        EventBuses.registerModEventBus(TemplateMod.ID, FMLJavaModLoadingContext.get().getModEventBus());
        TemplateMod.init();
    }
}
