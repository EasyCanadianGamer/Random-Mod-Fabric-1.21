package com.randommod.datagen;

import com.randommod.block.ModBlocks;
import com.randommod.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider  extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }


    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.RANDOMITE_BLOCK);


        getOrCreateTagBuilder(ModTags.Blocks.NEEDS_RANDOMITE_TOOL)
                .add(ModBlocks.RANDOMITE_BLOCK)
                .addTag(BlockTags.NEEDS_IRON_TOOL);
//
//        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
//                .add(ModBlocks.PINK_GARNET_DEEPSLATE_ORE);

//        getOrCreateTagBuilder(BlockTags.FENCES).add(ModBlocks.PINK_GARNET_FENCE);
//        getOrCreateTagBuilder(BlockTags.FENCE_GATES).add(ModBlocks.PINK_GARNET_FENCE_GATE);
//        getOrCreateTagBuilder(BlockTags.WALLS).add(ModBlocks.PINK_GARNET_WALL);
//
//        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
//                .add(ModBlocks.MAGIC_BLOCK);
//
//        getOrCreateTagBuilder(ModTags.Blocks.NEEDS_PINK_GARNET_TOOL)
//                .add(ModBlocks.MAGIC_BLOCK)
//                .addTag(BlockTags.NEEDS_IRON_TOOL);
//
//        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
//                .add(ModBlocks.DRIFTWOOD_LOG)
//                .add(ModBlocks.DRIFTWOOD_WOOD)
//                .add(ModBlocks.STRIPPED_DRIFTWOOD_LOG)
//                .add(ModBlocks.STRIPPED_DRIFTWOOD_WOOD);
//    }
    }
}
