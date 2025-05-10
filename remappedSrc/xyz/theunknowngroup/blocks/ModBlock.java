package xyz.theunknowngroup.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;
import xyz.theunknowngroup.DontTouch;
import xyz.theunknowngroup.item.itemgroup.DontItemGroup;

import static xyz.theunknowngroup.registry.RegistryHandler.registerBlock;

public class ModBlock {
    public static String MOD_NAME = DontTouch.MOD_NAME;
    public static String MOD_ID = DontTouch.MOD_ID;

    public static final Block SLIP_STONE = registerBlock(new Block(
            FabricBlockSettings.create(Material.ORGANIC_PRODUCT).sounds(BlockSoundGroup.STONE)
                    .luminance(10).collidable(true).resistance(10000000)),
            "slip_stone", DontItemGroup.DONT, true);

    public static void registerModBlocks() {
        DontTouch.LOGGER.info("[{}] Registering mod blocks for {}.", MOD_NAME, MOD_ID);
    }
    public static void initialize() {
        DontTouch.LOGGER.info("[{}] Mod Blocks for {} have been registered and initialized.", MOD_NAME, MOD_ID);
    }
}
