package net.rewey.markscoins.procedures;

import net.minecraft.world.entity.Entity;

public class ZeroGravityEffectExpiresProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.isNoGravity()) {
			entity.setNoGravity((false));
		}
	}
}
