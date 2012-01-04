package me.soldier.codeix;

import java.io.File;
import java.util.Arrays;
import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class HelpCraft extends JavaPlugin{
	
 
	Logger log = Logger.getLogger("Minecraft");
	String pluginDirPath;
	private File configFile;
	private HelpcraftConfig config;
	
	@Override
	public void onDisable() {
        log.info("[HC]Stoping HelpCraft");
	}
	@Override
	public void onEnable() {
        log.info("[HC]Loading HelpCraft");	

		this.pluginDirPath = this.getDataFolder().getAbsolutePath();
		this.configFile = new File(this.pluginDirPath + File.separator + "config.yml");
		this.config = new HelpcraftConfig(this.configFile);
        log.info("[HC]HelpCraft loaded !");	
          
	}
	public boolean onCommand(CommandSender sender, Command cmd, String label,String[]args){
		if(cmd.getName().equalsIgnoreCase("HelpMoney")&& sender.hasPermission("Help.helpmoney")){
			sender.sendMessage(ChatColor.GREEN+""+this.getConfig().getStringList("HelpMoney"));
			return true;
		    }else if(sender.hasPermission("Help.helpmoney") == false) sender.sendMessage(ChatColor.RED+"You can't do that");
			if(cmd.getName().equalsIgnoreCase("HelpLock")&& sender.hasPermission("Help.helplwc")){
				sender.sendMessage(ChatColor.GREEN+""+this.getConfig().getStringList("HelpLock"));
	   return true;
		}else if(sender.hasPermission("Help.helplock") == false) sender.sendMessage(ChatColor.RED+"You can't do that");
		if(cmd.getName().equalsIgnoreCase("HelpBB")&& sender.hasPermission("Help.helpbb")){
       		 sender.sendMessage(ChatColor.GREEN+""+this.getConfig().getStringList("HelpBB"));
	   return true;
		}else if(sender.hasPermission("Help.helpbb") == false) sender.sendMessage(ChatColor.RED+"You can't do that");			
    return false;
  }	
}
