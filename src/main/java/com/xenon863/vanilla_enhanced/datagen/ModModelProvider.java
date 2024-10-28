package com.xenon863.vanilla_enhanced.datagen;

import com.xenon863.vanilla_enhanced.block.ModBlocks;
import com.xenon863.vanilla_enhanced.block.ModCrops;
import com.xenon863.vanilla_enhanced.block.TallCrops;
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
        blockStateModelGenerator.registerCrop(ModBlocks.RICE_CROP, ModCrops.AGE, 0, 1, 2, 3, 4, 5, 6, 7);
        blockStateModelGenerator.registerCrop(ModBlocks.GOLDEN_RICE_CROP, ModCrops.AGE, 0, 1, 2, 3, 4, 5, 6, 7);
        blockStateModelGenerator.registerCrop(ModBlocks.CORN_CROP, TallCrops.AGE, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLOCK_OF_CORN);
        BlockStateModelGenerator.BlockTexturePool cornBricks = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CORN_BRICKS);
        cornBricks.stairs(ModBlocks.CORN_BRICK_STAIRS);
        cornBricks.slab(ModBlocks.CORN_BRICK_SLAB);
        cornBricks.wall(ModBlocks.CORN_BRICK_WALL);

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

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLOCK_OF_ANDESITE_BRONZE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLOCK_OF_DIORITE_BRONZE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLOCK_OF_GRANITE_BRONZE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLOCK_OF_TUNGSTEN);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        itemModelGenerator.register(ModItems.PEAR, Models.GENERATED);
        itemModelGenerator.register(ModItems.COPPER_PEAR, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHERRIES, Models.GENERATED);
        itemModelGenerator.register(ModItems.AMETHYST_CHERRIES, Models.GENERATED);
        itemModelGenerator.register(ModItems.BOWL_OF_RICE, Models.GENERATED);
        itemModelGenerator.register(ModItems.BOWL_OF_GOLDEN_RICE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CORN, Models.GENERATED);

        itemModelGenerator.register(ModItems.MUD_BALL, Models.GENERATED);
        itemModelGenerator.register(ModItems.THICK_STICK, Models.GENERATED);

        itemModelGenerator.register(ModItems.ANDESITE_BRONZE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.DIORITE_BRONZE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.GRANITE_BRONZE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.TUNGSTEN_INGOT, Models.GENERATED);

        itemModelGenerator.register(ModItems.ANDESITE_BRONZE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ANDESITE_BRONZE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ANDESITE_BRONZE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ANDESITE_BRONZE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ANDESITE_BRONZE_HOE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.DIORITE_BRONZE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DIORITE_BRONZE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DIORITE_BRONZE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DIORITE_BRONZE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DIORITE_BRONZE_HOE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.GRANITE_BRONZE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.GRANITE_BRONZE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.GRANITE_BRONZE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.GRANITE_BRONZE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.GRANITE_BRONZE_HOE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.TUNGSTEN_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TUNGSTEN_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TUNGSTEN_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TUNGSTEN_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TUNGSTEN_HOE, Models.HANDHELD);

    }
}
