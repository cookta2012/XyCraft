package com.foxy.xycraft.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cofh.core.item.ItemBase;
import cofh.lib.util.helpers.ItemHelper;
import cpw.mods.fml.common.registry.GameRegistry;

import com.foxy.xycraft.XyCraft;
import com.foxy.xycraft.XyTabs;

public class XyItems {

	public static Item XychoriumBlue;
	public static Item XychoriumGreen;
	public static Item XychoriumRed;
	public static Item XychoriumDark;
	public static Item XychoriumLight;
	
	public static Item XychoriditeBlue;
	public static Item XychoriditeGreen;
	public static Item XychoriditeRed;
	public static Item XychoriditeDark;
	public static Item XychoriditeLight;
	
	public static Item SeedCorn;
	public static Item Corn;
	public static Item CobOCorn;
	public static Item PopCorn;
	
	public static void preInit(){
		GameRegistry reg = null;
		
		reg.registerItem(XychoriumBlue = (new XyBaseItem(XyCraft.INSTANCE, "XychoriumBlue", "material")), "XychoriumBlue");
		reg.registerItem(XychoriumGreen = (new XyBaseItem(XyCraft.INSTANCE, "XychoriumGreen", "material")), "XychoriumGreen");
		reg.registerItem(XychoriumRed = (new XyBaseItem(XyCraft.INSTANCE, "XychoriumRed", "material")), "XychoriumRed");
		reg.registerItem(XychoriumDark = (new XyBaseItem(XyCraft.INSTANCE, "XychoriumDark", "material")), "XychoriumDark");
		reg.registerItem(XychoriumLight = (new XyBaseItem(XyCraft.INSTANCE, "XychoriumLight", "material")), "XychoriumLight");
		
		reg.registerItem(XychoriditeBlue = (new XyBaseItem(XyCraft.INSTANCE, "XychoriditeBlue", "material")), "XychoriditeBlue");
		reg.registerItem(XychoriditeGreen = (new XyBaseItem(XyCraft.INSTANCE, "XychoriditeGreen", "material")), "XychoriditeGreen");
		reg.registerItem(XychoriditeRed = (new XyBaseItem(XyCraft.INSTANCE, "XychoriditeRed", "material")), "XychoriditeRed");
		reg.registerItem(XychoriditeDark = (new XyBaseItem(XyCraft.INSTANCE, "XychoriditeDark", "material")), "XychoriditeDark");
		reg.registerItem(XychoriditeLight = (new XyBaseItem(XyCraft.INSTANCE, "XychoriditeLight", "material")), "XychoriditeLight");
	}

}