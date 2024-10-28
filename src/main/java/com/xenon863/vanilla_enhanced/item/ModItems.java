package com.xenon863.vanilla_enhanced.item;

import com.xenon863.vanilla_enhanced.Xenon863sVanillaEnhanced;
import com.xenon863.vanilla_enhanced.block.ModBlocks;
import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModItems {

    public static final Item PEAR = registerItem("pear", new Item(new Item.Settings().food(ModFoodComponent.PEAR)));
    public static final Item COPPER_PEAR = registerItem("copper_pear", new Item(new Item.Settings().food(ModFoodComponent.COPPER_PEAR)));
    public static final Item CHERRIES = registerItem("cherries", new Item(new Item.Settings().food(ModFoodComponent.CHERRIES)));
    public static final Item AMETHYST_CHERRIES = registerItem("amethyst_cherries", new Item(new Item.Settings().food(ModFoodComponent.AMETHYST_CHERRIES)));

    public static final Item RICE = registerItem("rice", new AliasedBlockItem(ModBlocks.RICE_CROP, new Item.Settings().food(ModFoodComponent.RICE)));
    public static final Item BOWL_OF_RICE = registerItem("bowl_of_rice", new Item(new Item.Settings().food(ModFoodComponent.BOWL_OF_RICE)));
    public static final Item GOLDEN_RICE = registerItem("golden_rice", new AliasedBlockItem(ModBlocks.GOLDEN_RICE_CROP, new Item.Settings().food(ModFoodComponent.GOLDEN_RICE)));
    public static final Item BOWL_OF_GOLDEN_RICE = registerItem("bowl_of_golden_rice", new Item(new Item.Settings().food(ModFoodComponent.BOWL_OF_GOLDEN_RICE)));
    public static final Item CORN_GRAINS = registerItem("corn_grains", new AliasedBlockItem(ModBlocks.CORN_CROP, new Item.Settings().food(ModFoodComponent.CORN_GRAINS)));
    public static final Item CORN = registerItem("corn", new Item(new Item.Settings().food(ModFoodComponent.CORN)));

    public static final Item MUD_BALL = registerItem("mud_ball", new Item(new Item.Settings()));
    public static final Item THICK_STICK = registerItem("thick_stick", new Item(new Item.Settings()));

    public static final Item RAW_TUNGSTEN = registerItem("raw_tungsten", new Item(new Item.Settings()));
    public static final Item ANDESITE_BRONZE_INGOT = registerItem("andesite_bronze_ingot", new Item(new Item.Settings()));
    public static final Item DIORITE_BRONZE_INGOT = registerItem("diorite_bronze_ingot", new Item(new Item.Settings()));
    public static final Item GRANITE_BRONZE_INGOT = registerItem("granite_bronze_ingot", new Item(new Item.Settings()));
    public static final Item TUNGSTEN_INGOT = registerItem("tungsten_ingot", new Item(new Item.Settings().fireproof()));


    public static final Item ANDESITE_BRONZE_SWORD = registerItem("andesite_bronze_sword", new SwordItem(ModToolMaterials.ANDESITE_BRONZE
            , new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.ANDESITE_BRONZE, 3, -2.4F))));
    public static final Item ANDESITE_BRONZE_PICKAXE = registerItem("andesite_bronze_pickaxe", new PickaxeItem(ModToolMaterials.ANDESITE_BRONZE
            , new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.ANDESITE_BRONZE, 1, -2.8F))));
    public static final Item ANDESITE_BRONZE_AXE = registerItem("andesite_bronze_axe", new AxeItem(ModToolMaterials.ANDESITE_BRONZE
            , new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.ANDESITE_BRONZE, 6, -3.2F))));
    public static final Item ANDESITE_BRONZE_SHOVEL = registerItem("andesite_bronze_shovel", new ShovelItem(ModToolMaterials.ANDESITE_BRONZE
            , new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.ANDESITE_BRONZE, 1.5F, -3F))));
    public static final Item ANDESITE_BRONZE_HOE = registerItem("andesite_bronze_hoe", new HoeItem(ModToolMaterials.ANDESITE_BRONZE
            , new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.ANDESITE_BRONZE, 0, -3F))));

    public static final Item DIORITE_BRONZE_SWORD = registerItem("diorite_bronze_sword", new SwordItem(ModToolMaterials.DIORITE_BRONZE
            , new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.DIORITE_BRONZE, 3, -2.4F))));
    public static final Item DIORITE_BRONZE_PICKAXE = registerItem("diorite_bronze_pickaxe", new PickaxeItem(ModToolMaterials.DIORITE_BRONZE
            , new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.DIORITE_BRONZE, 1, -2.8F))));
    public static final Item DIORITE_BRONZE_AXE = registerItem("diorite_bronze_axe", new AxeItem(ModToolMaterials.DIORITE_BRONZE
            , new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.DIORITE_BRONZE, 6, -3.2F))));
    public static final Item DIORITE_BRONZE_SHOVEL = registerItem("diorite_bronze_shovel", new ShovelItem(ModToolMaterials.DIORITE_BRONZE
            , new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.DIORITE_BRONZE, 1.5F, -3F))));
    public static final Item DIORITE_BRONZE_HOE = registerItem("diorite_bronze_hoe", new HoeItem(ModToolMaterials.DIORITE_BRONZE
            , new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.DIORITE_BRONZE, 0, -3F))));

    public static final Item GRANITE_BRONZE_SWORD = registerItem("granite_bronze_sword", new SwordItem(ModToolMaterials.GRANITE_BRONZE
            , new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.GRANITE_BRONZE, 3, -2.4F))));
    public static final Item GRANITE_BRONZE_PICKAXE = registerItem("granite_bronze_pickaxe", new PickaxeItem(ModToolMaterials.GRANITE_BRONZE
            , new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.GRANITE_BRONZE, 1, -2.8F))));
    public static final Item GRANITE_BRONZE_AXE = registerItem("granite_bronze_axe", new AxeItem(ModToolMaterials.GRANITE_BRONZE
            , new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.GRANITE_BRONZE, 6, -3.2F))));
    public static final Item GRANITE_BRONZE_SHOVEL = registerItem("granite_bronze_shovel", new ShovelItem(ModToolMaterials.GRANITE_BRONZE
            , new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.GRANITE_BRONZE, 1.5F, -3F))));
    public static final Item GRANITE_BRONZE_HOE = registerItem("granite_bronze_hoe", new HoeItem(ModToolMaterials.GRANITE_BRONZE
            , new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.GRANITE_BRONZE, 0, -3F))));

    public static final Item TUNGSTEN_SWORD = registerItem("tungsten_sword", new SwordItem(ModToolMaterials.TUNGSTEN
            , new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.TUNGSTEN, 3, -2.4F))));
    public static final Item TUNGSTEN_PICKAXE = registerItem("tungsten_pickaxe", new PickaxeItem(ModToolMaterials.TUNGSTEN
            , new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.TUNGSTEN, 1, -2.8F))));
    public static final Item TUNGSTEN_AXE = registerItem("tungsten_axe", new AxeItem(ModToolMaterials.TUNGSTEN
            , new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.TUNGSTEN, 6, -3.2F))));
    public static final Item TUNGSTEN_SHOVEL = registerItem("tungsten_shovel", new ShovelItem(ModToolMaterials.TUNGSTEN
            , new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.TUNGSTEN, 1.5F, -3F))));
    public static final Item TUNGSTEN_HOE = registerItem("tungsten_hoe", new HoeItem(ModToolMaterials.TUNGSTEN
            , new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.TUNGSTEN, 0, -3F))));

    public static final Item ANDESITE_BRONZE_HELMET = registerItem("andesite_bronze_helmet", new ArmorItem(ModArmorMaterials.
            ANDESITE_BRONZE_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(15))));
    public static final Item ANDESITE_BRONZE_CHESTPLATE = registerItem("andesite_bronze_chestplate", new ArmorItem(ModArmorMaterials.
            ANDESITE_BRONZE_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(15))));
    public static final Item ANDESITE_BRONZE_LEGGINGS = registerItem("andesite_bronze_leggings", new ArmorItem(ModArmorMaterials.
            ANDESITE_BRONZE_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(15))));
    public static final Item ANDESITE_BRONZE_BOOTS = registerItem("andesite_bronze_boots", new ArmorItem(ModArmorMaterials.
            ANDESITE_BRONZE_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(15))));

    public static final Item DIORITE_BRONZE_HELMET = registerItem("diorite_bronze_helmet", new ArmorItem(ModArmorMaterials.
            DIORITE_BRONZE_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(15))));
    public static final Item DIORITE_BRONZE_CHESTPLATE = registerItem("diorite_bronze_chestplate", new ArmorItem(ModArmorMaterials.
            DIORITE_BRONZE_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(15))));
    public static final Item DIORITE_BRONZE_LEGGINGS = registerItem("diorite_bronze_leggings", new ArmorItem(ModArmorMaterials.
            DIORITE_BRONZE_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(15))));
    public static final Item DIORITE_BRONZE_BOOTS = registerItem("diorite_bronze_boots", new ArmorItem(ModArmorMaterials.
            DIORITE_BRONZE_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(15))));

    public static final Item GRANITE_BRONZE_HELMET = registerItem("granite_bronze_helmet", new ArmorItem(ModArmorMaterials.
            GRANITE_BRONZE_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(15))));
    public static final Item GRANITE_BRONZE_CHESTPLATE = registerItem("granite_bronze_chestplate", new ArmorItem(ModArmorMaterials.
            GRANITE_BRONZE_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(15))));
    public static final Item GRANITE_BRONZE_LEGGINGS = registerItem("granite_bronze_leggings", new ArmorItem(ModArmorMaterials.
            GRANITE_BRONZE_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(15))));
    public static final Item GRANITE_BRONZE_BOOTS = registerItem("granite_bronze_boots", new ArmorItem(ModArmorMaterials.
            GRANITE_BRONZE_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(15))));

    public static final Item TUNGSTEN_HELMET = registerItem("tungsten_helmet", new ArmorItem(ModArmorMaterials.
            TUNGSTEN_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(37))));
    public static final Item TUNGSTEN_CHESTPLATE = registerItem("tungsten_chestplate", new ArmorItem(ModArmorMaterials.
            TUNGSTEN_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(37))));
    public static final Item TUNGSTEN_LEGGINGS = registerItem("tungsten_leggings", new ArmorItem(ModArmorMaterials.
            TUNGSTEN_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(37))));
    public static final Item TUNGSTEN_BOOTS = registerItem("tungsten_boots", new ArmorItem(ModArmorMaterials.
            TUNGSTEN_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(37))));


    public static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(Xenon863sVanillaEnhanced.MOD_ID, name), item);
    }

    public static void registerModItems(){
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries ->{
           entries.add(ModItems.PEAR);
           entries.add(ModItems.COPPER_PEAR);
           entries.add(ModItems.CHERRIES);
           entries.add(ModItems.AMETHYST_CHERRIES);
           entries.add(ModItems.RICE);
           entries.add(ModItems.BOWL_OF_RICE);
           entries.add(ModItems.GOLDEN_RICE);
           entries.add(ModItems.BOWL_OF_GOLDEN_RICE);
           entries.add(ModItems.CORN_GRAINS);
           entries.add(ModItems.CORN);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries ->{
            entries.add(ModItems.MUD_BALL);
            entries.add(ModItems.THICK_STICK);

            entries.add(ModItems.RAW_TUNGSTEN);
            entries.add(ModItems.ANDESITE_BRONZE_INGOT);
            entries.add(ModItems.DIORITE_BRONZE_INGOT);
            entries.add(ModItems.GRANITE_BRONZE_INGOT);
            entries.add(ModItems.TUNGSTEN_INGOT);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries ->{
            entries.add(ModItems.ANDESITE_BRONZE_SWORD);
            entries.add(ModItems.ANDESITE_BRONZE_AXE);
            entries.add(ModItems.DIORITE_BRONZE_SWORD);
            entries.add(ModItems.DIORITE_BRONZE_AXE);
            entries.add(ModItems.GRANITE_BRONZE_SWORD);
            entries.add(ModItems.GRANITE_BRONZE_AXE);
            entries.add(ModItems.TUNGSTEN_SWORD);
            entries.add(ModItems.TUNGSTEN_AXE);

            entries.add(ModItems.ANDESITE_BRONZE_HELMET);
            entries.add(ModItems.ANDESITE_BRONZE_CHESTPLATE);
            entries.add(ModItems.ANDESITE_BRONZE_LEGGINGS);
            entries.add(ModItems.ANDESITE_BRONZE_BOOTS);
            entries.add(ModItems.DIORITE_BRONZE_HELMET);
            entries.add(ModItems.DIORITE_BRONZE_CHESTPLATE);
            entries.add(ModItems.DIORITE_BRONZE_LEGGINGS);
            entries.add(ModItems.DIORITE_BRONZE_BOOTS);
            entries.add(ModItems.GRANITE_BRONZE_HELMET);
            entries.add(ModItems.GRANITE_BRONZE_CHESTPLATE);
            entries.add(ModItems.GRANITE_BRONZE_LEGGINGS);
            entries.add(ModItems.GRANITE_BRONZE_BOOTS);
            entries.add(ModItems.TUNGSTEN_HELMET);
            entries.add(ModItems.TUNGSTEN_CHESTPLATE);
            entries.add(ModItems.TUNGSTEN_LEGGINGS);
            entries.add(ModItems.TUNGSTEN_BOOTS);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries ->{
           entries.add(ModItems.ANDESITE_BRONZE_PICKAXE);
           entries.add(ModItems.ANDESITE_BRONZE_AXE);
           entries.add(ModItems.ANDESITE_BRONZE_SHOVEL);
           entries.add(ModItems.ANDESITE_BRONZE_HOE);
           entries.add(ModItems.DIORITE_BRONZE_PICKAXE);
           entries.add(ModItems.DIORITE_BRONZE_AXE);
           entries.add(ModItems.DIORITE_BRONZE_SHOVEL);
           entries.add(ModItems.DIORITE_BRONZE_HOE);
           entries.add(ModItems.GRANITE_BRONZE_PICKAXE);
           entries.add(ModItems.GRANITE_BRONZE_AXE);
           entries.add(ModItems.GRANITE_BRONZE_SHOVEL);
           entries.add(ModItems.GRANITE_BRONZE_HOE);
           entries.add(ModItems.TUNGSTEN_PICKAXE);
           entries.add(ModItems.TUNGSTEN_AXE);
           entries.add(ModItems.TUNGSTEN_SHOVEL);
           entries.add(ModItems.TUNGSTEN_HOE);
        });
    }
}
