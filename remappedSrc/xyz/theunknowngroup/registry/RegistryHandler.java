package xyz.theunknowngroup.registry;

import net.minecraft.block.Block;
import net.minecraft.item.*;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import xyz.theunknowngroup.DontTouch;
import xyz.theunknowngroup.remake.CustomItemSettings;

public class RegistryHandler {
    public static String MOD_ID = DontTouch.MOD_ID;

    public static final Block registerBlock(Block block, String name, ItemGroup group, boolean slipStone) {
        Identifier id = new Identifier(MOD_ID, name);

        registerBlockItem(block, id, group, slipStone);

        return Registry.register(Registry.BLOCK, id, block);
    }

    public static final Item registerItem(Item itemName, String name) {
        Identifier id = new Identifier(MOD_ID, name);

        return Registry.register(Registry.ITEM, id, itemName);
    }

    public static BlockItem registerBlockItem(Block blockName, Identifier id, ItemGroup group, boolean slipStone) {
        BlockItem blockItem;

        if (slipStone) {
            blockItem = new BlockItem(blockName, new CustomItemSettings()
                    .maxCount(64).group(group).fireproof());
        } else {
            blockItem = new BlockItem(blockName, new CustomItemSettings()
                    .maxCount(64).group(group));
        }

        return Registry.register(Registry.ITEM, id, blockItem);
    }
}
