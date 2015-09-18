package com.foxy.xycraft.block.machine;

import com.foxy.xycraft.XyCraft;

import cofh.lib.util.helpers.ItemHelper;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class XyMachines {
	
	public static Block EngineeringBlockBlue;
	public static Block EngineeringBlockGreen;
	public static Block EngineeringBlockRed;
	public static Block EngineeringBlockDark;
	public static Block EngineeringBlockLight;
	
	public static Block GlassViewer;
	
	public static Block XychoriumWater;
	public static Block XychoriumSoil;
	public static Block XychoriumFire;
	public static Block XychoriumVoid;
	public static Block XychoriumIce;
	
	public static void preInit(){
		GameRegistry reg = null;
		ItemHelper ih = null;
		
		reg.registerBlock(EngineeringBlockBlue = (new EngineeringBlock("EngineeringBlockBlue")), "EngineeringBlockBlue");
		reg.registerBlock(EngineeringBlockGreen = (new EngineeringBlock("EngineeringBlockGreen")), "EngineeringBlockGreen");
		reg.registerBlock(EngineeringBlockRed = (new EngineeringBlock("EngineeringBlockRed")), "EngineeringBlockRed");
		reg.registerBlock(EngineeringBlockDark = (new EngineeringBlock("EngineeringBlockDark")), "EngineeringBlockDark");
		reg.registerBlock(EngineeringBlockLight = (new EngineeringBlock("EngineeringBlockLight")), "EngineeringBlockLight");
		
		reg.registerBlock(GlassViewer = (new GlassViewer("GlassViewer")), "GlassViewer");
		
		reg.registerBlock(XychoriumWater = (new XychoriumWater("XychoriumWater")), "XychoriumWater");
		reg.registerBlock(XychoriumSoil = (new XychoriumSoil("XychoriumSoil")), "XychoriumSoil");
		reg.registerBlock(XychoriumFire = (new XychoriumFire("XychoriumFire")), "XychoriumFire");
		reg.registerBlock(XychoriumVoid = (new XychoriumVoid("XychoriumVoid")), "XychoriumVoid");
		reg.registerBlock(XychoriumIce = (new XychoriumIce("XychoriumIce")), "XychoriumIce");
	}

}
