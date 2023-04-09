
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.rewey.markscoins.init;

import net.rewey.markscoins.MarkscoinsMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

public class MarkscoinsModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, MarkscoinsMod.MODID);
	public static final RegistryObject<ParticleType<?>> BANK = REGISTRY.register("bank", () -> new SimpleParticleType(false));
}
