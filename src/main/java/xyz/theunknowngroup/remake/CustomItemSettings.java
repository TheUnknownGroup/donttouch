package xyz.theunknowngroup.remake;

import net.fabricmc.fabric.api.item.v1.EquipmentSlotProvider;
import net.minecraft.block.jukebox.JukeboxSong;
import net.minecraft.component.type.AttributeModifiersComponent;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Rarity;

/**
 * This code was copied from the class FabricItemSettings
 * @author TheGremlinX
 */

public class CustomItemSettings extends Item.Settings {

    /**
     * This dictates if the item is edible or not, along with
     */
    public CustomItemSettings food(FoodComponent foodComponent) {
        super.food(foodComponent);
        return this;
    }

    public CustomItemSettings maxDamage(int maxDamage) {
        super.maxDamage(maxDamage);
        return this;
    }

    public CustomItemSettings maxCount(int maxCount) {
        super.maxCount(maxCount);
        return this;
    }

    public CustomItemSettings recipeRemainder(Item recipeRemainder) {
        super.recipeRemainder(recipeRemainder);
        return this;
    }

    public CustomItemSettings rarity(Rarity rarity) {
        super.rarity(rarity);
        return this;
    }

    public CustomItemSettings fireproof() {
        super.fireproof();
        return this;
    }

    public CustomItemSettings jukeboxPlayable(RegistryKey<JukeboxSong> songKey) {
        super.jukeboxPlayable(songKey);
        return this;
    }

    public CustomItemSettings attributeModifiers(AttributeModifiersComponent attributeModifiersComponent) {
        super.attributeModifiers(attributeModifiersComponent);
        return this;
    }

    public CustomItemSettings equipmentSlot(EquipmentSlotProvider equipmentSlotProvider) {
        super.equipmentSlot(equipmentSlotProvider);
        return this;
    }
}
