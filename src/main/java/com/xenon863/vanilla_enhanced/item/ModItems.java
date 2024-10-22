package com.xenon863.vanilla_enhanced.item;

import com.xenon863.vanilla_enhanced.Xenon863sVanillaEnhanced;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModItems {

    public static final Item PEAR = registerItem("pear", new Item(new Item.Settings().food(ModFoodComponent.PEAR)));
    public static final Item COPPER_PEAR = registerItem("copper_pear", new Item(new Item.Settings().food(ModFoodComponent.COPPER_PEAR)));

    public static final Item MUD_BALL = registerItem("mud_ball", new Item(new Item.Settings()));
    public static final Item THICK_STICK = registerItem("thick_stick", new Item(new Item.Settings()));

    public static final Item ANDESITE_BRONZE_INGOT = registerItem("andesite_bronze_ingot", new Item(new Item.Settings()));
    public static final Item DIORITE_BRONZE_INGOT = registerItem("diorite_bronze_ingot", new Item(new Item.Settings()));
    public static final Item GRANITE_BRONZE_INGOT = registerItem("granite_bronze_ingot", new Item(new Item.Settings()));
    public static final Item STEEL_INGOT = registerItem("steel_ingot", new Item(new Item.Settings()));

    public static final Item ANDESITE_BRONZE_NUGGET = registerItem("andesite_bronze_nugget", new Item(new Item.Settings()));
    public static final Item DIORITE_BRONZE_NUGGET = registerItem("diorite_bronze_nugget", new Item(new Item.Settings()));
    public static final Item GRANITE_BRONZE_NUGGET = registerItem("granite_bronze_nugget", new Item(new Item.Settings()));
    public static final Item STEEL_NUGGET = registerItem("steel_nugget", new Item(new Item.Settings()));

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

            entries.add(ModItems.ANDESITE_BRONZE_INGOT);
            entries.add(ModItems.DIORITE_BRONZE_INGOT);
            entries.add(ModItems.GRANITE_BRONZE_INGOT);
            entries.add(ModItems.STEEL_INGOT);

            entries.add(ModItems.ANDESITE_BRONZE_NUGGET);
            entries.add(ModItems.DIORITE_BRONZE_NUGGET);
            entries.add(ModItems.GRANITE_BRONZE_NUGGET);
            entries.add(ModItems.STEEL_NUGGET);
        });
    }
}
