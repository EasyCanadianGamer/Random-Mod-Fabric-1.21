package com.randommod.Item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodItems {

    public static final FoodComponent RANDOM_MEAT_COOKED = new FoodComponent.Builder().alwaysEdible().nutrition(5).saturationModifier(0.50f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 400, 3), 0.7f).build();
    public static final FoodComponent RANDOM_MEAT_RAW = new FoodComponent.Builder().alwaysEdible().nutrition(2).saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 400, 3), 0.5f).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 600,6), 0.8f).build();

    public static final FoodComponent HAPPY_COFFEE = new FoodComponent.Builder().alwaysEdible().nutrition(5).saturationModifier(0.50f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 600, 9), 1.0f).statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_DAMAGE, 400, 9), 0.01f) .build();
}
