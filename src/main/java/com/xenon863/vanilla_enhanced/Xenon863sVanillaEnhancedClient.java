package com.xenon863.vanilla_enhanced;

import com.xenon863.vanilla_enhanced.block.ModBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class Xenon863sVanillaEnhancedClient implements ClientModInitializer{
    @Override
    public void onInitializeClient(){
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.RICE_CROP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GOLDEN_RICE_CROP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CORN_CROP, RenderLayer.getCutout());

       BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.AZALEA_DOOR, RenderLayer.getCutout());
       BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.AZALEA_TRAPDOOR, RenderLayer.getCutout());
    }
}
