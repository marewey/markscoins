package net.rewey.markscoins.procedures;

import net.rewey.markscoins.init.MarkscoinsModItems;
import net.rewey.markscoins.init.MarkscoinsModBlocks;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

public class CoinScannerMakeItemGlowProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return false;
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		if (MarkscoinsModItems.COIN_SCANNER.get() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()) {
			found = false;
			sx = -8;
			for (int index0 = 0; index0 < (int) (16); index0++) {
				sy = -8;
				for (int index1 = 0; index1 < (int) (16); index1++) {
					sz = -8;
					for (int index2 = 0; index2 < (int) (16); index2++) {
						if ((world.getBlockState(new BlockPos(x + sx, y + sy, z + sz))).getBlock() == MarkscoinsModBlocks.COIN_PLANT.get() || (world.getBlockState(new BlockPos(x + sx, y + sy, z + sz))).getBlock() == MarkscoinsModBlocks.ORE_COIN.get()
								|| (world.getBlockState(new BlockPos(x + sx, y + sy, z + sz))).getBlock() == MarkscoinsModBlocks.ORE_COIN_DEEPSLATE.get()) {
							found = true;
						}
						sz = sz + 1;
					}
					sy = sy + 1;
				}
				sx = sx + 1;
			}
			if (found == true) {
				return true;
			}
		}
		return false;
	}
}
