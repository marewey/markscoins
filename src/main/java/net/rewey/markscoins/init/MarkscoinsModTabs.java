
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.rewey.markscoins.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class MarkscoinsModTabs {
	public static CreativeModeTab TAB_COIN_TAB;

	public static void load() {
		TAB_COIN_TAB = new CreativeModeTab("tabcoin_tab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(MarkscoinsModItems.COIN_GOLD.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
