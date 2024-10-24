package net.minecraft.item;

import net.minecraft.block.Block;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;

import java.util.function.Supplier;

public enum ToolMaterials implements ToolMaterial {
    WOOD(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 64, 1.8F, 0.0F, 10, () -> Ingredient.fromTag(ItemTags.PLANKS)),
    STONE(BlockTags.INCORRECT_FOR_STONE_TOOL, 128, 3.6F, 1.0F, 10, () -> Ingredient.fromTag(ItemTags.STONE_TOOL_MATERIALS)),
    IRON(BlockTags.INCORRECT_FOR_IRON_TOOL, 256, 5.4F, 2.0F, 10, () -> Ingredient.ofItems(Items.IRON_INGOT)),
    DIAMOND(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 512, 7.2F, 3.0F, 10, () -> Ingredient.ofItems(Items.DIAMOND)),
    NETHERITE(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 1024, 9.0F, 4.0F, 10, () -> Ingredient.ofItems(Items.NETHERITE_INGOT)),

    GOLD(BlockTags.INCORRECT_FOR_GOLD_TOOL, 64, 9.0F, 4.0F, 25, () -> Ingredient.ofItems(Items.GOLD_INGOT));

    private final TagKey<Block> inverseTag;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    ToolMaterials(TagKey<Block> inverseTag, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.inverseTag = inverseTag;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = repairIngredient;
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
