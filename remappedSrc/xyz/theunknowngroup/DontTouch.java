package xyz.theunknowngroup;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DontTouch implements ModInitializer {
	public static final String MOD_NAME = "Don't Touch Me!";
	public static final String MOD_ID = "donttouch";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_NAME);

	@Override
	public void onInitialize() {
		LOGGER.info("[{}] The mod: {} is enabled and starting its functions.", MOD_NAME, MOD_ID);
		InitializeComponents.start();
	}
}