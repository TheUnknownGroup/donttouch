package xyz.theunknowngroup.item.itemgroup;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import xyz.theunknowngroup.DontTouch;
import xyz.theunknowngroup.item.ModItem;

public class DontItemGroup {
    public static final String MOD_ID = DontTouch.MOD_ID;
    public static final ItemGroup DONT = FabricItemGroupBuilder.build(
            new Identifier(MOD_ID, "dont"), () -> new ItemStack(ModItem.SLIP_NAPKIN));
}
