package com.writeinthecode.bohrmod.Config;

import net.minecraftforge.common.ForgeConfigSpec;

public class Config {
    public  static ForgeConfigSpec.ConfigValue<String> string;

    //Overworld
    public static ForgeConfigSpec.BooleanValue every_biome;

    //Bohr
    public static ForgeConfigSpec.BooleanValue generate_bohr;
    public static ForgeConfigSpec.IntValue durabilitiy_bohr;
    public static ForgeConfigSpec.DoubleValue attackdamage_bohr;
    public static ForgeConfigSpec.IntValue veinsize_bohr;
    public static ForgeConfigSpec.IntValue count_bohr;
    public static ForgeConfigSpec.IntValue minheight_bohr;
    public static ForgeConfigSpec.IntValue maxheight_bohr;
    public static ForgeConfigSpec.DoubleValue bohr_temperature;
    public static ForgeConfigSpec.BooleanValue enable_statuseffects;

    public static final String MODID = "bohrmod";

    public static void init(ForgeConfigSpec.Builder Builder) {

        Builder.push("Overworld");
        every_biome = Builder.comment("Enable that Bohr generate in every biome(Default: false).")
                .define("every_biome", true);
        Builder.pop();

        Builder.push("************* Bohr Ore Generation *************");
        generate_bohr = Builder.comment("Enable the Generation of Bohr Ore (Default: true).")
                .define("generate_bohr", true);
        veinsize_bohr = Builder.comment("Set the Vein Size of the Bohr Ore (Default: 8).").defineInRange(
            "veinsize_bohr", 8, 4, 255);
        count_bohr = Builder.comment("Set the Count of the Bohr Ore how much can spawn per Chunk (Default: 1).")
            .defineInRange("count_bohr", 50, 1, 255);
        minheight_bohr = Builder.comment("Set the Min Height of the Bohr Ore (Default: 0).")
            .defineInRange("minheight_bohr", 0, 0, 256);
        maxheight_bohr = Builder.comment("Set the Max  Height of the Bohr Ore (Default: 16).")
            .defineInRange("maxheight_bohr", 250, 8, 256);
        Builder.pop();

        Builder.push("Bohr");
        durabilitiy_bohr = Builder.comment("Bohr tool durabilitty").defineInRange("durability_bohr",
            1700, 0, 999999999);
        Builder.pop();
        Builder.push("Bohr");
        attackdamage_bohr = Builder.comment("Bohr base attack damage").defineInRange("attackdamage_bohr",
            3.5, 0.0, 999999999);
        Builder.pop();

        enable_statuseffects = Builder.comment("enable status effects.").define("enable_statuseffects", true);
    }
    }
