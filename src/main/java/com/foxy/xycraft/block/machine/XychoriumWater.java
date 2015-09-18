package com.foxy.xycraft.block.machine;

import com.foxy.xycraft.XyCraft;
import com.foxy.xycraft.XyTabs;
import com.foxy.xycraft.block.XyBaseBlock;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;
import net.minecraft.block.BlockBookshelf;

public class XychoriumWater extends XyBaseBlock {

	public XychoriumWater(String blockName) {
		super(Material.water);
		this.setBlockName(blockName);
		this.setStepSound(Block.soundTypeMetal);
		this.setCreativeTab(XyTabs.tabXMachines);
		this.setHardness(1.5F);
	}
	
	@SideOnly(Side.CLIENT)
    private IIcon icon[];
	
	@Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
        this.icon = new IIcon[3];
        this.icon[0] = iconRegister.registerIcon(XyCraft.INSTANCE + ":" + "machine/water/" + "XyWater_0");
        this.icon[1] = iconRegister.registerIcon(XyCraft.INSTANCE + ":" + "machine/water/" + "XyWater_1");
        this.icon[2] = iconRegister.registerIcon(XyCraft.INSTANCE + ":" + "fx/" + "XyGlowFX");
    }
	
	@Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta) {
		if (side < 6)
	      switch (side){
	        case 0: return icon[0];
	        case 1: return icon[0];
	        case 2: return icon[1];
	        case 3: return icon[1];
	        case 4: return icon[1];
	        case 5: return icon[1];
		  }
		else 
			return icon[2];
		
		return icon[side];
    }
	
	@Override
    public boolean canPlaceTorchOnTop(World world, int x, int y, int z) {
        return false;
    }
	
	@Override
    public boolean isSideSolid(IBlockAccess world, int x, int y, int z, ForgeDirection side) {
        return false;
    }

}
