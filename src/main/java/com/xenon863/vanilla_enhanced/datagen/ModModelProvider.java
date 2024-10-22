package com.xenon863.vanilla_enhanced.datagen;

import com.xenon863.vanilla_enhanced.block.ModBlocks;
import com.xenon863.vanilla_enhanced.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TERMITARY);

        blockStateModelGenerator.registerLog(ModBlocks.AZALEA_LOG).log(ModBlocks.AZALEA_LOG).wood(ModBlocks.AZALEA_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.AZALEA_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_AZALEA_LOG).log(ModBlocks.STRIPPED_AZALEA_LOG).wood(ModBlocks.STRIPPED_AZALEA_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_AZALEA_WOOD);
        BlockStateModelGenerator.BlockTexturePool azaleaPlanks = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.AZALEA_PLANKS);
        azaleaPlanks.stairs(ModBlocks.AZALEA_STAIRS);
        azaleaPlanks.slab(ModBlocks.AZALEA_SLAB);
        azaleaPlanks.fence(ModBlocks.AZALEA_FENCE);
        azaleaPlanks.fenceGate(ModBlocks.AZALEA_FENCE_GATE);
        blockStateModelGenerator.registerDoor(ModBlocks.AZALEA_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.AZALEA_TRAPDOOR);
        azaleaPlanks.pressurePlate(ModBlocks.AZALEA_PRESSURE_PLATE);
        azaleaPlanks.button(ModBlocks.AZALEA_BUTTON);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.PEAR, Models.GENERATED);
        itemModelGenerator.register(ModItems.COPPER_PEAR, Models.GENERATED);

        itemModelGenerator.register(ModItems.MUD_BALL, Models.GENERATED);
        itemModelGenerator.register(ModItems.THICK_STICK, Models.GENERATED);

        itemModelGenerator.register(ModItems.ANDESITE_BRONZE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.DIORITE_BRONZE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.GRANITE_BRONZE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_INGOT, Models.GENERATED);
    }
}
