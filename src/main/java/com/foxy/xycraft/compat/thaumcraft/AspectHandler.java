package com.foxy.xycraft.compat.thaumcraft;

import com.foxy.xycraft.block.XyBlocks;
import com.foxy.xycraft.item.XyItems;

import net.minecraft.item.ItemStack;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;

public class AspectHandler {
	
	public static void registerAspects(){
		ThaumcraftApi api = null;
		api.registerObjectTag(new ItemStack(XyItems.XychoriumBlue), new AspectList().add(Aspect.WATER, 1).add(Aspect.CRYSTAL, 2));
		api.registerObjectTag(new ItemStack(XyItems.XychoriumGreen), new AspectList().add(Aspect.PLANT, 1).add(Aspect.CRYSTAL, 2));
		api.registerObjectTag(new ItemStack(XyItems.XychoriumRed), new AspectList().add(Aspect.FIRE, 1).add(Aspect.CRYSTAL, 2));
		api.registerObjectTag(new ItemStack(XyItems.XychoriumDark), new AspectList().add(Aspect.VOID, 1).add(Aspect.CRYSTAL, 2));
		api.registerObjectTag(new ItemStack(XyItems.XychoriumLight), new AspectList().add(Aspect.COLD, 1).add(Aspect.CRYSTAL, 2));
		
		api.registerObjectTag(new ItemStack(XyItems.XychoriditeBlue), new AspectList().add(Aspect.WATER, 1).add(Aspect.METAL, 2).add(Aspect.CRYSTAL, 1));
		api.registerObjectTag(new ItemStack(XyItems.XychoriditeGreen), new AspectList().add(Aspect.PLANT, 1).add(Aspect.METAL, 2).add(Aspect.CRYSTAL, 1));
		api.registerObjectTag(new ItemStack(XyItems.XychoriditeRed), new AspectList().add(Aspect.FIRE, 1).add(Aspect.METAL, 2).add(Aspect.CRYSTAL, 1));
		api.registerObjectTag(new ItemStack(XyItems.XychoriditeDark), new AspectList().add(Aspect.VOID, 1).add(Aspect.METAL, 2).add(Aspect.CRYSTAL, 1));
		api.registerObjectTag(new ItemStack(XyItems.XychoriditeLight), new AspectList().add(Aspect.COLD, 1).add(Aspect.METAL, 2).add(Aspect.CRYSTAL, 1));
		
		api.registerObjectTag(new ItemStack(XyItems.SeedCorn), new AspectList().add(Aspect.LIFE, 1).add(Aspect.PLANT, 2));
		api.registerObjectTag(new ItemStack(XyItems.Corn), new AspectList().add(Aspect.LIFE, 1).add(Aspect.HEAL, 2));
		api.registerObjectTag(new ItemStack(XyItems.CobOCorn), new AspectList().add(Aspect.HEAL, 1).add(Aspect.HUNGER, 2));
		api.registerObjectTag(new ItemStack(XyItems.PopCorn), new AspectList().add(Aspect.HEAL, 3).add(Aspect.HUNGER, 2));
		
		api.registerObjectTag(new ItemStack(XyBlocks.XyBlockBlue), new AspectList().add(Aspect.WATER, 2).add(Aspect.CRYSTAL, 4));
		api.registerObjectTag(new ItemStack(XyBlocks.XyBlockGreen), new AspectList().add(Aspect.PLANT, 2).add(Aspect.CRYSTAL, 4));
		api.registerObjectTag(new ItemStack(XyBlocks.XyBlockRed), new AspectList().add(Aspect.FIRE, 2).add(Aspect.CRYSTAL, 4));
		api.registerObjectTag(new ItemStack(XyBlocks.XyBlockDark), new AspectList().add(Aspect.VOID, 2).add(Aspect.CRYSTAL, 4));
		api.registerObjectTag(new ItemStack(XyBlocks.XyBlockLight), new AspectList().add(Aspect.COLD, 2).add(Aspect.CRYSTAL, 4));
	}

}