package com.writeinthecode.bohrmod.Init;

import com.writeinthecode.bohrmod.Config.Config;
import com.writeinthecode.bohrmod.Tools.*;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

import net.minecraftforge.registries.IForgeRegistry;


@EventBusSubscriber(modid = Config.MODID, bus = Bus.MOD)
public class RegisterTools {

    public static final Pickaxe bohrPickaxe = new Pickaxe(BohrToolMaterial.bohr,
        new Item.Properties().group(CreativeTabs.overworld));
    public static final Hoe bohrHoe = new Hoe(BohrToolMaterial.bohr,
        new Item.Properties().group(CreativeTabs.overworld));
    public static final Axe bohrAxe = new Axe(BohrToolMaterial.bohr,
        new Item.Properties().group(CreativeTabs.overworld));
    public static final Shovel bohrShovel = new Shovel(BohrToolMaterial.bohr,
        new Item.Properties().group(CreativeTabs.overworld));
    public static final Sword bohrSword = new Sword(BohrToolMaterial.bohr,
        new Item.Properties().group(CreativeTabs.overworld));


    @SubscribeEvent
    public static void register(RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> registry = event.getRegistry();

        bohrPickaxe.setRegistryName(Config.MODID, "bohr_pickaxe");
        bohrAxe.setRegistryName(Config.MODID, "bohr_axe");
        bohrHoe.setRegistryName(Config.MODID, "bohr_hoe");
        bohrShovel.setRegistryName(Config.MODID, "bohr_shovel");
        bohrSword.setRegistryName(Config.MODID, "bohr_sword");
        registry.registerAll(bohrHoe,bohrAxe,bohrPickaxe,bohrShovel,bohrSword);
    }
}
