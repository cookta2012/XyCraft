package com.foxy.xycraft;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import com.foxy.xycraft.proxy.ClientProxy;
import com.foxy.xycraft.proxy.ServerProxy;
import com.foxy.xycraft.block.XyBlocks;
import com.foxy.xycraft.block.machine.XyMachines;
import com.foxy.xycraft.item.XyItems;
import com.foxy.xycraft.handler.CraftingHandler;
import com.foxy.xycraft.handler.SmeltingHandler;
import com.foxy.xycraft.world.XyWorldGen;

@Mod(modid=XyCraft.MODID, version=XyCraft.VERSION, dependencies=XyCraft.DEPENDENCIES)

public class XyCraft {
	
	public static int idCounter;

	public static final String MODID = "XyCraft";
	public static final String VERSION = "0.13.0";
	public static final String DEPENDENCIES = "after:Minecraft";
	public static final String INSTANCE = "xycraft";

	@Instance(value=XyCraft.INSTANCE)
	public static XyCraft instance;
	
	@SidedProxy(clientSide=XyCraft.CLIENTPROXY, serverSide=XyCraft.SERVERPROXY)
	public static ServerProxy proxy;
	
	public static final String CLIENTPROXY = "com.foxy.xycraft.proxy.ClientProxy";
	public static final String SERVERPROXY = "com.foxy.xycraft.proxy.ServerProxy";
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		XyBlocks.preInit();
		XyMachines.preInit();
		XyItems.preInit();
		XyWorldGen.preInit();
	}
	
	@EventHandler
	public void load(FMLInitializationEvent event) {
		ClientProxy.registerProxyThings();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		CraftingHandler.postInit();
		SmeltingHandler.postInit();
	}

}