package com.pascalHann.peacefulplayerrepacified.permissions;

import com.pascalHann.peacefulplayerrepacified.listeners.God;
import com.pascalHann.peacefulplayerrepacified.listeners.Pacified;
import com.pascalHann.peacefulplayerrepacified.listeners.Pacifier;
import org.bukkit.event.Listener;
import org.bukkit.permissions.Permission;
import org.bukkit.permissions.PermissionDefault;

public enum Permissions {

    GOD(new Permission("peacefulplayer.god"), new God()),
    PACIFIED(new Permission("peacefulplayer.pacified"), new Pacified()),
    PACIFIER(new Permission("peacefulplayer.pacifier"), new Pacifier());

    private final Permission permission;
    private final Listener listener;

    Permissions(Permission permission, Listener listener) {
        this.permission = permission;
        this.listener = listener;
    }

    public Permission getPermission() {
        permission.setDefault(PermissionDefault.FALSE);
        return permission;
    }

    public Listener getListener() {
        return listener;
    }

}