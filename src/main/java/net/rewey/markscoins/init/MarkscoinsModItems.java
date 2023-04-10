
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.rewey.markscoins.init;

import net.rewey.markscoins.item.UnbakedCoinItem;
import net.rewey.markscoins.item.USAAnthemItem;
import net.rewey.markscoins.item.TommacItem;
import net.rewey.markscoins.item.CoinWoodItem;
import net.rewey.markscoins.item.CoinStoneItem;
import net.rewey.markscoins.item.CoinSapphireItem;
import net.rewey.markscoins.item.CoinRubyItem;
import net.rewey.markscoins.item.CoinPlatinumItem;
import net.rewey.markscoins.item.CoinNetheriteItem;
import net.rewey.markscoins.item.CoinIronItem;
import net.rewey.markscoins.item.CoinGoldItem;
import net.rewey.markscoins.item.CoinFrameItem;
import net.rewey.markscoins.item.CoinEmeraldItem;
import net.rewey.markscoins.item.CoinDiamondItem;
import net.rewey.markscoins.item.CoinCopperItem;
import net.rewey.markscoins.item.CoinAmethystItem;
import net.rewey.markscoins.MarkscoinsMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

public class MarkscoinsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MarkscoinsMod.MODID);
	public static final RegistryObject<Item> COIN_STONE = REGISTRY.register("coin_stone", () -> new CoinStoneItem());
	public static final RegistryObject<Item> COIN_WOOD = REGISTRY.register("coin_wood", () -> new CoinWoodItem());
	public static final RegistryObject<Item> COIN_COPPER = REGISTRY.register("coin_copper", () -> new CoinCopperItem());
	public static final RegistryObject<Item> COIN_IRON = REGISTRY.register("coin_iron", () -> new CoinIronItem());
	public static final RegistryObject<Item> COIN_GOLD = REGISTRY.register("coin_gold", () -> new CoinGoldItem());
	public static final RegistryObject<Item> COIN_PLATINUM = REGISTRY.register("coin_platinum", () -> new CoinPlatinumItem());
	public static final RegistryObject<Item> COIN_AMETHYST = REGISTRY.register("coin_amethyst", () -> new CoinAmethystItem());
	public static final RegistryObject<Item> COIN_SAPPHIRE = REGISTRY.register("coin_sapphire", () -> new CoinSapphireItem());
	public static final RegistryObject<Item> COIN_RUBY = REGISTRY.register("coin_ruby", () -> new CoinRubyItem());
	public static final RegistryObject<Item> COIN_DIAMOND = REGISTRY.register("coin_diamond", () -> new CoinDiamondItem());
	public static final RegistryObject<Item> COIN_EMERALD = REGISTRY.register("coin_emerald", () -> new CoinEmeraldItem());
	public static final RegistryObject<Item> COIN_NETHERITE = REGISTRY.register("coin_netherite", () -> new CoinNetheriteItem());
	public static final RegistryObject<Item> COIN_PLANT = block(MarkscoinsModBlocks.COIN_PLANT, MarkscoinsModTabs.TAB_COIN_TAB);
	public static final RegistryObject<Item> UNBAKED_COIN = REGISTRY.register("unbaked_coin", () -> new UnbakedCoinItem());
	public static final RegistryObject<Item> COIN_FRAME = REGISTRY.register("coin_frame", () -> new CoinFrameItem());
	public static final RegistryObject<Item> ORE_COIN = block(MarkscoinsModBlocks.ORE_COIN, MarkscoinsModTabs.TAB_COIN_TAB);
	public static final RegistryObject<Item> ATM = block(MarkscoinsModBlocks.ATM, MarkscoinsModTabs.TAB_COIN_TAB);
	public static final RegistryObject<Item> TOMMAC = REGISTRY.register("tommac", () -> new TommacItem());
	public static final RegistryObject<Item> ORE_COIN_DEEPSLATE = block(MarkscoinsModBlocks.ORE_COIN_DEEPSLATE, MarkscoinsModTabs.TAB_COIN_TAB);
	public static final RegistryObject<Item> USA_ANTHEM = REGISTRY.register("usa_anthem", () -> new USAAnthemItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
