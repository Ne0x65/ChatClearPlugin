package xyz.ne0x.Command;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ChatClearCommand implements CommandExecutor {

  @Override
  public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
    Player player = (Player) sender;

    if(!player.hasPermission("system.chatclear")) {
      player.sendMessage("§c§lChatClear §8» §7Dafür hast du keine Rechte§8.");
      return true;

    }

    if(args.length == 0) {
      for (int i= 0; i < 105; ++i) {
        for(Player all : Bukkit.getOnlinePlayers()) {
          if(!all.hasPermission("system.chatclear")){
            all.sendMessage("");
          }
        }
      }
      Bukkit.broadcastMessage("§c§lChatClear §8» §7Der Chat wurde von §c" + player.getName() + " §7geleert§8.");

    } else {
      player.sendMessage("§c§lChatClear §8» §7Bitte benutze §c/ChatClear");
      return true;

    }

    return false;
  }

}