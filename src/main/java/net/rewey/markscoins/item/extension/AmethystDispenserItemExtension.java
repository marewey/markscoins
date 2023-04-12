
package net.rewey.markscoins.item.extension;

import net.rewey.markscoins.procedures.AmethystDispenserOnDispenseAttemptWithResultProcedure;
import net.rewey.markscoins.procedures.AmethystDispenserDispenseSuccessfullyIfProcedure;
import net.rewey.markscoins.init.MarkscoinsModItems;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.block.DispenserBlock;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.dispenser.OptionalDispenseItemBehavior;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockSource;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AmethystDispenserItemExtension {
	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> DispenserBlock.registerBehavior(MarkscoinsModItems.COIN_AMETHYST.get(), new OptionalDispenseItemBehavior() {
			public ItemStack execute(BlockSource blockSource, ItemStack stack) {
				ItemStack itemstack = stack.copy();
				Level world = blockSource.getLevel();
				Direction direction = blockSource.getBlockState().getValue(DispenserBlock.FACING);
				int x = blockSource.getPos().getX();
				int y = blockSource.getPos().getY();
				int z = blockSource.getPos().getZ();
				this.setSuccess(AmethystDispenserDispenseSuccessfullyIfProcedure.execute(world, x, y, z, direction));
				boolean success = this.isSuccess();
				AmethystDispenserOnDispenseAttemptWithResultProcedure.execute(world, x, y, z, direction, itemstack);
				if (success)
					itemstack.shrink(1);
				return itemstack;
			}
		}));
	}
}
