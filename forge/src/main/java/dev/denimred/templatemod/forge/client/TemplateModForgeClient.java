package dev.denimred.templatemod.forge.client;

import dev.denimred.templatemod.TemplateMod;
import dev.denimred.templatemod.client.TemplateModClient;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import org.jetbrains.annotations.ApiStatus;

@Mod.EventBusSubscriber(modid = TemplateMod.ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public final class TemplateModForgeClient {
    @SubscribeEvent
    @ApiStatus.Internal
    public static void onFMLClientSetup(FMLClientSetupEvent event) {
        TemplateModClient.init();
    }
}
