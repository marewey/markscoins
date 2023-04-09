
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.rewey.markscoins.init;

import org.lwjgl.glfw.GLFW;

import net.rewey.markscoins.network.BankKeyMessage;
import net.rewey.markscoins.MarkscoinsMod;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.client.ClientRegistry;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class MarkscoinsModKeyMappings {
	public static final KeyMapping BANK_KEY = new KeyMapping("key.markscoins.bank_key", GLFW.GLFW_KEY_RIGHT_CONTROL, "key.categories.misc");

	@SubscribeEvent
	public static void registerKeyBindings(FMLClientSetupEvent event) {
		ClientRegistry.registerKeyBinding(BANK_KEY);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onKeyInput(InputEvent.KeyInputEvent event) {
			if (Minecraft.getInstance().screen == null) {
				if (event.getKey() == BANK_KEY.getKey().getValue()) {
					if (event.getAction() == GLFW.GLFW_PRESS) {
						MarkscoinsMod.PACKET_HANDLER.sendToServer(new BankKeyMessage(0, 0));
						BankKeyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
					}
				}
			}
		}
	}
}
