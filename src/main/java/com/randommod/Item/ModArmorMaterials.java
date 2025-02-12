package com.randommod.Item;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

import com.randommod.RandomMod;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ArmorMaterials;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

public class ModArmorMaterials  {

    public static final RegistryEntry<ArmorMaterial> RANDOMITE = ModArmorMaterials.register("randomite", Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
        map.put(ArmorItem.Type.BOOTS, 6);
        map.put(ArmorItem.Type.LEGGINGS, 7);
        map.put(ArmorItem.Type.CHESTPLATE, 7);
        map.put(ArmorItem.Type.HELMET, 6);
        map.put(ArmorItem.Type.BODY, 7);
    }), 15, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 0.6f, 1.0f, () -> Ingredient.ofItems(ModItems.RANDOMITE),
            List.of(new ArmorMaterial.Layer(Identifier.of(RandomMod.MOD_ID, "randomite"), "", true), new ArmorMaterial.Layer(Identifier.of(RandomMod.MOD_ID, "randomite"), "", false)));



    public static RegistryEntry<ArmorMaterial> getDefault(Registry<ArmorMaterial> registry) {
        return ArmorMaterials.NETHERITE;
    }


    private static RegistryEntry<ArmorMaterial> register(String id, EnumMap<ArmorItem.Type, Integer> defense, int enchantability, RegistryEntry<SoundEvent> equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
        List<ArmorMaterial.Layer> list = List.of(new ArmorMaterial.Layer(Identifier.of(RandomMod.MOD_ID, id)));
        return ModArmorMaterials.register(id, defense, enchantability, equipSound, toughness, knockbackResistance, repairIngredient, list);
    }


    private static RegistryEntry<ArmorMaterial> register(String id, EnumMap<ArmorItem.Type, Integer> defense, int enchantability, RegistryEntry<SoundEvent> equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient, List<ArmorMaterial.Layer> layers) {
        EnumMap<ArmorItem.Type, Integer> enumMap = new EnumMap<ArmorItem.Type, Integer>(ArmorItem.Type.class);
        for (ArmorItem.Type type : ArmorItem.Type.values()) {
            enumMap.put(type, defense.get(type));
        }
        return Registry.registerReference(Registries.ARMOR_MATERIAL, Identifier.of(RandomMod.MOD_ID, id),
                new ArmorMaterial(enumMap, enchantability, equipSound, repairIngredient, layers, toughness, knockbackResistance));
    }

    }
