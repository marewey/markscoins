
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.rewey.markscoins.init;

import net.rewey.markscoins.MarkscoinsMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffectInstance;

public class MarkscoinsModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, MarkscoinsMod.MODID);
	public static final RegistryObject<Potion> ZERO_GRAVITY_POTION = REGISTRY.register("zero_gravity_potion", () -> new Potion(new MobEffectInstance(MarkscoinsModMobEffects.ZERO_GRAVITY.get(), 3600, 0, true, true)));
}
