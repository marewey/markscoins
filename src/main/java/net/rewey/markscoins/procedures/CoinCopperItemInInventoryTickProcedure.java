package net.rewey.markscoins.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.EntityType;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import java.util.Random;

public class CoinCopperItemInInventoryTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, ItemStack itemstack) {
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double y_ = 0;
		double sz = 0;
		double x_ = 0;
		sx = -3;
		found = false;
		for (int index0 = 0; index0 < (int) (6); index0++) {
			sy = -3;
			for (int index1 = 0; index1 < (int) (6); index1++) {
				sz = -3;
				for (int index2 = 0; index2 < (int) (6); index2++) {
					if ((world.getBlockState(new BlockPos(x + sx, y + sy, z + sz))).getBlock() == Blocks.LIGHTNING_ROD) {
						found = true;
					}
					sz = sz + 1;
				}
				sy = sy + 1;
			}
			sx = sx + 1;
		}
		if (Math.random() < (itemstack).getCount() * 0.0001 && found == true && world.canSeeSkyFromBelowWater(new BlockPos(x, y, z)) && (world.getLevelData().isRaining() || world.getLevelData().isThundering())) {
			x_ = x + Mth.nextInt(new Random(), -6, 6);
			y_ = z + Mth.nextInt(new Random(), -6, 6);
			if (world instanceof ServerLevel _level) {
				LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
				entityToSpawn.moveTo(Vec3.atBottomCenterOf(new BlockPos(x_, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x_, (int) y_), y_)));
				entityToSpawn.setVisualOnly(false);
				_level.addFreshEntity(entityToSpawn);
			}
		}
	}
}
