package xyz.theunknowngroup.item;

import net.minecraft.item.Item;
import xyz.theunknowngroup.DontTouch;
import xyz.theunknowngroup.custom.SlipNapkin;
import xyz.theunknowngroup.registry.RegistryHandler;

public class ModItem {
    public static final String MOD_ID = DontTouch.MOD_ID;
    public static final String MOD_NAME = DontTouch.MOD_NAME;

    public static final Item SLIP_NAPKIN = RegistryHandler.registerItem(new SlipNapkin(SlipNapkin.itemCreate()),
            "slip_napkin");

    public static void addToGroup() {
        RegistryHandler.addEntry(SLIP_NAPKIN.getDefaultStack());
    }

    public static void registerModItems() {
        addToGroup();
        DontTouch.LOGGER.info("[{}] Registering mod items for {}.", MOD_NAME, MOD_ID);
    }
    public static void initialize() {
        DontTouch.LOGGER.info("[{}] Mod Items for {} have been registered and initialized.", MOD_NAME, MOD_ID);
    }
}
