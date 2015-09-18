package com.foxy.xycraft;

import java.util.Random;

import com.foxy.xycraft.block.XyBlocks;
import com.foxy.xycraft.block.machine.XyMachines;
import com.foxy.xycraft.item.XyItems;

import cofh.lib.util.helpers.ItemHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class XyTabs {

	public static CreativeTabs tabXItems = new CreativeTabs("tabXItems"){
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			return XyItems.XychoriumBlue;
		}
	};
	
	public static CreativeTabs tabXBlocks = new CreativeTabs("tabXBlocks"){
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			return Item.getItemFromBlock(XyBlocks.XyBlockBlue);
		}
	};
	
	public static CreativeTabs tabXMachines = new CreativeTabs("tabXMachines"){
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			return Item.getItemFromBlock(XyMachines.EngineeringBlockBlue);
		}
	};

}