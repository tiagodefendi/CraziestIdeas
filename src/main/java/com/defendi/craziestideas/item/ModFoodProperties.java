package com.defendi.craziestideas.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties DRAGON_FRUIT = new FoodProperties.Builder()
            .nutrition(5)
            .saturationModifier(1.1f)
            .effect(
                    () -> new MobEffectInstance(MobEffects.SATURATION, 1800),
                    1f
            )
            .build();
}
