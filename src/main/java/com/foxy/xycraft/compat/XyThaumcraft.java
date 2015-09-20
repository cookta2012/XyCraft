package com.foxy.xycraft.compat;

import com.foxy.xycraft.compat.thaumcraft.AspectHandler;

public class XyThaumcraft {
	
	public static void onThaumcraftCall(){
		AspectHandler.registerAspects();
	}

}
