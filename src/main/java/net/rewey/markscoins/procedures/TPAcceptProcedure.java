package net.rewey.markscoins.procedures;

import net.rewey.markscoins.network.MarkscoinsModVariables;
import net.rewey.markscoins.MarkscoinsMod;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.chat.TextComponent;

import java.util.ArrayList;

public class TPAcceptProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		Entity requestee = null;
		if ((entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MarkscoinsModVariables.PlayerVariables())).tpa_state) {
			for (Entity entityiterator : new ArrayList<>(world.players())) {
				if (((entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MarkscoinsModVariables.PlayerVariables())).tpa_request).equals(entityiterator.getDisplayName().getString())) {
					requestee = entityiterator;
				}
			}
			if (requestee instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(new TextComponent(("[TPA] Teleporting " + entity.getDisplayName().getString() + " to you now...")), (false));
			{
				Entity _ent = entity;
				_ent.teleportTo((requestee.getX()), (requestee.getY()), (requestee.getZ()));
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport((requestee.getX()), (requestee.getY()), (requestee.getZ()), _ent.getYRot(), _ent.getXRot());
			}
			MarkscoinsMod.LOGGER.info(("[TPA] x: " + requestee.getX() + ", y: " + requestee.getY() + ", z: " + requestee.getZ()));
			{
				boolean _setval = false;
				entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.tpa_state = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(new TextComponent("[TPA] No pending requests"), (false));
		}
	}
}
