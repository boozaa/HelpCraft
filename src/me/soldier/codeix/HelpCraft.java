package me.soldier.codeix;

import java.io.File;
import java.util.logging.Logger;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class HelpCraft extends JavaPlugin{
	
 
	Logger log = Logger.getLogger("Minecraft");
	String pluginDirPath;
	private File configFile;
	@SuppressWarnings("unused")
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
		if(cmd.getName().equalsIgnoreCase("HelpReload")&& sender.hasPermission("Help.reload")){
			this.reloadConfig();
			sender.sendMessage(ChatColor.GREEN+"Helpcraft reloaded");
			return true;
		}	
		
		
		if(cmd.getName().equalsIgnoreCase("HelpAdmn")&& sender.hasPermission("Help.helpadmn")){
			sender.sendMessage(ChatColor.GREEN+""+this.getConfig().getStringList("HelpAdmn"));
			return true;
		}else if(sender.hasPermission("Help.helpadmn") == false) sender.sendMessage(ChatColor.RED+"You can't do that");
		
		
		if(cmd.getName().equalsIgnoreCase("HelpEcon")&& sender.hasPermission("Help.helpecon")){
			sender.sendMessage(ChatColor.GREEN+""+this.getConfig().getStringList("HelpEcon"));
			  return true;		
		   }else if(sender.hasPermission("Help.helpEcon") == false) sender.sendMessage(ChatColor.RED+"You can't do that");
		
		
		if(cmd.getName().equalsIgnoreCase("HelpLock")&& sender.hasPermission("Help.helplock")){
				sender.sendMessage(ChatColor.GREEN+""+this.getConfig().getStringList("HelpLock"));
				return true;
			}else if(sender.hasPermission("Help.helplock") == false) sender.sendMessage(ChatColor.RED+"You can't do that");
			
			
	    if(cmd.getName().equalsIgnoreCase("HelpMisc")&& sender.hasPermission("Help.helpmisc")){
				sender.sendMessage(ChatColor.GREEN+""+this.getConfig().getStringList("HelpMisc"));
				return true;
			}else if(sender.hasPermission("Help.helpmisc") == false) sender.sendMessage(ChatColor.RED+"You can't do that");
			
			
		if(cmd.getName().equalsIgnoreCase("HelpSec")&& sender.hasPermission("Help.helpsec")){
       		 sender.sendMessage(ChatColor.GREEN+""+this.getConfig().getStringList("HelpSec"));
       		 return true;
			}else if(sender.hasPermission("Help.helpsec") == false) sender.sendMessage(ChatColor.RED+"You can't do that");
		
		if(cmd.getName().equalsIgnoreCase("HelpChat")&& sender.hasPermission("Help.helpchat")){
			sender.sendMessage(ChatColor.GREEN+""+this.getConfig().getStringList("HelpChat"));
			return true;
		}else if(sender.hasPermission("Help.helpchat") == false) sender.sendMessage(ChatColor.RED+"You can't do that");
		
		
		if(cmd.getName().equalsIgnoreCase("HelpEdit")&& sender.hasPermission("Help.helpedit")){
			sender.sendMessage(ChatColor.GREEN+""+this.getConfig().getStringList("HelpEdit"));
			return true;
		}else if(sender.hasPermission("Help.helpedit") == false) sender.sendMessage(ChatColor.RED+"You can't do that");
		
		
		if(cmd.getName().equalsIgnoreCase("HelpWGen")&& sender.hasPermission("Help.helpwgen")){
			sender.sendMessage(ChatColor.GREEN+""+this.getConfig().getStringList("HelpWGen"));
	   return true;
		}else if(sender.hasPermission("Help.helpwgen") == false) sender.sendMessage(ChatColor.RED+"You can't do that");
		
		
		if(cmd.getName().equalsIgnoreCase("HelpFun")&& sender.hasPermission("Help.helpfun")){
			sender.sendMessage(ChatColor.GREEN+""+this.getConfig().getStringList("HelpFun"));
			return true;
		}else if(sender.hasPermission("Help.helpfun") == false) sender.sendMessage(ChatColor.RED+"You can't do that");
		
		
		if(cmd.getName().equalsIgnoreCase("HelpGen")&& sender.hasPermission("Help.helpgen")){
			sender.sendMessage(ChatColor.GREEN+""+this.getConfig().getStringList("HelpGen"));
			return true;
		}else if(sender.hasPermission("Help.helpgen") == false) sender.sendMessage(ChatColor.RED+"You can't do that");


		if(cmd.getName().equalsIgnoreCase("HelpTp")&& sender.hasPermission("Help.helptp")){
			sender.sendMessage(ChatColor.GREEN+""+this.getConfig().getStringList("HelpTp"));
			return true;
		}else if(sender.hasPermission("Help.helptp") == false) sender.sendMessage(ChatColor.RED+"You can't do that");
		
		
		if(cmd.getName().equalsIgnoreCase("HelpInfo")&& sender.hasPermission("Help.helpinfo")){
			sender.sendMessage(ChatColor.GREEN+""+this.getConfig().getStringList("HelpInfo"));
			return true;
		}else if(sender.hasPermission("Help.helpinfo") == false) sender.sendMessage(ChatColor.RED+"You can't do that");
		
		
		if(cmd.getName().equalsIgnoreCase("HelpMech")&& sender.hasPermission("Help.helpmech")){
			sender.sendMessage(ChatColor.GREEN+""+this.getConfig().getStringList("HelpMech"));
			return true;
		}else if(sender.hasPermission("Help.helpmech") == false) sender.sendMessage(ChatColor.RED+"You can't do that");
		
    return false;
    
  }	
}
