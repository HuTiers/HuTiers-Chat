package hu.jgj52.huTiersChat;

import hu.jgj52.huTiersChat.Listeners.AsyncChatListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class HuTiersChat extends JavaPlugin {
    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new AsyncChatListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
