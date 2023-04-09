package net.rewey.markscoins.procedures;

import net.rewey.markscoins.network.MarkscoinsModVariables;
import net.rewey.markscoins.init.MarkscoinsModItems;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

import java.util.function.Supplier;
import java.util.Map;

public class BankInProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		new Object() {
			private int ticks = 0;
			private float waitTicks;
			private LevelAccessor world;

			public void start(LevelAccessor world, int waitTicks) {
				this.waitTicks = waitTicks;
				MinecraftForge.EVENT_BUS.register(this);
				this.world = world;
			}

			@SubscribeEvent
			public void tick(TickEvent.ServerTickEvent event) {
				if (event.phase == TickEvent.Phase.END) {
					this.ticks += 1;
					if (this.ticks >= this.waitTicks)
						run();
				}
			}

			private void run() {
				if (MarkscoinsModItems.COIN_WOOD.get() == (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
						.getItem()) {
					{
						double _setval = (entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MarkscoinsModVariables.PlayerVariables())).balance + new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
									ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
									if (stack != null)
										return stack.getCount();
								}
								return 0;
							}
						}.getAmount(0);
						entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.balance = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						((Slot) _slots.get(0)).set(ItemStack.EMPTY);
						_player.containerMenu.broadcastChanges();
					}
				} else if (MarkscoinsModItems.COIN_STONE
						.get() == (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem()) {
					{
						double _setval = (entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MarkscoinsModVariables.PlayerVariables())).balance + new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
									ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
									if (stack != null)
										return stack.getCount();
								}
								return 0;
							}
						}.getAmount(0) * 4;
						entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.balance = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						((Slot) _slots.get(0)).set(ItemStack.EMPTY);
						_player.containerMenu.broadcastChanges();
					}
				} else if (MarkscoinsModItems.COIN_COPPER
						.get() == (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem()) {
					{
						double _setval = (entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MarkscoinsModVariables.PlayerVariables())).balance + new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
									ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
									if (stack != null)
										return stack.getCount();
								}
								return 0;
							}
						}.getAmount(0) * 16;
						entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.balance = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						((Slot) _slots.get(0)).set(ItemStack.EMPTY);
						_player.containerMenu.broadcastChanges();
					}
				} else if (MarkscoinsModItems.COIN_IRON
						.get() == (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem()) {
					{
						double _setval = (entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MarkscoinsModVariables.PlayerVariables())).balance + new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
									ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
									if (stack != null)
										return stack.getCount();
								}
								return 0;
							}
						}.getAmount(0) * 64;
						entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.balance = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						((Slot) _slots.get(0)).set(ItemStack.EMPTY);
						_player.containerMenu.broadcastChanges();
					}
				} else if (MarkscoinsModItems.COIN_GOLD
						.get() == (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem()) {
					{
						double _setval = (entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MarkscoinsModVariables.PlayerVariables())).balance + new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
									ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
									if (stack != null)
										return stack.getCount();
								}
								return 0;
							}
						}.getAmount(0) * 256;
						entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.balance = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						((Slot) _slots.get(0)).set(ItemStack.EMPTY);
						_player.containerMenu.broadcastChanges();
					}
				} else if (MarkscoinsModItems.COIN_PLATINUM
						.get() == (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem()) {
					{
						double _setval = (entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MarkscoinsModVariables.PlayerVariables())).balance + new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
									ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
									if (stack != null)
										return stack.getCount();
								}
								return 0;
							}
						}.getAmount(0) * 1024;
						entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.balance = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						((Slot) _slots.get(0)).set(ItemStack.EMPTY);
						_player.containerMenu.broadcastChanges();
					}
				} else if (MarkscoinsModItems.COIN_AMETHYST
						.get() == (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem()) {
					{
						double _setval = (entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MarkscoinsModVariables.PlayerVariables())).balance + new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
									ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
									if (stack != null)
										return stack.getCount();
								}
								return 0;
							}
						}.getAmount(0) * 4096;
						entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.balance = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						((Slot) _slots.get(0)).set(ItemStack.EMPTY);
						_player.containerMenu.broadcastChanges();
					}
				} else if (MarkscoinsModItems.COIN_SAPPHIRE
						.get() == (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem()) {
					{
						double _setval = (entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MarkscoinsModVariables.PlayerVariables())).balance + new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
									ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
									if (stack != null)
										return stack.getCount();
								}
								return 0;
							}
						}.getAmount(0) * 16384;
						entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.balance = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						((Slot) _slots.get(0)).set(ItemStack.EMPTY);
						_player.containerMenu.broadcastChanges();
					}
				} else if (MarkscoinsModItems.COIN_RUBY
						.get() == (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem()) {
					{
						double _setval = (entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MarkscoinsModVariables.PlayerVariables())).balance + new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
									ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
									if (stack != null)
										return stack.getCount();
								}
								return 0;
							}
						}.getAmount(0) * 65536;
						entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.balance = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						((Slot) _slots.get(0)).set(ItemStack.EMPTY);
						_player.containerMenu.broadcastChanges();
					}
				} else if (MarkscoinsModItems.COIN_DIAMOND
						.get() == (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem()) {
					{
						double _setval = (entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MarkscoinsModVariables.PlayerVariables())).balance + new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
									ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
									if (stack != null)
										return stack.getCount();
								}
								return 0;
							}
						}.getAmount(0) * 262144;
						entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.balance = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						((Slot) _slots.get(0)).set(ItemStack.EMPTY);
						_player.containerMenu.broadcastChanges();
					}
				} else if (MarkscoinsModItems.COIN_EMERALD
						.get() == (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem()) {
					{
						double _setval = (entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MarkscoinsModVariables.PlayerVariables())).balance + new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
									ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
									if (stack != null)
										return stack.getCount();
								}
								return 0;
							}
						}.getAmount(0) * 1048576;
						entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.balance = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						((Slot) _slots.get(0)).set(ItemStack.EMPTY);
						_player.containerMenu.broadcastChanges();
					}
				} else if (MarkscoinsModItems.COIN_NETHERITE
						.get() == (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem()) {
					{
						double _setval = (entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MarkscoinsModVariables.PlayerVariables())).balance + new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
									ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
									if (stack != null)
										return stack.getCount();
								}
								return 0;
							}
						}.getAmount(0) * 4194304;
						entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.balance = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						((Slot) _slots.get(0)).set(ItemStack.EMPTY);
						_player.containerMenu.broadcastChanges();
					}
				}
				MinecraftForge.EVENT_BUS.unregister(this);
			}
		}.start(world, 1);
	}
}
