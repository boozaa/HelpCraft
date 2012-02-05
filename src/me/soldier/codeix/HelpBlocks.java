package me.soldier.codeix;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class HelpBlocks implements Listener{
	public HelpBlocks(HelpCraft plugin){
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}
	
	@EventHandler
	public void onBlockp(BlockPlaceEvent e){
		Player p = e.getPlayer();
		Block b = e.getBlock();
		if(HelpCraft.helpshop == true){
			if(b.getType().equals(Material.CHEST)){
				p.sendMessage(ChatColor.GREEN+"place a sign on the top of the chest and read the /helpshop documentation");
				HelpCraft.helpshop = false;
			}
		}
	}
}
