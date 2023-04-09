package net.rewey.markscoins.procedures;

import net.rewey.markscoins.network.MarkscoinsModVariables;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

import java.util.function.Supplier;
import java.util.Map;

public class TransferProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MarkscoinsModVariables.PlayerVariables())).balance >= 0) {
			if (new Object() {
				public int getAmount(int sltid) {
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
						if (stack != null)
							return stack.getCount();
					}
					return 0;
				}
			}.getAmount(1) > 0) {
				{
					double _setval = (entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MarkscoinsModVariables.PlayerVariables())).balance
							- (entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MarkscoinsModVariables.PlayerVariables())).transfer;
					entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.balance = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 0;
					entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.transfer = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (entity instanceof Player _player) {
					ItemStack _setstack = (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY);
					_setstack.setCount((int) (entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MarkscoinsModVariables.PlayerVariables())).display);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					((Slot) _slots.get(1)).set(ItemStack.EMPTY);
					_player.containerMenu.broadcastChanges();
				}
			}
		}
	}
}
