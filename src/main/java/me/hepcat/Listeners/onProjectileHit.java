package me.hepcat.Listeners;

import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;

import java.util.Objects;

public class onProjectileHit implements Listener {
    @EventHandler
    public void BoomHit(ProjectileHitEvent e)
    {
        Block b = e.getHitBlock();
        if (b == null)
            Objects.requireNonNull(e.getHitEntity()).getWorld().createExplosion(e.getHitEntity().getLocation(), 5, false);
        else
        {
            e.getHitBlock().getWorld().createExplosion(e.getHitBlock().getLocation(), 5, false);
        }
    }
}
