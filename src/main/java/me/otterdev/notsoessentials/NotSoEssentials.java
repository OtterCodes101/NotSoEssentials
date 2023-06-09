package me.otterdev.notsoessentials;

import org.bukkit.Bukkit.*;
import org.bukkit.plugin.java.JavaPlugin;

public class NotSoEssentials extends JavaPlugin {
    
    @Override
    public void onEnable() {
    }

    @Override
    public void onDisable() {
    // save the server before it stops
    Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "save-all");
    }
}
