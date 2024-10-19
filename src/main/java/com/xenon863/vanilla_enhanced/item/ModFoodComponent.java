package com.xenon863.vanilla_enhanced.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponent {
    public static final FoodComponent PEAR = new FoodComponent.Builder()
            .nutrition(4)
            .saturationModifier(0.3f)
            .build();
    public static final FoodComponent COPPER_PEAR = new FoodComponent.Builder()
            .nutrition(4)
            .saturationModifier(0.6f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 1200), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 400), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 400), 1f)
            .alwaysEdible()
            .build();
}
