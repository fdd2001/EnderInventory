package me.fdd2001.ei;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.Console;

/**
 * Created by Flo on 14.07.14.
 */
public class Main extends JavaPlugin {
    @Override
    public void onEnable () {

    }
    @Override
    public void onDisable () {

    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player p = (Player)sender;
        if (cmd.getName().equalsIgnoreCase("get")) {
            if (p.hasPermission("ei.get")) {
                p.getInventory().clear();
                p.getInventory().setContents(p.getEnderChest().getContents());
                p.sendMessage(ChatColor.GREEN + "Successfully replaced your inventory with the one of your ender chest.");
            }
            return true;
        }
        else if (cmd.getName().equalsIgnoreCase("clearec")) {
            if (p.hasPermission("ei.clear")) {
                p.getEnderChest().clear();
                p.sendMessage(ChatColor.GREEN + "Successfully cleared your ender chest.");
            }
            return true;
        }
        return false;
    }
}
