package com.codetaylor.mc.onslaught.modules.onslaught.invasion;

import com.codetaylor.mc.onslaught.ModOnslaught;

import net.minecraft.command.CommandSenderWrapper;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;

/** Responsible for sending the given commands to the given player. */
public class InvasionCommandSender {

	public void send(MinecraftServer minecraftServer, String[] commands, EntityPlayerMP player) {

		CommandSenderWrapper sender = CommandSenderWrapper.create(player).computePositionVector().withPermissionLevel(2)
				.withSendCommandFeedback(false);

		for (String commandString : commands) {

			try {
				int result = minecraftServer.commandManager.executeCommand(sender, commandString);

				if (result > 0) {
					String message = String.format("Executed invasion command [%s] for player %s", commandString,
							player.getName());
					ModOnslaught.LOG.info(message);

				} else {
					String message = String.format("Unable to execute invasion command [%s] for player %s",
							commandString, player.getName());
					ModOnslaught.LOG.error(message);
				}

			} catch (Exception e) {
				String message = String.format("Unable to execute invasion command [%s] for player %s", commandString,
						player.getName());
				ModOnslaught.LOG.error(message, e);
			}
		}
	}
}
