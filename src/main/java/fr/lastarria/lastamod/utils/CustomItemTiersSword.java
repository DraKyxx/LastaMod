package fr.lastarria.lastamod.utils;

import fr.lastarria.lastamod.init.ModItems;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

public enum CustomItemTiersSword implements IItemTier {

    VLADINITE_SWORD(0, 2500, 10f, 11f, 25, new LazyValue<>(() -> {return Ingredient.of(ModItems.VLADINITE_INGOT.get());}));

    private final int Level;
    private final int Uses;
    private final float Speed;
    private final float AttackDamageBonus;
    private final int EnchantmentValue;
    private final LazyValue<Ingredient> repairMaterial;

    CustomItemTiersSword(int level, int uses, float speed, float attackDamageBonus, int enchantmentValue, LazyValue<Ingredient> repairMaterial) {
        Level = level;
        Uses = uses;
        Speed = speed;
        AttackDamageBonus = attackDamageBonus;
        EnchantmentValue = enchantmentValue;
        this.repairMaterial = repairMaterial;
    }

    @Override
    public int getUses() {
        return Uses;
    }

    @Override
    public float getSpeed() {
        return Speed;
    }

    @Override
    public float getAttackDamageBonus() {
        return AttackDamageBonus;
    }

    @Override
    public int getLevel() {
        return Level;
    }

    @Override
    public int getEnchantmentValue() {
        return EnchantmentValue;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return repairMaterial.get();
    }
}
