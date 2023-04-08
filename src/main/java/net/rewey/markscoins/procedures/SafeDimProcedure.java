package net.rewey.markscoins.procedures;

import net.rewey.markscoins.MarkscoinsMod;

import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.core.BlockPos;

public class SafeDimProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double y_find = 0;
		y_find = world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) entity.getX(), (int) entity.getZ());
		if (y_find < -60) {
			y_find = 323;
			while (!world.getBlockState(new BlockPos(entity.getX(), y_find, entity.getZ())).canOcclude() && !world.getBlockState(new BlockPos(entity.getX(), y_find - 1, entity.getZ())).canOcclude()) {
				y_find = y_find - 1;
				if (y_find < -60) {
					y_find = 130;
					break;
				}
			}
		}
		MarkscoinsMod.LOGGER.debug(("SAFE CORDS= x: " + entity.getX() + " y: " + y_find + " z: " + entity.getZ()));
		{
			Entity _ent = entity;
			_ent.teleportTo((entity.getX()), y_find, (entity.getZ()));
			if (_ent instanceof ServerPlayer _serverPlayer)
				_serverPlayer.connection.teleport((entity.getX()), y_find, (entity.getZ()), _ent.getYRot(), _ent.getXRot());
		}
	}
}
