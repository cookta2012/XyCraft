package com.foxy.xycraft.util;

import com.foxy.xycraft.item.XyItems;

import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;

public class ForgeHooks {
	
	public static void preInit(){
		
	}
	
	public static void init(){
		
	}
	
	public static void postInit(){
		MinecraftForge.addGrassSeed(new ItemStack(XyItems.SeedCorn), 8);
	}

}