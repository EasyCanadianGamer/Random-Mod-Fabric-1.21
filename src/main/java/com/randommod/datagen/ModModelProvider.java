package com.randommod.datagen;

import com.randommod.Item.ModItems;
import com.randommod.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Model;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;

public class ModModelProvider  extends FabricModelProvider {

    public ModModelProvider(FabricDataOutput output){
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator){
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RANDOMITE_BLOCK);

//        BlockStateModelGenerator.BlockTexturePool randomitePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RANDOMITE_BLOCK);
//        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_PINK_GARNET_BLOCK);
//        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PINK_GARNET_ORE);
//        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PINK_GARNET_DEEPSLATE_ORE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.RANDOMITE, Models.GENERATED);

        itemModelGenerator.register(ModItems.RANDOMITE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RANDOMITE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RANDOMITE_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RANDOMITE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RANDOMITE_AXE, Models.HANDHELD);

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.RANDOMITE_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.RANDOMITE_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.RANDOMITE_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.RANDOMITE_BOOTS));
    }
}
