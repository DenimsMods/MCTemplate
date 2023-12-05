package dev.denimred.templatemod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.ApiStatus;

public final class TemplateMod {
    public static final String ID = "templatemod";
    public static final Logger LOGGER = LogManager.getLogger("TemplateMod");

    @ApiStatus.Internal
    public static void init() {
        LOGGER.warn("Template mod common init");
    }
}
