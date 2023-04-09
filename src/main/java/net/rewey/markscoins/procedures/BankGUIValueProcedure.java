package net.rewey.markscoins.procedures;

import net.rewey.markscoins.network.MarkscoinsModVariables;

import net.minecraft.world.entity.Entity;

public class BankGUIValueProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return (entity.getCapability(MarkscoinsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MarkscoinsModVariables.PlayerVariables())).balance_disp;
	}
}
