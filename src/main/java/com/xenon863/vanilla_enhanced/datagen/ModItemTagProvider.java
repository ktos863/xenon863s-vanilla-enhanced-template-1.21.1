package com.xenon863.vanilla_enhanced.datagen;

import com.xenon863.vanilla_enhanced.block.ModBlocks;
import com.xenon863.vanilla_enhanced.item.ModItems;
import com.xenon863.vanilla_enhanced.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture, @Nullable BlockTagProvider blockTagProvider) {
        super(output, completableFuture, blockTagProvider);
    }

    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        this(output, completableFuture, null);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ModItems.ANDESITE_BRONZE_SWORD)
                .add(ModItems.DIORITE_BRONZE_SWORD)
                .add(ModItems.GRANITE_BRONZE_SWORD)
                .add(ModItems.TUNGSTEN_SWORD);
        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(ModItems.ANDESITE_BRONZE_PICKAXE)
                .add(ModItems.DIORITE_BRONZE_PICKAXE)
                .add(ModItems.GRANITE_BRONZE_PICKAXE)
                .add(ModItems.TUNGSTEN_PICKAXE);
        getOrCreateTagBuilder(ItemTags.AXES)
                .add(ModItems.ANDESITE_BRONZE_AXE)
                .add(ModItems.DIORITE_BRONZE_AXE)
                .add(ModItems.GRANITE_BRONZE_AXE)
                .add(ModItems.TUNGSTEN_AXE);
        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(ModItems.ANDESITE_BRONZE_SHOVEL)
                .add(ModItems.DIORITE_BRONZE_SHOVEL)
                .add(ModItems.GRANITE_BRONZE_SHOVEL)
                .add(ModItems.TUNGSTEN_SHOVEL);
        getOrCreateTagBuilder(ItemTags.HOES)
                .add(ModItems.ANDESITE_BRONZE_HOE)
                .add(ModItems.DIORITE_BRONZE_HOE)
                .add(ModItems.GRANITE_BRONZE_HOE)
                .add(ModItems.TUNGSTEN_HOE);
        getOrCreateTagBuilder(ItemTags.HEAD_ARMOR)
                .add(ModItems.ANDESITE_BRONZE_HELMET)
                .add(ModItems.DIORITE_BRONZE_HELMET)
                .add(ModItems.GRANITE_BRONZE_HELMET)
                .add(ModItems.TUNGSTEN_HELMET);
        getOrCreateTagBuilder(ItemTags.CHEST_ARMOR)
                .add(ModItems.ANDESITE_BRONZE_CHESTPLATE)
                .add(ModItems.DIORITE_BRONZE_CHESTPLATE)
                .add(ModItems.GRANITE_BRONZE_CHESTPLATE)
                .add(ModItems.TUNGSTEN_CHESTPLATE);
        getOrCreateTagBuilder(ItemTags.LEG_ARMOR)
                .add(ModItems.ANDESITE_BRONZE_LEGGINGS)
                .add(ModItems.DIORITE_BRONZE_LEGGINGS)
                .add(ModItems.GRANITE_BRONZE_LEGGINGS)
                .add(ModItems.TUNGSTEN_LEGGINGS);
        getOrCreateTagBuilder(ItemTags.FOOT_ARMOR)
                .add(ModItems.ANDESITE_BRONZE_BOOTS)
                .add(ModItems.DIORITE_BRONZE_BOOTS)
                .add(ModItems.GRANITE_BRONZE_BOOTS)
                .add(ModItems.TUNGSTEN_BOOTS);

        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(ModBlocks.AZALEA_PLANKS.asItem());

        getOrCreateTagBuilder(ModTags.Items.AZALEA_LOGS)
                .add(ModBlocks.AZALEA_LOG.asItem())
                .add(ModBlocks.AZALEA_WOOD.asItem())
                .add(ModBlocks.STRIPPED_AZALEA_LOG.asItem())
                .add(ModBlocks.STRIPPED_AZALEA_WOOD.asItem());

        getOrCreateTagBuilder(ItemTags.LOGS)
                .add(ModBlocks.AZALEA_LOG.asItem())
                .add(ModBlocks.AZALEA_WOOD.asItem())
                .add(ModBlocks.STRIPPED_AZALEA_LOG.asItem())
                .add(ModBlocks.STRIPPED_AZALEA_WOOD.asItem());

        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
                .add(ModBlocks.AZALEA_LOG.asItem())
                .add(ModBlocks.AZALEA_WOOD.asItem())
                .add(ModBlocks.STRIPPED_AZALEA_LOG.asItem())
                .add(ModBlocks.STRIPPED_AZALEA_WOOD.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_BUTTONS)
                .add(ModBlocks.AZALEA_BUTTON.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_STAIRS)
                .add(ModBlocks.AZALEA_STAIRS.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_SLABS)
                .add(ModBlocks.AZALEA_SLAB.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_FENCES)
                .add(ModBlocks.AZALEA_FENCE.asItem());

        getOrCreateTagBuilder(ItemTags.FENCE_GATES)
                .add(ModBlocks.AZALEA_FENCE_GATE.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_DOORS)
                .add(ModBlocks.AZALEA_DOOR.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_TRAPDOORS)
                .add(ModBlocks.AZALEA_TRAPDOOR.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_PRESSURE_PLATES)
                .add(ModBlocks.AZALEA_PRESSURE_PLATE.asItem());

    }
}
