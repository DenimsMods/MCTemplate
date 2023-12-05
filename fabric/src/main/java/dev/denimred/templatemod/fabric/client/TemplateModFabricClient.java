package dev.denimred.templatemod.fabric.client;

import dev.denimred.templatemod.client.TemplateModClient;
import net.fabricmc.api.ClientModInitializer;
import org.jetbrains.annotations.ApiStatus;

public final class TemplateModFabricClient implements ClientModInitializer {
    @Override
    @ApiStatus.Internal
    public void onInitializeClient() {
        TemplateModClient.init();
    }
}
