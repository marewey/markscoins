
package net.rewey.markscoins.item;

import net.rewey.markscoins.init.MarkscoinsModTabs;
import net.rewey.markscoins.init.MarkscoinsModSounds;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class USAAnthemItem extends RecordItem {
	public USAAnthemItem() {
		super(13, MarkscoinsModSounds.REGISTRY.get(new ResourceLocation("markscoins:usa_anthem_song")), new Item.Properties().tab(MarkscoinsModTabs.TAB_COIN_TAB).stacksTo(1).rarity(Rarity.RARE));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
