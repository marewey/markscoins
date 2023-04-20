
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.rewey.markscoins.init;

import net.rewey.markscoins.potion.ZeroGravityMobEffect;
import net.rewey.markscoins.potion.GroundedMobEffect;
import net.rewey.markscoins.MarkscoinsMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

public class MarkscoinsModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, MarkscoinsMod.MODID);
	public static final RegistryObject<MobEffect> ZERO_GRAVITY = REGISTRY.register("zero_gravity", () -> new ZeroGravityMobEffect());
	public static final RegistryObject<MobEffect> GROUNDED = REGISTRY.register("grounded", () -> new GroundedMobEffect());
}
