package xyz.theunknowngroup.custom;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import xyz.theunknowngroup.remake.CustomItemSettings;

public class SlipNapkin extends Item {
    public SlipNapkin(Settings settings) {
        super(settings);
    }

    public static Settings itemCreate() {
        return new CustomItemSettings().maxCount(16)
                .fireproof().equipmentSlot((entity, stack) -> EquipmentSlot.CHEST)
                .food(SlipNapkin.getFood());
    }

    public static FoodComponent getFood() {
        return new FoodComponent.Builder().alwaysEdible()
                .nutrition(50).saturationModifier(20.0f).statusEffect(
                     new StatusEffectInstance(
                             StatusEffects.GLOWING, 40 * 20, 20), 1f
                ).build();
    }
}
