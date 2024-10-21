package com.xenon863.vanilla_enhanced.util;

import com.xenon863.vanilla_enhanced.Xenon863sVanillaEnhanced;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {

    public static class Blocks{
        private static TagKey<Block> createTag(String name){
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(Xenon863sVanillaEnhanced.MOD_ID, name));
        }
    }

    public static class Items{
        private static TagKey<Item> createTag(String name){
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(Xenon863sVanillaEnhanced.MOD_ID, name));
        }

        public static final TagKey<Item> AZALEA_LOGS = createTag("azalea_logs");
    }
}
