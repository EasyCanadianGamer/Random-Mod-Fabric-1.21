package com.randommod.Item;



import com.randommod.util.ModTags;
import net.minecraft.block.Block;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;

import com.google.common.base.Suppliers;


import java.util.function.Supplier;

public enum ModToolMaterials  implements ToolMaterial {
    RANDOMITE(ModTags.Blocks.INCORRECT_FOR_RANDOMITE_TOOL,
            1200, 5.0F, 4.0F, 22, () -> Ingredient.ofItems(ModItems.RANDOMITE));

    private final TagKey<Block> inverseTag;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    ModToolMaterials(final TagKey<Block> inverseTag, final int itemDurability,final float miningSpeed,
                     final float attackDamage, final int enchantability,final Supplier<Ingredient> repairIngredient) {
        this.inverseTag = inverseTag;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = Suppliers.memoize(repairIngredient::get);
    }

    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public TagKey<Block> getInverseTag() {
        return this.inverseTag;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
//
//    public static final ModToolMaterials RANDOMITE = new ModToolMaterials();
//
//
//    @Override
//    public int getDurability() {
//        return 350;
//    }
//
//    @Override
//    public float getMiningSpeedMultiplier() {
//        return 7.0F;
//    }
//
//    @Override
//    public float getAttackDamage() {
//        return 2.5F;
//    }
//
//    @Override
//    public TagKey<Block> getInverseTag() {
//        return BlockTags.INCORRECT_FOR_IRON_TOOL;
//    }
//
//    @Override
//    public int getEnchantability() {
//        return 13;
//    }
//
//    @Override
//    public Ingredient getRepairIngredient() {
//        return Ingredient.ofItems(ModItems.RANDOMITE);
//    }

}
