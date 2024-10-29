package com.xenon863.vanilla_enhanced.datagen;

import com.xenon863.vanilla_enhanced.block.ModBlocks;
import com.xenon863.vanilla_enhanced.block.ModCrops;
import com.xenon863.vanilla_enhanced.block.TallCrops;
import com.xenon863.vanilla_enhanced.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.AnyOfLootCondition;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.loot.condition.TableBonusLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.predicate.StatePredicate;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {

        BlockStatePropertyLootCondition.Builder riceDropBuilder = BlockStatePropertyLootCondition.builder(ModBlocks.RICE_CROP).properties(StatePredicate
                .Builder.create().exactMatch(ModCrops.AGE, 7));
        addDrop(ModBlocks.RICE_CROP, cropDrops(ModBlocks.RICE_CROP, ModItems.RICE, ModItems.RICE, riceDropBuilder));
        BlockStatePropertyLootCondition.Builder goldenRiceDropBuilder = BlockStatePropertyLootCondition.builder(ModBlocks.GOLDEN_RICE_CROP).properties(StatePredicate
                .Builder.create().exactMatch(ModCrops.AGE, 7));
        addDrop(ModBlocks.GOLDEN_RICE_CROP, cropDrops(ModBlocks.GOLDEN_RICE_CROP, ModItems.GOLDEN_RICE, ModItems.GOLDEN_RICE, goldenRiceDropBuilder));
        AnyOfLootCondition.Builder cornDropBuilder = BlockStatePropertyLootCondition.builder(ModBlocks.CORN_CROP).properties(StatePredicate.Builder
                .create().exactMatch(TallCrops.AGE, 7)).or(BlockStatePropertyLootCondition.builder(ModBlocks.CORN_CROP).properties(StatePredicate.Builder
                .create().exactMatch(TallCrops.AGE, 15)));
        addDrop(ModBlocks.CORN_CROP, cropDrops(ModBlocks.CORN_CROP, ModItems.CORN, ModItems.CORN_GRAINS, cornDropBuilder));

        addDrop(ModBlocks.BLOCK_OF_CORN);
        addDrop(ModBlocks.CORN_BRICKS);
        addDrop(ModBlocks.CORN_BRICK_STAIRS);
        addDrop(ModBlocks.CORN_BRICK_SLAB);
        addDrop(ModBlocks.CORN_BRICK_WALL);

        addDrop(ModBlocks.TERMITARY);

        addDrop(Blocks.BIRCH_LEAVES, birchLeavesDrops(Blocks.BIRCH_LEAVES, Blocks.BIRCH_SAPLING, ModItems.PEAR, 0.05f));
        addDrop(Blocks.CHERRY_LEAVES, birchLeavesDrops(Blocks.CHERRY_LEAVES, Blocks.CHERRY_SAPLING, ModItems.CHERRIES, 0.05f));

        addDrop(ModBlocks.AZALEA_LOG);
        addDrop(ModBlocks.AZALEA_WOOD);
        addDrop(ModBlocks.STRIPPED_AZALEA_LOG);
        addDrop(ModBlocks.STRIPPED_AZALEA_WOOD);
        addDrop(ModBlocks.AZALEA_PLANKS);
        addDrop(ModBlocks.AZALEA_STAIRS);
        addDrop(ModBlocks.AZALEA_SLAB, slabDrops(ModBlocks.AZALEA_SLAB));
        addDrop(ModBlocks.AZALEA_FENCE);
        addDrop(ModBlocks.AZALEA_FENCE_GATE);
        addDrop(ModBlocks.AZALEA_DOOR, doorDrops(ModBlocks.AZALEA_DOOR));
        addDrop(ModBlocks.AZALEA_TRAPDOOR);
        addDrop(ModBlocks.AZALEA_PRESSURE_PLATE);
        addDrop(ModBlocks.AZALEA_BUTTON);

        addDrop(ModBlocks.TUNGSTEN_ORE, oreDrops(ModBlocks.TUNGSTEN_ORE, ModItems.RAW_TUNGSTEN));
        addDrop(ModBlocks.DEEPSLATE_TUNGSTEN_ORE, oreDrops(ModBlocks.DEEPSLATE_TUNGSTEN_ORE, ModItems.RAW_TUNGSTEN));
        addDrop(ModBlocks.BLOCK_OF_RAW_TUNGSTEN);
        addDrop(ModBlocks.BLOCK_OF_ANDESITE_BRONZE);
        addDrop(ModBlocks.BLOCK_OF_DIORITE_BRONZE);
        addDrop(ModBlocks.BLOCK_OF_GRANITE_BRONZE);
        addDrop(ModBlocks.BLOCK_OF_TUNGSTEN);

        addDrop(ModBlocks.FORESTERS_TABLE);
        addDrop(ModBlocks.BLUEPRINT_TABLE);
        addDrop(ModBlocks.MINERS_TABLE);
    }


    public LootTable.Builder birchLeavesDrops(Block leaves, Block sapling, Item fruit, float... saplingChance) {
        RegistryWrapper.Impl<Enchantment> impl = this.registryLookup.getWrapperOrThrow(RegistryKeys.ENCHANTMENT);
        return this.leavesDrops(leaves, sapling, saplingChance)
                .pool(
                        LootPool.builder()
                                .rolls(ConstantLootNumberProvider.create(1.0F))
                                .conditionally(this.createWithoutShearsOrSilkTouchCondition())
                                .with(
                                        ((LeafEntry.Builder)this.addSurvivesExplosionCondition(leaves, ItemEntry.builder(fruit)))
                                                .conditionally(TableBonusLootCondition.builder(impl.getOrThrow(Enchantments.FORTUNE), 0.005F, 0.0055555557F, 0.00625F, 0.008333334F, 0.025F))
                                )

                );

    }

}
