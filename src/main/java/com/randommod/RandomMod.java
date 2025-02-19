package com.randommod;

import com.randommod.Item.ModItemGroups;
import com.randommod.block.ModBlocks;
import com.randommod.commands.ModCommands;
import com.randommod.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;
import com.randommod.Item.ModItems;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RandomMod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.


	public static final String MOD_ID = "randommod";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Fabric world!");
		ModCommands.registerCommands();

		ModBlocks.registerModBlocks();

		ModItemGroups.registerItemGroups();
		ModWorldGeneration.generateModWorldGen();


		ModItems.registerModItems();

		//ModFlammableBlockRegistry.registerFlammableBlocks();
	}
}