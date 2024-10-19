package com.xenon863.vanilla_enhanced;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Xenon863sVanillaEnhanced implements ModInitializer {
	public static final String MOD_ID = "xenon863s-vanilla-enhanced";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		LOGGER.info("Hello Fabric world!");
	}
}