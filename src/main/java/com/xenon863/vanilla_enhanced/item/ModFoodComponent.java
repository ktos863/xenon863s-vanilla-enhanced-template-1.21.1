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
    public static final FoodComponent CHERRIES = new FoodComponent.Builder()
            .nutrition(2)
            .saturationModifier(0.3f)
            .build();
    public static final FoodComponent AMETHYST_CHERRIES = new FoodComponent.Builder()
            .nutrition(2)
            .saturationModifier(0.6f)
            .statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 200, 2), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 1200), 1f)
            .alwaysEdible()
            .build();

    public static final FoodComponent RICE = new FoodComponent.Builder()
            .nutrition(1)
            .saturationModifier(0.6f)
            .build();
    public static final FoodComponent BOWL_OF_RICE = new FoodComponent.Builder()
            .nutrition(8)
            .saturationModifier(0.6f)
            .build();
    public static final FoodComponent GOLDEN_RICE = new FoodComponent.Builder()
            .nutrition(2)
            .saturationModifier(0.6f)
            .alwaysEdible()
            .build();
    public static final FoodComponent BOWL_OF_GOLDEN_RICE = new FoodComponent.Builder()
            .nutrition(16)
            .saturationModifier(0.6f)
            .alwaysEdible()
            .build();

    public static final FoodComponent CORN_GRAINS = new FoodComponent.Builder()
            .nutrition(1)
            .saturationModifier(0.6f)
            .build();
    public static final FoodComponent CORN = new FoodComponent.Builder()
            .nutrition(6)
            .saturationModifier(0.6f)
            .build();
}
