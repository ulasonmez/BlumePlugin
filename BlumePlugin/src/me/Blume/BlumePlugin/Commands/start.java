package me.Blume.BlumePlugin.Commands;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.Blume.BlumePlugin.Main;

public class start implements CommandExecutor{
	private Main plugin;
	public start(Main main) {
		this.plugin = main;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(sender.isOp() && label.equals("start") && sender instanceof Player) {
			Player player = (Player) sender;
			World world = player.getWorld();
			world.setFullTime(0);
			for(Player p : Bukkit.getOnlinePlayers()) {
				p.setHealth(20.0);
				p.setFoodLevel(25);
			}
			return true;
		}
		
		return false;
	}
	
}
