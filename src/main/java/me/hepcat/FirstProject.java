package me.hepcat;

import org.bukkit.Bukkit;
import org.bukkit.block.Block;
import org.bukkit.block.BlockState;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.entity.EntityBreakDoorEvent;
import org.bukkit.event.entity.EntityToggleGlideEvent;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerToggleFlightEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public class FirstProject extends JavaPlugin implements Listener {

    public void onEnable() {
        Bukkit.getServer().getPluginManager().registerEvents(this, this);
    }
    @EventHandler
    public void playerjoin(PlayerJoinEvent e) {
        Player p = e.getPlayer();
        p.sendMessage("Welcome " + p.getDisplayName());
    }
    @EventHandler
    public void BoomHit(ProjectileHitEvent e) {
        Block b = e.getHitBlock();
        if (b == null)
            e.getHitEntity().getWorld().createExplosion(e.getHitEntity().getLocation(), 5, false);
        else {
            e.getHitBlock().getWorld().createExplosion(e.getHitBlock().getLocation(), 5, false);
        }
    }
}
