package com.foxy.xycraft.world;

import java.util.Random;

import com.foxy.xycraft.block.XyBlocks;

import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class XyWorldGen implements IWorldGenerator {
	
	public static void preInit(){
		registerWorldGen(new XyWorldGen(), 1);
	}
	
	public static void registerWorldGen(IWorldGenerator worldGenClass, int weightedProberblity){
		GameRegistry.registerWorldGenerator(worldGenClass, weightedProberblity);
	}
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch (world.provider.dimensionId) {
		case -1:
			generateNether(random, chunkX * 16, chunkZ * 16, world);
			break;
		case 0:
			generateSurface(random, chunkX * 16, chunkZ * 16, world);
			break;
		case 1:
			generateEnd(random, chunkX * 16, chunkZ * 16, world);
			break;
		default:
			;
		}
	}
	
	private void addOreWithMeta(Block block, int meta, Block blockSpawn, Random random, World world, int posX, int posZ, int minY, int maxY, int minVeinSize, int maxVeinSize, int spawnChance) {
		for (int i = 0; i < spawnChance; i++) {
			int defaultChunkSize = 16;
			
			int xPos = posX + random.nextInt(defaultChunkSize);
			int yPos = minY + random.nextInt(maxY - minY);
			int zPos = posZ + random.nextInt(defaultChunkSize);
			
			new WorldGenMinable(block, meta, (minVeinSize + random.nextInt(maxVeinSize - minVeinSize)), blockSpawn).generate(world, random, xPos, yPos, zPos);
		}
	}
	
	private void addOre(Block block, Block blockSpawn, Random random, World world, int posX, int posZ, int minY, int maxY, int minVeinSize, int maxVeinSize, int spawnChance) {
		for (int i = 0; i < spawnChance; i++) {
			int defaultChunkSize = 16;
			
			int xPos = posX + random.nextInt(defaultChunkSize);
			int yPos = minY + random.nextInt(maxY - minY);
			int zPos = posZ + random.nextInt(defaultChunkSize);
			
			new WorldGenMinable(block, (minVeinSize + random.nextInt(maxVeinSize - minVeinSize)), blockSpawn).generate(world, random, xPos, yPos, zPos);
		}
	}
	
	private void generateEnd(Random random, int chunkX, int chunkZ, World world) {

	}

	private void generateSurface(Random random, int chunkX, int chunkZ, World world) {
		addOre(XyBlocks.XyOreBlue, Blocks.stone, random, world, chunkX, chunkZ, 20, 60, 10, 20, 20);
		addOre(XyBlocks.XyOreGreen, Blocks.stone, random, world, chunkX, chunkZ, 20, 60, 10, 20, 20);
		addOre(XyBlocks.XyOreRed, Blocks.stone, random, world, chunkX, chunkZ, 20, 60, 10, 20, 20);
		addOre(XyBlocks.XyOreDark, Blocks.stone, random, world, chunkX, chunkZ, 20, 60, 10, 20, 20);
		addOre(XyBlocks.XyOreLight, Blocks.stone, random, world, chunkX, chunkZ, 20, 60, 10, 20, 20);
	}

	private void generateNether(Random random, int chunkX, int chunkZ, World world) {
		
	}

}