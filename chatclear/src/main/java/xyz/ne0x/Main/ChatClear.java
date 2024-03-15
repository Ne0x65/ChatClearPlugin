package xyz.ne0x.Main;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import xyz.ne0x.Command.ChatClearCommand;

public class ChatClear extends JavaPlugin {

  @Override
  public void onEnable() {
    Bukkit.getConsoleSender().sendMessage("§c§lChatClear §8» §7wurde erfolgreich geladen");

    getCommand("chatclear").setExecutor(new ChatClearCommand());
    getCommand("cc").setExecutor(new ChatClearCommand());

  }

}
