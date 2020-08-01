package com.pascalHann.peacefulplayer.listeners;

import com.pascalHann.peacefulplayer.permissions.Permissions;
import com.pascalHann.peacefulplayer.helper.Mobs;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityTargetEvent;

public class Pacifier implements Listener {

    @EventHandler
    public void onAggro(EntityTargetEvent targetEvent) {
        Entity attacker = targetEvent.getEntity();
        Entity victim = targetEvent.getTarget();
        if(victim instanceof Player && victim.hasPermission(Permissions.PACIFIER.getPermission()) && Mobs.isHostile(attacker)) {
            targetEvent.setCancelled(true);
        }
    }

}
