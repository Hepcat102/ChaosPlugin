package me.hepcat.Listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityCombustEvent;

public class noMoCombust implements Listener {
    @EventHandler
    public void NoFire(EntityCombustEvent c)
    {
        c.setCancelled(true);
    }
}
