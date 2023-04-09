
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
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(MarkscoinsModItems.COIN_SAPPHIRE.get(), 5), new ItemStack(MarkscoinsModItems.COIN_GOLD.get()), new ItemStack(MarkscoinsModItems.TOMMAC.get()), 2, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.MUSIC_DISC_MELLOHI),

				new ItemStack(MarkscoinsModItems.COIN_PLATINUM.get(), 6), 2, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.HEART_OF_THE_SEA),

				new ItemStack(MarkscoinsModItems.COIN_GOLD.get(), 6), 3, 5, 0.05f));
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
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(MarkscoinsModItems.COIN_IRON.get(), 2),

					new ItemStack(Items.IRON_AXE), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.COOKED_CHICKEN, 2),

					new ItemStack(MarkscoinsModItems.COIN_COPPER.get(), 2), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(MarkscoinsModItems.COIN_COPPER.get(), 3),

					new ItemStack(Items.COOKED_CHICKEN, 2), 10, 5, 0.05f));
		}
		if (event.getType() == VillagerProfession.LIBRARIAN) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(MarkscoinsModItems.COIN_IRON.get()),

					new ItemStack(Items.ENCHANTED_BOOK), 10, 5, 0.05f));
		}
	}
}
