package com.pascalHann.peacefulplayerrepacified.listeners;

import com.pascalHann.peacefulplayerrepacified.permissions.Permissions;
import com.pascalHann.peacefulplayerrepacified.helper.Mobs;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Projectile;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.AreaEffectCloudApplyEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.PotionSplashEvent;
import org.bukkit.projectiles.ProjectileSource;

/**
 * Cancel pacified player attempt to damage hostile mobs
 */
public class Pacified implements Listener {

    @EventHandler
    public void onAttack(EntityDamageByEntityEvent attackEvent) {
        Entity attacker = attackEvent.getDamager();
        if(attacker instanceof Projectile) {
            if(!(((Projectile)attacker).getShooter() instanceof Player))
                return;
            attacker = (Player)((Projectile)attackEvent.getDamager()).getShooter();
        }
        Entity victim = attackEvent.getEntity();
        if(attacker instanceof Player && attacker.hasPermission(Permissions.PACIFIED.getPermission()) && (Mobs.isHostile(victim)) ) {
            attackEvent.setCancelled(true);
        }
    }

    @EventHandler
    public void onLingeringPotionEffect(AreaEffectCloudApplyEvent areaEffectEvent) {
        ProjectileSource thrower = areaEffectEvent.getEntity().getSource();
        if(thrower instanceof Player && ((Player)thrower).hasPermission(Permissions.PACIFIED.getPermission())) {
            areaEffectEvent.getAffectedEntities().removeIf(mob -> Mobs.isHostile(mob));
        }
    }

    @EventHandler
    public void onPotionEffect(PotionSplashEvent splashEvent) {
        ProjectileSource thrower = splashEvent.getEntity().getShooter();
        if(thrower instanceof Player && ((Player)thrower).hasPermission(Permissions.PACIFIED.getPermission())) {
            splashEvent.getAffectedEntities().forEach(mob -> {
                        if(Mobs.isHostile(mob))
                            splashEvent.setIntensity(mob, 0);
                    });
        }
    }

}
