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
		this.configDefault.put("HelpMoney", Arrays.asList(listOfStrings4money));		
		String[] listOfStrings4lwc = {"Use /cprivate to lock an object", "/cpassword to lock with a password", "/cremove to remove a protection", "/lwc for plugin global help"};
		this.configDefault.put("HelpLock", Arrays.asList(listOfStrings4lwc));
		String[] listOfStrings4BB = {"Use /bb stick 1 to active the stick", "/bb stick 2 to active the history log", "/bb stick 0 disactive any bb stick", "/bb for global plugin help"};
		this.configDefault.put("HelpBB", Arrays.asList(listOfStrings4BB));
		

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
