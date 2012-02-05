package me.soldier.codeix;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.YamlConfiguration;

public class HelpcraftConfig {
	
	private YamlConfiguration config;
	private HashMap<String, Object> configDefault = new HashMap<String, Object>();
	
	public HelpcraftConfig(File configFile){
		this.config = new YamlConfiguration();
		
		String[] listOfStrings4money = {"Use /money pay (player) (amount) to pay other player", "/money check your balance", "/money ? for the plugin helper"};
		this.configDefault.put("HelpEcon", Arrays.asList(listOfStrings4money));		
		
		String[] listOfStrings4lwc = {"Use /cprivate to lock an object", "/cpassword to lock with a password", "/cremove to remove a protection", "/lwc for plugin global help"};
		this.configDefault.put("HelpLock", Arrays.asList(listOfStrings4lwc));
		
		String[] listOfStrings4BB = {"Use /bb stick 1 to active the stick", "/bb stick 2 to active the history log", "/bb stick 0 disactive any bb stick", "/bb for global plugin help"};
		this.configDefault.put("HelpSec", Arrays.asList(listOfStrings4BB));
		
		String[] listOfStrings4admn = {"Use /time <Day|night> to set the time", "/weather <sun|storm> (duration) to set the weather", "/kick <playerName>to kick a player", "/ban <playerName> tp ban a player anu /unban <PlayerName> to unban  a player"};
		this.configDefault.put("HelpAdmn", Arrays.asList(listOfStrings4admn));
		
		String[] listOfStrings4Chat = {"Use /ch <chanel> for choose a channel", "/gmute <playerName> to mute some player  (for the admins)", "/ch for global help"};
		this.configDefault.put("HelpChat", Arrays.asList(listOfStrings4Chat));
		
		String[] listOfStrings4Edit = {"Use //wand to acive the world editing tool", "'//' to active the super pickaxe", "/rg for use the region commands"};
		this.configDefault.put("HelpEdit", Arrays.asList(listOfStrings4Edit));
		
		String[] listOfStrings4Fun = {"unconfigured", "let's configure now !!!!"};
		this.configDefault.put("HelpFun", Arrays.asList(listOfStrings4Fun));
		
		String[] listOfStrings4Gen = {"Use /tgm to set your gamemode", "/tgm <PlayerName>", "'/tgm c' to set "};
		this.configDefault.put("HelpGen", Arrays.asList(listOfStrings4Gen));
		
		String[] listOfStrings4Info = {"/news to read news", "New Line"};
		this.configDefault.put("HelpInfo", Arrays.asList(listOfStrings4Info));
		
		String[] listOfStrings4Tp = {"/tp <NameofThePlayer>", "/tp <NameofThePlayer> <Yourname> for teleport a player to you"};
		this.configDefault.put("HelpTp", Arrays.asList(listOfStrings4Tp));
		
		String[] listOfStrings4Mech = {"/godwalk for walk in the air", "/stopgodwalk"};
		this.configDefault.put("HelpMech", Arrays.asList(listOfStrings4Mech));
		
		String[] listOfStrings4WGen = {"Let's", "Configure"};
		this.configDefault.put("HelpWGen", Arrays.asList(listOfStrings4WGen));
		
		String[] listOfStrings4Misc = {"/dynmap show", "/dynmap hide"};
		this.configDefault.put("HelpMisc", Arrays.asList(listOfStrings4Misc));
		
		String[] listOfStrings4CMD = {"essential", "or", "commandbook"};
		this.configDefault.put("HelpCmd", Arrays.asList(listOfStrings4CMD));
		
		this.configDefault.put("Language", "en");
		
		this.configDefault.put("HelpShop", "Place a chest and then read the following text.....Write: 1st line: nothing ; 2nd line lot ; 3rd line <buy price> ':' <Sell price> ; 4th line: Item name or Id");
		
		if(configFile.exists() == false){
			for(String key : this.configDefault.keySet()){
				this.config.set(key, configDefault.get(key));
			}
			try {
				this.config.save(configFile);
			} catch (IOException e) {
				e.printStackTrace();
			 }
		    }else{
		    	try {
					this.config.load(configFile);
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				} catch (InvalidConfigurationException e) {
					e.printStackTrace();
				}
		    }
			
	}

}
