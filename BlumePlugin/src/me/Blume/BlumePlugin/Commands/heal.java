package me.Blume.BlumePlugin.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.Blume.BlumePlugin.Main;
import net.md_5.bungee.api.ChatColor;

public class heal implements CommandExecutor{
	private Main plugin;
	public heal(Main main) {
		this.plugin = main;
	}
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(label.equals("heal") && sender instanceof Player) {
			Player player = (Player) sender;
			if(player.getHealth()==20.0 && player.getFoodLevel()==20) {
				player.sendMessage(ChatColor.GREEN+"You are already full.");
			return true;
			}
			player.setHealth(20.0);
			player.setFoodLevel(25);
			
			
		}
		return false;
	}

}