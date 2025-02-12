package com.randommod.Item;

import com.randommod.Item.tools.*;
import com.randommod.RandomMod;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems implements ModInitializer {

    //items
    public static final Item RANDOMITE= registerItem("randomite", new Item(new Item.Settings()));
    //food
    public static final Item RANDOM_MEAT_COOKED= registerItem("random_meat_cooked", new Item(new Item.Settings().food(ModFoodItems.RANDOM_MEAT_COOKED)));

    public static final Item GROGGY_MUG= registerItem("groggy_mug", new Item(new Item.Settings()));

    public static final Item RANDOM_MEAT_RAW= registerItem("random_meat_raw", new Item(new Item.Settings().food(ModFoodItems.RANDOM_MEAT_RAW)));


    public static final Item HAPPY_COFFEE= registerItem("happy_coffee", new Item(new Item.Settings().food(ModFoodItems.HAPPY_COFFEE)));


    //armor

public static final Item RANDOMITE_HELMET = ModItems.registerItem("randomite_helmet",
        new ArmorItem(ModArmorMaterials.RANDOMITE, ArmorItem.Type.HELMET, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(9))));

    public static final Item RANDOMITE_CHESTPLATE = ModItems.registerItem("randomite_chestplate",
            new ArmorItem(ModArmorMaterials.RANDOMITE, ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(9))));

    public static final Item RANDOMITE_LEGGINGS = ModItems.registerItem("randomite_leggings",
            new ArmorItem(ModArmorMaterials.RANDOMITE, ArmorItem.Type.LEGGINGS, new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(9))));

    public static final Item RANDOMITE_BOOTS = ModItems.registerItem("randomite_boots",
            new ArmorItem(ModArmorMaterials.RANDOMITE, ArmorItem.Type.BOOTS, new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(9))));

    //tools

    public static final Item RANDOMITE_SWORD =  registerItem("randomite_sword", new RandomiteSword(ModToolMaterials.RANDOMITE));

    public static final Item RANDOMITE_PICKAXE =  registerItem("randomite_pickaxe", new RandomitePickaxe(ModToolMaterials.RANDOMITE));

    public static final Item RANDOMITE_AXE =  registerItem("randomite_axe", new RandomiteAxe(ModToolMaterials.RANDOMITE));

    public static final Item RANDOMITE_HOE =  registerItem("randomite_hoe", new RandomiteHoe(ModToolMaterials.RANDOMITE));


    public static final Item RANDOMITE_SHOVEL =  registerItem("randomite_shovel", new RandomiteShovel(ModToolMaterials.RANDOMITE));

    //custom items/tools

    private static void addItemsToIngrediantItemGroup(FabricItemGroupEntries entries) {
        entries.add(RANDOMITE);
    }


    @Override
    public void onInitialize() {

    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM,  Identifier.of(RandomMod.MOD_ID,name), item);
    }
    public static void registerModItems() {
        RandomMod.LOGGER.info("Registering Mod Items for " + RandomMod.MOD_ID);


        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register
                (ModItems::addItemsToIngrediantItemGroup);
    }
}
