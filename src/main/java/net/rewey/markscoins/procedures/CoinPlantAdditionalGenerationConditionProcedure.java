package net.rewey.markscoins.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import java.util.Random;

public class CoinPlantAdditionalGenerationConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (world.canSeeSkyFromBelowWater(new BlockPos(x, y, z)) && Mth.nextInt(new Random(), 1,
				100) <= (new ResourceLocation("flower_forest").equals(world.getBiome(new BlockPos(x, y, z)).value().getRegistryName()) || new ResourceLocation("plains").equals(world.getBiome(new BlockPos(x, y, z)).value().getRegistryName())
						|| new ResourceLocation("sunflower_plains").equals(world.getBiome(new BlockPos(x, y, z)).value().getRegistryName()) ? 45 : 15)) {
			return true;
		}
		return false;
	}
}
