package com.randommod.Item.tools;

import com.randommod.Item.ModToolMaterials;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterial;

public class RandomiteShovel extends ShovelItem {
    public RandomiteShovel(ToolMaterial toolMaterial) {
        super(toolMaterial, getItemSettings());
    }


    private static Item.Settings getItemSettings() {
        return (new Item.Settings()).attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.RANDOMITE, 4.0F, 12.0F));
    }
}

