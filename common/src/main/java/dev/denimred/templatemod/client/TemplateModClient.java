package dev.denimred.templatemod.client;

import org.jetbrains.annotations.ApiStatus;

import static dev.denimred.templatemod.TemplateMod.LOGGER;

public final class TemplateModClient {
    @ApiStatus.Internal
    public static void init() {
        LOGGER.warn("Template mod client init");
    }
}
