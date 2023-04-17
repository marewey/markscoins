
/*
*    MCreator note: This file will be REGENERATED on each build.
*/
package net.rewey.markscoins.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.WandererTradesEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.npc.VillagerProfession;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class MarkscoinsModTrades {
	@SubscribeEvent
	public static void registerWanderingTrades(WandererTradesEvent event) {
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(MarkscoinsModItems.COIN_WOOD.get(), 2),

				new ItemStack(Blocks.COARSE_DIRT), 10, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(MarkscoinsModItems.COIN_STONE.get()),

				new ItemStack(Blocks.GRAVEL), 10, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Blocks.DIRT),

				new ItemStack(MarkscoinsModItems.COIN_WOOD.get()), 10, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Blocks.COBBLESTONE),

				new ItemStack(MarkscoinsModItems.COIN_STONE.get()), 10, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(MarkscoinsModItems.COIN_PLATINUM.get()),

				new ItemStack(MarkscoinsModBlocks.ATM.get()), 10, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Blocks.OAK_LOG, 4),

				new ItemStack(MarkscoinsModItems.COIN_WOOD.get(), 3), 10, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.GUNPOWDER, 2),

				new ItemStack(MarkscoinsModItems.COIN_GOLD.get()), 10, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(MarkscoinsModItems.COIN_GOLD.get(), 2),

				new ItemStack(Items.GUNPOWDER), 10, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Blocks.LANTERN),

				new ItemStack(MarkscoinsModItems.COIN_COPPER.get(), 2), 10, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(MarkscoinsModItems.COIN_COPPER.get()),

				new ItemStack(Blocks.LANTERN), 10, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(MarkscoinsModItems.COIN_SAPPHIRE.get(), 5), new ItemStack(MarkscoinsModItems.COIN_GOLD.get()), new ItemStack(MarkscoinsModItems.USA_ANTHEM.get()), 2, 20, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.MUSIC_DISC_MELLOHI),

				new ItemStack(MarkscoinsModItems.COIN_PLATINUM.get(), 6), 2, 10, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.HEART_OF_THE_SEA),

				new ItemStack(MarkscoinsModItems.COIN_GOLD.get(), 6), 3, 15, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(MarkscoinsModItems.COIN_AMETHYST.get(), 5), new ItemStack(MarkscoinsModItems.COIN_PLATINUM.get(), 2), new ItemStack(MarkscoinsModItems.TOMMAC.get()), 2, 25, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(MarkscoinsModItems.COIN_EMERALD.get(), 2),

				new ItemStack(Items.NETHER_STAR), 10, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.NETHER_STAR),

				new ItemStack(MarkscoinsModItems.COIN_SAPPHIRE.get(), 3), 10, 5, 0.05f));
	}

	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == VillagerProfession.BUTCHER) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.COOKED_BEEF, 2),

					new ItemStack(MarkscoinsModItems.COIN_COPPER.get(), 3), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(MarkscoinsModItems.COIN_IRON.get()),

					new ItemStack(Items.COOKED_BEEF, 2), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.COOKED_PORKCHOP, 2),

					new ItemStack(MarkscoinsModItems.COIN_COPPER.get(), 2), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(MarkscoinsModItems.COIN_IRON.get()),

					new ItemStack(Items.COOKED_PORKCHOP), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.COOKED_MUTTON),

					new ItemStack(MarkscoinsModItems.COIN_COPPER.get(), 2), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(MarkscoinsModItems.COIN_COPPER.get(), 3),

					new ItemStack(Items.COOKED_MUTTON), 10, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(MarkscoinsModItems.COIN_IRON.get(), 2),

					new ItemStack(Items.IRON_AXE), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.COOKED_CHICKEN, 2),

					new ItemStack(MarkscoinsModItems.COIN_COPPER.get(), 2), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(MarkscoinsModItems.COIN_COPPER.get(), 3),

					new ItemStack(Items.COOKED_CHICKEN, 2), 10, 5, 0.05f));
		}
		if (event.getType() == VillagerProfession.LIBRARIAN) {
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(MarkscoinsModItems.COIN_GOLD.get(), 2),

					new ItemStack(Blocks.BOOKSHELF, 4), 10, 5, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Blocks.BOOKSHELF, 4),

					new ItemStack(MarkscoinsModItems.COIN_GOLD.get()), 10, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.BOOK, 2),

					new ItemStack(MarkscoinsModItems.COIN_COPPER.get()), 10, 3, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.PAPER, 4),

					new ItemStack(MarkscoinsModItems.COIN_STONE.get()), 10, 2, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(MarkscoinsModItems.COIN_STONE.get(), 2),

					new ItemStack(Items.PAPER, 4), 10, 2, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(MarkscoinsModItems.COIN_IRON.get()),

					new ItemStack(Items.BOOK, 2), 10, 3, 0.05f));
		}
		if (event.getType() == VillagerProfession.CLERIC) {
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(MarkscoinsModItems.COIN_AMETHYST.get(), 3), new ItemStack(MarkscoinsModItems.COIN_PLATINUM.get(), 2), new ItemStack(Items.BLAZE_POWDER, 2), 4, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.ROTTEN_FLESH, 4),

					new ItemStack(MarkscoinsModItems.COIN_COPPER.get()), 9, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.REDSTONE, 16),

					new ItemStack(MarkscoinsModItems.COIN_COPPER.get(), 2), 8, 5, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(MarkscoinsModItems.COIN_SAPPHIRE.get()),

					new ItemStack(Blocks.BREWING_STAND), 3, 5, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(MarkscoinsModItems.COIN_GOLD.get(), 3),

					new ItemStack(Items.EXPERIENCE_BOTTLE), 10, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 4),

					new ItemStack(MarkscoinsModItems.COIN_GOLD.get()), 7, 20, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(MarkscoinsModItems.COIN_RUBY.get()),

					new ItemStack(Items.EMERALD), 10, 15, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.GOLD_INGOT, 16),

					new ItemStack(MarkscoinsModItems.COIN_GOLD.get()), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(MarkscoinsModItems.COIN_SAPPHIRE.get()),

					new ItemStack(Items.GOLD_INGOT), 10, 5, 0.05f));
		}
		if (event.getType() == VillagerProfession.ARMORER) {
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(MarkscoinsModItems.COIN_DIAMOND.get(), 2),

					new ItemStack(Items.NETHERITE_CHESTPLATE), 10, 20, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(MarkscoinsModItems.COIN_DIAMOND.get()), new ItemStack(MarkscoinsModItems.COIN_RUBY.get(), 3), new ItemStack(Items.NETHERITE_LEGGINGS), 10, 20, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(MarkscoinsModItems.COIN_DIAMOND.get()), new ItemStack(MarkscoinsModItems.COIN_RUBY.get(), 2), new ItemStack(Items.NETHERITE_HELMET), 10, 20, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(MarkscoinsModItems.COIN_DIAMOND.get()), new ItemStack(MarkscoinsModItems.COIN_RUBY.get()), new ItemStack(Items.NETHERITE_BOOTS), 10, 20, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(MarkscoinsModItems.COIN_DIAMOND.get()),

					new ItemStack(Items.NETHERITE_INGOT), 10, 25, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.NETHERITE_INGOT),

					new ItemStack(MarkscoinsModItems.COIN_SAPPHIRE.get(), 3), 10, 20, 0.05f));
		}
		if (event.getType() == VillagerProfession.TOOLSMITH) {
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.DIAMOND, 4),

					new ItemStack(MarkscoinsModItems.COIN_PLATINUM.get()), 5, 20, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(MarkscoinsModItems.COIN_RUBY.get()),

					new ItemStack(Items.DIAMOND), 10, 20, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.IRON_INGOT, 16),

					new ItemStack(MarkscoinsModItems.COIN_IRON.get()), 5, 15, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(MarkscoinsModItems.COIN_AMETHYST.get()),

					new ItemStack(Items.IRON_INGOT), 10, 15, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.COPPER_INGOT, 8),

					new ItemStack(MarkscoinsModItems.COIN_COPPER.get()), 5, 10, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(MarkscoinsModItems.COIN_GOLD.get()),

					new ItemStack(Items.COPPER_INGOT, 8), 10, 10, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.COAL),

					new ItemStack(MarkscoinsModItems.COIN_WOOD.get(), 2), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(MarkscoinsModItems.COIN_COPPER.get()),

					new ItemStack(Items.COAL), 10, 5, 0.05f));
		}
	}
}
