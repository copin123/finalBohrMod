package com.writeinthecode.bohrmod.Init;

import com.writeinthecode.bohrmod.Config.Config;
import com.writeinthecode.bohrmod.Items.OreItems;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.IForgeRegistry;

@EventBusSubscriber(modid = Config.MODID, bus = Bus.MOD)
public class RegisterItems {

    public static final OreItems bohr_ite = new OreItems(new Item.Properties().group(CreativeTabs.overworld));
    public static final OreItems bohr = new OreItems(new Item.Properties().group(CreativeTabs.overworld));

    @SubscribeEvent
    public static void register(Register<Item> event) {
        IForgeRegistry<Item> registry = event.getRegistry();
        bohr_ite.setRegistryName(Config.MODID, "bohr_ite");
        registry.register(bohr_ite);
        bohr.setRegistryName(Config.MODID, "bohr");
        registry.register(bohr);
    }


}