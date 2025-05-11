package xyz.theunknowngroup.blocks;

import net.minecraft.block.*;
import xyz.theunknowngroup.DontTouch;
import xyz.theunknowngroup.custom.SlipStone;
import xyz.theunknowngroup.registry.RegistryHandler;

public class ModBlock {
    public static String MOD_NAME = DontTouch.MOD_NAME;
    public static String MOD_ID = DontTouch.MOD_ID;

    public static final Block SLIP_STONE = RegistryHandler.registerBlock(new SlipStone(SlipStone.blockCreate()),
            "slip_stone", true);

    public static void registerModBlocks() {
        DontTouch.LOGGER.info("[{}] Registering mod blocks for {}.", MOD_NAME, MOD_ID);
    }
    public static void initialize() {
        DontTouch.LOGGER.info("[{}] Mod Blocks for {} have been registered and initialized.", MOD_NAME, MOD_ID);
    }
}