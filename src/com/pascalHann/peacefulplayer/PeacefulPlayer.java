package com.pascalHann.peacefulplayer;

import com.pascalHann.peacefulplayer.permissions.Permissions;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class PeacefulPlayer extends JavaPlugin {

    @Override
    public void onEnable() {
        PluginManager pluginManager = getServer().getPluginManager();
        for(Permissions perm : Permissions.values()) {
            pluginManager.addPermission(perm.getPermission());
            pluginManager.registerEvents(perm.getListener(), this);
        }
        System.out.println("Loaded PeacefulPlayer 1.0.3 successfully!");
    }

}
