package net.rewey.markscoins.procedures;

import net.rewey.markscoins.init.MarkscoinsModItems;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

public class CoinDiamondItemInHandTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (MarkscoinsModItems.COIN_DIAMOND.get() == (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem()) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1, 0, (false), (false)));
		}
	}
}
