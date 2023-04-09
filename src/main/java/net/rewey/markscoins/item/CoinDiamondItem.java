
package net.rewey.markscoins.item;

import net.rewey.markscoins.procedures.CoinDiamondItemInHandTickProcedure;
import net.rewey.markscoins.init.MarkscoinsModTabs;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import java.util.List;

public class CoinDiamondItem extends Item {
	public CoinDiamondItem() {
		super(new Item.Properties().tab(MarkscoinsModTabs.TAB_COIN_TAB).stacksTo(64).rarity(Rarity.EPIC));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("262,144 PC"));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		if (selected)
			CoinDiamondItemInHandTickProcedure.execute(entity);
	}
}
