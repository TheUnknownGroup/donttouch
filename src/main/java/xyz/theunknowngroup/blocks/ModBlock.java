package xyz.theunknowngroup.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.Identifier;
import xyz.theunknowngroup.DontTouch;

public class ModBlock {
    public static String MOD_NAME = DontTouch.MOD_NAME;
    public static String MOD_ID = DontTouch.MOD_ID;

    public static final Block SLIP_STONE = register(
            new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT)
                    .sounds(BlockSoundGroup.STONE).luminance(10)
                    .collidable(true).resistance(10000000)),
            "slip_stone", true
    );

    public static Block register(Block block, String name, boolean shouldRegisterItem) {
        Identifier id = new Identifier(MOD_ID, name);

        if (shouldRegisterItem) {
            BlockItem blockItem = new BlockItem(block, new Item.Settings()
                    .maxCount(64).group(ItemGroup.REDSTONE)
                    .food(new FoodComponent.Builder()
                            .alwaysEdible().meat()
                            .hunger(50).statusEffect(
                            new StatusEffectInstance(
                                    StatusEffects.GLOWING, 40 * 20, 20
                            ), 1f
                    ).build()));
            Registry.register(Registry.ITEM, id, blockItem);
        }

        return Registry.register(Registry.BLOCK, id, block);
    }

    public static void registerModBlocks() {
        DontTouch.LOGGER.info("[{}] Registering mod blocks for {}.", MOD_NAME, MOD_ID);
    }
    public static void initialize() {
        DontTouch.LOGGER.info("[{}] Mod Blocks for {} have been registered and initialized.", MOD_NAME, MOD_ID);
    }
}
