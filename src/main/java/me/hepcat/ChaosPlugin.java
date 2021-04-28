package me.hepcat;

import me.hepcat.Listeners.noMoCombust;
import me.hepcat.Listeners.onJoinListener;
import me.hepcat.Listeners.onProjectileHit;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
/**
 * main class
 */
public class ChaosPlugin extends JavaPlugin
{
    private static ChaosPlugin instance;
    public void onEnable()
    {
        if (instance != null) {
            return;
        }
        instance = this;
        Bukkit.getPluginManager().registerEvents(new onJoinListener(), getPlugin());
        Bukkit.getPluginManager().registerEvents(new onProjectileHit(), getPlugin());
        Bukkit.getPluginManager().registerEvents(new noMoCombust(), getPlugin());
    }
    public static JavaPlugin getPlugin() {
        return instance;
    }
}