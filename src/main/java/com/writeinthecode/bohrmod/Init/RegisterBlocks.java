package com.writeinthecode.bohrmod.Init;

import com.writeinthecode.bohrmod.Blocks.ItemBlocks;
import com.writeinthecode.bohrmod.Blocks.OverworldOres;
import com.writeinthecode.bohrmod.Config.Config;
import com.writeinthecode.bohrmod.Items.ItemFromBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;    

@Mod.EventBusSubscriber(modid = Config.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class RegisterBlocks {
    public static final Block bohrOre = new OverworldOres();
    public static final Block bohrBlock = new ItemBlocks(MaterialColor.PURPLE);

    @SubscribeEvent
    public static void register(RegistryEvent.Register<Block> event) {
        IForgeRegistry<Block> registry = event.getRegistry();

        bohrOre.setRegistryName(Config.MODID, "bohr_ore");
        bohrBlock.setRegistryName(Config.MODID, "bohr_block");
        registry.registerAll(bohrOre, bohrBlock);
    }

    @SubscribeEvent
    public static void registerItem(RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> registry = event.getRegistry();

        registry.register(new ItemFromBlock(bohrOre, new Item.Properties().group(CreativeTabs.overworld)));
        registry.register(new ItemFromBlock(bohrBlock, new Item.Properties().group(CreativeTabs.overworld)));
    }
    }
