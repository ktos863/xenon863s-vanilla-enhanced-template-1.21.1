package com.xenon863.vanilla_enhanced.item;

import com.xenon863.vanilla_enhanced.Xenon863sVanillaEnhanced;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ArmorMaterials;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class ModArmorMaterials {

    public static final RegistryEntry<ArmorMaterial> ANDESITE_BRONZE_ARMOR_MATERIAL = registerArmorMaterial("andesite_bronze",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map ->{
                map.put(ArmorItem.Type.BOOTS, 1);
                map.put(ArmorItem.Type.LEGGINGS, 4);
                map.put(ArmorItem.Type.CHESTPLATE, 5);
                map.put(ArmorItem.Type.HELMET, 2);
                map.put(ArmorItem.Type.BODY, 4);
            }), 25, SoundEvents.ITEM_ARMOR_EQUIP_IRON, () -> Ingredient.ofItems(ModItems.ANDESITE_BRONZE_INGOT),
                    List.of(new ArmorMaterial.Layer(Identifier.of(Xenon863sVanillaEnhanced.MOD_ID, "andesite_bronze"))), 0, 0));
    public static final RegistryEntry<ArmorMaterial> DIORITE_BRONZE_ARMOR_MATERIAL = registerArmorMaterial("diorite_bronze",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map ->{
                map.put(ArmorItem.Type.BOOTS, 1);
                map.put(ArmorItem.Type.LEGGINGS, 4);
                map.put(ArmorItem.Type.CHESTPLATE, 5);
                map.put(ArmorItem.Type.HELMET, 2);
                map.put(ArmorItem.Type.BODY, 4);
            }), 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, () -> Ingredient.ofItems(ModItems.DIORITE_BRONZE_INGOT),
                    List.of(new ArmorMaterial.Layer(Identifier.of(Xenon863sVanillaEnhanced.MOD_ID, "diorite_bronze"))), 0, 0));
    public static final RegistryEntry<ArmorMaterial> GRANITE_BRONZE_ARMOR_MATERIAL = registerArmorMaterial("granite_bronze",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map ->{
                map.put(ArmorItem.Type.BOOTS, 2);
                map.put(ArmorItem.Type.LEGGINGS, 5);
                map.put(ArmorItem.Type.CHESTPLATE, 6);
                map.put(ArmorItem.Type.HELMET, 2);
                map.put(ArmorItem.Type.BODY, 5);
            }), 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, () -> Ingredient.ofItems(ModItems.GRANITE_BRONZE_INGOT),
                    List.of(new ArmorMaterial.Layer(Identifier.of(Xenon863sVanillaEnhanced.MOD_ID, "granite_bronze"))), 0, 0));
    public static final RegistryEntry<ArmorMaterial> TUNGSTEN_ARMOR_MATERIAL = registerArmorMaterial("tungsten",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map ->{
                map.put(ArmorItem.Type.BOOTS, 3);
                map.put(ArmorItem.Type.LEGGINGS, 6);
                map.put(ArmorItem.Type.CHESTPLATE, 8);
                map.put(ArmorItem.Type.HELMET, 3);
                map.put(ArmorItem.Type.BODY, 11);
            }), 5, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, () -> Ingredient.ofItems(ModItems.TUNGSTEN_INGOT),
                    List.of(new ArmorMaterial.Layer(Identifier.of(Xenon863sVanillaEnhanced.MOD_ID, "tungsten"))), 3, 0.1f));

    public static RegistryEntry.Reference<ArmorMaterial> registerArmorMaterial(String name, Supplier<ArmorMaterial> material){
        return Registry.registerReference(Registries.ARMOR_MATERIAL, Identifier.of(Xenon863sVanillaEnhanced.MOD_ID, name), material.get());
    }
}
