package net.rewey.markscoins.procedures;

import net.rewey.markscoins.init.MarkscoinsModBlocks;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.BlockItem;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import java.util.Random;
import java.util.Map;

public class OreCoinUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		ItemStack block = ItemStack.EMPTY;
		ItemStack block_set = ItemStack.EMPTY;
		double random_ = 0;
		double x_ = 0;
		double y_ = 0;
		double z_ = 0;
		Direction direction_ = Direction.NORTH;
		if (Math.random() < 0.05 && (new Object() {
			public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getTileData().getBoolean(tag);
				return false;
			}
		}.getValue(world, new BlockPos(x, y, z), "stunted")) == false) {
			random_ = Math.random();
			if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == MarkscoinsModBlocks.ORE_COIN.get()) {
				block = new ItemStack(Blocks.STONE);
				block_set = new ItemStack(MarkscoinsModBlocks.ORE_COIN.get());
				random_ = Math.random() - 0.01;
			} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == MarkscoinsModBlocks.ORE_COIN_DEEPSLATE.get()) {
				block = new ItemStack(Blocks.DEEPSLATE);
				block_set = new ItemStack(MarkscoinsModBlocks.ORE_COIN_DEEPSLATE.get());
				random_ = Math.random();
			}
			x_ = x;
			y_ = y;
			z_ = z;
			direction_ = Direction.getRandom(new Random());
			if (direction_ == Direction.DOWN) {
				y_ = y - 1;
			} else if (direction_ == Direction.UP) {
				y_ = y + 1;
			} else if (direction_ == Direction.NORTH) {
				z_ = z - 1;
			} else if (direction_ == Direction.SOUTH) {
				z_ = z + 1;
			} else if (direction_ == Direction.WEST) {
				x_ = x - 1;
			} else if (direction_ == Direction.EAST) {
				x_ = x + 1;
			}
			if ((world.getBlockState(new BlockPos(x_, y_, z_))).getBlock() == (block.getItem() instanceof BlockItem _bi ? _bi.getBlock().defaultBlockState() : Blocks.AIR.defaultBlockState()).getBlock()) {
				{
					BlockPos _bp = new BlockPos(x_, y_, z_);
					BlockState _bs = (block_set.getItem() instanceof BlockItem _bi ? _bi.getBlock().defaultBlockState() : Blocks.AIR.defaultBlockState());
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					BlockEntity _be = world.getBlockEntity(_bp);
					CompoundTag _bnbt = null;
					if (_be != null) {
						_bnbt = _be.saveWithFullMetadata();
						_be.setRemoved();
					}
					world.setBlock(_bp, _bs, 3);
					if (_bnbt != null) {
						_be = world.getBlockEntity(_bp);
						if (_be != null) {
							try {
								_be.load(_bnbt);
							} catch (Exception ignored) {
							}
						}
					}
				}
				if (random_ < 0.05) {
					if (!world.isClientSide()) {
						BlockPos _bp = new BlockPos(x_, y_, z_);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getTileData().putBoolean("stunted", (false));
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				} else {
					if (!world.isClientSide()) {
						BlockPos _bp = new BlockPos(x_, y_, z_);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getTileData().putBoolean("stunted", (true));
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				}
			}
		}
	}
}
