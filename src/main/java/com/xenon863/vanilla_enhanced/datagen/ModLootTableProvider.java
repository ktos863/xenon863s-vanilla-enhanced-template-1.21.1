package com.xenon863.vanilla_enhanced.datagen;

import com.xenon863.vanilla_enhanced.block.ModBlocks;
import com.xenon863.vanilla_enhanced.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.fabricmc.fabric.api.loot.v3.FabricLootTableBuilder;
import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Items;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.TableBonusLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.TERMITARY);

        addDrop(Blocks.BIRCH_LEAVES, birchLeavesDrops(Blocks.BIRCH_LEAVES, Blocks.BIRCH_SAPLING, 0.05f));

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

        addDrop(ModBlocks.BLOCK_OF_ANDESITE_BRONZE);
        addDrop(ModBlocks.BLOCK_OF_DIORITE_BRONZE);
        addDrop(ModBlocks.BLOCK_OF_GRANITE_BRONZE);
        addDrop(ModBlocks.BLOCK_OF_TUNGSTEN);
    }

    public LootTable.Builder birchLeavesDrops(Block leaves, Block sapling, float... saplingChance) {
        RegistryWrapper.Impl<Enchantment> impl = this.registryLookup.getWrapperOrThrow(RegistryKeys.ENCHANTMENT);
        return this.leavesDrops(leaves, sapling, saplingChance)
                .pool(
                        LootPool.builder()
                                .rolls(ConstantLootNumberProvider.create(1.0F))
                                .conditionally(this.createWithoutShearsOrSilkTouchCondition())
                                .with(
                                        ((LeafEntry.Builder)this.addSurvivesExplosionCondition(leaves, ItemEntry.builder(ModItems.PEAR)))
                                                .conditionally(TableBonusLootCondition.builder(impl.getOrThrow(Enchantments.FORTUNE), 0.005F, 0.0055555557F, 0.00625F, 0.008333334F, 0.025F))
                                )

                );

    }
}
