package com.foxy.xycraft.handler;

import com.foxy.xycraft.block.XyBlocks;
import com.foxy.xycraft.block.machine.XyMachines;
import com.foxy.xycraft.item.XyItems;

import cofh.lib.util.helpers.ItemHelper;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class CraftingHandler {
	
	public static void postInit(){
		
		String[] blockR = new String[]{"XXX", "XXX", "XXX"};
		String[] brickR = new String[]{"XCX", "CCC", "XCX"};
		String[] structureR = new String[]{"XCX", "CCC", "XCX"};
		String[] plateR = new String[]{"XCX", "CVC", "XCX"};
		String[] shieldR = new String[]{"XCX", "CVC", "XCX"};
		String[] platformR = new String[]{"XCX", "CVC", "XCX"};
		
		String[] engineR = new String[]{"XCX", "CVC", "XCX"};
		
		GameRegistry reg = null;
		
		//Backwards - Xychorium/-idite
		
		reg.addShapelessRecipe(new ItemStack(XyItems.XychoriumBlue, 1), new Object[]{XyItems.XychoriditeBlue});
		reg.addShapelessRecipe(new ItemStack(XyItems.XychoriumGreen, 1), new Object[]{XyItems.XychoriditeGreen});
		reg.addShapelessRecipe(new ItemStack(XyItems.XychoriumRed, 1), new Object[]{XyItems.XychoriditeRed});
		reg.addShapelessRecipe(new ItemStack(XyItems.XychoriumDark, 1), new Object[]{XyItems.XychoriditeDark});
		reg.addShapelessRecipe(new ItemStack(XyItems.XychoriumLight, 1), new Object[]{XyItems.XychoriditeLight});
		
		//Blocks - Storage
		
		reg.addRecipe(new ItemStack(XyBlocks.XyBlockBlue, 1), new Object[]{blockR, 'X', XyItems.XychoriumBlue});
		reg.addRecipe(new ItemStack(XyBlocks.XyBlockGreen, 1), new Object[]{blockR, 'X', XyItems.XychoriumGreen});
		reg.addRecipe(new ItemStack(XyBlocks.XyBlockRed, 1), new Object[]{blockR, 'X', XyItems.XychoriumRed});
		reg.addRecipe(new ItemStack(XyBlocks.XyBlockDark, 1), new Object[]{blockR, 'X', XyItems.XychoriumDark});
		reg.addRecipe(new ItemStack(XyBlocks.XyBlockLight, 1), new Object[]{blockR, 'X', XyItems.XychoriumLight});
		
		reg.addShapelessRecipe(new ItemStack(XyItems.XychoriumBlue, 9), new Object[]{XyBlocks.XyBlockBlue});
		reg.addShapelessRecipe(new ItemStack(XyItems.XychoriumGreen, 9), new Object[]{XyBlocks.XyBlockGreen});
		reg.addShapelessRecipe(new ItemStack(XyItems.XychoriumRed, 9), new Object[]{XyBlocks.XyBlockRed});
		reg.addShapelessRecipe(new ItemStack(XyItems.XychoriumDark, 9), new Object[]{XyBlocks.XyBlockDark});
		reg.addShapelessRecipe(new ItemStack(XyItems.XychoriumLight, 9), new Object[]{XyBlocks.XyBlockLight});
		
		//Bricks
		
		reg.addRecipe(new ItemStack(XyBlocks.XyBrickBlue, 5), new Object[]{brickR, 'C', Blocks.stonebrick, 'X', XyItems.XychoriditeBlue});
		reg.addRecipe(new ItemStack(XyBlocks.XyBrickGreen, 5), new Object[]{brickR, 'C', Blocks.stonebrick, 'X', XyItems.XychoriditeGreen});
		reg.addRecipe(new ItemStack(XyBlocks.XyBrickRed, 5), new Object[]{brickR, 'C', Blocks.stonebrick, 'X', XyItems.XychoriditeRed});
		reg.addRecipe(new ItemStack(XyBlocks.XyBrickDark, 5), new Object[]{brickR, 'C', Blocks.stonebrick, 'X', XyItems.XychoriditeDark});
		reg.addRecipe(new ItemStack(XyBlocks.XyBrickLight, 5), new Object[]{brickR, 'C', Blocks.stonebrick, 'X', XyItems.XychoriditeLight});
		
		//Structures
		
		reg.addRecipe(new ItemStack(XyBlocks.XyStBlue, 5), new Object[]{structureR, 'C', Blocks.stone, 'X', XyItems.XychoriditeBlue});
		reg.addRecipe(new ItemStack(XyBlocks.XyStGreen, 5), new Object[]{structureR, 'C', Blocks.stone, 'X', XyItems.XychoriditeGreen});
		reg.addRecipe(new ItemStack(XyBlocks.XyStRed, 5), new Object[]{structureR, 'C', Blocks.stone, 'X', XyItems.XychoriditeRed});
		reg.addRecipe(new ItemStack(XyBlocks.XyStBlack, 5), new Object[]{structureR, 'C', Blocks.stone, 'X', XyItems.XychoriditeDark});
		reg.addRecipe(new ItemStack(XyBlocks.XyStWhite, 5), new Object[]{structureR, 'C', Blocks.stone, 'X', XyItems.XychoriditeLight});
		
		//Plates
		
		reg.addRecipe(new ItemStack(XyBlocks.XyPlateBlue, 5), new Object[]{plateR, 'C', Items.iron_ingot, 'V', Blocks.stone, 'X', XyItems.XychoriditeBlue});
		reg.addRecipe(new ItemStack(XyBlocks.XyPlateGreen, 5), new Object[]{plateR, 'C', Items.iron_ingot, 'V', Blocks.stone, 'X', XyItems.XychoriditeGreen});
		reg.addRecipe(new ItemStack(XyBlocks.XyPlateRed, 5), new Object[]{plateR, 'C', Items.iron_ingot, 'V', Blocks.stone, 'X', XyItems.XychoriditeRed});
		reg.addRecipe(new ItemStack(XyBlocks.XyPlateBlack, 5), new Object[]{plateR, 'C', Items.iron_ingot, 'V', Blocks.stone, 'X', XyItems.XychoriditeDark});
		reg.addRecipe(new ItemStack(XyBlocks.XyPlateWhite, 5), new Object[]{plateR, 'C', Items.iron_ingot, 'V', Blocks.stone, 'X', XyItems.XychoriditeLight});
		
		//Platforms
		
		reg.addRecipe(new ItemStack(XyBlocks.XyPlatformBlue, 5), new Object[]{platformR, 'C', Items.iron_ingot, 'V', Blocks.iron_block, 'X', XyItems.XychoriditeBlue});
		reg.addRecipe(new ItemStack(XyBlocks.XyPlatformGreen, 5), new Object[]{platformR, 'C', Items.iron_ingot, 'V', Blocks.iron_block, 'X', XyItems.XychoriditeGreen});
		reg.addRecipe(new ItemStack(XyBlocks.XyPlatformRed, 5), new Object[]{platformR, 'C', Items.iron_ingot, 'V', Blocks.iron_block, 'X', XyItems.XychoriditeRed});
		reg.addRecipe(new ItemStack(XyBlocks.XyPlatformBlack, 5), new Object[]{platformR, 'C', Items.iron_ingot, 'V', Blocks.iron_block, 'X', XyItems.XychoriditeDark});
		reg.addRecipe(new ItemStack(XyBlocks.XyPlatformWhite, 5), new Object[]{platformR, 'C', Items.iron_ingot, 'V', Blocks.iron_block, 'X', XyItems.XychoriditeLight});
		
		//Shields
		
		reg.addRecipe(new ItemStack(XyBlocks.XyShieldBlue, 5), new Object[]{shieldR, 'C', Items.iron_ingot, 'V', Blocks.obsidian, 'X', XyItems.XychoriditeBlue});
		reg.addRecipe(new ItemStack(XyBlocks.XyShieldGreen, 5), new Object[]{shieldR, 'C', Items.iron_ingot, 'V', Blocks.obsidian, 'X', XyItems.XychoriditeGreen});
		reg.addRecipe(new ItemStack(XyBlocks.XyShieldRed, 5), new Object[]{shieldR, 'C', Items.iron_ingot, 'V', Blocks.obsidian, 'X', XyItems.XychoriditeRed});
		reg.addRecipe(new ItemStack(XyBlocks.XyShieldBlack, 5), new Object[]{shieldR, 'C', Items.iron_ingot, 'V', Blocks.obsidian, 'X', XyItems.XychoriditeDark});
		reg.addRecipe(new ItemStack(XyBlocks.XyShieldWhite, 5), new Object[]{shieldR, 'C', Items.iron_ingot, 'V', Blocks.obsidian, 'X', XyItems.XychoriditeLight});
		
		//Engnineering Blocks
		
		reg.addRecipe(new ItemStack(XyMachines.EngineeringBlockBlue, 4), new Object[]{engineR, 'C', Blocks.stonebrick, 'V', Items.redstone, 'X', XyItems.XychoriditeBlue});
		reg.addRecipe(new ItemStack(XyMachines.EngineeringBlockGreen, 4), new Object[]{engineR, 'C', Blocks.stonebrick, 'V', Items.redstone, 'X', XyItems.XychoriditeGreen});
		reg.addRecipe(new ItemStack(XyMachines.EngineeringBlockRed, 4), new Object[]{engineR, 'C', Blocks.stonebrick, 'V', Items.redstone, 'X', XyItems.XychoriditeRed});
		reg.addRecipe(new ItemStack(XyMachines.EngineeringBlockDark, 4), new Object[]{engineR, 'C', Blocks.stonebrick, 'V', Items.redstone, 'X', XyItems.XychoriditeDark});
		reg.addRecipe(new ItemStack(XyMachines.EngineeringBlockLight, 4), new Object[]{engineR, 'C', Blocks.stonebrick, 'V', Items.redstone, 'X', XyItems.XychoriditeLight});
		
	}

}
