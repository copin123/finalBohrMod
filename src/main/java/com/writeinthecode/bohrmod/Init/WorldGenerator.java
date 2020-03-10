package com.writeinthecode.bohrmod.Init;

import com.writeinthecode.bohrmod.Config.Config;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(modid = Config.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class WorldGenerator {
    private static final CountRangeConfig bohrOre = new CountRangeConfig(
            Config.count_bohr.get(), Config.minheight_bohr.get(), 0, Config.maxheight_bohr.get());
    private static final int bohrOreVeinSize = Config.veinsize_bohr.get();

    public static void setup(){
        ForgeRegistries.BIOMES.getValues().forEach(biome -> {
                if (Config.generate_bohr.get()) {
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(
                            new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                                    RegisterBlocks.bohrOre.getDefaultState(), bohrOreVeinSize))
                            .func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(bohrOre)));

                }
        });
    }
}
