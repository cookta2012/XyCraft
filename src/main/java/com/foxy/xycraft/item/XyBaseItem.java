package com.foxy.xycraft.item;

import com.foxy.xycraft.XyTabs;

import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;;

public class XyBaseItem extends Item {
	
	public XyBaseItem(String modid, String itemName, String subFolder){
		this.setUnlocalizedName(itemName);
		this.setTextureName(modid + ":" + subFolder + "/" + itemName);
		this.setCreativeTab(XyTabs.tabXItems);
	}
	
	public XyBaseItem(String modid, String itemName){
		this.setUnlocalizedName(itemName);
		this.setTextureName(modid + ":" + "/" + itemName);
		this.setCreativeTab(XyTabs.tabXItems);
	}

}
