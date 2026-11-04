package com.robloxtop;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BlackQuartzMod implements ModInitializer {
    public static final String MOD_ID = "black-quartz";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModBlocks.initialize();
        LOGGER.info("Проект загружен успешно");
    }
}
