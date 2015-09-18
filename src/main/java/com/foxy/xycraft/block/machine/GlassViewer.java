package com.foxy.xycraft.block.machine;

import com.foxy.xycraft.XyCraft;
import com.foxy.xycraft.XyTabs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockGlass;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.block.BlockGlass;

public class GlassViewer extends Block {

	public GlassViewer(String blockName) {
		super(Material.glass);
		this.setBlockName(blockName);
		this.setCreativeTab(XyTabs.tabXMachines);
		this.setHardness(1.0F);
		this.setStepSound(Block.soundTypeGlass);
	}
	
	@SideOnly(Side.CLIENT)
    private IIcon icon[];
	
	@Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
        icon = new IIcon[1];
        icon[0] = iconRegister.registerIcon(XyCraft.INSTANCE + ":" + "machine/" + "GlassViewer");
    }
	
	@Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta) {
        if (side < 6)
            return icon[0];
        else 
        	return icon[0];
    }
	
    public int getRenderBlockPass()
    {
        return 1;
    }
    
    public boolean renderAsNormalBlock()
    {
        return false;
    }

}
