package org.piotrwyrw.iridiumscoreboard.global;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Permissions {
	public static List<String> admins = new ArrayList<String>();
	
	public static String COMMAND_ADD = "isb.add";
	public static String COMMAND_CLEAR = "isb.clear";
	public static String COMMAND_STOP = "isb.stop";
	public static String COMMAND_START = "ist.start";
	public static String COMMAND_TEST = "isb.test";
	public static String COMMAND_SAVE = "isb.save";
	public static String COMMAND_RELOAD = "isb.reload";
	public static String COMMAND_RESET = "isb.reset";
	
	public static boolean EVENT_SIGNTELEPORT_REQUIRE = true;
	public static String EVENT_SIGNTELEPORT = "isb.signtp";
}
