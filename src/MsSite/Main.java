package MsSite;

//import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
//import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
//import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import ru.tehkode.permissions.bukkit.PermissionsEx;

public class Main extends JavaPlugin implements Listener{
	
	@Override
	public void onEnable() {
		ConsoleCommandSender c = Bukkit.getConsoleSender();
		c.sendMessage("§8===================");
		c.sendMessage("§7Nome: §eparavoce");
		c.sendMessage("§7Criador:§ayurirp4");
		c.sendMessage("§7Stats: §aAtivo");
		c.sendMessage("§7Versão: 1.0");
	}

	
	@Override
	public void onDisable() {
   ConsoleCommandSender c = Bukkit.getConsoleSender();
   c.sendMessage("§8===================");
	c.sendMessage("§7Nome: §eParavoce");
	c.sendMessage("§7Criador:§cyurirp4");
	c.sendMessage("§7Stats: §cDesativado");
	c.sendMessage("§7Versão: §c1.0");
	c.sendMessage("§8===================");
	}
  @Override
public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
	  Player p = (Player) sender;
	  
	  
	  if (cmd.getName().equalsIgnoreCase("s")){
			if (args.length == 0) {
				p.sendMessage("§cUse /s (MSG)");
				return true;
			} else {
				String message = "";
				for (int i = 0; i < args.length; i++) {
					if (i == args.length - 1) {
						message = message + args[i];
					} else {
						message = message + args[i] + " ";
					}
				}
				for (Player s : Bukkit.getOnlinePlayers()) {
					if (s.hasPermission("staff.mcskypvp")) {
						s.sendMessage("§d[S] §8" + p.getName().replaceAll("&", "§") + "§7:" + " §b" + message.replace("&", "§"));
					}
				}
			}
			}
			return false;
}
}