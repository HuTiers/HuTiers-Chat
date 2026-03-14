package hu.jgj52.huTiersChat.Listeners;

import hu.jgj52.huTiersMessenger.Messenger;
import io.papermc.paper.event.player.AsyncChatEvent;
import net.kyori.adventure.text.serializer.plain.PlainTextComponentSerializer;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class AsyncChatListener implements Listener {
    @EventHandler
    public void onMessage(AsyncChatEvent event) {
        event.setCancelled(true);
        Messenger.send("message", event.getPlayer().getName() + " " + PlainTextComponentSerializer.plainText().serialize(event.originalMessage()));
    }
}
