package com.xenon863.vanilla_enhanced.mixin;

import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterials;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;

@Mixin(ToolMaterials.class)
public class ToolMaterialsMixin {
/*
    @Shadow @Final @Mutable
    private int itemDurability;
    @Shadow @Final @Mutable
    private float miningSpeed;
    @Shadow @Final @Mutable
    private float attackDamage;
    @Shadow @Final @Mutable
    private int enchantability;

    @Inject(method = "<init>", at = @At("RETURN"))
    private void changeToolStats(){
        Item item = (Item) (Object) this;

        if(item == Items.WOODEN_SWORD || item == Items.WOODEN_PICKAXE || item == Items.WOODEN_AXE || item == Items.WOODEN_SHOVEL || item == Items.WOODEN_HOE){
            this.itemDurability = 128;
            this.miningSpeed = 1.8f;
            this.enchantability = 10;
        }
        else if(item == Items.STONE_SWORD || item == Items.STONE_PICKAXE || item == Items.STONE_AXE || item == Items.STONE_SHOVEL || item == Items.STONE_HOE){
            this.itemDurability = 256;
            this.miningSpeed = 3.6f;
            this.enchantability = 10;
        }
        else if(item == Items.IRON_SWORD || item == Items.IRON_PICKAXE || item == Items.IRON_AXE || item == Items.IRON_SHOVEL || item == Items.IRON_HOE){
            this.itemDurability = 512;
            this.miningSpeed = 5.4f;
            this.enchantability = 10;
        }
        else if(item == Items.DIAMOND_SWORD || item == Items.DIAMOND_PICKAXE || item == Items.DIAMOND_AXE || item == Items.DIAMOND_SHOVEL || item == Items.DIAMOND_HOE){
            this.itemDurability = 1024;
            this.miningSpeed = 7.2f;
        }
        else if(item == Items.NETHERITE_SWORD || item == Items.NETHERITE_PICKAXE || item == Items.NETHERITE_AXE || item == Items.NETHERITE_SHOVEL || item == Items.NETHERITE_HOE){
            this.itemDurability = 2048;
            this.miningSpeed = 9f;
            this.enchantability = 10;
        }
        else if(item == Items.GOLDEN_SWORD || item == Items.GOLDEN_PICKAXE || item == Items.GOLDEN_AXE || item == Items.GOLDEN_SHOVEL || item == Items.GOLDEN_HOE){
            this.itemDurability = 64;
            this.miningSpeed = 9f;
            this.attackDamage = 4f;
        }
    }

 */
}
