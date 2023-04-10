package net.rewey.markscoins.procedures;

import org.checkerframework.checker.units.qual.s;

import net.rewey.markscoins.network.MarkscoinsModVariables;
import net.rewey.markscoins.init.MarkscoinsModParticleTypes;
import net.rewey.markscoins.init.MarkscoinsModItems;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import java.util.function.Supplier;
import java.util.Map;

public class BankInProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
					if (stack != null)
						return stack.getCount();
				}
				return 0;
			}
		}.getAmount(0) > 0) {
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
			} else if (MarkscoinsModItems.COIN_STONE.get() == (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
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
					}.getAmount(0) * 4;
					entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.balance = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (MarkscoinsModItems.COIN_COPPER.get() == (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
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
					}.getAmount(0) * 16;
					entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.balance = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (MarkscoinsModItems.COIN_IRON.get() == (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
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
					}.getAmount(0) * 64;
					entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.balance = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (MarkscoinsModItems.COIN_GOLD.get() == (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
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
					}.getAmount(0) * 256;
					entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.balance = _setval;
						capability.syncPlayerVariables(entity);
					});
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
			} else if (MarkscoinsModItems.COIN_RUBY.get() == (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
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
					}.getAmount(0) * 65536;
					entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.balance = _setval;
						capability.syncPlayerVariables(entity);
					});
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
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				((Slot) _slots.get(0)).remove(new Object() {
					public int getAmount(int sltid) {
						if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
							ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
							if (stack != null)
								return stack.getCount();
						}
						return 0;
					}
				}.getAmount(0));
				_player.containerMenu.broadcastChanges();
			}
		}
		if (0 < (entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MarkscoinsModVariables.PlayerVariables())).balance) {
			if ((entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MarkscoinsModVariables.PlayerVariables())).balance < 4) {
				{
					double _setval = Math.floor((entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MarkscoinsModVariables.PlayerVariables())).balance);
					entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.display = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = Math.floor((entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MarkscoinsModVariables.PlayerVariables())).display);
					entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.transfer = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(MarkscoinsModItems.COIN_WOOD.get());
					_setstack.setCount((int) new Object() {
						double convert(String s) {
							try {
								return Double.parseDouble(s.trim());
							} catch (Exception e) {
							}
							return 0;
						}
					}.convert(new java.text.DecimalFormat("#").format((entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MarkscoinsModVariables.PlayerVariables())).display)));
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if ((entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MarkscoinsModVariables.PlayerVariables())).balance < 16) {
				{
					double _setval = Math.floor((entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MarkscoinsModVariables.PlayerVariables())).balance / 4);
					entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.display = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = Math.floor((entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MarkscoinsModVariables.PlayerVariables())).display * 4);
					entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.transfer = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(MarkscoinsModItems.COIN_STONE.get());
					_setstack.setCount((int) new Object() {
						double convert(String s) {
							try {
								return Double.parseDouble(s.trim());
							} catch (Exception e) {
							}
							return 0;
						}
					}.convert(new java.text.DecimalFormat("#").format((entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MarkscoinsModVariables.PlayerVariables())).display)));
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if ((entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MarkscoinsModVariables.PlayerVariables())).balance < 64) {
				{
					double _setval = Math.floor((entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MarkscoinsModVariables.PlayerVariables())).balance / 16);
					entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.display = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = Math.floor((entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MarkscoinsModVariables.PlayerVariables())).display * 16);
					entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.transfer = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(MarkscoinsModItems.COIN_COPPER.get());
					_setstack.setCount((int) new Object() {
						double convert(String s) {
							try {
								return Double.parseDouble(s.trim());
							} catch (Exception e) {
							}
							return 0;
						}
					}.convert(new java.text.DecimalFormat("#").format((entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MarkscoinsModVariables.PlayerVariables())).display)));
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if ((entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MarkscoinsModVariables.PlayerVariables())).balance < 256) {
				{
					double _setval = Math.floor((entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MarkscoinsModVariables.PlayerVariables())).balance / 64);
					entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.display = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = Math.floor((entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MarkscoinsModVariables.PlayerVariables())).display * 64);
					entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.transfer = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(MarkscoinsModItems.COIN_IRON.get());
					_setstack.setCount((int) new Object() {
						double convert(String s) {
							try {
								return Double.parseDouble(s.trim());
							} catch (Exception e) {
							}
							return 0;
						}
					}.convert(new java.text.DecimalFormat("#").format((entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MarkscoinsModVariables.PlayerVariables())).display)));
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if ((entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MarkscoinsModVariables.PlayerVariables())).balance < 1024) {
				{
					double _setval = Math.floor((entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MarkscoinsModVariables.PlayerVariables())).balance / 256);
					entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.display = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = Math.floor((entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MarkscoinsModVariables.PlayerVariables())).display * 256);
					entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.transfer = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(MarkscoinsModItems.COIN_GOLD.get());
					_setstack.setCount((int) new Object() {
						double convert(String s) {
							try {
								return Double.parseDouble(s.trim());
							} catch (Exception e) {
							}
							return 0;
						}
					}.convert(new java.text.DecimalFormat("#").format((entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MarkscoinsModVariables.PlayerVariables())).display)));
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if ((entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MarkscoinsModVariables.PlayerVariables())).balance < 4096) {
				{
					double _setval = Math.floor((entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MarkscoinsModVariables.PlayerVariables())).balance / 1024);
					entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.display = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = Math.floor((entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MarkscoinsModVariables.PlayerVariables())).display * 1024);
					entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.transfer = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(MarkscoinsModItems.COIN_PLATINUM.get());
					_setstack.setCount((int) new Object() {
						double convert(String s) {
							try {
								return Double.parseDouble(s.trim());
							} catch (Exception e) {
							}
							return 0;
						}
					}.convert(new java.text.DecimalFormat("#").format((entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MarkscoinsModVariables.PlayerVariables())).display)));
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if ((entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MarkscoinsModVariables.PlayerVariables())).balance < 16384) {
				{
					double _setval = Math.floor((entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MarkscoinsModVariables.PlayerVariables())).balance / 4096);
					entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.display = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = Math.floor((entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MarkscoinsModVariables.PlayerVariables())).display * 4096);
					entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.transfer = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(MarkscoinsModItems.COIN_AMETHYST.get());
					_setstack.setCount((int) new Object() {
						double convert(String s) {
							try {
								return Double.parseDouble(s.trim());
							} catch (Exception e) {
							}
							return 0;
						}
					}.convert(new java.text.DecimalFormat("#").format((entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MarkscoinsModVariables.PlayerVariables())).display)));
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if ((entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MarkscoinsModVariables.PlayerVariables())).balance < 65536) {
				{
					double _setval = Math.floor((entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MarkscoinsModVariables.PlayerVariables())).balance / 16384);
					entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.display = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = Math.floor((entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MarkscoinsModVariables.PlayerVariables())).display * 16384);
					entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.transfer = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(MarkscoinsModItems.COIN_SAPPHIRE.get());
					_setstack.setCount((int) new Object() {
						double convert(String s) {
							try {
								return Double.parseDouble(s.trim());
							} catch (Exception e) {
							}
							return 0;
						}
					}.convert(new java.text.DecimalFormat("#").format((entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MarkscoinsModVariables.PlayerVariables())).display)));
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if ((entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MarkscoinsModVariables.PlayerVariables())).balance < 262144) {
				{
					double _setval = Math.floor((entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MarkscoinsModVariables.PlayerVariables())).balance / 65536);
					entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.display = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = Math.floor((entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MarkscoinsModVariables.PlayerVariables())).display * 65536);
					entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.transfer = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(MarkscoinsModItems.COIN_RUBY.get());
					_setstack.setCount((int) new Object() {
						double convert(String s) {
							try {
								return Double.parseDouble(s.trim());
							} catch (Exception e) {
							}
							return 0;
						}
					}.convert(new java.text.DecimalFormat("#").format((entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MarkscoinsModVariables.PlayerVariables())).display)));
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if ((entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MarkscoinsModVariables.PlayerVariables())).balance < 1048576) {
				{
					double _setval = Math.floor((entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MarkscoinsModVariables.PlayerVariables())).balance / 262144);
					entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.display = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = Math.floor((entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MarkscoinsModVariables.PlayerVariables())).display * 262144);
					entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.transfer = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(MarkscoinsModItems.COIN_DIAMOND.get());
					_setstack.setCount((int) new Object() {
						double convert(String s) {
							try {
								return Double.parseDouble(s.trim());
							} catch (Exception e) {
							}
							return 0;
						}
					}.convert(new java.text.DecimalFormat("#").format((entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MarkscoinsModVariables.PlayerVariables())).display)));
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if ((entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MarkscoinsModVariables.PlayerVariables())).balance < 4194304) {
				{
					double _setval = Math.floor((entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MarkscoinsModVariables.PlayerVariables())).balance / 1048576);
					entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.display = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = Math.floor((entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MarkscoinsModVariables.PlayerVariables())).display * 1048576);
					entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.transfer = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(MarkscoinsModItems.COIN_EMERALD.get());
					_setstack.setCount((int) new Object() {
						double convert(String s) {
							try {
								return Double.parseDouble(s.trim());
							} catch (Exception e) {
							}
							return 0;
						}
					}.convert(new java.text.DecimalFormat("#").format((entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MarkscoinsModVariables.PlayerVariables())).display)));
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if ((entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MarkscoinsModVariables.PlayerVariables())).balance >= 4194304) {
				{
					double _setval = Math.floor((entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MarkscoinsModVariables.PlayerVariables())).balance / 4194304);
					entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.display = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = Math.floor((entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MarkscoinsModVariables.PlayerVariables())).display * 4194304);
					entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.transfer = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(MarkscoinsModItems.COIN_NETHERITE.get());
					_setstack.setCount((int) new Object() {
						double convert(String s) {
							try {
								return Double.parseDouble(s.trim());
							} catch (Exception e) {
							}
							return 0;
						}
					}.convert(new java.text.DecimalFormat("#").format((entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MarkscoinsModVariables.PlayerVariables())).display)));
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			}
		}
		{
			String _setval = new java.text.DecimalFormat("#,###,###,### PC").format((entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MarkscoinsModVariables.PlayerVariables())).balance);
			entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.balance_disp = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (MarkscoinsModParticleTypes.BANK.get()), x, (y + 2.25), z, 1, 0, 0, 0, 1);
	}
}
