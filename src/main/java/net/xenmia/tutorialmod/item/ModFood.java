package net.xenmia.tutorialmod.item;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFood {
    public static final FoodProperties STRAWBERRY = new FoodProperties.Builder().alwaysEat().fast().nutrition(5)
            .saturationMod(500).effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200), 0.2f).build();
}
