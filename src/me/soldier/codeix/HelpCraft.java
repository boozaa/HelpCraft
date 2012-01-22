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
		
		if(cmd.getName().equalsIgnoreCase("Help?")&& sender.hasPermission("Help.help")){
			if(this.getConfig().getString("Language").equals("en")){
			sender.sendMessage(ChatColor.YELLOW+"==>HelpCraft Help<==");
			sender.sendMessage(ChatColor.GREEN+"  =>HelpEcon: help with economy");			
			sender.sendMessage(ChatColor.GREEN+"  =>HelpLock: help for privacy");			
			sender.sendMessage(ChatColor.GREEN+"  =>Helpsec: help for anti-grief");			
			sender.sendMessage(ChatColor.GREEN+"  =>HelpMisc: help with misc plugins");			
			sender.sendMessage(ChatColor.GREEN+"  =>HelpAdmn: help for admin-tools");			
			sender.sendMessage(ChatColor.GREEN+"  =>HelpChat: help for chat tools");			
			sender.sendMessage(ChatColor.GREEN+"  =>HelpEdit: help for world editing");			
			sender.sendMessage(ChatColor.GREEN+"  =>HelpWGen: help for world generator");			
			sender.sendMessage(ChatColor.GREEN+"  =>HelpFun: help for Fun =)");			
			sender.sendMessage(ChatColor.GREEN+"  =>HelpGen; help for general plugins");			
			sender.sendMessage(ChatColor.GREEN+"  =>HelpTp: help for teleportation");			
			sender.sendMessage(ChatColor.GREEN+"  =>HelpInfo: help for informational plugins");			
			sender.sendMessage(ChatColor.GREEN+"  =>HelpMech: help for mechanics plugins");	
			sender.sendMessage(ChatColor.GREEN+"  =>HelpCmd: help for general commands (essantial or command book");			

			sender.sendMessage(ChatColor.GREEN+"  =>HelpReload: reload config.yml");			
			sender.sendMessage(ChatColor.GREEN+"  =>Help?");			
			}
			if(this.getConfig().getString("Language").equals("fr")){
			sender.sendMessage(ChatColor.YELLOW+"==>HelpCraft Help<==");
			sender.sendMessage(ChatColor.GREEN+"  =>HelpEcon: aide avec l'Žconomie");			
			sender.sendMessage(ChatColor.GREEN+"  =>HelpLock: aide avec le securitŽe");			
			sender.sendMessage(ChatColor.GREEN+"  =>Helpsec: aide pour l'anti-grief");			
			sender.sendMessage(ChatColor.GREEN+"  =>HelpMisc: aide avec les plugins 'Misc'");			
			sender.sendMessage(ChatColor.GREEN+"  =>HelpAdmn: aide pour l'administration");			
			sender.sendMessage(ChatColor.GREEN+"  =>HelpChat: aide pour le chat");			
			sender.sendMessage(ChatColor.GREEN+"  =>HelpEdit: aide pour le 'World editing'");			
			sender.sendMessage(ChatColor.GREEN+"  =>HelpWGen: aide pour les gŽnŽrateurs de monde");			
			sender.sendMessage(ChatColor.GREEN+"  =>HelpFun: aide pour le fun Fun =)");			
			sender.sendMessage(ChatColor.GREEN+"  =>HelpGen; aide pour les plugin gŽnŽraux");			
			sender.sendMessage(ChatColor.GREEN+"  =>HelpTp: aide pour la teleportation");			
			sender.sendMessage(ChatColor.GREEN+"  =>HelpInfo: aide pour le plugins informationnels");			
			sender.sendMessage(ChatColor.GREEN+"  =>HelpMech: aide pour les plugins 'Mechanics'");	
			sender.sendMessage(ChatColor.GREEN+"  =>HelpCmd: aide pour les commands de masse (essantial ou command book");			

			sender.sendMessage(ChatColor.GREEN+"  =>HelpReload: reload config.yml");			
			sender.sendMessage(ChatColor.GREEN+"  =>Help?");			
			}
			return true;
		}
		if(cmd.getName().equalsIgnoreCase("HelpReload")&& sender.hasPermission("Help.reload")){
			this.reloadConfig();
			sender.sendMessage(ChatColor.GREEN+"Helpcraft reloaded");
			return true;
		}	
		
		
		if(cmd.getName().equalsIgnoreCase("HelpAdmn")&& sender.hasPermission("Help.helpadmn")){
			sender.sendMessage(ChatColor.GREEN+""+this.getConfig().getStringList("HelpAdmn"));
			return true;
		}else if(sender.hasPermission("Help.helpadmn") == false && cmd.getName().equalsIgnoreCase("HelpAdmn")) sender.sendMessage(ChatColor.RED+"You can't do that");
		
		if(cmd.getName().equalsIgnoreCase("HelpCmd")&& sender.hasPermission("Help.helpcmd")){
			sender.sendMessage(ChatColor.GREEN+""+this.getConfig().getStringList("HelpCmd"));
			return true;
		}else if(sender.hasPermission("Help.helpcmd") == false && cmd.getName().equalsIgnoreCase("Helpcmd")) sender.sendMessage(ChatColor.RED+"You can't do that");
		
		
		if(cmd.getName().equalsIgnoreCase("HelpEcon")&& sender.hasPermission("Help.helpecon")){
			sender.sendMessage(ChatColor.GREEN+""+this.getConfig().getStringList("HelpEcon"));
			  return true;		
		   }else if(sender.hasPermission("Help.helpEcon") == false && cmd.getName().equalsIgnoreCase("HelpEcon")) sender.sendMessage(ChatColor.RED+"You can't do that");
		
		
		if(cmd.getName().equalsIgnoreCase("HelpLock")&& sender.hasPermission("Help.helplock")){
				sender.sendMessage(ChatColor.GREEN+""+this.getConfig().getStringList("HelpLock"));
				return true;
			}else if(sender.hasPermission("Help.helplock") == false && cmd.getName().equalsIgnoreCase("HelpLock")) sender.sendMessage(ChatColor.RED+"You can't do that");
			
			
	    if(cmd.getName().equalsIgnoreCase("HelpMisc")&& sender.hasPermission("Help.helpmisc")){
				sender.sendMessage(ChatColor.GREEN+""+this.getConfig().getStringList("HelpMisc"));
				return true;
			}else if(sender.hasPermission("Help.helpmisc") == false && cmd.getName().equalsIgnoreCase("HelpMisc")) sender.sendMessage(ChatColor.RED+"You can't do that");
			
			
		if(cmd.getName().equalsIgnoreCase("HelpSec")&& sender.hasPermission("Help.helpsec")){
       		 sender.sendMessage(ChatColor.GREEN+""+this.getConfig().getStringList("HelpSec"));
       		 return true;
			}else if(sender.hasPermission("Help.helpsec") == false && cmd.getName().equalsIgnoreCase("HelpSec")) sender.sendMessage(ChatColor.RED+"You can't do that");
		
		if(cmd.getName().equalsIgnoreCase("HelpChat")&& sender.hasPermission("Help.helpchat")){
			sender.sendMessage(ChatColor.GREEN+""+this.getConfig().getStringList("HelpChat"));
			return true;
		}else if(sender.hasPermission("Help.helpchat") == false && cmd.getName().equalsIgnoreCase("Helpchat")) sender.sendMessage(ChatColor.RED+"You can't do that");
		
		
		if(cmd.getName().equalsIgnoreCase("HelpEdit")&& sender.hasPermission("Help.helpedit")){
			sender.sendMessage(ChatColor.GREEN+""+this.getConfig().getStringList("HelpEdit"));
			return true;
		}else if(sender.hasPermission("Help.helpedit") == false && cmd.getName().equalsIgnoreCase("HelpEdit")) sender.sendMessage(ChatColor.RED+"You can't do that");
		
		
		if(cmd.getName().equalsIgnoreCase("HelpWGen")&& sender.hasPermission("Help.helpwgen")){
			sender.sendMessage(ChatColor.GREEN+""+this.getConfig().getStringList("HelpWGen"));
	   return true;
		}else if(sender.hasPermission("Help.helpwgen") == false && cmd.getName().equalsIgnoreCase("HelpWGen")) sender.sendMessage(ChatColor.RED+"You can't do that");
		
		
		if(cmd.getName().equalsIgnoreCase("HelpFun")&& sender.hasPermission("Help.helpfun")){
			sender.sendMessage(ChatColor.GREEN+""+this.getConfig().getStringList("HelpFun"));
			return true;
		}else if(sender.hasPermission("Help.helpfun") == false && cmd.getName().equalsIgnoreCase("HelpFun")) sender.sendMessage(ChatColor.RED+"You can't do that");
		
		
		if(cmd.getName().equalsIgnoreCase("HelpGen")&& sender.hasPermission("Help.helpgen")){
			sender.sendMessage(ChatColor.GREEN+""+this.getConfig().getStringList("HelpGen"));
			return true;
		}else if(sender.hasPermission("Help.helpgen") == false && cmd.getName().equalsIgnoreCase("HelpGen")) sender.sendMessage(ChatColor.RED+"You can't do that");


		if(cmd.getName().equalsIgnoreCase("HelpTp")&& sender.hasPermission("Help.helptp")){
			sender.sendMessage(ChatColor.GREEN+""+this.getConfig().getStringList("HelpTp"));
			return true;
		}else if(sender.hasPermission("Help.helptp") == false && cmd.getName().equalsIgnoreCase("HelpTp")) sender.sendMessage(ChatColor.RED+"You can't do that");
		
		
		if(cmd.getName().equalsIgnoreCase("HelpInfo")&& sender.hasPermission("Help.helpinfo")){
			sender.sendMessage(ChatColor.GREEN+""+this.getConfig().getStringList("HelpInfo"));
			return true;
		}else if(sender.hasPermission("Help.helpinfo") == false && cmd.getName().equalsIgnoreCase("HelpInfo")) sender.sendMessage(ChatColor.RED+"You can't do that");
		
		
		if(cmd.getName().equalsIgnoreCase("HelpMech")&& sender.hasPermission("Help.helpmech")){
			sender.sendMessage(ChatColor.GREEN+""+this.getConfig().getStringList("HelpMech"));
			return true;
		}else if(sender.hasPermission("Help.helpmech") == false && cmd.getName().equalsIgnoreCase("HelpMech")) sender.sendMessage(ChatColor.RED+"You can't do that");
		
    return false;
    
  }	
}
