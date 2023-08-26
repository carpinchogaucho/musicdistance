package me.lexo;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Registro del comando
        getCommand("playmusic").setExecutor(new CommandPlayMusic());
    }
}

