package com.pascalHann.peacefulplayerrepacified.listeners;

import com.pascalHann.peacefulplayerrepacified.permissions.Permissions;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

/**
 * Cancel damage to a god player
 */
public class God implements Listener {

    @EventHandler
    public void onDamage(EntityDamageEvent damageEvent) {
        Entity victim = damageEvent.getEntity();
        if(victim instanceof Player && victim.hasPermission(Permissions.GOD.getPermission())) {
            damageEvent.setCancelled(true);
        }
    }

}
