package com.xenon863.vanilla_enhanced.item;

import com.xenon863.vanilla_enhanced.Xenon863sVanillaEnhanced;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModItems {

    public static final Item PEAR = registerItem("pear", new Item(new Item.Settings().food(ModFoodComponent.PEAR)));
    public static final Item COPPER_PEAR = registerItem("copper_pear", new Item(new Item.Settings().food(ModFoodComponent.COPPER_PEAR)));

    public static final Item MUD_BALL = registerItem("mud_ball", new Item(new Item.Settings()));
    public static final Item THICK_STICK = registerItem("thick_stick", new Item(new Item.Settings()));

    public static final Item TITANIUM_INGOT = registerItem("titanium_ingot", new Item(new Item.Settings()));

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


    public static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(Xenon863sVanillaEnhanced.MOD_ID, name), item);
    }

    public static void registerModItems(){
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries ->{
           entries.add(ModItems.PEAR);
           entries.add(ModItems.COPPER_PEAR);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries ->{
            entries.add(ModItems.MUD_BALL);
            entries.add(ModItems.THICK_STICK);

            entries.add(ModItems.TITANIUM_INGOT);

            entries.add(ModItems.ANDESITE_BRONZE_INGOT);
            entries.add(ModItems.DIORITE_BRONZE_INGOT);
            entries.add(ModItems.GRANITE_BRONZE_INGOT);
            entries.add(ModItems.TUNGSTEN_INGOT);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries ->{
           entries.add(ModItems.ANDESITE_BRONZE_SWORD);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries ->{
           entries.add(ModItems.ANDESITE_BRONZE_PICKAXE);
           entries.add(ModItems.ANDESITE_BRONZE_AXE);
           entries.add(ModItems.ANDESITE_BRONZE_SHOVEL);
           entries.add(ModItems.ANDESITE_BRONZE_HOE);
        });
    }
}
