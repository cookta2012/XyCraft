package com.foxy.xycraft.handler;

import com.foxy.xycraft.item.XyItems;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;

public class SmeltingHandler {
	
	public static void postInit(){
		GameRegistry reg = null;
		
		reg.addSmelting(XyItems.XychoriumBlue, new ItemStack(XyItems.XychoriditeBlue), 2);
		reg.addSmelting(XyItems.XychoriumGreen, new ItemStack(XyItems.XychoriditeGreen), 2);
		reg.addSmelting(XyItems.XychoriumRed, new ItemStack(XyItems.XychoriditeRed), 2);
		reg.addSmelting(XyItems.XychoriumDark, new ItemStack(XyItems.XychoriditeDark), 2);
		reg.addSmelting(XyItems.XychoriumLight, new ItemStack(XyItems.XychoriditeLight), 2);
		
		reg.addSmelting(XyItems.SeedCorn, new ItemStack(XyItems.PopCorn), 2);
		reg.addSmelting(XyItems.Corn, new ItemStack(XyItems.CobOCorn), 2);
	}

}
