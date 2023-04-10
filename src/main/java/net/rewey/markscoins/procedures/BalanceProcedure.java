package net.rewey.markscoins.procedures;

import net.rewey.markscoins.network.MarkscoinsModVariables;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.commands.CommandSourceStack;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;

public class BalanceProcedure {
	public static void execute(CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		try {
			for (Entity entityiterator : EntityArgument.getEntities(arguments, "name")) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(new TextComponent((entityiterator.getDisplayName().getString() + " balance: "
							+ new java.text.DecimalFormat("#,###,###,### PC").format((entityiterator.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MarkscoinsModVariables.PlayerVariables())).balance) + ".")),
							(false));
			}
		} catch (CommandSyntaxException e) {
			e.printStackTrace();
		}
	}
}
