package net.rewey.markscoins.procedures;

import net.rewey.markscoins.init.MarkscoinsModBlocks;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class AmethystDispenserDispenseSuccessfullyIfProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z, Direction direction) {
		if (direction == null)
			return false;
		if (!(Direction.UP == direction)) {
			if (world.isEmptyBlock(new BlockPos(x + direction.getStepX(), y + direction.getStepY(), z + direction.getStepZ()))
					&& MarkscoinsModBlocks.COIN_PLANT.get().defaultBlockState().canSurvive(world, new BlockPos(x + direction.getStepX(), y + direction.getStepY(), z + direction.getStepZ()))) {
				return true;
			}
		}
		return false;
	}
}
