package com.randommod.world;

import com.randommod.RandomMod;
import com.randommod.block.ModBlocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.registry.RegistryKey;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;

import java.util.List;

public class ModConfiguredFeatures {

    public static final RegistryKey<ConfiguredFeature<?, ?>> RANDOMITE_ORE_KEY = registerKey("randomite_ore");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {

        RuleTest stoneReplaceables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.RANDOMITE_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.DEEPSLATE_RANDOMITE_ORE.getDefaultState()));

    }
        public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(RandomMod.MOD_ID, name));
    }
    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
