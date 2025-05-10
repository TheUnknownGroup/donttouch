package xyz.theunknowngroup.remake;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Rarity;

/**
 * This code was copied from the class FabricItemSettings
 * @author TheGremlinX
 */

public class CustomItemSettings extends Item.Settings {

    /**
     * This sets the ItemGroup for the item, which dictates if it either goes
     * into a premade (vanilla) itemGroup or a custom-made itemGroup.
     * Example:
     * {@code new CustomItemSettings.group(ItemGroup.REDSTONE)} or {@code new CustomItemSettings.group(<CUSTOMITEMGROUP>)}
     */
    @Override
    public CustomItemSettings group(ItemGroup group) {
        super.group(group);
        return this;
    }
    /**
     * This dictates if the item is edible or not, along with
     */
    @Override
    public CustomItemSettings food(FoodComponent foodComponent) {
        super.food(foodComponent);
        return this;
    }

    @Override
    public CustomItemSettings maxDamage(int maxDamage) {
        super.maxDamage(maxDamage);
        return this;
    }

    @Override
    public CustomItemSettings maxDamageIfAbsent(int maxDamage) {
        super.maxDamageIfAbsent(maxDamage);
        return this;
    }

    @Override
    public CustomItemSettings maxCount(int maxCount) {
        super.maxCount(maxCount);
        return this;
    }

    @Override
    public CustomItemSettings recipeRemainder(Item recipeRemainder) {
        super.recipeRemainder(recipeRemainder);
        return this;
    }

    @Override
    public CustomItemSettings rarity(Rarity rarity) {
        super.rarity(rarity);
        return this;
    }

    @Override
    public CustomItemSettings fireproof() {
        super.fireproof();
        return this;
    }
}
