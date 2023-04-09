
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.rewey.markscoins.init;

import net.rewey.markscoins.block.OreCoinDeepslateBlock;
import net.rewey.markscoins.block.OreCoinBlock;
import net.rewey.markscoins.block.CoinPlantBlock;
import net.rewey.markscoins.block.ATMBlock;
import net.rewey.markscoins.MarkscoinsMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

public class MarkscoinsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MarkscoinsMod.MODID);
	public static final RegistryObject<Block> COIN_PLANT = REGISTRY.register("coin_plant", () -> new CoinPlantBlock());
	public static final RegistryObject<Block> ORE_COIN = REGISTRY.register("ore_coin", () -> new OreCoinBlock());
	public static final RegistryObject<Block> ATM = REGISTRY.register("atm", () -> new ATMBlock());
	public static final RegistryObject<Block> ORE_COIN_DEEPSLATE = REGISTRY.register("ore_coin_deepslate", () -> new OreCoinDeepslateBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			CoinPlantBlock.registerRenderLayer();
		}
	}
}
