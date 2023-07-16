
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.rewey.markscoins.init;

import net.rewey.markscoins.block.entity.OreCoinDeepslateBlockEntity;
import net.rewey.markscoins.block.entity.OreCoinBlockEntity;
import net.rewey.markscoins.MarkscoinsMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

public class MarkscoinsModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, MarkscoinsMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> ORE_COIN = register("ore_coin", MarkscoinsModBlocks.ORE_COIN, OreCoinBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ORE_COIN_DEEPSLATE = register("ore_coin_deepslate", MarkscoinsModBlocks.ORE_COIN_DEEPSLATE, OreCoinDeepslateBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
