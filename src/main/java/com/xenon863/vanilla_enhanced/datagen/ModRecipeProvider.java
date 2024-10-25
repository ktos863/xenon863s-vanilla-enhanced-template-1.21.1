package com.xenon863.vanilla_enhanced.datagen;

import com.xenon863.vanilla_enhanced.Xenon863sVanillaEnhanced;
import com.xenon863.vanilla_enhanced.block.ModBlocks;
import com.xenon863.vanilla_enhanced.item.ModItems;
import com.xenon863.vanilla_enhanced.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.ShapedRecipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter recipeExporter) {

        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.COPPER_PEAR)
                .pattern("CCC")
                .pattern("CPC")
                .pattern("CCC")
                .input('C', Items.COPPER_INGOT)
                .input('P', ModItems.PEAR)
                .criterion(hasItem(ModItems.PEAR), conditionsFromItem(ModItems.PEAR))
                .offerTo(recipeExporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.MUD_BALL, 9)
                .input(Blocks.PACKED_MUD)
                .criterion(hasItem(Blocks.PACKED_MUD),conditionsFromItem(Blocks.PACKED_MUD))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Blocks.PACKED_MUD)
                .pattern("MMM")
                .pattern("MMM")
                .pattern("MMM")
                .input('M', ModItems.MUD_BALL)
                .criterion(hasItem(ModItems.MUD_BALL), conditionsFromItem(ModItems.MUD_BALL))
                .offerTo(recipeExporter, Identifier.of(Xenon863sVanillaEnhanced.MOD_ID, "packed_mud_from_mud_balls"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.THICK_STICK)
                .pattern("SMS")
                .input('S', Items.STICK)
                .input('M', ModItems.MUD_BALL)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(recipeExporter);


        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.AZALEA_PLANKS, 4)
                .input(ModTags.Items.AZALEA_LOGS)
                .criterion(hasItem(ModBlocks.AZALEA_LOG), conditionsFromItem(ModBlocks.AZALEA_LOG))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.AZALEA_WOOD, 3)
                .pattern("LL")
                .pattern("LL")
                .input('L', ModBlocks.AZALEA_LOG)
                .criterion(hasItem(ModBlocks.AZALEA_LOG), conditionsFromItem(ModBlocks.AZALEA_LOG))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_AZALEA_WOOD, 3)
                .pattern("LL")
                .pattern("LL")
                .input('L', ModBlocks.STRIPPED_AZALEA_LOG)
                .criterion(hasItem(ModBlocks.STRIPPED_AZALEA_LOG), conditionsFromItem(ModBlocks.STRIPPED_AZALEA_LOG))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.AZALEA_STAIRS, 4)
                .pattern("P  ")
                .pattern("PP ")
                .pattern("PPP")
                .input('P', ModBlocks.AZALEA_PLANKS)
                .criterion(hasItem(ModBlocks.AZALEA_PLANKS), conditionsFromItem(ModBlocks.AZALEA_PLANKS))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.AZALEA_SLAB, 6)
                .pattern("PPP")
                .input('P', ModBlocks.AZALEA_PLANKS)
                .criterion(hasItem(ModBlocks.AZALEA_PLANKS), conditionsFromItem(ModBlocks.AZALEA_PLANKS))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.AZALEA_FENCE, 3)
                .pattern("PSP")
                .pattern("PSP")
                .input('P', ModBlocks.AZALEA_PLANKS)
                .input('S', Items.STICK)
                .criterion(hasItem(ModBlocks.AZALEA_PLANKS), conditionsFromItem(ModBlocks.AZALEA_PLANKS))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.AZALEA_FENCE_GATE)
                .pattern("SPS")
                .pattern("SPS")
                .input('P', ModBlocks.AZALEA_PLANKS)
                .input('S', Items.STICK)
                .criterion(hasItem(ModBlocks.AZALEA_PLANKS), conditionsFromItem(ModBlocks.AZALEA_PLANKS))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.AZALEA_DOOR, 3)
                .pattern("PP")
                .pattern("PP")
                .pattern("PP")
                .input('P', ModBlocks.AZALEA_PLANKS)
                .criterion(hasItem(ModBlocks.AZALEA_PLANKS), conditionsFromItem(ModBlocks.AZALEA_PLANKS))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.AZALEA_TRAPDOOR, 2)
                .pattern("PPP")
                .pattern("PPP")
                .input('P', ModBlocks.AZALEA_PLANKS)
                .criterion(hasItem(ModBlocks.AZALEA_PLANKS), conditionsFromItem(ModBlocks.AZALEA_PLANKS))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.AZALEA_PRESSURE_PLATE)
                .pattern("PP")
                .input('P', ModBlocks.AZALEA_PLANKS)
                .criterion(hasItem(ModBlocks.AZALEA_PLANKS), conditionsFromItem(ModBlocks.AZALEA_PLANKS))
                .offerTo(recipeExporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.AZALEA_BUTTON)
                .input(ModBlocks.AZALEA_PLANKS)
                .criterion(hasItem(ModBlocks.AZALEA_PLANKS), conditionsFromItem(ModBlocks.AZALEA_PLANKS))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Items.CHAINMAIL_HELMET)
                .pattern("NNN")
                .pattern("N N")
                .input('N', Items.IRON_NUGGET)
                .criterion(hasItem(Items.IRON_NUGGET), conditionsFromItem(Items.IRON_NUGGET))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Items.CHAINMAIL_CHESTPLATE)
                .pattern("N N")
                .pattern("NNN")
                .pattern("NNN")
                .input('N', Items.IRON_NUGGET)
                .criterion(hasItem(Items.IRON_NUGGET), conditionsFromItem(Items.IRON_NUGGET))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Items.CHAINMAIL_LEGGINGS)
                .pattern("NNN")
                .pattern("N N")
                .pattern("N N")
                .input('N', Items.IRON_NUGGET)
                .criterion(hasItem(Items.IRON_NUGGET), conditionsFromItem(Items.IRON_NUGGET))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Items.CHAINMAIL_BOOTS)
                .pattern("N N")
                .pattern("N N")
                .input('N', Items.IRON_NUGGET)
                .criterion(hasItem(Items.IRON_NUGGET), conditionsFromItem(Items.IRON_NUGGET))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ANDESITE_BRONZE_INGOT)
                .pattern("CAC")
                .pattern("ACA")
                .pattern("CAC")
                .input('C', Items.COPPER_INGOT)
                .input('A', Blocks.ANDESITE)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DIORITE_BRONZE_INGOT)
                .pattern("CDC")
                .pattern("DCD")
                .pattern("CDC")
                .input('C', Items.COPPER_INGOT)
                .input('D', Blocks.DIORITE)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.GRANITE_BRONZE_INGOT)
                .pattern("CGC")
                .pattern("GCG")
                .pattern("CGC")
                .input('C', Items.COPPER_INGOT)
                .input('G', Blocks.GRANITE)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(recipeExporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ANDESITE_BRONZE_INGOT, 9)
                .input(ModBlocks.BLOCK_OF_ANDESITE_BRONZE)
                .criterion(hasItem(ModBlocks.BLOCK_OF_ANDESITE_BRONZE),conditionsFromItem(ModBlocks.BLOCK_OF_ANDESITE_BRONZE))
                .offerTo(recipeExporter, Identifier.of(Xenon863sVanillaEnhanced.MOD_ID, "andesite_bronze_ingot_from_block_of_andesite_bronze"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLOCK_OF_ANDESITE_BRONZE)
                .pattern("III")
                .pattern("III")
                .pattern("III")
                .input('I', ModItems.ANDESITE_BRONZE_INGOT)
                .criterion(hasItem(ModItems.ANDESITE_BRONZE_INGOT), conditionsFromItem(ModItems.ANDESITE_BRONZE_INGOT))
                .offerTo(recipeExporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DIORITE_BRONZE_INGOT, 9)
                .input(ModBlocks.BLOCK_OF_DIORITE_BRONZE)
                .criterion(hasItem(ModBlocks.BLOCK_OF_DIORITE_BRONZE),conditionsFromItem(ModBlocks.BLOCK_OF_DIORITE_BRONZE))
                .offerTo(recipeExporter, Identifier.of(Xenon863sVanillaEnhanced.MOD_ID, "diorite_bronze_ingot_from_block_of_diorite_bronze"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLOCK_OF_DIORITE_BRONZE)
                .pattern("III")
                .pattern("III")
                .pattern("III")
                .input('I', ModItems.DIORITE_BRONZE_INGOT)
                .criterion(hasItem(ModItems.DIORITE_BRONZE_INGOT), conditionsFromItem(ModItems.DIORITE_BRONZE_INGOT))
                .offerTo(recipeExporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.GRANITE_BRONZE_INGOT, 9)
                .input(ModBlocks.BLOCK_OF_GRANITE_BRONZE)
                .criterion(hasItem(ModBlocks.BLOCK_OF_GRANITE_BRONZE),conditionsFromItem(ModBlocks.BLOCK_OF_GRANITE_BRONZE))
                .offerTo(recipeExporter, Identifier.of(Xenon863sVanillaEnhanced.MOD_ID, "granite_bronze_ingot_from_block_of_granite_bronze"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLOCK_OF_GRANITE_BRONZE)
                .pattern("III")
                .pattern("III")
                .pattern("III")
                .input('I', ModItems.GRANITE_BRONZE_INGOT)
                .criterion(hasItem(ModItems.GRANITE_BRONZE_INGOT), conditionsFromItem(ModItems.GRANITE_BRONZE_INGOT))
                .offerTo(recipeExporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.TUNGSTEN_INGOT, 9)
                .input(ModBlocks.BLOCK_OF_TUNGSTEN)
                .criterion(hasItem(ModBlocks.BLOCK_OF_TUNGSTEN), conditionsFromItem(ModBlocks.BLOCK_OF_TUNGSTEN))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLOCK_OF_TUNGSTEN)
                .pattern("III")
                .pattern("III")
                .pattern("III")
                .input('I', ModItems.TUNGSTEN_INGOT)
                .criterion(hasItem(ModItems.TUNGSTEN_INGOT), conditionsFromItem(ModItems.TUNGSTEN_INGOT))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.ANDESITE_BRONZE_SWORD)
                .pattern("I")
                .pattern("I")
                .pattern("S")
                .input('I', ModItems.ANDESITE_BRONZE_INGOT)
                .input('S', ModItems.THICK_STICK)
                .criterion(hasItem(ModItems.ANDESITE_BRONZE_INGOT), conditionsFromItem(ModItems.ANDESITE_BRONZE_INGOT))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ANDESITE_BRONZE_PICKAXE)
                .pattern("III")
                .pattern(" S ")
                .pattern(" S ")
                .input('I', ModItems.ANDESITE_BRONZE_INGOT)
                .input('S', ModItems.THICK_STICK)
                .criterion(hasItem(ModItems.ANDESITE_BRONZE_INGOT), conditionsFromItem(ModItems.ANDESITE_BRONZE_INGOT))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ANDESITE_BRONZE_AXE)
                .pattern("II")
                .pattern("IS")
                .pattern(" S")
                .input('I', ModItems.ANDESITE_BRONZE_INGOT)
                .input('S', ModItems.THICK_STICK)
                .criterion(hasItem(ModItems.ANDESITE_BRONZE_INGOT), conditionsFromItem(ModItems.ANDESITE_BRONZE_INGOT))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ANDESITE_BRONZE_SHOVEL)
                .pattern("I")
                .pattern("S")
                .pattern("S")
                .input('I', ModItems.ANDESITE_BRONZE_INGOT)
                .input('S', ModItems.THICK_STICK)
                .criterion(hasItem(ModItems.ANDESITE_BRONZE_INGOT), conditionsFromItem(ModItems.ANDESITE_BRONZE_INGOT))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ANDESITE_BRONZE_HOE)
                .pattern("II")
                .pattern(" S")
                .pattern(" S")
                .input('I', ModItems.ANDESITE_BRONZE_INGOT)
                .input('S', ModItems.THICK_STICK)
                .criterion(hasItem(ModItems.ANDESITE_BRONZE_INGOT), conditionsFromItem(ModItems.ANDESITE_BRONZE_INGOT))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.ANDESITE_BRONZE_HELMET)
                .pattern("III")
                .pattern("I I")
                .input('I', ModItems.ANDESITE_BRONZE_INGOT)
                .criterion(hasItem(ModItems.ANDESITE_BRONZE_INGOT), conditionsFromItem(ModItems.ANDESITE_BRONZE_INGOT))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.ANDESITE_BRONZE_CHESTPLATE)
                .pattern("I I")
                .pattern("III")
                .pattern("III")
                .input('I', ModItems.ANDESITE_BRONZE_INGOT)
                .criterion(hasItem(ModItems.ANDESITE_BRONZE_INGOT), conditionsFromItem(ModItems.ANDESITE_BRONZE_INGOT))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.ANDESITE_BRONZE_LEGGINGS)
                .pattern("III")
                .pattern("I I")
                .pattern("I I")
                .input('I', ModItems.ANDESITE_BRONZE_INGOT)
                .criterion(hasItem(ModItems.ANDESITE_BRONZE_INGOT), conditionsFromItem(ModItems.ANDESITE_BRONZE_INGOT))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.ANDESITE_BRONZE_BOOTS)
                .pattern("I I")
                .pattern("I I")
                .input('I', ModItems.ANDESITE_BRONZE_INGOT)
                .criterion(hasItem(ModItems.ANDESITE_BRONZE_INGOT), conditionsFromItem(ModItems.ANDESITE_BRONZE_INGOT))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.DIORITE_BRONZE_SWORD)
                .pattern("I")
                .pattern("I")
                .pattern("S")
                .input('I', ModItems.DIORITE_BRONZE_INGOT)
                .input('S', ModItems.THICK_STICK)
                .criterion(hasItem(ModItems.DIORITE_BRONZE_INGOT), conditionsFromItem(ModItems.DIORITE_BRONZE_INGOT))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.DIORITE_BRONZE_PICKAXE)
                .pattern("III")
                .pattern(" S ")
                .pattern(" S ")
                .input('I', ModItems.DIORITE_BRONZE_INGOT)
                .input('S', ModItems.THICK_STICK)
                .criterion(hasItem(ModItems.DIORITE_BRONZE_INGOT), conditionsFromItem(ModItems.DIORITE_BRONZE_INGOT))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.DIORITE_BRONZE_AXE)
                .pattern("II")
                .pattern("IS")
                .pattern(" S")
                .input('I', ModItems.DIORITE_BRONZE_INGOT)
                .input('S', ModItems.THICK_STICK)
                .criterion(hasItem(ModItems.DIORITE_BRONZE_INGOT), conditionsFromItem(ModItems.DIORITE_BRONZE_INGOT))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.DIORITE_BRONZE_SHOVEL)
                .pattern("I")
                .pattern("S")
                .pattern("S")
                .input('I', ModItems.DIORITE_BRONZE_INGOT)
                .input('S', ModItems.THICK_STICK)
                .criterion(hasItem(ModItems.DIORITE_BRONZE_INGOT), conditionsFromItem(ModItems.DIORITE_BRONZE_INGOT))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.DIORITE_BRONZE_HOE)
                .pattern("II")
                .pattern(" S")
                .pattern(" S")
                .input('I', ModItems.DIORITE_BRONZE_INGOT)
                .input('S', ModItems.THICK_STICK)
                .criterion(hasItem(ModItems.DIORITE_BRONZE_INGOT), conditionsFromItem(ModItems.DIORITE_BRONZE_INGOT))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.DIORITE_BRONZE_HELMET)
                .pattern("III")
                .pattern("I I")
                .input('I', ModItems.DIORITE_BRONZE_INGOT)
                .criterion(hasItem(ModItems.DIORITE_BRONZE_INGOT), conditionsFromItem(ModItems.DIORITE_BRONZE_INGOT))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.DIORITE_BRONZE_CHESTPLATE)
                .pattern("I I")
                .pattern("III")
                .pattern("III")
                .input('I', ModItems.DIORITE_BRONZE_INGOT)
                .criterion(hasItem(ModItems.DIORITE_BRONZE_INGOT), conditionsFromItem(ModItems.DIORITE_BRONZE_INGOT))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.DIORITE_BRONZE_LEGGINGS)
                .pattern("III")
                .pattern("I I")
                .pattern("I I")
                .input('I', ModItems.DIORITE_BRONZE_INGOT)
                .criterion(hasItem(ModItems.DIORITE_BRONZE_INGOT), conditionsFromItem(ModItems.DIORITE_BRONZE_INGOT))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.DIORITE_BRONZE_BOOTS)
                .pattern("I I")
                .pattern("I I")
                .input('I', ModItems.DIORITE_BRONZE_INGOT)
                .criterion(hasItem(ModItems.DIORITE_BRONZE_INGOT), conditionsFromItem(ModItems.DIORITE_BRONZE_INGOT))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.GRANITE_BRONZE_SWORD)
                .pattern("I")
                .pattern("I")
                .pattern("S")
                .input('I', ModItems.GRANITE_BRONZE_INGOT)
                .input('S', ModItems.THICK_STICK)
                .criterion(hasItem(ModItems.GRANITE_BRONZE_INGOT), conditionsFromItem(ModItems.GRANITE_BRONZE_INGOT))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.GRANITE_BRONZE_PICKAXE)
                .pattern("III")
                .pattern(" S ")
                .pattern(" S ")
                .input('I', ModItems.GRANITE_BRONZE_INGOT)
                .input('S', ModItems.THICK_STICK)
                .criterion(hasItem(ModItems.GRANITE_BRONZE_INGOT), conditionsFromItem(ModItems.GRANITE_BRONZE_INGOT))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.GRANITE_BRONZE_AXE)
                .pattern("II")
                .pattern("IS")
                .pattern(" S")
                .input('I', ModItems.GRANITE_BRONZE_INGOT)
                .input('S', ModItems.THICK_STICK)
                .criterion(hasItem(ModItems.GRANITE_BRONZE_INGOT), conditionsFromItem(ModItems.GRANITE_BRONZE_INGOT))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.GRANITE_BRONZE_SHOVEL)
                .pattern("I")
                .pattern("S")
                .pattern("S")
                .input('I', ModItems.GRANITE_BRONZE_INGOT)
                .input('S', ModItems.THICK_STICK)
                .criterion(hasItem(ModItems.GRANITE_BRONZE_INGOT), conditionsFromItem(ModItems.GRANITE_BRONZE_INGOT))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.GRANITE_BRONZE_HOE)
                .pattern("II")
                .pattern(" S")
                .pattern(" S")
                .input('I', ModItems.GRANITE_BRONZE_INGOT)
                .input('S', ModItems.THICK_STICK)
                .criterion(hasItem(ModItems.GRANITE_BRONZE_INGOT), conditionsFromItem(ModItems.GRANITE_BRONZE_INGOT))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.GRANITE_BRONZE_HELMET)
                .pattern("III")
                .pattern("I I")
                .input('I', ModItems.GRANITE_BRONZE_INGOT)
                .criterion(hasItem(ModItems.GRANITE_BRONZE_INGOT), conditionsFromItem(ModItems.GRANITE_BRONZE_INGOT))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.GRANITE_BRONZE_CHESTPLATE)
                .pattern("I I")
                .pattern("III")
                .pattern("III")
                .input('I', ModItems.GRANITE_BRONZE_INGOT)
                .criterion(hasItem(ModItems.GRANITE_BRONZE_INGOT), conditionsFromItem(ModItems.GRANITE_BRONZE_INGOT))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.GRANITE_BRONZE_LEGGINGS)
                .pattern("III")
                .pattern("I I")
                .pattern("I I")
                .input('I', ModItems.GRANITE_BRONZE_INGOT)
                .criterion(hasItem(ModItems.GRANITE_BRONZE_INGOT), conditionsFromItem(ModItems.GRANITE_BRONZE_INGOT))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.GRANITE_BRONZE_BOOTS)
                .pattern("I I")
                .pattern("I I")
                .input('I', ModItems.GRANITE_BRONZE_INGOT)
                .criterion(hasItem(ModItems.GRANITE_BRONZE_INGOT), conditionsFromItem(ModItems.GRANITE_BRONZE_INGOT))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.TUNGSTEN_SWORD)
                .pattern("I")
                .pattern("I")
                .pattern("S")
                .input('I', ModItems.TUNGSTEN_INGOT)
                .input('S', ModItems.THICK_STICK)
                .criterion(hasItem(ModItems.TUNGSTEN_INGOT), conditionsFromItem(ModItems.TUNGSTEN_INGOT))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.TUNGSTEN_PICKAXE)
                .pattern("III")
                .pattern(" S ")
                .pattern(" S ")
                .input('I', ModItems.TUNGSTEN_INGOT)
                .input('S', ModItems.THICK_STICK)
                .criterion(hasItem(ModItems.TUNGSTEN_INGOT), conditionsFromItem(ModItems.TUNGSTEN_INGOT))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.TUNGSTEN_AXE)
                .pattern("II")
                .pattern("IS")
                .pattern(" S")
                .input('I', ModItems.TUNGSTEN_INGOT)
                .input('S', ModItems.THICK_STICK)
                .criterion(hasItem(ModItems.TUNGSTEN_INGOT), conditionsFromItem(ModItems.TUNGSTEN_INGOT))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.TUNGSTEN_SHOVEL)
                .pattern("I")
                .pattern("S")
                .pattern("S")
                .input('I', ModItems.TUNGSTEN_INGOT)
                .input('S', ModItems.THICK_STICK)
                .criterion(hasItem(ModItems.TUNGSTEN_INGOT), conditionsFromItem(ModItems.TUNGSTEN_INGOT))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.TUNGSTEN_HOE)
                .pattern("II")
                .pattern(" S")
                .pattern(" S")
                .input('I', ModItems.TUNGSTEN_INGOT)
                .input('S', ModItems.THICK_STICK)
                .criterion(hasItem(ModItems.TUNGSTEN_INGOT), conditionsFromItem(ModItems.TUNGSTEN_INGOT))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.TUNGSTEN_HELMET)
                .pattern("III")
                .pattern("I I")
                .input('I', ModItems.TUNGSTEN_INGOT)
                .criterion(hasItem(ModItems.TUNGSTEN_INGOT), conditionsFromItem(ModItems.TUNGSTEN_INGOT))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.TUNGSTEN_CHESTPLATE)
                .pattern("I I")
                .pattern("III")
                .pattern("III")
                .input('I', ModItems.TUNGSTEN_INGOT)
                .criterion(hasItem(ModItems.TUNGSTEN_INGOT), conditionsFromItem(ModItems.TUNGSTEN_INGOT))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.TUNGSTEN_LEGGINGS)
                .pattern("III")
                .pattern("I I")
                .pattern("I I")
                .input('I', ModItems.TUNGSTEN_INGOT)
                .criterion(hasItem(ModItems.TUNGSTEN_INGOT), conditionsFromItem(ModItems.TUNGSTEN_INGOT))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.TUNGSTEN_BOOTS)
                .pattern("I I")
                .pattern("I I")
                .input('I', ModItems.TUNGSTEN_INGOT)
                .criterion(hasItem(ModItems.TUNGSTEN_INGOT), conditionsFromItem(ModItems.TUNGSTEN_INGOT))
                .offerTo(recipeExporter);
        }
    }

