package com.foxy.xycraft.block;

import com.foxy.xycraft.XyCraft;
import com.foxy.xycraft.XyTabs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

public class XychoriumBlock extends XyBaseBlock {

	public XychoriumBlock(String blockName) {
		super(Material.iron);
		this.setBlockName(blockName);
		this.setCreativeTab(XyTabs.tabXBlocks);
		this.setHardness(1.5F);
		this.setStepSound(Block.soundTypeMetal);
	}
	
	@SideOnly(Side.CLIENT)
    private IIcon icon[];
	
	@Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
        icon = new IIcon[2];
        icon[0] = iconRegister.registerIcon(XyCraft.INSTANCE + ":" + "material/" + "XyBlock");
        icon[1] = iconRegister.registerIcon(XyCraft.INSTANCE + ":" + "fx/" + "XyGlowFX");
    }
	
	@Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta) {
        if (side < 6)
            return icon[0];
        else
            return icon[1];
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
