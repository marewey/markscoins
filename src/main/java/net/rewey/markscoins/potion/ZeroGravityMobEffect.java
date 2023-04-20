
package net.rewey.markscoins.potion;

import net.rewey.markscoins.procedures.ZeroGravityEffectStartedappliedProcedure;
import net.rewey.markscoins.procedures.ZeroGravityEffectExpiresProcedure;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class ZeroGravityMobEffect extends MobEffect {
	public ZeroGravityMobEffect() {
		super(MobEffectCategory.HARMFUL, -3355444);
	}

	@Override
	public String getDescriptionId() {
		return "effect.markscoins.zero_gravity";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		ZeroGravityEffectStartedappliedProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		ZeroGravityEffectExpiresProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
