package com.foxy.xycraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

import com.foxy.xycraft.XyCraft;
import com.foxy.xycraft.proxy.ClientProxy;
import com.foxy.xycraft.render.RenderRegistry;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class XyBaseBlock extends Block {
	
	public int idBlock;

    public XyBaseBlock(Material material) {
        super(material);
        idBlock = XyCraft.idCounter;
        XyCraft.idCounter++;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public boolean renderAsNormalBlock() {
        return false;
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public int getRenderType() {
        return RenderRegistry.renderID[idBlock];
    }

    @Override
    @SideOnly(Side.CLIENT)
    public boolean canRenderInPass(int pass) {
        RenderRegistry.renderPass[idBlock] = pass;
        return true;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public int getRenderBlockPass() {
        return 1;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public boolean isBlockNormalCube() {
        return true;
    }

    @Override
    public boolean canPlaceTorchOnTop(World world, int x, int y, int z) {
        return true;
    }

    @Override
    public boolean isSideSolid(IBlockAccess world, int x, int y, int z, ForgeDirection side) {
        return true;
    }

    @Override
    public boolean shouldCheckWeakPower(IBlockAccess world, int x, int y, int z, int side) {
        return true;
    }

}
