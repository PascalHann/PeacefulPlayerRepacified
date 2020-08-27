# Peaceful Player Repacified
Simple permission-based plugin to deactivate mob aggro on **specific** players. With
this plugin you can prevent monsters from attacking a certain player, prevent a player attacking monsters, or make a
player immune to damage with three simple permissions. No commands or configuration needed.

## Disclaimer
This Plugin was originally developed by [Owen Oclee](https://github.com/owenoclee). I simply updated the list of hostile mobs to be compatible
with newer versions of Minecraft.  
[Check out his original project!](https://github.com/owenoclee/PeacefulPlayer)

## Requirements
* A server distribution that implements the Bukkit API. I recommend [Paper](https://papermc.io/).
* A permission plugin to apply the permissions. I recommend [LuckPerms](https://www.spigotmc.org/resources/luckperms.28140/).

## Installation
Grab the right version for your server from [here](https://github.com/PascalHann/PeacefulPlayerRepacified/releases) and simply drop the .jar into your server's plugins folder.  
After a server restart the plugin should get listed when you run the /pl chatcommand.

## Permissions
* peacefulplayer.pacifier
    - make hostile mobs act as if the permission holder is not there
    If you want to enable the "true" peaceful experience you might also want to prevent the player from starving. You can
    do this with [Worldguard global region flags](https://worldguard.enginehub.org/en/latest/regions/global-region/):
        ````
        /region flag __global__ -g members feed-delay 30
        /region flag __global__ -g members feed-amount 20
        /region addmember __global__ g:[yourPeacefulGroup]
        ````
    
* peacefulplayer.pacified
    - prevent permission holder from attacking hostile mobs  
    If you want more control over which specific types the player can and cannot attack you can alternatively use [WorldGuards
    build permissions](https://worldguard.enginehub.org/en/latest/build-perms/). (worldguard.build.entity.damage.[Mob])
    
* peacefulplayer.god
    - primitive 'god mode', prevents permission holder from receiving any sort of damage (if you truly hate dying!)
    
## List of affected mobs

* BLAZE
* CAVE_SPIDER
* CREEPER
* DROWNED
* ELDER_GUARDIAN
* ENDER_DRAGON
* ENDERMAN
* ENDERMITE
* EVOKER
* GHAST
* GUARDIAN
* HOGLIN
* HUSK
* MAGMA_CUBE
* PHANTOM
* PIGLIN
* PIGLIN_BRUTE
* PILLAGER
* RAVAGER
* SHULKER
* SILVERFISH
* SKELETON
* SLIME
* SPIDER
* STRAY
* VEX
* VINDICATOR
* WITCH
* WITHER
* WITHER_SKELETON
* WITHER_SKULL
* ZOGLIN
* ZOMBIE
* ZOMBIFIED_PIGLIN
* ZOMBIE_VILLAGER
