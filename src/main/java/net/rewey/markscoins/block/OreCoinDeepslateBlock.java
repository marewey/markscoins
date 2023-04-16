
package net.rewey.markscoins.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class OreCoinDeepslateBlock extends Block {
	public OreCoinDeepslateBlock() {
		super(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.AMETHYST).strength(1f, 10f).lightLevel(s -> 1));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}
