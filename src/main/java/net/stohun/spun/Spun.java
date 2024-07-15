package net.stohun.spun;

import net.fabricmc.api.ModInitializer;

import net.stohun.spun.block.ModBlocks;
import net.stohun.spun.item.ModItemGroups;
import net.stohun.spun.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Spun implements ModInitializer {
	public static final String MOD_ID = "spun";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}