/*
 *    MCreator note:
 *
 *    If you lock base mod element files, you can edit this file and it won't get overwritten.
 *    If you change your modid or package, you need to apply these changes to this file MANUALLY.
 *
 *    Settings in @Mod annotation WON'T be changed in case of the base mod element
 *    files lock too, so you need to set them manually here in such case.
 *
 *    If you do not lock base mod element files in Workspace settings, this file
 *    will be REGENERATED on each build.
 *
 */
package net.rewey.markscoins;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.rewey.markscoins.init.MarkscoinsModTabs;
import net.rewey.markscoins.init.MarkscoinsModPotions;
import net.rewey.markscoins.init.MarkscoinsModParticleTypes;
import net.rewey.markscoins.init.MarkscoinsModMobEffects;
import net.rewey.markscoins.init.MarkscoinsModItems;
import net.rewey.markscoins.init.MarkscoinsModFeatures;
import net.rewey.markscoins.init.MarkscoinsModBlocks;

import net.minecraftforge.network.simple.SimpleChannel;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.IEventBus;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.FriendlyByteBuf;

import java.util.function.Supplier;
import java.util.function.Function;
import java.util.function.BiConsumer;

@Mod("markscoins")
public class MarkscoinsMod {
	public static final Logger LOGGER = LogManager.getLogger(MarkscoinsMod.class);
	public static final String MODID = "markscoins";
	private static final String PROTOCOL_VERSION = "1";
	public static final SimpleChannel PACKET_HANDLER = NetworkRegistry.newSimpleChannel(new ResourceLocation(MODID, MODID), () -> PROTOCOL_VERSION, PROTOCOL_VERSION::equals, PROTOCOL_VERSION::equals);
	private static int messageID = 0;

	public MarkscoinsMod() {
		MarkscoinsModTabs.load();
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		MarkscoinsModBlocks.REGISTRY.register(bus);
		MarkscoinsModItems.REGISTRY.register(bus);

		MarkscoinsModFeatures.REGISTRY.register(bus);

		MarkscoinsModMobEffects.REGISTRY.register(bus);
		MarkscoinsModPotions.REGISTRY.register(bus);

		MarkscoinsModParticleTypes.REGISTRY.register(bus);
	}

	public static <T> void addNetworkMessage(Class<T> messageType, BiConsumer<T, FriendlyByteBuf> encoder, Function<FriendlyByteBuf, T> decoder, BiConsumer<T, Supplier<NetworkEvent.Context>> messageConsumer) {
		PACKET_HANDLER.registerMessage(messageID, messageType, encoder, decoder, messageConsumer);
		messageID++;
	}
}
