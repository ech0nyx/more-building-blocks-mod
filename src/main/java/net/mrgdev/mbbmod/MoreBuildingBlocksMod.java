package net.mrgdev.mbbmod;

import net.fabricmc.api.ModInitializer;
import net.mrgdev.mbbmod.block.ModBlocks;
import net.mrgdev.mbbmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoreBuildingBlocksMod implements ModInitializer {
	public static final String MOD_ID = "mbbmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

	}
}
