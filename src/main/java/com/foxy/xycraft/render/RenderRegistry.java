package com.foxy.xycraft.render;

import com.foxy.xycraft.XyCraft;
import com.foxy.xycraft.util.BlockCounter;
import com.foxy.xycraft.util.RGBColor;

import cpw.mods.fml.client.registry.RenderingRegistry;

public class RenderRegistry {
	
	public static int renderID[] = new int[BlockCounter.countBlocks];
	public static int renderPass[] = new int [BlockCounter.countBlocks];
	
	public static void renderingRegistry(){
		
		XyCraft.idCounter = 0;
		
		//Ores
		
				renderID[XyCraft.idCounter] = RenderingRegistry.getNextAvailableRenderId();
		        RenderingRegistry.registerBlockHandler(new RenderXy(renderID[XyCraft.idCounter],
		                RGBColor.brightnessBright, RGBColor.colorBlueR, RGBColor.colorBlueG, RGBColor.colorBlueB));

		        renderID[XyCraft.idCounter] = RenderingRegistry.getNextAvailableRenderId();
		        RenderingRegistry.registerBlockHandler(new RenderXy(renderID[XyCraft.idCounter],
		                RGBColor.brightnessBright, RGBColor.colorGreenR, RGBColor.colorGreenG, RGBColor.colorGreenB));
		        
		        renderID[XyCraft.idCounter] = RenderingRegistry.getNextAvailableRenderId();
		        RenderingRegistry.registerBlockHandler(new RenderXy(renderID[XyCraft.idCounter],
		                RGBColor.brightnessBright, RGBColor.colorRedR, RGBColor.colorRedG, RGBColor.colorRedB));

		        renderID[XyCraft.idCounter] = RenderingRegistry.getNextAvailableRenderId();
		        RenderingRegistry.registerBlockHandler(new RenderXy(renderID[XyCraft.idCounter],
		                RGBColor.brightnessBright, RGBColor.colorBlackR, RGBColor.colorBlackG, RGBColor.colorBlackB));
		        
		        renderID[XyCraft.idCounter] = RenderingRegistry.getNextAvailableRenderId();
		        RenderingRegistry.registerBlockHandler(new RenderXy(renderID[XyCraft.idCounter],
		                RGBColor.brightnessBright, RGBColor.colorWhiteR, RGBColor.colorWhiteG, RGBColor.colorWhiteB));
		        
		        //Blocks
		        
		        renderID[XyCraft.idCounter] = RenderingRegistry.getNextAvailableRenderId();
		        RenderingRegistry.registerBlockHandler(new RenderXy(renderID[XyCraft.idCounter],
		                RGBColor.brightnessBright, RGBColor.colorBlueR, RGBColor.colorBlueG, RGBColor.colorBlueB));
		        
		        renderID[XyCraft.idCounter] = RenderingRegistry.getNextAvailableRenderId();
		        RenderingRegistry.registerBlockHandler(new RenderXy(renderID[XyCraft.idCounter],
		                RGBColor.brightnessBright, RGBColor.colorGreenR, RGBColor.colorGreenG, RGBColor.colorGreenB));
		        
		        renderID[XyCraft.idCounter] = RenderingRegistry.getNextAvailableRenderId();
		        RenderingRegistry.registerBlockHandler(new RenderXy(renderID[XyCraft.idCounter],
		                RGBColor.brightnessBright, RGBColor.colorRedR, RGBColor.colorRedG, RGBColor.colorRedB));

		        renderID[XyCraft.idCounter] = RenderingRegistry.getNextAvailableRenderId();
		        RenderingRegistry.registerBlockHandler(new RenderXy(renderID[XyCraft.idCounter],
		                RGBColor.brightnessBright, RGBColor.colorBlackR, RGBColor.colorBlackG, RGBColor.colorBlackB));
		        
		        renderID[XyCraft.idCounter] = RenderingRegistry.getNextAvailableRenderId();
		        RenderingRegistry.registerBlockHandler(new RenderXy(renderID[XyCraft.idCounter],
		                RGBColor.brightnessBright, RGBColor.colorWhiteR, RGBColor.colorWhiteG, RGBColor.colorWhiteB));
		        
		        //Bricks
		        
		        renderID[XyCraft.idCounter] = RenderingRegistry.getNextAvailableRenderId();
		        RenderingRegistry.registerBlockHandler(new RenderXy(renderID[XyCraft.idCounter],
		                RGBColor.brightnessBright, RGBColor.colorBlueR, RGBColor.colorBlueG, RGBColor.colorBlueB));
		        
		        renderID[XyCraft.idCounter] = RenderingRegistry.getNextAvailableRenderId();
		        RenderingRegistry.registerBlockHandler(new RenderXy(renderID[XyCraft.idCounter],
		                RGBColor.brightnessBright, RGBColor.colorGreenR, RGBColor.colorGreenG, RGBColor.colorGreenB));
		        
		        renderID[XyCraft.idCounter] = RenderingRegistry.getNextAvailableRenderId();
		        RenderingRegistry.registerBlockHandler(new RenderXy(renderID[XyCraft.idCounter],
		                RGBColor.brightnessBright, RGBColor.colorRedR, RGBColor.colorRedG, RGBColor.colorRedB));

		        renderID[XyCraft.idCounter] = RenderingRegistry.getNextAvailableRenderId();
		        RenderingRegistry.registerBlockHandler(new RenderXy(renderID[XyCraft.idCounter],
		                RGBColor.brightnessBright, RGBColor.colorBlackR, RGBColor.colorBlackG, RGBColor.colorBlackB));
		        
		        renderID[XyCraft.idCounter] = RenderingRegistry.getNextAvailableRenderId();
		        RenderingRegistry.registerBlockHandler(new RenderXy(renderID[XyCraft.idCounter],
		                RGBColor.brightnessBright, RGBColor.colorWhiteR, RGBColor.colorWhiteG, RGBColor.colorWhiteB));
		        
		        //Structures
		        
		        renderID[XyCraft.idCounter] = RenderingRegistry.getNextAvailableRenderId();
		        RenderingRegistry.registerBlockHandler(new RenderXy(renderID[XyCraft.idCounter],
		                RGBColor.brightnessBright, RGBColor.colorBlackR, RGBColor.colorBlackG, RGBColor.colorBlackB));
		        
		        renderID[XyCraft.idCounter] = RenderingRegistry.getNextAvailableRenderId();
		        RenderingRegistry.registerBlockHandler(new RenderXy(renderID[XyCraft.idCounter],
		                RGBColor.brightnessBright, RGBColor.colorRedR, RGBColor.colorRedG, RGBColor.colorRedB));
		        
		        renderID[XyCraft.idCounter] = RenderingRegistry.getNextAvailableRenderId();
		        RenderingRegistry.registerBlockHandler(new RenderXy(renderID[XyCraft.idCounter],
		                RGBColor.brightnessBright, RGBColor.colorGreenR, RGBColor.colorGreenG, RGBColor.colorGreenB));
		        
		        renderID[XyCraft.idCounter] = RenderingRegistry.getNextAvailableRenderId();
		        RenderingRegistry.registerBlockHandler(new RenderXy(renderID[XyCraft.idCounter],
		                RGBColor.brightnessBright, RGBColor.colorBrownR, RGBColor.colorBrownG, RGBColor.colorBrownB));
		        
		        renderID[XyCraft.idCounter] = RenderingRegistry.getNextAvailableRenderId();
		        RenderingRegistry.registerBlockHandler(new RenderXy(renderID[XyCraft.idCounter],
		                RGBColor.brightnessBright, RGBColor.colorBlueR, RGBColor.colorBlueG, RGBColor.colorBlueB));
		        
		        renderID[XyCraft.idCounter] = RenderingRegistry.getNextAvailableRenderId();
		        RenderingRegistry.registerBlockHandler(new RenderXy(renderID[XyCraft.idCounter],
		                RGBColor.brightnessBright, RGBColor.colorPurpleR, RGBColor.colorPurpleG, RGBColor.colorPurpleB));
		        
		        renderID[XyCraft.idCounter] = RenderingRegistry.getNextAvailableRenderId();
		        RenderingRegistry.registerBlockHandler(new RenderXy(renderID[XyCraft.idCounter],
		                RGBColor.brightnessBright, RGBColor.colorCyanR, RGBColor.colorCyanG, RGBColor.colorCyanB));
		        
		        renderID[XyCraft.idCounter] = RenderingRegistry.getNextAvailableRenderId();
		        RenderingRegistry.registerBlockHandler(new RenderXy(renderID[XyCraft.idCounter],
		                RGBColor.brightnessBright, RGBColor.colorLightGrayR, RGBColor.colorLightGrayG, RGBColor.colorLightGrayB));
		        
		        renderID[XyCraft.idCounter] = RenderingRegistry.getNextAvailableRenderId();
		        RenderingRegistry.registerBlockHandler(new RenderXy(renderID[XyCraft.idCounter],
		                RGBColor.brightnessBright, RGBColor.colorGrayR, RGBColor.colorGrayG, RGBColor.colorGrayB));
		        
		        renderID[XyCraft.idCounter] = RenderingRegistry.getNextAvailableRenderId();
		        RenderingRegistry.registerBlockHandler(new RenderXy(renderID[XyCraft.idCounter],
		                RGBColor.brightnessBright, RGBColor.colorPinkR, RGBColor.colorPinkG, RGBColor.colorPinkB));
		        
		        renderID[XyCraft.idCounter] = RenderingRegistry.getNextAvailableRenderId();
		        RenderingRegistry.registerBlockHandler(new RenderXy(renderID[XyCraft.idCounter],
		                RGBColor.brightnessBright, RGBColor.colorLimeR, RGBColor.colorLimeG, RGBColor.colorLimeB));
		        
		        renderID[XyCraft.idCounter] = RenderingRegistry.getNextAvailableRenderId();
		        RenderingRegistry.registerBlockHandler(new RenderXy(renderID[XyCraft.idCounter],
		                RGBColor.brightnessBright, RGBColor.colorYellowR, RGBColor.colorYellowG, RGBColor.colorYellowB));
		        
		        renderID[XyCraft.idCounter] = RenderingRegistry.getNextAvailableRenderId();
		        RenderingRegistry.registerBlockHandler(new RenderXy(renderID[XyCraft.idCounter],
		                RGBColor.brightnessBright, RGBColor.colorSkyBlueR, RGBColor.colorSkyBlueG, RGBColor.colorSkyBlueB));
		        
		        renderID[XyCraft.idCounter] = RenderingRegistry.getNextAvailableRenderId();
		        RenderingRegistry.registerBlockHandler(new RenderXy(renderID[XyCraft.idCounter],
		                RGBColor.brightnessBright, RGBColor.colorMagentaR, RGBColor.colorMagentaG, RGBColor.colorMagentaB));
		        
		        renderID[XyCraft.idCounter] = RenderingRegistry.getNextAvailableRenderId();
		        RenderingRegistry.registerBlockHandler(new RenderXy(renderID[XyCraft.idCounter],
		                RGBColor.brightnessBright, RGBColor.colorOrangeR, RGBColor.colorOrangeG, RGBColor.colorOrangeB));
		        
		        renderID[XyCraft.idCounter] = RenderingRegistry.getNextAvailableRenderId();
		        RenderingRegistry.registerBlockHandler(new RenderXy(renderID[XyCraft.idCounter],
		                RGBColor.brightnessBright, RGBColor.colorWhiteR, RGBColor.colorWhiteG, RGBColor.colorWhiteB));
		        
		        //Plates
		        
		        renderID[XyCraft.idCounter] = RenderingRegistry.getNextAvailableRenderId();
		        RenderingRegistry.registerBlockHandler(new RenderXy(renderID[XyCraft.idCounter],
		                RGBColor.brightnessBright, RGBColor.colorBlackR, RGBColor.colorBlackG, RGBColor.colorBlackB));
		        
		        renderID[XyCraft.idCounter] = RenderingRegistry.getNextAvailableRenderId();
		        RenderingRegistry.registerBlockHandler(new RenderXy(renderID[XyCraft.idCounter],
		                RGBColor.brightnessBright, RGBColor.colorRedR, RGBColor.colorRedG, RGBColor.colorRedB));
		        
		        renderID[XyCraft.idCounter] = RenderingRegistry.getNextAvailableRenderId();
		        RenderingRegistry.registerBlockHandler(new RenderXy(renderID[XyCraft.idCounter],
		                RGBColor.brightnessBright, RGBColor.colorGreenR, RGBColor.colorGreenG, RGBColor.colorGreenB));
		        
		        renderID[XyCraft.idCounter] = RenderingRegistry.getNextAvailableRenderId();
		        RenderingRegistry.registerBlockHandler(new RenderXy(renderID[XyCraft.idCounter],
		                RGBColor.brightnessBright, RGBColor.colorBrownR, RGBColor.colorBrownG, RGBColor.colorBrownB));
		        
		        renderID[XyCraft.idCounter] = RenderingRegistry.getNextAvailableRenderId();
		        RenderingRegistry.registerBlockHandler(new RenderXy(renderID[XyCraft.idCounter],
		                RGBColor.brightnessBright, RGBColor.colorBlueR, RGBColor.colorBlueG, RGBColor.colorBlueB));
		        
		        renderID[XyCraft.idCounter] = RenderingRegistry.getNextAvailableRenderId();
		        RenderingRegistry.registerBlockHandler(new RenderXy(renderID[XyCraft.idCounter],
		                RGBColor.brightnessBright, RGBColor.colorPurpleR, RGBColor.colorPurpleG, RGBColor.colorPurpleB));
		        
		        renderID[XyCraft.idCounter] = RenderingRegistry.getNextAvailableRenderId();
		        RenderingRegistry.registerBlockHandler(new RenderXy(renderID[XyCraft.idCounter],
		                RGBColor.brightnessBright, RGBColor.colorCyanR, RGBColor.colorCyanG, RGBColor.colorCyanB));
		        
		        renderID[XyCraft.idCounter] = RenderingRegistry.getNextAvailableRenderId();
		        RenderingRegistry.registerBlockHandler(new RenderXy(renderID[XyCraft.idCounter],
		                RGBColor.brightnessBright, RGBColor.colorLightGrayR, RGBColor.colorLightGrayG, RGBColor.colorLightGrayB));
		        
		        renderID[XyCraft.idCounter] = RenderingRegistry.getNextAvailableRenderId();
		        RenderingRegistry.registerBlockHandler(new RenderXy(renderID[XyCraft.idCounter],
		                RGBColor.brightnessBright, RGBColor.colorGrayR, RGBColor.colorGrayG, RGBColor.colorGrayB));
		        
		        renderID[XyCraft.idCounter] = RenderingRegistry.getNextAvailableRenderId();
		        RenderingRegistry.registerBlockHandler(new RenderXy(renderID[XyCraft.idCounter],
		                RGBColor.brightnessBright, RGBColor.colorPinkR, RGBColor.colorPinkG, RGBColor.colorPinkB));
		        
		        renderID[XyCraft.idCounter] = RenderingRegistry.getNextAvailableRenderId();
		        RenderingRegistry.registerBlockHandler(new RenderXy(renderID[XyCraft.idCounter],
		                RGBColor.brightnessBright, RGBColor.colorLimeR, RGBColor.colorLimeG, RGBColor.colorLimeB));
		        
		        renderID[XyCraft.idCounter] = RenderingRegistry.getNextAvailableRenderId();
		        RenderingRegistry.registerBlockHandler(new RenderXy(renderID[XyCraft.idCounter],
		                RGBColor.brightnessBright, RGBColor.colorYellowR, RGBColor.colorYellowG, RGBColor.colorYellowB));
		        
		        renderID[XyCraft.idCounter] = RenderingRegistry.getNextAvailableRenderId();
		        RenderingRegistry.registerBlockHandler(new RenderXy(renderID[XyCraft.idCounter],
		                RGBColor.brightnessBright, RGBColor.colorSkyBlueR, RGBColor.colorSkyBlueG, RGBColor.colorSkyBlueB));
		        
		        renderID[XyCraft.idCounter] = RenderingRegistry.getNextAvailableRenderId();
		        RenderingRegistry.registerBlockHandler(new RenderXy(renderID[XyCraft.idCounter],
		                RGBColor.brightnessBright, RGBColor.colorMagentaR, RGBColor.colorMagentaG, RGBColor.colorMagentaB));
		        
		        renderID[XyCraft.idCounter] = RenderingRegistry.getNextAvailableRenderId();
		        RenderingRegistry.registerBlockHandler(new RenderXy(renderID[XyCraft.idCounter],
		                RGBColor.brightnessBright, RGBColor.colorOrangeR, RGBColor.colorOrangeG, RGBColor.colorOrangeB));
		        
		        renderID[XyCraft.idCounter] = RenderingRegistry.getNextAvailableRenderId();
		        RenderingRegistry.registerBlockHandler(new RenderXy(renderID[XyCraft.idCounter],
		                RGBColor.brightnessBright, RGBColor.colorWhiteR, RGBColor.colorWhiteG, RGBColor.colorWhiteB));
		        
		        //Shield
		        
		        renderID[XyCraft.idCounter] = RenderingRegistry.getNextAvailableRenderId();
		        RenderingRegistry.registerBlockHandler(new RenderXy(renderID[XyCraft.idCounter],
		                RGBColor.brightnessBright, RGBColor.colorBlackR, RGBColor.colorBlackG, RGBColor.colorBlackB));
		        
		        renderID[XyCraft.idCounter] = RenderingRegistry.getNextAvailableRenderId();
		        RenderingRegistry.registerBlockHandler(new RenderXy(renderID[XyCraft.idCounter],
		                RGBColor.brightnessBright, RGBColor.colorRedR, RGBColor.colorRedG, RGBColor.colorRedB));
		        
		        renderID[XyCraft.idCounter] = RenderingRegistry.getNextAvailableRenderId();
		        RenderingRegistry.registerBlockHandler(new RenderXy(renderID[XyCraft.idCounter],
		                RGBColor.brightnessBright, RGBColor.colorGreenR, RGBColor.colorGreenG, RGBColor.colorGreenB));
		        
		        renderID[XyCraft.idCounter] = RenderingRegistry.getNextAvailableRenderId();
		        RenderingRegistry.registerBlockHandler(new RenderXy(renderID[XyCraft.idCounter],
		                RGBColor.brightnessBright, RGBColor.colorBrownR, RGBColor.colorBrownG, RGBColor.colorBrownB));
		        
		        renderID[XyCraft.idCounter] = RenderingRegistry.getNextAvailableRenderId();
		        RenderingRegistry.registerBlockHandler(new RenderXy(renderID[XyCraft.idCounter],
		                RGBColor.brightnessBright, RGBColor.colorBlueR, RGBColor.colorBlueG, RGBColor.colorBlueB));
		        
		        renderID[XyCraft.idCounter] = RenderingRegistry.getNextAvailableRenderId();
		        RenderingRegistry.registerBlockHandler(new RenderXy(renderID[XyCraft.idCounter],
		                RGBColor.brightnessBright, RGBColor.colorPurpleR, RGBColor.colorPurpleG, RGBColor.colorPurpleB));
		        
		        renderID[XyCraft.idCounter] = RenderingRegistry.getNextAvailableRenderId();
		        RenderingRegistry.registerBlockHandler(new RenderXy(renderID[XyCraft.idCounter],
		                RGBColor.brightnessBright, RGBColor.colorCyanR, RGBColor.colorCyanG, RGBColor.colorCyanB));
		        
		        renderID[XyCraft.idCounter] = RenderingRegistry.getNextAvailableRenderId();
		        RenderingRegistry.registerBlockHandler(new RenderXy(renderID[XyCraft.idCounter],
		                RGBColor.brightnessBright, RGBColor.colorLightGrayR, RGBColor.colorLightGrayG, RGBColor.colorLightGrayB));
		        
		        renderID[XyCraft.idCounter] = RenderingRegistry.getNextAvailableRenderId();
		        RenderingRegistry.registerBlockHandler(new RenderXy(renderID[XyCraft.idCounter],
		                RGBColor.brightnessBright, RGBColor.colorGrayR, RGBColor.colorGrayG, RGBColor.colorGrayB));
		        
		        renderID[XyCraft.idCounter] = RenderingRegistry.getNextAvailableRenderId();
		        RenderingRegistry.registerBlockHandler(new RenderXy(renderID[XyCraft.idCounter],
		                RGBColor.brightnessBright, RGBColor.colorPinkR, RGBColor.colorPinkG, RGBColor.colorPinkB));
		        
		        renderID[XyCraft.idCounter] = RenderingRegistry.getNextAvailableRenderId();
		        RenderingRegistry.registerBlockHandler(new RenderXy(renderID[XyCraft.idCounter],
		                RGBColor.brightnessBright, RGBColor.colorLimeR, RGBColor.colorLimeG, RGBColor.colorLimeB));
		        
		        renderID[XyCraft.idCounter] = RenderingRegistry.getNextAvailableRenderId();
		        RenderingRegistry.registerBlockHandler(new RenderXy(renderID[XyCraft.idCounter],
		                RGBColor.brightnessBright, RGBColor.colorYellowR, RGBColor.colorYellowG, RGBColor.colorYellowB));
		        
		        renderID[XyCraft.idCounter] = RenderingRegistry.getNextAvailableRenderId();
		        RenderingRegistry.registerBlockHandler(new RenderXy(renderID[XyCraft.idCounter],
		                RGBColor.brightnessBright, RGBColor.colorSkyBlueR, RGBColor.colorSkyBlueG, RGBColor.colorSkyBlueB));
		        
		        renderID[XyCraft.idCounter] = RenderingRegistry.getNextAvailableRenderId();
		        RenderingRegistry.registerBlockHandler(new RenderXy(renderID[XyCraft.idCounter],
		                RGBColor.brightnessBright, RGBColor.colorMagentaR, RGBColor.colorMagentaG, RGBColor.colorMagentaB));
		        
		        renderID[XyCraft.idCounter] = RenderingRegistry.getNextAvailableRenderId();
		        RenderingRegistry.registerBlockHandler(new RenderXy(renderID[XyCraft.idCounter],
		                RGBColor.brightnessBright, RGBColor.colorOrangeR, RGBColor.colorOrangeG, RGBColor.colorOrangeB));
		        
		        renderID[XyCraft.idCounter] = RenderingRegistry.getNextAvailableRenderId();
		        RenderingRegistry.registerBlockHandler(new RenderXy(renderID[XyCraft.idCounter],
		                RGBColor.brightnessBright, RGBColor.colorWhiteR, RGBColor.colorWhiteG, RGBColor.colorWhiteB));
		        
		        //Platforms
		        renderID[XyCraft.idCounter] = RenderingRegistry.getNextAvailableRenderId();
		        RenderingRegistry.registerBlockHandler(new RenderXy(renderID[XyCraft.idCounter],
		                RGBColor.brightnessBright, RGBColor.colorBlackR, RGBColor.colorBlackG, RGBColor.colorBlackB));
		        
		        renderID[XyCraft.idCounter] = RenderingRegistry.getNextAvailableRenderId();
		        RenderingRegistry.registerBlockHandler(new RenderXy(renderID[XyCraft.idCounter],
		                RGBColor.brightnessBright, RGBColor.colorRedR, RGBColor.colorRedG, RGBColor.colorRedB));
		        
		        renderID[XyCraft.idCounter] = RenderingRegistry.getNextAvailableRenderId();
		        RenderingRegistry.registerBlockHandler(new RenderXy(renderID[XyCraft.idCounter],
		                RGBColor.brightnessBright, RGBColor.colorGreenR, RGBColor.colorGreenG, RGBColor.colorGreenB));
		        
		        renderID[XyCraft.idCounter] = RenderingRegistry.getNextAvailableRenderId();
		        RenderingRegistry.registerBlockHandler(new RenderXy(renderID[XyCraft.idCounter],
		                RGBColor.brightnessBright, RGBColor.colorBrownR, RGBColor.colorBrownG, RGBColor.colorBrownB));
		        
		        renderID[XyCraft.idCounter] = RenderingRegistry.getNextAvailableRenderId();
		        RenderingRegistry.registerBlockHandler(new RenderXy(renderID[XyCraft.idCounter],
		                RGBColor.brightnessBright, RGBColor.colorBlueR, RGBColor.colorBlueG, RGBColor.colorBlueB));
		        
		        renderID[XyCraft.idCounter] = RenderingRegistry.getNextAvailableRenderId();
		        RenderingRegistry.registerBlockHandler(new RenderXy(renderID[XyCraft.idCounter],
		                RGBColor.brightnessBright, RGBColor.colorPurpleR, RGBColor.colorPurpleG, RGBColor.colorPurpleB));
		        
		        renderID[XyCraft.idCounter] = RenderingRegistry.getNextAvailableRenderId();
		        RenderingRegistry.registerBlockHandler(new RenderXy(renderID[XyCraft.idCounter],
		                RGBColor.brightnessBright, RGBColor.colorCyanR, RGBColor.colorCyanG, RGBColor.colorCyanB));
		        
		        renderID[XyCraft.idCounter] = RenderingRegistry.getNextAvailableRenderId();
		        RenderingRegistry.registerBlockHandler(new RenderXy(renderID[XyCraft.idCounter],
		                RGBColor.brightnessBright, RGBColor.colorLightGrayR, RGBColor.colorLightGrayG, RGBColor.colorLightGrayB));
		        
		        renderID[XyCraft.idCounter] = RenderingRegistry.getNextAvailableRenderId();
		        RenderingRegistry.registerBlockHandler(new RenderXy(renderID[XyCraft.idCounter],
		                RGBColor.brightnessBright, RGBColor.colorGrayR, RGBColor.colorGrayG, RGBColor.colorGrayB));
		        
		        renderID[XyCraft.idCounter] = RenderingRegistry.getNextAvailableRenderId();
		        RenderingRegistry.registerBlockHandler(new RenderXy(renderID[XyCraft.idCounter],
		                RGBColor.brightnessBright, RGBColor.colorPinkR, RGBColor.colorPinkG, RGBColor.colorPinkB));
		        
		        renderID[XyCraft.idCounter] = RenderingRegistry.getNextAvailableRenderId();
		        RenderingRegistry.registerBlockHandler(new RenderXy(renderID[XyCraft.idCounter],
		                RGBColor.brightnessBright, RGBColor.colorLimeR, RGBColor.colorLimeG, RGBColor.colorLimeB));
		        
		        renderID[XyCraft.idCounter] = RenderingRegistry.getNextAvailableRenderId();
		        RenderingRegistry.registerBlockHandler(new RenderXy(renderID[XyCraft.idCounter],
		                RGBColor.brightnessBright, RGBColor.colorYellowR, RGBColor.colorYellowG, RGBColor.colorYellowB));
		        
		        renderID[XyCraft.idCounter] = RenderingRegistry.getNextAvailableRenderId();
		        RenderingRegistry.registerBlockHandler(new RenderXy(renderID[XyCraft.idCounter],
		                RGBColor.brightnessBright, RGBColor.colorSkyBlueR, RGBColor.colorSkyBlueG, RGBColor.colorSkyBlueB));
		        
		        renderID[XyCraft.idCounter] = RenderingRegistry.getNextAvailableRenderId();
		        RenderingRegistry.registerBlockHandler(new RenderXy(renderID[XyCraft.idCounter],
		                RGBColor.brightnessBright, RGBColor.colorMagentaR, RGBColor.colorMagentaG, RGBColor.colorMagentaB));
		        
		        renderID[XyCraft.idCounter] = RenderingRegistry.getNextAvailableRenderId();
		        RenderingRegistry.registerBlockHandler(new RenderXy(renderID[XyCraft.idCounter],
		                RGBColor.brightnessBright, RGBColor.colorOrangeR, RGBColor.colorOrangeG, RGBColor.colorOrangeB));
		        
		        renderID[XyCraft.idCounter] = RenderingRegistry.getNextAvailableRenderId();
		        RenderingRegistry.registerBlockHandler(new RenderXy(renderID[XyCraft.idCounter],
		                RGBColor.brightnessBright, RGBColor.colorWhiteR, RGBColor.colorWhiteG, RGBColor.colorWhiteB));
		        
		        //Engineering Blocks
		        
		        renderID[XyCraft.idCounter] = RenderingRegistry.getNextAvailableRenderId();
		        RenderingRegistry.registerBlockHandler(new RenderXy(renderID[XyCraft.idCounter],
		                RGBColor.brightnessBright, RGBColor.colorBlueR, RGBColor.colorBlueG, RGBColor.colorBlueB));

		        renderID[XyCraft.idCounter] = RenderingRegistry.getNextAvailableRenderId();
		        RenderingRegistry.registerBlockHandler(new RenderXy(renderID[XyCraft.idCounter],
		                RGBColor.brightnessBright, RGBColor.colorGreenR, RGBColor.colorGreenG, RGBColor.colorGreenB));
		        
		        renderID[XyCraft.idCounter] = RenderingRegistry.getNextAvailableRenderId();
		        RenderingRegistry.registerBlockHandler(new RenderXy(renderID[XyCraft.idCounter],
		                RGBColor.brightnessBright, RGBColor.colorRedR, RGBColor.colorRedG, RGBColor.colorRedB));

		        renderID[XyCraft.idCounter] = RenderingRegistry.getNextAvailableRenderId();
		        RenderingRegistry.registerBlockHandler(new RenderXy(renderID[XyCraft.idCounter],
		                RGBColor.brightnessBright, RGBColor.colorBlackR, RGBColor.colorBlackG, RGBColor.colorBlackB));
		        
		        renderID[XyCraft.idCounter] = RenderingRegistry.getNextAvailableRenderId();
		        RenderingRegistry.registerBlockHandler(new RenderXy(renderID[XyCraft.idCounter],
		                RGBColor.brightnessBright, RGBColor.colorWhiteR, RGBColor.colorWhiteG, RGBColor.colorWhiteB));
		        
		        //Machines
		        
				renderID[XyCraft.idCounter] = RenderingRegistry.getNextAvailableRenderId();
		        RenderingRegistry.registerBlockHandler(new RenderXy(renderID[XyCraft.idCounter],
		                RGBColor.brightnessBright, RGBColor.colorBlueR, RGBColor.colorBlueG, RGBColor.colorBlueB));
		        
		        renderID[XyCraft.idCounter] = RenderingRegistry.getNextAvailableRenderId();
		        RenderingRegistry.registerBlockHandler(new RenderXy(renderID[XyCraft.idCounter],
		                RGBColor.brightnessBright, RGBColor.colorGreenR, RGBColor.colorGreenG, RGBColor.colorGreenB));
		        
		        renderID[XyCraft.idCounter] = RenderingRegistry.getNextAvailableRenderId();
		        RenderingRegistry.registerBlockHandler(new RenderXy(renderID[XyCraft.idCounter],
		                RGBColor.brightnessBright, RGBColor.colorRedR, RGBColor.colorRedG, RGBColor.colorRedB));
		        
		        renderID[XyCraft.idCounter] = RenderingRegistry.getNextAvailableRenderId();
		        RenderingRegistry.registerBlockHandler(new RenderXy(renderID[XyCraft.idCounter],
		                RGBColor.brightnessBright, RGBColor.colorBlackR, RGBColor.colorBlackG, RGBColor.colorBlackB));
		        
		        renderID[XyCraft.idCounter] = RenderingRegistry.getNextAvailableRenderId();
		        RenderingRegistry.registerBlockHandler(new RenderXy(renderID[XyCraft.idCounter],
		                RGBColor.brightnessBright, RGBColor.colorWhiteR, RGBColor.colorWhiteG, RGBColor.colorWhiteB));
		
	}

}