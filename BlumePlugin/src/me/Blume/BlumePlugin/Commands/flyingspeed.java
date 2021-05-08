package me.Blume.BlumePlugin.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.Blume.BlumePlugin.Main;
import net.md_5.bungee.api.ChatColor;

public class flyingspeed implements CommandExecutor{
	private Main plugin;
	public flyingspeed(Main main) {
		this.plugin = main;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(label.equals("flyingspeed") && sender instanceof Player) {
			if(args.length==0) {
				sender.sendMessage(ChatColor.AQUA+"You must enter a value");
				return true;
			}
			if(sender.isOp()) {
				Player player = (Player) sender;
				int flyingSpeed = Integer.parseInt(args[0]);
				player.setFlySpeed((float) flyingSpeed/10);
				return true;
			}
			else{
				sender.sendMessage(ChatColor.RED+"You don't have permission!");
				return true;
			}
		}
		return false;
	}

}
