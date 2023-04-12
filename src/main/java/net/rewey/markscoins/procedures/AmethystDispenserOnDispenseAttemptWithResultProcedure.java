package net.rewey.markscoins.procedures;

import net.rewey.markscoins.init.MarkscoinsModBlocks;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class AmethystDispenserOnDispenseAttemptWithResultProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Direction direction, ItemStack itemstack) {
		if (direction == null)
			return;
		if (!(Direction.UP == direction)) {
			if (world.isEmptyBlock(new BlockPos(x + direction.getStepX(), y + direction.getStepY(), z + direction.getStepZ()))
					&& MarkscoinsModBlocks.COIN_PLANT.get().defaultBlockState().canSurvive(world, new BlockPos(x + direction.getStepX(), y + direction.getStepY(), z + direction.getStepZ()))) {
				(itemstack).shrink(1);
				if (Math.random() <= 0.2 + 0.05 * world.getMaxLocalRawBrightness(new BlockPos(x + direction.getStepX(), direction.getStepY(), z + direction.getStepZ()))) {
					world.setBlock(new BlockPos(x + direction.getStepX(), y + direction.getStepY(), z + direction.getStepZ()), MarkscoinsModBlocks.COIN_PLANT.get().defaultBlockState(), 3);
				}
			}
		}
	}
}
