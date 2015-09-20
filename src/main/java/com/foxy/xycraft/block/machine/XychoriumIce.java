package com.foxy.xycraft.block.machine;

import com.foxy.xycraft.XyCraft;
import com.foxy.xycraft.XyTabs;
import com.foxy.xycraft.block.XyBaseBlock;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

public class XychoriumIce extends XyBaseBlock {

	public XychoriumIce(String blockName) {
		super(Material.ice);
		this.setBlockName(blockName);
		this.setCreativeTab(XyTabs.tabXMachines);
		this.setHardness(1.5F);
		this.setStepSound(Block.soundTypeMetal);
	}
	
	@SideOnly(Side.CLIENT)
    private IIcon icon[];
	
	@Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
        this.icon = new IIcon[3];
        this.icon[0] = iconRegister.registerIcon(XyCraft.INSTANCE + ":" + "machine/ice/" + "XyIce_0");
        this.icon[1] = iconRegister.registerIcon(XyCraft.INSTANCE + ":" + "machine/ice/" + "XyIce_1");
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
	
	public void iceWater(World world, int x, int y, int z, ForgeDirection dir) {
		if (world.getBlock(x + dir.offsetX, y + dir.offsetY, z + dir.offsetZ).getMaterial() == Material.water) {
			world.setBlock(x + dir.offsetX, y + dir.offsetY, z + dir.offsetZ, Blocks.ice);
		}
	}
	
	@Override
	public void onBlockAdded(World world, int x, int y, int z) {
		for (ForgeDirection dir : ForgeDirection.VALID_DIRECTIONS) {
			iceWater(world, x, y, z, dir);
		}
	}

}
