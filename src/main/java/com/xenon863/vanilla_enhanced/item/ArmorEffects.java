package com.xenon863.vanilla_enhanced.item;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;

public class ArmorEffects {

    private static int numberOfTungstenArmor = 0;
    private static int tickCounter = 0;

    public static void registerArmorEffects(ServerPlayerEntity player){
        onPlayerTick(player);
    }

    private static void onPlayerTick(ServerPlayerEntity player) {
        tickCounter++;
        if(tickCounter >= 80) {
            isWearingTungstenArmor(player);
            if (numberOfTungstenArmor > 0) {
                player.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 21 * numberOfTungstenArmor, 1, true, true, true));
            }
            tickCounter = 0;
        }
    }

    private static void isWearingTungstenArmor(PlayerEntity player) {
        numberOfTungstenArmor = 0;

        ItemStack head = player.getEquippedStack(EquipmentSlot.HEAD);
        if (head.getItem() == ModItems.TUNGSTEN_HELMET) {
            numberOfTungstenArmor++;
        }
        ItemStack chest = player.getEquippedStack(EquipmentSlot.CHEST);
        if (chest.getItem() == ModItems.TUNGSTEN_CHESTPLATE) {
            numberOfTungstenArmor++;
        }
        ItemStack legs = player.getEquippedStack(EquipmentSlot.LEGS);
        if (legs.getItem() == ModItems.TUNGSTEN_LEGGINGS) {
            numberOfTungstenArmor++;
        }
        ItemStack feet = player.getEquippedStack(EquipmentSlot.FEET);
        if (feet.getItem() == ModItems.TUNGSTEN_BOOTS) {
            numberOfTungstenArmor++;
        }
    }

    private static boolean isTungstenArmor(ItemStack itemStack) {
        return itemStack.getItem() == ModItems.TUNGSTEN_HELMET ||
                itemStack.getItem() == ModItems.TUNGSTEN_CHESTPLATE ||
                itemStack.getItem() == ModItems.TUNGSTEN_LEGGINGS ||
                itemStack.getItem() == ModItems.TUNGSTEN_BOOTS;
    }
}
