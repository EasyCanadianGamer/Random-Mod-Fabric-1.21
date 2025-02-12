package com.randommod.Item.tools;

import com.randommod.Item.ModToolMaterials;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;
public class RandomitePickaxe extends PickaxeItem {


    public RandomitePickaxe(ToolMaterial toolMaterial) {
        super(toolMaterial, getItemSettings());
    }


    private static Settings getItemSettings() {
        return (new Settings()).attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.RANDOMITE, 4.0F, 12.0F));
    }

}
