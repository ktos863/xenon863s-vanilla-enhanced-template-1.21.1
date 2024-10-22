package com.xenon863.vanilla_enhanced.item;

import com.google.common.base.Suppliers;
import com.xenon863.vanilla_enhanced.util.ModTags;
import net.minecraft.block.Block;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import java.util.function.Supplier;

public enum ModToolMaterials implements ToolMaterial {;

    @Override
    public int getDurability() {
        return 0;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 0;
    }

    @Override
    public float getAttackDamage() {
        return 0;
    }

    @Override
    public TagKey<Block> getInverseTag() {
        return null;
    }

    @Override
    public int getEnchantability() {
        return 0;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return null;
    }

    public enum modToolMaterials implements ToolMaterial {
        //WOOD(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 64, 1.5F, 0.0F, 15, () -> Ingredient.fromTag(ItemTags.PLANKS)),
        //STONE(BlockTags.INCORRECT_FOR_STONE_TOOL, 128, 3.0F, 0.8F, 5, () -> Ingredient.fromTag(ItemTags.STONE_TOOL_MATERIALS)),
        //IRON(BlockTags.INCORRECT_FOR_IRON_TOOL, 256, 4.5F, 1.6F, 14, () -> Ingredient.ofItems(Items.IRON_INGOT)),
        TITANIUM(ModTags.Blocks.INCORRECT_FOR_TITANIUM_TOOL, 512, 6.0f, 2.4F, 10, () -> Ingredient.ofItems(ModItems.TITANIUM_INGOT)),
        //DIAMOND(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1024, 7.5F, 3.2F, 10, () -> Ingredient.ofItems(Items.DIAMOND)),
        //NETHERITE(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 2048, 9.0F, 4.0F, 15, () -> Ingredient.ofItems(Items.NETHERITE_INGOT)),

        ANDESITE_BRONZE(ModTags.Blocks.INCORRECT_FOR_ANDESITE_BRONZE_TOOL, 128, 3.0F, 0.8F, 25, () -> Ingredient.ofItems(ModItems.ANDESITE_BRONZE_INGOT)),
        DIORITE_BRONZE(ModTags.Blocks.INCORRECT_FOR_DIORITE_BRONZE_TOOL, 256, 3.0F, 0.8F, 10, () -> Ingredient.ofItems(ModItems.DIORITE_BRONZE_INGOT)),
        GRANITE_BRONZE(ModTags.Blocks.INCORRECT_FOR_GRANITE_BRONZE_TOOL, 128, 4.5F, 1.6F, 10, () -> Ingredient.ofItems(ModItems.GRANITE_BRONZE_INGOT)),
        //GOLD(BlockTags.INCORRECT_FOR_GOLD_TOOL, 64, 12.0F, 0.0F, 22, () -> Ingredient.ofItems(Items.GOLD_INGOT)),
        TUNGSTEN(ModTags.Blocks.INCORRECT_FOR_TUNGSTEN_TOOL, 2048, 9.0F, 4.0F, 5, () -> Ingredient.ofItems(ModItems.TUNGSTEN_INGOT));

        private final TagKey<Block> inverseTag;
        private final int itemDurability;
        private final float miningSpeed;
        private final float attackDamage;
        private final int enchantability;
        private final Supplier<Ingredient> repairIngredient;

        private modToolMaterials(
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
        public TagKey<Block> getInverseTag() {
            return this.inverseTag;
        }

        @Override
        public int getEnchantability() {
            return this.enchantability;
        }

        @Override
        public Ingredient getRepairIngredient() {
            return (Ingredient)this.repairIngredient.get();
        }
    }
}
