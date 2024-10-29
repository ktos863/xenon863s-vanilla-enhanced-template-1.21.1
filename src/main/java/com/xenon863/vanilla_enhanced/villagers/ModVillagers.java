package com.xenon863.vanilla_enhanced.villagers;

import com.google.common.collect.ImmutableSet;
import com.xenon863.vanilla_enhanced.Xenon863sVanillaEnhanced;
import com.xenon863.vanilla_enhanced.block.ModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.world.poi.PointOfInterestHelper;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.village.VillagerProfession;
import net.minecraft.world.poi.PointOfInterest;
import net.minecraft.world.poi.PointOfInterestType;

public class ModVillagers {

    public static final RegistryKey<PointOfInterestType> FORESTER_POI_KEY = poiKey("forester_poi");
    public static final PointOfInterestType FORESTER_POI = registerPoi("forester_poi", ModBlocks.FORESTERS_TABLE);

    public static final VillagerProfession FORESTER = registerProfession("forester", FORESTER_POI_KEY);

    private static VillagerProfession registerProfession(String name, RegistryKey<PointOfInterestType> type){
        return Registry.register(Registries.VILLAGER_PROFESSION, Identifier.of(Xenon863sVanillaEnhanced.MOD_ID, name), new VillagerProfession(name, entry ->
                entry.matchesKey(type), entry -> entry.matchesKey(type), ImmutableSet.of(), ImmutableSet.of(), SoundEvents.BLOCK_BEEHIVE_WORK));
    }

    private static PointOfInterestType registerPoi(String name, Block block){
        return PointOfInterestHelper.register(Identifier.of(Xenon863sVanillaEnhanced.MOD_ID, name), 1, 1, block);
    }

    private static RegistryKey<PointOfInterestType> poiKey (String name){
        return RegistryKey.of(RegistryKeys.POINT_OF_INTEREST_TYPE, Identifier.of(Xenon863sVanillaEnhanced.MOD_ID, name));
    }

    public static void registerVillagers(){
        Registry.register(Registries.VILLAGER_PROFESSION, Identifier.of(Xenon863sVanillaEnhanced.MOD_ID, "forester"), FORESTER);
        Registry.register(Registries.POINT_OF_INTEREST_TYPE, Identifier.of(Xenon863sVanillaEnhanced.MOD_ID, "forester_poi"), FORESTER_POI);
    }
}

