package com.randommod.Item.tools;

import com.randommod.Item.ModToolMaterials;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
public class RandomiteSword extends SwordItem {

    public RandomiteSword(ToolMaterial toolMaterial) {
        super(toolMaterial, getItemSettings());
    }

    private static Settings getItemSettings() {
        return (new Settings()).attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.RANDOMITE, 23.0F, 83.0F));
    }

}
