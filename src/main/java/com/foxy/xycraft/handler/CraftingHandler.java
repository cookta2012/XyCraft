package com.foxy.xycraft.handler;

import com.foxy.xycraft.block.XyBlocks;
import com.foxy.xycraft.block.machine.XyMachines;
import com.foxy.xycraft.item.XyItems;
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
		
		String[] lampR = new String[]{" X ", "XCX", " X "};
		
		GameRegistry reg = null;
		
		//Backwards - Xychorium/-idite
		
		reg.addShapelessRecipe(new ItemStack(XyItems.SeedCorn, 1), new Object[]{XyItems.Corn});
		
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
		
		reg.addShapelessRecipe(new ItemStack(XyBlocks.XyStBlack, 1), new Object[]{XyBlocks.XyStWhite, new ItemStack(Items.dye, 1, 0)});
		reg.addShapelessRecipe(new ItemStack(XyBlocks.XyStRed, 1), new Object[]{XyBlocks.XyStWhite, new ItemStack(Items.dye, 1, 1)});
		reg.addShapelessRecipe(new ItemStack(XyBlocks.XyStGreen, 1), new Object[]{XyBlocks.XyStWhite, new ItemStack(Items.dye, 1, 2)});
		reg.addShapelessRecipe(new ItemStack(XyBlocks.XyStBrown, 1), new Object[]{XyBlocks.XyStWhite, new ItemStack(Items.dye, 1, 3)});
		reg.addShapelessRecipe(new ItemStack(XyBlocks.XyStBlue, 1), new Object[]{XyBlocks.XyStWhite, new ItemStack(Items.dye, 1, 0)});
		reg.addShapelessRecipe(new ItemStack(XyBlocks.XyStPurple, 1), new Object[]{XyBlocks.XyStWhite, new ItemStack(Items.dye, 1, 5)});
		reg.addShapelessRecipe(new ItemStack(XyBlocks.XyStCyan, 1), new Object[]{XyBlocks.XyStWhite, new ItemStack(Items.dye, 1, 6)});
		reg.addShapelessRecipe(new ItemStack(XyBlocks.XyStLightGray, 1), new Object[]{XyBlocks.XyStWhite, new ItemStack(Items.dye, 1, 7)});
		reg.addShapelessRecipe(new ItemStack(XyBlocks.XyStGray, 1), new Object[]{XyBlocks.XyStWhite, new ItemStack(Items.dye, 1, 8)});
		reg.addShapelessRecipe(new ItemStack(XyBlocks.XyStPink, 1), new Object[]{XyBlocks.XyStWhite, new ItemStack(Items.dye, 1, 9)});
		reg.addShapelessRecipe(new ItemStack(XyBlocks.XyStLime, 1), new Object[]{XyBlocks.XyStWhite, new ItemStack(Items.dye, 1, 10)});
		reg.addShapelessRecipe(new ItemStack(XyBlocks.XyStYellow, 1), new Object[]{XyBlocks.XyStWhite, new ItemStack(Items.dye, 1, 11)});
		reg.addShapelessRecipe(new ItemStack(XyBlocks.XyStLightBlue, 1), new Object[]{XyBlocks.XyStWhite, new ItemStack(Items.dye, 1, 12)});
		reg.addShapelessRecipe(new ItemStack(XyBlocks.XyStMagenta, 1), new Object[]{XyBlocks.XyStWhite, new ItemStack(Items.dye, 1, 13)});
		reg.addShapelessRecipe(new ItemStack(XyBlocks.XyStOrange, 1), new Object[]{XyBlocks.XyStWhite, new ItemStack(Items.dye, 1, 14)});
		
		//Plates
		
		reg.addRecipe(new ItemStack(XyBlocks.XyPlateBlue, 5), new Object[]{plateR, 'C', Items.iron_ingot, 'V', Blocks.stone, 'X', XyItems.XychoriditeBlue});
		reg.addRecipe(new ItemStack(XyBlocks.XyPlateGreen, 5), new Object[]{plateR, 'C', Items.iron_ingot, 'V', Blocks.stone, 'X', XyItems.XychoriditeGreen});
		reg.addRecipe(new ItemStack(XyBlocks.XyPlateRed, 5), new Object[]{plateR, 'C', Items.iron_ingot, 'V', Blocks.stone, 'X', XyItems.XychoriditeRed});
		reg.addRecipe(new ItemStack(XyBlocks.XyPlateBlack, 5), new Object[]{plateR, 'C', Items.iron_ingot, 'V', Blocks.stone, 'X', XyItems.XychoriditeDark});
		reg.addRecipe(new ItemStack(XyBlocks.XyPlateWhite, 5), new Object[]{plateR, 'C', Items.iron_ingot, 'V', Blocks.stone, 'X', XyItems.XychoriditeLight});
		
		reg.addShapelessRecipe(new ItemStack(XyBlocks.XyPlateBlack, 1), new Object[]{XyBlocks.XyPlateWhite, new ItemStack(Items.dye, 1, 0)});
		reg.addShapelessRecipe(new ItemStack(XyBlocks.XyPlateRed, 1), new Object[]{XyBlocks.XyPlateWhite, new ItemStack(Items.dye, 1, 1)});
		reg.addShapelessRecipe(new ItemStack(XyBlocks.XyPlateGreen, 1), new Object[]{XyBlocks.XyPlateWhite, new ItemStack(Items.dye, 1, 2)});
		reg.addShapelessRecipe(new ItemStack(XyBlocks.XyPlateBrown, 1), new Object[]{XyBlocks.XyPlateWhite, new ItemStack(Items.dye, 1, 3)});
		reg.addShapelessRecipe(new ItemStack(XyBlocks.XyPlateBlue, 1), new Object[]{XyBlocks.XyPlateWhite, new ItemStack(Items.dye, 1, 0)});
		reg.addShapelessRecipe(new ItemStack(XyBlocks.XyPlatePurple, 1), new Object[]{XyBlocks.XyPlateWhite, new ItemStack(Items.dye, 1, 5)});
		reg.addShapelessRecipe(new ItemStack(XyBlocks.XyPlateCyan, 1), new Object[]{XyBlocks.XyPlateWhite, new ItemStack(Items.dye, 1, 6)});
		reg.addShapelessRecipe(new ItemStack(XyBlocks.XyPlateLightGray, 1), new Object[]{XyBlocks.XyPlateWhite, new ItemStack(Items.dye, 1, 7)});
		reg.addShapelessRecipe(new ItemStack(XyBlocks.XyPlateGray, 1), new Object[]{XyBlocks.XyPlateWhite, new ItemStack(Items.dye, 1, 8)});
		reg.addShapelessRecipe(new ItemStack(XyBlocks.XyPlatePink, 1), new Object[]{XyBlocks.XyPlateWhite, new ItemStack(Items.dye, 1, 9)});
		reg.addShapelessRecipe(new ItemStack(XyBlocks.XyPlateLime, 1), new Object[]{XyBlocks.XyPlateWhite, new ItemStack(Items.dye, 1, 10)});
		reg.addShapelessRecipe(new ItemStack(XyBlocks.XyPlateYellow, 1), new Object[]{XyBlocks.XyPlateWhite, new ItemStack(Items.dye, 1, 11)});
		reg.addShapelessRecipe(new ItemStack(XyBlocks.XyPlateLightBlue, 1), new Object[]{XyBlocks.XyPlateWhite, new ItemStack(Items.dye, 1, 12)});
		reg.addShapelessRecipe(new ItemStack(XyBlocks.XyPlateMagenta, 1), new Object[]{XyBlocks.XyPlateWhite, new ItemStack(Items.dye, 1, 13)});
		reg.addShapelessRecipe(new ItemStack(XyBlocks.XyPlateOrange, 1), new Object[]{XyBlocks.XyPlateWhite, new ItemStack(Items.dye, 1, 14)});
		
		//Platforms
		
		reg.addRecipe(new ItemStack(XyBlocks.XyPlatformBlue, 5), new Object[]{platformR, 'C', Items.iron_ingot, 'V', Blocks.iron_block, 'X', XyItems.XychoriditeBlue});
		reg.addRecipe(new ItemStack(XyBlocks.XyPlatformGreen, 5), new Object[]{platformR, 'C', Items.iron_ingot, 'V', Blocks.iron_block, 'X', XyItems.XychoriditeGreen});
		reg.addRecipe(new ItemStack(XyBlocks.XyPlatformRed, 5), new Object[]{platformR, 'C', Items.iron_ingot, 'V', Blocks.iron_block, 'X', XyItems.XychoriditeRed});
		reg.addRecipe(new ItemStack(XyBlocks.XyPlatformBlack, 5), new Object[]{platformR, 'C', Items.iron_ingot, 'V', Blocks.iron_block, 'X', XyItems.XychoriditeDark});
		reg.addRecipe(new ItemStack(XyBlocks.XyPlatformWhite, 5), new Object[]{platformR, 'C', Items.iron_ingot, 'V', Blocks.iron_block, 'X', XyItems.XychoriditeLight});
		
		reg.addShapelessRecipe(new ItemStack(XyBlocks.XyPlatformBlack, 1), new Object[]{XyBlocks.XyPlatformWhite, new ItemStack(Items.dye, 1, 0)});
		reg.addShapelessRecipe(new ItemStack(XyBlocks.XyPlatformRed, 1), new Object[]{XyBlocks.XyPlatformWhite, new ItemStack(Items.dye, 1, 1)});
		reg.addShapelessRecipe(new ItemStack(XyBlocks.XyPlatformGreen, 1), new Object[]{XyBlocks.XyPlatformWhite, new ItemStack(Items.dye, 1, 2)});
		reg.addShapelessRecipe(new ItemStack(XyBlocks.XyPlatformBrown, 1), new Object[]{XyBlocks.XyPlatformWhite, new ItemStack(Items.dye, 1, 3)});
		reg.addShapelessRecipe(new ItemStack(XyBlocks.XyPlatformBlue, 1), new Object[]{XyBlocks.XyPlatformWhite, new ItemStack(Items.dye, 1, 0)});
		reg.addShapelessRecipe(new ItemStack(XyBlocks.XyPlatformPurple, 1), new Object[]{XyBlocks.XyPlatformWhite, new ItemStack(Items.dye, 1, 5)});
		reg.addShapelessRecipe(new ItemStack(XyBlocks.XyPlatformCyan, 1), new Object[]{XyBlocks.XyPlatformWhite, new ItemStack(Items.dye, 1, 6)});
		reg.addShapelessRecipe(new ItemStack(XyBlocks.XyPlatformLightGray, 1), new Object[]{XyBlocks.XyPlatformWhite, new ItemStack(Items.dye, 1, 7)});
		reg.addShapelessRecipe(new ItemStack(XyBlocks.XyPlatformGray, 1), new Object[]{XyBlocks.XyPlatformWhite, new ItemStack(Items.dye, 1, 8)});
		reg.addShapelessRecipe(new ItemStack(XyBlocks.XyPlatformPink, 1), new Object[]{XyBlocks.XyPlatformWhite, new ItemStack(Items.dye, 1, 9)});
		reg.addShapelessRecipe(new ItemStack(XyBlocks.XyPlatformLime, 1), new Object[]{XyBlocks.XyPlatformWhite, new ItemStack(Items.dye, 1, 10)});
		reg.addShapelessRecipe(new ItemStack(XyBlocks.XyPlatformYellow, 1), new Object[]{XyBlocks.XyPlatformWhite, new ItemStack(Items.dye, 1, 11)});
		reg.addShapelessRecipe(new ItemStack(XyBlocks.XyPlatformLightBlue, 1), new Object[]{XyBlocks.XyPlatformWhite, new ItemStack(Items.dye, 1, 12)});
		reg.addShapelessRecipe(new ItemStack(XyBlocks.XyPlatformMagenta, 1), new Object[]{XyBlocks.XyPlatformWhite, new ItemStack(Items.dye, 1, 13)});
		reg.addShapelessRecipe(new ItemStack(XyBlocks.XyPlatformOrange, 1), new Object[]{XyBlocks.XyPlatformWhite, new ItemStack(Items.dye, 1, 14)});
		
		//Shields
		
		reg.addRecipe(new ItemStack(XyBlocks.XyShieldBlue, 5), new Object[]{shieldR, 'C', Items.iron_ingot, 'V', Blocks.obsidian, 'X', XyItems.XychoriditeBlue});
		reg.addRecipe(new ItemStack(XyBlocks.XyShieldGreen, 5), new Object[]{shieldR, 'C', Items.iron_ingot, 'V', Blocks.obsidian, 'X', XyItems.XychoriditeGreen});
		reg.addRecipe(new ItemStack(XyBlocks.XyShieldRed, 5), new Object[]{shieldR, 'C', Items.iron_ingot, 'V', Blocks.obsidian, 'X', XyItems.XychoriditeRed});
		reg.addRecipe(new ItemStack(XyBlocks.XyShieldBlack, 5), new Object[]{shieldR, 'C', Items.iron_ingot, 'V', Blocks.obsidian, 'X', XyItems.XychoriditeDark});
		reg.addRecipe(new ItemStack(XyBlocks.XyShieldWhite, 5), new Object[]{shieldR, 'C', Items.iron_ingot, 'V', Blocks.obsidian, 'X', XyItems.XychoriditeLight});
		
		reg.addShapelessRecipe(new ItemStack(XyBlocks.XyShieldBlack, 1), new Object[]{XyBlocks.XyShieldWhite, new ItemStack(Items.dye, 1, 0)});
		reg.addShapelessRecipe(new ItemStack(XyBlocks.XyShieldRed, 1), new Object[]{XyBlocks.XyShieldWhite, new ItemStack(Items.dye, 1, 1)});
		reg.addShapelessRecipe(new ItemStack(XyBlocks.XyShieldGreen, 1), new Object[]{XyBlocks.XyShieldWhite, new ItemStack(Items.dye, 1, 2)});
		reg.addShapelessRecipe(new ItemStack(XyBlocks.XyShieldBrown, 1), new Object[]{XyBlocks.XyShieldWhite, new ItemStack(Items.dye, 1, 3)});
		reg.addShapelessRecipe(new ItemStack(XyBlocks.XyShieldBlue, 1), new Object[]{XyBlocks.XyShieldWhite, new ItemStack(Items.dye, 1, 0)});
		reg.addShapelessRecipe(new ItemStack(XyBlocks.XyShieldPurple, 1), new Object[]{XyBlocks.XyShieldWhite, new ItemStack(Items.dye, 1, 5)});
		reg.addShapelessRecipe(new ItemStack(XyBlocks.XyShieldCyan, 1), new Object[]{XyBlocks.XyShieldWhite, new ItemStack(Items.dye, 1, 6)});
		reg.addShapelessRecipe(new ItemStack(XyBlocks.XyShieldLightGray, 1), new Object[]{XyBlocks.XyShieldWhite, new ItemStack(Items.dye, 1, 7)});
		reg.addShapelessRecipe(new ItemStack(XyBlocks.XyShieldGray, 1), new Object[]{XyBlocks.XyShieldWhite, new ItemStack(Items.dye, 1, 8)});
		reg.addShapelessRecipe(new ItemStack(XyBlocks.XyShieldPink, 1), new Object[]{XyBlocks.XyShieldWhite, new ItemStack(Items.dye, 1, 9)});
		reg.addShapelessRecipe(new ItemStack(XyBlocks.XyShieldLime, 1), new Object[]{XyBlocks.XyShieldWhite, new ItemStack(Items.dye, 1, 10)});
		reg.addShapelessRecipe(new ItemStack(XyBlocks.XyShieldYellow, 1), new Object[]{XyBlocks.XyShieldWhite, new ItemStack(Items.dye, 1, 11)});
		reg.addShapelessRecipe(new ItemStack(XyBlocks.XyShieldLightBlue, 1), new Object[]{XyBlocks.XyShieldWhite, new ItemStack(Items.dye, 1, 12)});
		reg.addShapelessRecipe(new ItemStack(XyBlocks.XyShieldMagenta, 1), new Object[]{XyBlocks.XyShieldWhite, new ItemStack(Items.dye, 1, 13)});
		reg.addShapelessRecipe(new ItemStack(XyBlocks.XyShieldOrange, 1), new Object[]{XyBlocks.XyShieldWhite, new ItemStack(Items.dye, 1, 14)});
		
		//Engnineering Blocks
		
		reg.addRecipe(new ItemStack(XyMachines.EngineeringBlockBlue, 4), new Object[]{engineR, 'C', Blocks.stonebrick, 'V', Items.redstone, 'X', XyItems.XychoriditeBlue});
		reg.addRecipe(new ItemStack(XyMachines.EngineeringBlockGreen, 4), new Object[]{engineR, 'C', Blocks.stonebrick, 'V', Items.redstone, 'X', XyItems.XychoriditeGreen});
		reg.addRecipe(new ItemStack(XyMachines.EngineeringBlockRed, 4), new Object[]{engineR, 'C', Blocks.stonebrick, 'V', Items.redstone, 'X', XyItems.XychoriditeRed});
		reg.addRecipe(new ItemStack(XyMachines.EngineeringBlockDark, 4), new Object[]{engineR, 'C', Blocks.stonebrick, 'V', Items.redstone, 'X', XyItems.XychoriditeDark});
		reg.addRecipe(new ItemStack(XyMachines.EngineeringBlockLight, 4), new Object[]{engineR, 'C', Blocks.stonebrick, 'V', Items.redstone, 'X', XyItems.XychoriditeLight});
		
		//Misc
		reg.addRecipe(new ItemStack(XyMachines.GlassViewer, 2), new Object[]{" X ", "XCX", " X ", 'C', Blocks.glass, 'X', XyItems.XychoriditeDark});
		
		//Machines
		reg.addRecipe(new ItemStack(XyMachines.XychoriumWater, 2), new Object[]{" V ", "XCX", " X ", 'C', XyMachines.EngineeringBlockBlue, 'X', Items.iron_ingot, 'V', Items.water_bucket});
		reg.addRecipe(new ItemStack(XyMachines.XychoriumSoil, 2), new Object[]{" V ", "XCX", " V ", 'C', XyMachines.EngineeringBlockGreen, 'X', Items.iron_ingot, 'V', Blocks.sapling});
		reg.addRecipe(new ItemStack(XyMachines.XychoriumFire, 2), new Object[]{" V ", "XCX", " Y ", 'C', XyMachines.EngineeringBlockRed, 'X', Items.iron_ingot, 'V', Items.flint_and_steel, 'Y', Items.redstone});
		reg.addRecipe(new ItemStack(XyMachines.XychoriumVoid, 2), new Object[]{" V ", "XCX", " V ", 'C', XyMachines.EngineeringBlockDark, 'X', Items.iron_ingot, 'V', Items.bucket});
		reg.addRecipe(new ItemStack(XyMachines.XychoriumIce, 2), new Object[]{" V ", "XCX", " X ", 'C', XyMachines.EngineeringBlockLight, 'X', Items.snowball, 'V', Items.water_bucket});
		
		reg.addRecipe(new ItemStack(XyMachines.LampBlue, 2), new Object[]{lampR, 'C', Blocks.redstone_lamp, 'X', XyItems.XychoriditeBlue});
		reg.addRecipe(new ItemStack(XyMachines.LampGreen, 2), new Object[]{lampR, 'C', Blocks.redstone_lamp, 'X', XyItems.XychoriditeGreen});
		reg.addRecipe(new ItemStack(XyMachines.LampRed, 2), new Object[]{lampR, 'C', Blocks.redstone_lamp, 'X', XyItems.XychoriditeRed});
		reg.addRecipe(new ItemStack(XyMachines.LampBlack, 2), new Object[]{lampR, 'C', Blocks.redstone_lamp, 'X', XyItems.XychoriditeDark});
		reg.addRecipe(new ItemStack(XyMachines.LampWhite, 2), new Object[]{lampR, 'C', Blocks.redstone_lamp, 'X', XyItems.XychoriditeLight});
		
		reg.addShapelessRecipe(new ItemStack(XyMachines.LampBlack, 1), new Object[]{XyMachines.LampWhite, new ItemStack(Items.dye, 1, 0)});
		reg.addShapelessRecipe(new ItemStack(XyMachines.LampRed, 1), new Object[]{XyMachines.LampWhite, new ItemStack(Items.dye, 1, 1)});
		reg.addShapelessRecipe(new ItemStack(XyMachines.LampGreen, 1), new Object[]{XyMachines.LampWhite, new ItemStack(Items.dye, 1, 2)});
		reg.addShapelessRecipe(new ItemStack(XyMachines.LampBrown, 1), new Object[]{XyMachines.LampWhite, new ItemStack(Items.dye, 1, 3)});
		reg.addShapelessRecipe(new ItemStack(XyMachines.LampBlue, 1), new Object[]{XyMachines.LampWhite, new ItemStack(Items.dye, 1, 4)});
		reg.addShapelessRecipe(new ItemStack(XyMachines.LampPurple, 1), new Object[]{XyMachines.LampWhite, new ItemStack(Items.dye, 1, 5)});
		reg.addShapelessRecipe(new ItemStack(XyMachines.LampCyan, 1), new Object[]{XyMachines.LampWhite, new ItemStack(Items.dye, 1, 6)});
		reg.addShapelessRecipe(new ItemStack(XyMachines.LampLightGray, 1), new Object[]{XyMachines.LampWhite, new ItemStack(Items.dye, 1, 7)});
		reg.addShapelessRecipe(new ItemStack(XyMachines.LampGray, 1), new Object[]{XyMachines.LampWhite, new ItemStack(Items.dye, 1, 8)});
		reg.addShapelessRecipe(new ItemStack(XyMachines.LampPink, 1), new Object[]{XyMachines.LampWhite, new ItemStack(Items.dye, 1, 9)});
		reg.addShapelessRecipe(new ItemStack(XyMachines.LampLime, 1), new Object[]{XyMachines.LampWhite, new ItemStack(Items.dye, 1, 10)});
		reg.addShapelessRecipe(new ItemStack(XyMachines.LampYellow, 1), new Object[]{XyMachines.LampWhite, new ItemStack(Items.dye, 1, 11)});
		reg.addShapelessRecipe(new ItemStack(XyMachines.LampLightBlue, 1), new Object[]{XyMachines.LampWhite, new ItemStack(Items.dye, 1, 12)});
		reg.addShapelessRecipe(new ItemStack(XyMachines.LampMagenta, 1), new Object[]{XyMachines.LampWhite, new ItemStack(Items.dye, 1, 13)});
		reg.addShapelessRecipe(new ItemStack(XyMachines.LampOrange, 1), new Object[]{XyMachines.LampWhite, new ItemStack(Items.dye, 1, 14)});
	}

}
