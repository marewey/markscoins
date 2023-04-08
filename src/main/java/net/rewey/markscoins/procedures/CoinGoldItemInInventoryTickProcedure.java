package net.rewey.markscoins.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.Mth;

import java.util.Random;

public class CoinGoldItemInInventoryTickProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (Mth.nextInt(new Random(), -26, 0) + (itemstack).getCount() >= 1) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.LUCK, 1, 0, (false), (false)));
		}
		if (Math.random() < 1e-9) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.BAD_OMEN, 500, 0, (false), (false)));
		}
	}
}
