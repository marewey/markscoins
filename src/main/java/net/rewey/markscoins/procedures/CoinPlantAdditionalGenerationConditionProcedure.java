package net.rewey.markscoins.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.Mth;
import net.minecraft.core.BlockPos;

import java.util.Random;

public class CoinPlantAdditionalGenerationConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (world.canSeeSkyFromBelowWater(new BlockPos(x, y, z)) && Mth.nextInt(new Random(), 1, 100) <= 15) {
			return true;
		}
		return false;
	}
}
