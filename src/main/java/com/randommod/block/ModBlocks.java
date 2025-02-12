package com.randommod.block;


import com.randommod.RandomMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.util.math.intprovider.ConstantIntProvider;

import static net.minecraft.block.Blocks.createLeavesBlock;
import static net.minecraft.block.Blocks.createLogBlock;

public class ModBlocks {
    public static final Block RANDOMITE_BLOCK = registerBlock("randomite_block",
            new Block(AbstractBlock.Settings.create()
                    .strength(4.0F, 4.0F)
                    .requiresTool()
                    .sounds(BlockSoundGroup.METAL)
                    .instrument(NoteBlockInstrument.IRON_XYLOPHONE)
                    .luminance(state -> 15)));


    public static final Block RANDOMITE_ORE = registerBlock("randomite_ore",
            new Block(AbstractBlock.Settings.create()
                    .strength(3.0F, 3.0F)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)));
    public static final Block DEEPSLATE_RANDOMITE_ORE = registerBlock("deepslate_randomite_ore",
            new Block(AbstractBlock.Settings.create()
                    .strength(5.0F, 5.0F)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)));


    public static final Block RANDOM_PLANKS = registerBlock("random_planks",
            new PillarBlock(AbstractBlock.Settings.create()
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F)
                    .mapColor(MapColor.DULL_PINK)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()));

    public static final Block RANDOM_LOG = registerBlock("random_log",
            createLogBlock(MapColor.DULL_RED, MapColor.RED));

    public static final Block RANDOM_LEAVES = registerBlock("random_leaves",
            createLeavesBlock(BlockSoundGroup.GRASS));

    public static final Block RANDOM_SPALING = registerBlock("random_sapling",
            new  SaplingBlock(SaplingGenerator.OAK, AbstractBlock.Settings.create()
                    .mapColor(MapColor.PURPLE)
                    .noCollision()
                    .ticksRandomly()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .pistonBehavior(PistonBehavior.DESTROY)));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(RandomMod.MOD_ID,name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(RandomMod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }
    public static void registerModBlocks() {
        RandomMod.LOGGER.info("Registering Mod Blocks for " + RandomMod.MOD_ID );

}
}
