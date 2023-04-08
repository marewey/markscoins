package net.rewey.markscoins.procedures;

import net.rewey.markscoins.init.MarkscoinsModBlocks;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

public class CoinAmethystRightclickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (entity.isShiftKeyDown() && world.isEmptyBlock(new BlockPos(x, y + 1, z)) && (world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.GRASS_BLOCK) {
			if (Math.random() <= 0.2 + 0.05 * world.getMaxLocalRawBrightness(new BlockPos(x, y, z))) {
				world.setBlock(new BlockPos(x, y + 1, z), MarkscoinsModBlocks.COIN_PLANT.get().defaultBlockState(), 3);
			}
			if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = itemstack;
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
			}
		}
	}
}
