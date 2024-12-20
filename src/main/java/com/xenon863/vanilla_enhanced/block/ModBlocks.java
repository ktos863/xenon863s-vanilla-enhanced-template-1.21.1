package com.xenon863.vanilla_enhanced.block;

import com.xenon863.vanilla_enhanced.Xenon863sVanillaEnhanced;
import com.xenon863.vanilla_enhanced.item.ModItems;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.client.util.ModelIdentifier;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block RICE_CROP = Registry.register(Registries.BLOCK, Identifier.of(Xenon863sVanillaEnhanced.MOD_ID, "rice_crop"), new ModCrops(FabricBlockSettings.copyOf(Blocks.CARROTS), ModItems.RICE));
    public static final Block GOLDEN_RICE_CROP = Registry.register(Registries.BLOCK, Identifier.of(Xenon863sVanillaEnhanced.MOD_ID, "golden_rice_crop"), new ModCrops(FabricBlockSettings.copyOf(Blocks.CARROTS), ModItems.GOLDEN_RICE));
    public static final Block CORN_CROP = Registry.register(Registries.BLOCK, Identifier.of(Xenon863sVanillaEnhanced.MOD_ID, "corn_crop"), new TallCrops(FabricBlockSettings.copyOf(Blocks.WHEAT)));

    public static final Block BLOCK_OF_CORN = registerBlock("block_of_corn", new Block(AbstractBlock.Settings.create().strength(2f).burnable()));
    public static final Block CORN_BRICKS = registerBlock("corn_bricks", new Block(AbstractBlock.Settings.create().strength(3f).burnable().requiresTool()));
    public static final Block CORN_BRICK_STAIRS = registerBlock("corn_brick_stairs", new StairsBlock(ModBlocks.CORN_BRICKS.getDefaultState(), AbstractBlock.Settings.create().strength(3f).burnable().requiresTool()));
    public static final Block CORN_BRICK_SLAB = registerBlock("corn_brick_slab", new SlabBlock(AbstractBlock.Settings.create().strength(3f).burnable().requiresTool()));
    public static final Block CORN_BRICK_WALL = registerBlock("corn_brick_wall", new WallBlock(AbstractBlock.Settings.create().strength(3f).burnable().requiresTool()));

    public static final Block TERMITARY = registerBlock("termitary", new Block(AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.ROOTED_DIRT)));

    public static final Block AZALEA_LOG = registerBlock("azalea_log", new PillarBlock(AbstractBlock.Settings.create().strength(2f).burnable()));
    public static final Block AZALEA_WOOD = registerBlock("azalea_wood", new PillarBlock(AbstractBlock.Settings.create().strength(2f).burnable()));
    public static final Block STRIPPED_AZALEA_LOG = registerBlock("stripped_azalea_log", new PillarBlock(AbstractBlock.Settings.create().strength(2f).burnable()));
    public static final Block STRIPPED_AZALEA_WOOD = registerBlock("stripped_azalea_wood", new PillarBlock(AbstractBlock.Settings.create().strength(2f).burnable()));
    public static final Block AZALEA_PLANKS = registerBlock("azalea_planks", new Block(AbstractBlock.Settings.create().strength(2f).burnable()));
    public static final Block AZALEA_STAIRS = registerBlock("azalea_stairs", new StairsBlock(ModBlocks.AZALEA_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(2f).burnable()));
    public static final Block AZALEA_SLAB = registerBlock("azalea_slab", new SlabBlock(AbstractBlock.Settings.create().strength(2f).burnable()));
    public static final Block AZALEA_FENCE = registerBlock("azalea_fence", new FenceBlock(AbstractBlock.Settings.create().strength(2f).burnable()));
    public static final Block AZALEA_FENCE_GATE = registerBlock("azalea_fence_gate", new FenceGateBlock(WoodType.OAK, AbstractBlock.Settings.create().strength(2f).burnable()));
    public static final Block AZALEA_DOOR = registerBlock("azalea_door", new DoorBlock(BlockSetType.OAK, AbstractBlock.Settings.create().nonOpaque().strength(3f).burnable()));
    public static final Block AZALEA_TRAPDOOR = registerBlock("azalea_trapdoor", new TrapdoorBlock(BlockSetType.OAK, AbstractBlock.Settings.create().nonOpaque().strength(3f).burnable()));
    public static final Block AZALEA_PRESSURE_PLATE = registerBlock("azalea_pressure_plate", new PressurePlateBlock(BlockSetType.OAK, AbstractBlock.Settings.create().nonOpaque().strength(0.5f).burnable()));
    public static final Block AZALEA_BUTTON = registerBlock("azalea_button", new ButtonBlock(BlockSetType.OAK, 15, AbstractBlock.Settings.create().noCollision().strength(0.5f).burnable()));

    public static final Block TUNGSTEN_ORE = registerBlock("tungsten_ore", new Block(AbstractBlock.Settings.create().strength(9).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block DEEPSLATE_TUNGSTEN_ORE = registerBlock("deepslate_tungsten_ore", new Block(AbstractBlock.Settings.create().strength(18).requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block BLOCK_OF_RAW_TUNGSTEN = registerBlock("block_of_raw_tungsten", new Block(AbstractBlock.Settings.create().strength(18).requiresTool().sounds(BlockSoundGroup.ANCIENT_DEBRIS)));
    public static final Block BLOCK_OF_ANDESITE_BRONZE = registerBlock("block_of_andesite_bronze", new Block(AbstractBlock.Settings.create().strength(4).requiresTool().sounds(BlockSoundGroup.METAL)));
    public static final Block BLOCK_OF_DIORITE_BRONZE = registerBlock("block_of_diorite_bronze", new Block(AbstractBlock.Settings.create().strength(4).requiresTool().sounds(BlockSoundGroup.METAL)));
    public static final Block BLOCK_OF_GRANITE_BRONZE = registerBlock("block_of_granite_bronze", new Block(AbstractBlock.Settings.create().strength(4).requiresTool().sounds(BlockSoundGroup.METAL)));
    public static final Block BLOCK_OF_TUNGSTEN = registerBlock("block_of_tungsten", new Block(AbstractBlock.Settings.create().strength(20).requiresTool().sounds(BlockSoundGroup.METAL)));


    public static final Block FORESTERS_TABLE = registerBlock("foresters_table", new Block(AbstractBlock.Settings.create().strength(2).burnable()));
    public static final Block BLUEPRINT_TABLE = registerBlock("blueprint_table", new Block(AbstractBlock.Settings.create().strength(2).burnable()));
    public static final Block MINERS_TABLE = registerBlock("miners_table", new Block(AbstractBlock.Settings.create().strength(4).requiresTool()));

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Xenon863sVanillaEnhanced.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block){
        Registry.register(Registries.ITEM, Identifier.of(Xenon863sVanillaEnhanced.MOD_ID, name), new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks(){
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries ->{
           entries.add(ModBlocks.AZALEA_LOG);
           entries.add(ModBlocks.AZALEA_WOOD);
           entries.add(ModBlocks.STRIPPED_AZALEA_LOG);
           entries.add(ModBlocks.STRIPPED_AZALEA_WOOD);
           entries.add(ModBlocks.AZALEA_PLANKS);
           entries.add(ModBlocks.AZALEA_STAIRS);
           entries.add(ModBlocks.AZALEA_SLAB);
           entries.add(ModBlocks.AZALEA_FENCE);
           entries.add(ModBlocks.AZALEA_FENCE_GATE);
           entries.add(ModBlocks.AZALEA_DOOR);
           entries.add(ModBlocks.AZALEA_TRAPDOOR);
           entries.add(ModBlocks.AZALEA_PRESSURE_PLATE);
           entries.add(ModBlocks.AZALEA_BUTTON);

           entries.add(ModBlocks.BLOCK_OF_CORN);
           entries.add(ModBlocks.CORN_BRICKS);
           entries.add(ModBlocks.CORN_BRICK_STAIRS);
           entries.add(ModBlocks.CORN_BRICK_SLAB);
           entries.add(ModBlocks.CORN_BRICK_WALL);

           entries.add(ModBlocks.BLOCK_OF_ANDESITE_BRONZE);
           entries.add(ModBlocks.BLOCK_OF_DIORITE_BRONZE);
           entries.add(ModBlocks.BLOCK_OF_GRANITE_BRONZE);
           entries.add(ModBlocks.BLOCK_OF_TUNGSTEN);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries ->{
            entries.add(ModBlocks.TERMITARY);
            entries.add(ModBlocks.AZALEA_LOG);
            entries.add(ModBlocks.TUNGSTEN_ORE);
            entries.add(ModBlocks.DEEPSLATE_TUNGSTEN_ORE);
            entries.add(ModBlocks.BLOCK_OF_RAW_TUNGSTEN);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(entries ->{
            entries.add(ModBlocks.FORESTERS_TABLE);
            entries.add(ModBlocks.BLUEPRINT_TABLE);
            entries.add(ModBlocks.MINERS_TABLE);
        });
    }
}
