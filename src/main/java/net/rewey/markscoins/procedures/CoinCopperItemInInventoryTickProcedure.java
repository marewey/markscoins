package net.rewey.markscoins.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.EntityType;
import net.minecraft.util.Mth;
import net.minecraft.tags.BlockTags;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
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
		double found_x = 0;
		double found_z = 0;
		double found_y = 0;
		sx = -3;
		found = false;
		for (int index0 = 0; index0 < (int) (6); index0++) {
			sy = -3;
			for (int index1 = 0; index1 < (int) (6); index1++) {
				sz = -3;
				for (int index2 = 0; index2 < (int) (6); index2++) {
					if ((world.getBlockState(new BlockPos(x + sx, y + sy, z + sz))).is(BlockTags.create(new ResourceLocation("forge:super_conductive_blocks")))) {
						if (Math.random() < 0.5) {
							found = true;
							found_x = x + sx;
							found_y = x + sy;
							found_z = z + sz;
						}
					} else if ((world.getBlockState(new BlockPos(x + sx, y + sy, z + sz))).is(BlockTags.create(new ResourceLocation("forge:conductive_blocks")))) {
						if (Math.random() < 0.33) {
							found = true;
							found_x = x + sx;
							found_y = x + sy;
							found_z = z + sz;
						}
					} else if ((world.getBlockState(new BlockPos(x + sx, y + sy, z + sz))).is(BlockTags.create(new ResourceLocation("forge:semi_conductive_blocks")))) {
						if (Math.random() < Mth.nextDouble(new Random(), 0.0001, 0.0999) + 0.01) {
							found = true;
							found_x = x + sx;
							found_y = x + sy;
							found_z = z + sz;
						}
					}
					sz = sz + 1;
				}
				sy = sy + 1;
			}
			sx = sx + 1;
		}
		if (Mth.nextDouble(new Random(), 1, 4096) < (itemstack).getCount() + Mth.nextDouble(new Random(), 1, 32) && found == true && world.canSeeSkyFromBelowWater(new BlockPos(x, y, z))
				&& (world.getLevelData().isRaining() || world.getLevelData().isThundering())) {
			x_ = found_x + Mth.nextInt(new Random(), -3, 3);
			y_ = found_z + Mth.nextInt(new Random(), -3, 3);
			if (world instanceof ServerLevel _level) {
				LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
				entityToSpawn.moveTo(Vec3.atBottomCenterOf(new BlockPos(x_, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x_, (int) y_), y_)));
				entityToSpawn.setVisualOnly(false);
				_level.addFreshEntity(entityToSpawn);
			}
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.ELECTRIC_SPARK, x, (y - 0.25), z, 40, 0.5, 1, 0.5, 0.1);
		}
	}
}
