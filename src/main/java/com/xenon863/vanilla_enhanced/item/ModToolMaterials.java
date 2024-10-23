package com.xenon863.vanilla_enhanced.item;

import com.google.common.base.Suppliers;
import com.xenon863.vanilla_enhanced.util.ModTags;
import net.minecraft.block.Block;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.TagKey;

import java.util.function.Supplier;

public enum ModToolMaterials implements ToolMaterial {
    TITANIUM(ModTags.Blocks.INCORRECT_FOR_TITANIUM_TOOL, 512, 6.0f, 2.4F, 10,  () -> Ingredient.ofItems(ModItems.TITANIUM_INGOT)),
    ANDESITE_BRONZE(ModTags.Blocks.INCORRECT_FOR_ANDESITE_BRONZE_TOOL, 128, 3.0F, 0.8F, 25, () -> Ingredient.ofItems(ModItems.ANDESITE_BRONZE_INGOT)),
    DIORITE_BRONZE(ModTags.Blocks.INCORRECT_FOR_DIORITE_BRONZE_TOOL, 256, 3.0F, 0.8F, 10, () -> Ingredient.ofItems(ModItems.DIORITE_BRONZE_INGOT)),
    GRANITE_BRONZE(ModTags.Blocks.INCORRECT_FOR_GRANITE_BRONZE_TOOL, 128, 4.5F, 1.6F, 10, () -> Ingredient.ofItems(ModItems.GRANITE_BRONZE_INGOT)),
    TUNGSTEN(ModTags.Blocks.INCORRECT_FOR_TUNGSTEN_TOOL, 2048, 9.0F, 4.0F, 5, () -> Ingredient.ofItems(ModItems.TUNGSTEN_INGOT));

    private final TagKey<Block> inverseTag;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    ModToolMaterials(
            final TagKey<Block> inverseTag,
            final int itemDurability,
            final float miningSpeed,
            final float attackDamage,
            final int enchantability,
            final Supplier<Ingredient> repairIngredient
    ) {
        this.inverseTag = inverseTag;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = Suppliers.memoize(repairIngredient::get);
    }

    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    public TagKey<Block> getInverseTag() {
        return this.inverseTag;
    }
}
