package network.battlecraft.HelloWorld;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

	@Override
	public void onEnable() {
		//basically when server starts
	}
	
	@Override
	public void onEnable() {
		//server off
	}
	
	// /truth = response of "alex stinks"
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (label.equalsIgnoreCase("truth")) {
			if (sender instanceof Player) {
				//player (not console)
				Player player = (Player) sender;
				if (player.hasPermission("stinky.use")) { 
					player.sendMessage(ChatColor.LIGHT_PURPLE+""+ChatColor.BOLD+"Alex Stinks");
					player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&ehe really Does"));
					return true;
				}
				player.sendMessage(ChatColor.DARK_RED+""+ChatColor.BOLD+"You don't Have permission to use this!");
				return true;
			}
			else {
				//console (not player)
				sender.sendMessage("hey Console");
				return true;
			}
		}
		return false;
	}
}
