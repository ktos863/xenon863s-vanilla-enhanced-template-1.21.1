package com.xenon863.vanilla_enhanced.datagen;

import com.xenon863.vanilla_enhanced.block.ModBlocks;
import com.xenon863.vanilla_enhanced.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.BLOCK_OF_ANDESITE_BRONZE)
                .add(ModBlocks.BLOCK_OF_DIORITE_BRONZE)
                .add(ModBlocks.BLOCK_OF_GRANITE_BRONZE)
                .add(ModBlocks.BLOCK_OF_TUNGSTEN);

        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(ModBlocks.AZALEA_LOG)
                .add(ModBlocks.AZALEA_WOOD)
                .add(ModBlocks.STRIPPED_AZALEA_LOG)
                .add(ModBlocks.STRIPPED_AZALEA_WOOD)
                .add(ModBlocks.AZALEA_PLANKS)
                .add(ModBlocks.AZALEA_STAIRS)
                .add(ModBlocks.AZALEA_SLAB)
                .add(ModBlocks.AZALEA_FENCE)
                .add(ModBlocks.AZALEA_FENCE_GATE)
                .add(ModBlocks.AZALEA_DOOR)
                .add(ModBlocks.AZALEA_TRAPDOOR)
                .add(ModBlocks.AZALEA_PRESSURE_PLATE)
                .add(ModBlocks.AZALEA_BUTTON);

        getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE)
                .add(ModBlocks.TERMITARY);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.BLOCK_OF_ANDESITE_BRONZE)
                .add(ModBlocks.BLOCK_OF_DIORITE_BRONZE)
                .add(ModBlocks.BLOCK_OF_GRANITE_BRONZE);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.BLOCK_OF_TUNGSTEN);

        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(ModBlocks.AZALEA_FENCE_GATE);

        getOrCreateTagBuilder(BlockTags.LOGS)
                .add(ModBlocks.AZALEA_LOG)
                .add(ModBlocks.STRIPPED_AZALEA_LOG)
                .add(ModBlocks.AZALEA_WOOD)
                .add(ModBlocks.STRIPPED_AZALEA_WOOD);

        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.AZALEA_LOG)
                .add(ModBlocks.STRIPPED_AZALEA_LOG)
                .add(ModBlocks.AZALEA_WOOD)
                .add(ModBlocks.STRIPPED_AZALEA_WOOD);

        getOrCreateTagBuilder(BlockTags.WOODEN_BUTTONS)
                .add(ModBlocks.AZALEA_BUTTON);

        getOrCreateTagBuilder(BlockTags.WOODEN_DOORS)
                .add(ModBlocks.AZALEA_DOOR);

        getOrCreateTagBuilder(BlockTags.WOODEN_FENCES)
                .add(ModBlocks.AZALEA_FENCE);

        getOrCreateTagBuilder(BlockTags.WOODEN_PRESSURE_PLATES)
                .add(ModBlocks.AZALEA_PRESSURE_PLATE);

        getOrCreateTagBuilder(BlockTags.WOODEN_SLABS)
                .add(ModBlocks.AZALEA_SLAB);

        getOrCreateTagBuilder(BlockTags.WOODEN_STAIRS)
                .add(ModBlocks.AZALEA_STAIRS);

        getOrCreateTagBuilder(BlockTags.WOODEN_TRAPDOORS)
                .add(ModBlocks.AZALEA_TRAPDOOR);
    }
}
