package xyz.theunknowngroup.registry;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;
import xyz.theunknowngroup.DontTouch;
import xyz.theunknowngroup.remake.CustomItemSettings;

import static xyz.theunknowngroup.item.ModItem.SLIP_NAPKIN;

public class RegistryHandler {
    public static String MOD_ID = DontTouch.MOD_ID;
    public static RegistryKey<ItemGroup> KEY = RegistryKey.of(Registries.ITEM_GROUP.getKey(), Identifier.of(MOD_ID, "dont"));

    public static Block registerBlock(Block block, String name, boolean slipStone) {
        registerBlockItem(block, Identifier.of(MOD_ID, name), slipStone);

        return Registry.register(Registries.BLOCK, Identifier.of(MOD_ID, name), block);
    }

    public static Item registerItem(Item itemName, String name) {
        registerItemGroup("itemGroup.donttouch.dont");

        return Registry.register(Registries.ITEM, Identifier.of(MOD_ID, name), itemName);
    }

    public static void registerItemGroup(String translate) {
        Registry.register(Registries.ITEM_GROUP, KEY, FabricItemGroup
                .builder()
                .icon(() -> new ItemStack(SLIP_NAPKIN))
                .displayName(Text.translatable(translate))
                .build());
    }

    public static void addEntry(ItemStack item) {
        ItemGroupEvents.modifyEntriesEvent(KEY).register(itemGroup -> {
            itemGroup.add(item);
        });
    }

    public static BlockItem registerBlockItem(Block blockName, Identifier id, boolean slipStone) {
        BlockItem blockItem;

        if (slipStone) {
            blockItem = new BlockItem(blockName, new CustomItemSettings()
                    .maxCount(64).fireproof());
        } else {
            blockItem = new BlockItem(blockName, new CustomItemSettings()
                    .maxCount(64));
        }

        addEntry(blockItem.getDefaultStack());

        return Registry.register(Registries.ITEM, id, blockItem);
    }
}
