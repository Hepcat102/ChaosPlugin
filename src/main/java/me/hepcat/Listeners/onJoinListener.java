package me.hepcat.Listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class onJoinListener implements Listener {
    @EventHandler
    public void playerjoin(PlayerJoinEvent e)
    {
        Player p = e.getPlayer();
        p.sendMessage("Welcome " + p.getDisplayName());
    }
}
