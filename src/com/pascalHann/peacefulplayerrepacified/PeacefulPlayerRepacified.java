package com.pascalHann.peacefulplayerrepacified;

import com.pascalHann.peacefulplayerrepacified.permissions.Permissions;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class PeacefulPlayerRepacified extends JavaPlugin {

    @Override
    public void onEnable() {
        PluginManager pluginManager = getServer().getPluginManager();
        for(Permissions perm : Permissions.values()) {
            pluginManager.addPermission(perm.getPermission());
            pluginManager.registerEvents(perm.getListener(), this);
        }
        System.out.println("Loaded PeacefulPlayerRepacified 2.0 successfully!");
    }

}
