package com.randommod.Item;

import com.randommod.RandomMod;
import com.randommod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;


public class ModItemGroups {

    private static final ItemGroup RANDOM_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModItems.RANDOMITE))
            .displayName(Text.translatable("Random Mod"))
            .entries((context, entries) -> {
                entries.add(ModItems.RANDOMITE);
                entries.add(ModItems.RANDOM_MEAT_COOKED);
                entries.add(ModItems.RANDOM_MEAT_RAW);

                entries.add(ModItems.RANDOMITE_SWORD);
                entries.add(ModItems.RANDOMITE_PICKAXE);
                entries.add(ModItems.RANDOMITE_AXE);
                entries.add(ModItems.RANDOMITE_HOE);
                entries.add(ModItems.RANDOMITE_SHOVEL);


                entries.add(ModItems.HAPPY_COFFEE);
                entries.add(ModItems.GROGGY_MUG);

                entries.add(ModItems.RANDOMITE_HELMET);
                entries.add(ModItems.RANDOMITE_CHESTPLATE);
                entries.add(ModItems.RANDOMITE_LEGGINGS);
                entries.add(ModItems.RANDOMITE_BOOTS);

                //blocks
                entries.add(ModBlocks.RANDOMITE_BLOCK);
                entries.add(ModBlocks.DEEPSLATE_RANDOMITE_ORE);
                entries.add(ModBlocks.RANDOM_LEAVES);
                entries.add(ModBlocks.RANDOM_LOG);
                entries.add(ModBlocks.RANDOM_PLANKS);
                entries.add(ModBlocks.RANDOM_SPALING);





            })
            .build();


    public static void registerItemGroups() {

        Registry.register(Registries.ITEM_GROUP, Identifier.of("random", "random_group"), RANDOM_GROUP);
        RandomMod.LOGGER.info("Registering Item Groups for " + RandomMod.MOD_ID);
    }
}
