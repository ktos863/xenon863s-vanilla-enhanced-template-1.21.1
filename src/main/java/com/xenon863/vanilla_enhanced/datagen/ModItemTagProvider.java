package com.xenon863.vanilla_enhanced.datagen;

import com.xenon863.vanilla_enhanced.block.ModBlocks;
import com.xenon863.vanilla_enhanced.item.ModItems;
import com.xenon863.vanilla_enhanced.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ModItems.ANDESITE_BRONZE_SWORD);

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
