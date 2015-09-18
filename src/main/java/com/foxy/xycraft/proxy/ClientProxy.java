package com.foxy.xycraft.proxy;

import com.foxy.xycraft.XyCraft;
import com.foxy.xycraft.block.XyBlocks;
import com.foxy.xycraft.render.RenderRegistry;
import com.foxy.xycraft.render.RenderXy;
import com.foxy.xycraft.util.BlockCounter;
import com.foxy.xycraft.util.RGBColor;

import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends ServerProxy {
	
	public static void registerProxyThings(){
		
		RenderRegistry.renderingRegistry();
		
	}

}
