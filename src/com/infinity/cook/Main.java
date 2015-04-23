package com.infinity.cook;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
	
	public static Main instance;
	
	public static Main getInstance(){
		return instance;
	}
	
	public void consoleBroadcast(String s){
		Bukkit.getServer().getLogger().info(s);
	}
	
	@Override
	public void onEnable(){
		consoleBroadcast("[InfiniteCooker] The plugin has been enabled.");
		instance = this;
	}
	
	@Override
	public void onDisable(){
		consoleBroadcast("[InfiniteCooker] The plugin has been disabled.");
		instance = null;
	}
	
	String ics = ChatColor.BLACK + "[ " + ChatColor.RED + "InfiniteCooker" + ChatColor.BLACK + " ]" + ChatColor.RESET + " ";
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
		
		if(!(sender instanceof Player)){
			sender.sendMessage(ics + ChatColor.RED + "You musta be a playa to use de \"cook\" commanda! You may fry your console!");
			return true;
		}
		
		if(cmd.getName().equalsIgnoreCase("cook")){
			Player p = (Player) sender;
			PlayerInventory inv = p.getInventory();
			if(p.hasPermission("IC.command")){
				Material type = p.getItemInHand().getType();
				int amount = p.getItemInHand().getAmount();
				ItemStack hand = inv.getItemInHand();
				if(type == Material.PORK){
					ItemStack Cooked_Porkchop = new ItemStack(Material.GRILLED_PORK, amount);
					inv.removeItem(new ItemStack[] {hand});
					inv.addItem(new ItemStack[] {Cooked_Porkchop});
					foodMessage(p);
					return true;
				}else if(type == Material.RAW_BEEF){
					ItemStack Steak = new ItemStack(Material.COOKED_BEEF, amount);
					inv.removeItem(new ItemStack[] {hand});
					inv.addItem(new ItemStack[] {Steak});
					foodMessage(p);
					return true;
				}else if(type == Material.RAW_CHICKEN){
					ItemStack Cooked_Chicken = new ItemStack(Material.COOKED_CHICKEN, amount);
					inv.removeItem(new ItemStack[] {hand});
					inv.addItem(new ItemStack[] {Cooked_Chicken});
					foodMessage(p);
					return true;
				}else if(type == Material.RAW_FISH){
					ItemStack Cooked_Fish = new ItemStack(Material.COOKED_FISH, amount);
					inv.removeItem(new ItemStack[] {hand});
					inv.addItem(new ItemStack[] {Cooked_Fish});
					foodMessage(p);
					return true;
				}else if(type == Material.POTATO){
					ItemStack Baked_Potato = new ItemStack(Material.BAKED_POTATO, amount);
					inv.removeItem(new ItemStack[] {hand});
					inv.addItem(new ItemStack[] {Baked_Potato});
					foodMessage(p);
					return true;
				}else if(type == Material.MUTTON){
					ItemStack Cooked_Mutton = new ItemStack(Material.COOKED_MUTTON, amount);
					inv.removeItem(new ItemStack[] {hand});
					inv.addItem(new ItemStack[] {Cooked_Mutton});
					foodMessage(p);
					return true;
				}else if(type == Material.RABBIT){
					ItemStack Cooked_Rabbit = new ItemStack(Material.COOKED_RABBIT, amount);
					inv.removeItem(new ItemStack[] {hand});
					inv.addItem(new ItemStack[] {Cooked_Rabbit});
					foodMessage(p);
					return true;
				}else if(type == Material.IRON_ORE){
					ItemStack Iron_Ingot = new ItemStack(Material.IRON_INGOT, amount);
					inv.removeItem(new ItemStack[] {hand});
					inv.addItem(new ItemStack[] {Iron_Ingot});
					oreMessage(p);
					return true;
				}else if(type == Material.GOLD_ORE){
					ItemStack Gold_Ingot = new ItemStack(Material.GOLD_INGOT, amount);
					inv.removeItem(new ItemStack[] {hand});
					inv.addItem(new ItemStack[] {Gold_Ingot});
					oreMessage(p);
					return true;
				}else if(type == Material.SAND){
					ItemStack Glass = new ItemStack(Material.GLASS, amount);
					inv.removeItem(new ItemStack[] {hand});
					inv.addItem(new ItemStack[] {Glass});
					materialMessage(p);
					return true;
				}else if(type == Material.COBBLESTONE){
					ItemStack Stone = new ItemStack(Material.STONE, amount);
					inv.removeItem(new ItemStack[] {hand});
					inv.addItem(new ItemStack[] {Stone});
					materialMessage(p);
					return true;
				}else if(type == Material.CLAY_BALL){
					ItemStack Brick = new ItemStack(Material.BRICK, amount);
					inv.removeItem(new ItemStack[] {hand});
					inv.addItem(new ItemStack[] {Brick});
					brickMessage(p);
					return true;
				}else if(type == Material.NETHERRACK){
					ItemStack Nether_Brick = new ItemStack(Material.NETHER_BRICK_ITEM, amount);
					inv.removeItem(new ItemStack[] {hand});
					inv.addItem(new ItemStack[] {Nether_Brick});
					brickMessage(p);
				}else if(type == Material.CLAY){
					ItemStack Hardened_Clay = new ItemStack(Material.HARD_CLAY, amount);
					inv.removeItem(new ItemStack[] {hand});
					inv.addItem(new ItemStack[] {Hardened_Clay});
					materialMessage(p);
					return true;
				}else if(type == Material.DIAMOND_ORE){
					ItemStack Diamond = new ItemStack(Material.DIAMOND, amount);
					inv.removeItem(new ItemStack[] {hand});
					inv.addItem(new ItemStack[] {Diamond});
					oreMessage(p);
					return true;
				}else if(type == Material.DIAMOND_ORE){
					ItemStack Diamond = new ItemStack(Material.DIAMOND, amount);
					inv.removeItem(new ItemStack[] {hand});
					inv.addItem(new ItemStack[] {Diamond});
					oreMessage(p);
					return true;
				}else if(type == Material.REDSTONE_ORE){
					ItemStack Redstone = new ItemStack(Material.REDSTONE, 4 * amount);
					inv.removeItem(new ItemStack[] {hand});
					inv.addItem(new ItemStack[] {Redstone});
					oreMessage(p);
					return true;
				}else if(type == Material.COAL_ORE){
					ItemStack Coal = new ItemStack(Material.COAL, amount);
					inv.removeItem(new ItemStack[] {hand});
					inv.addItem(new ItemStack[] {Coal});
					oreMessage(p);
					return true;
				}else if(type == Material.EMERALD_ORE){
					ItemStack Emerald = new ItemStack(Material.EMERALD, amount);
					inv.removeItem(new ItemStack[] {hand});
					inv.addItem(new ItemStack[] {Emerald});
					oreMessage(p);
					return true;
				}else if(type == Material.QUARTZ_ORE){
					ItemStack Quartz = new ItemStack(Material.QUARTZ, 3 * amount);
					inv.removeItem(new ItemStack[] {hand});
					inv.addItem(new ItemStack[] {Quartz});
					oreMessage(p);
					return true;
				}else if(type == Material.DIAMOND_ORE){
					ItemStack Diamond = new ItemStack(Material.DIAMOND, amount);
					inv.removeItem(new ItemStack[] {hand});
					inv.addItem(new ItemStack[] {Diamond});
					oreMessage(p);
					return true;
				}else{
					noCookMessage(p);
					return true;
				}
			}
		}
		
		return false;
	}
	
	public void foodMessage(Player p){
		p.sendMessage(ics + ChatColor.GREEN + "It has been cooked! Mmm, delicious!");
	}
	
	public void oreMessage(Player p){
		p.sendMessage(ics + ChatColor.GREEN + "It has been smelted! Make sure you give some loot to your favorite Italian cooker! No? I was expecting that -__-");
	}
	
	public void materialMessage(Player p){
		p.sendMessage(ics + ChatColor.GREEN + "It has been smelted! Build some beautiful structures for me with that, will you?");
	}
	
	public void brickMessage(Player p){
		p.sendMessage(ics + ChatColor.GREEN + "It has been smelted! Hit some people in the head with that brick, will you? I'm justa kidding. Cooks can have humor too! No, seriously!");
	}
	
	public void noCookMessage(Player p){
		p.sendMessage(ics + ChatColor.RED + "Mumumia! I can'ta cook dis!");
	}

}
