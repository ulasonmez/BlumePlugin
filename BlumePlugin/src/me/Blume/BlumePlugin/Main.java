package me.Blume.BlumePlugin;


import org.bukkit.plugin.java.JavaPlugin;

import me.Blume.BlumePlugin.Commands.flyingspeed;
import me.Blume.BlumePlugin.Commands.heal;
import me.Blume.BlumePlugin.Commands.start;

public class Main extends JavaPlugin{
	
	@Override
	public void onEnable() {
		getCommand("flyingspeed").setExecutor(new flyingspeed(this));
		getCommand("heal").setExecutor(new heal(this));
		getCommand("start").setExecutor(new start(this));
	}
	@Override
	public void onDisable() {
		
	}
}
