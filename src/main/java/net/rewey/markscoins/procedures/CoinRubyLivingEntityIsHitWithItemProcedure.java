package net.rewey.markscoins.procedures;

import net.rewey.markscoins.MarkscoinsMod;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;

public class CoinRubyLivingEntityIsHitWithItemProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		double xp_price = 0;
		double xp_amount = 0;
		xp_amount = Math.pow(entity instanceof Player _plr ? _plr.experienceLevel : 0, 2) + 6 * (entity instanceof Player _plr ? _plr.experienceLevel : 0) + 0;
		if (entity.isShiftKeyDown()) {
			xp_price = ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) - 1) / 9 + (itemstack).getCount() / 8;
			if ((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) > 0) {
				if (entity instanceof Player _player)
					_player.giveExperiencePoints((int) xp_price);
				if (entity instanceof LivingEntity _entity)
					_entity.hurt(new DamageSource("xpprice").bypassArmor(), (float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) - 0.25));
				if (entity instanceof Player _player)
					_player.getFoodData().setSaturation(0);
				if (entity instanceof Player _player)
					_player.getFoodData().setFoodLevel((int) ((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) - 14));
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown(itemstack.getItem(), (int) (200 - xp_price * 10));
			}
			MarkscoinsMod.LOGGER.info(xp_price);
		} else {
			xp_price = (((entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) - (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1)) / 4 + 9) - (itemstack).getCount() / 8;
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) != (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1)) {
				if (xp_amount - xp_price >= 0) {
					if (entity instanceof LivingEntity _entity)
						_entity.setHealth(entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1);
					if (entity instanceof Player _player)
						_player.giveExperiencePoints(-((int) xp_price));
					if (entity instanceof Player _player)
						_player.getCooldowns().addCooldown(itemstack.getItem(), (int) (xp_price * 10));
				}
			}
			MarkscoinsMod.LOGGER.info("xp points at next level: " + xp_amount + " - " + xp_price + " = " + (xp_amount - xp_price));
		}
	}
}
