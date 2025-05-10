package xyz.theunknowngroup.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import xyz.theunknowngroup.DontTouch;
import xyz.theunknowngroup.remake.CustomItemSettings;

import static xyz.theunknowngroup.registry.RegistryHandler.addEntry;
import static xyz.theunknowngroup.registry.RegistryHandler.registerItem;

public class ModItem {
    public static final String MOD_ID = DontTouch.MOD_ID;
    public static final String MOD_NAME = DontTouch.MOD_NAME;

    public static final Item SLIP_NAPKIN = registerItem(new Item(new CustomItemSettings()
            .maxCount(16).food(new FoodComponent.Builder()
                    .alwaysEdible().nutrition(50)
                    .saturationModifier(20.0f).statusEffect(
                        new StatusEffectInstance(
                                StatusEffects.GLOWING, 40 * 20, 20
                        ), 1f
                    ).build())),
            "slip_napkin");

    public static void addToGroup() {
        addEntry(SLIP_NAPKIN.getDefaultStack());
    }

    public static void registerModItems() {
        addToGroup();
        DontTouch.LOGGER.info("[{}] Registering mod items for {}.", MOD_NAME, MOD_ID);
    }
    public static void initialize() {
        DontTouch.LOGGER.info("[{}] Mod Items for {} have been registered and initialized.", MOD_NAME, MOD_ID);
    }
}
