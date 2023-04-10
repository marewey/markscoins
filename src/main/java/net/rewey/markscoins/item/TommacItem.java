
package net.rewey.markscoins.item;

import net.rewey.markscoins.init.MarkscoinsModTabs;
import net.rewey.markscoins.init.MarkscoinsModSounds;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class TommacItem extends RecordItem {
	public TommacItem() {
		super(9, MarkscoinsModSounds.REGISTRY.get(new ResourceLocation("markscoins:hog-ghost")), new Item.Properties().tab(MarkscoinsModTabs.TAB_COIN_TAB).stacksTo(1).rarity(Rarity.RARE));
	}
}
