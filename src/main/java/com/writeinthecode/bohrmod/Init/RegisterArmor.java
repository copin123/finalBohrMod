package com.writeinthecode.bohrmod.Init;

import com.writeinthecode.bohrmod.Armor.BohrArmor;
import com.writeinthecode.bohrmod.Armor.BohrArmorMaterial;
import com.writeinthecode.bohrmod.Config.Config;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.IForgeRegistry;

@EventBusSubscriber(modid = Config.MODID, bus = Bus.MOD)
public class RegisterArmor {
    public static final BohrArmor bohrHelm = new BohrArmor(BohrArmorMaterial.bohr,
        EquipmentSlotType.HEAD, new Item.Properties().group(CreativeTabs.overworld));
    public static final BohrArmor bohrChest = new BohrArmor(BohrArmorMaterial.bohr,
        EquipmentSlotType.CHEST, new Item.Properties().group(CreativeTabs.overworld));
    public static final BohrArmor bohrLegs = new BohrArmor(BohrArmorMaterial.bohr,
        EquipmentSlotType.LEGS, new Item.Properties().group(CreativeTabs.overworld));
    public static final BohrArmor bohrBoots = new BohrArmor(BohrArmorMaterial.bohr,
        EquipmentSlotType.FEET, new Item.Properties().group(CreativeTabs.overworld));

    @SubscribeEvent
    public static void register(RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> registry = event.getRegistry();
        bohrHelm.setRegistryName(Config.MODID, "bohr_helm");
        bohrChest.setRegistryName(Config.MODID, "bohr_chest");
        bohrLegs.setRegistryName(Config.MODID, "bohr_legs");
        bohrBoots.setRegistryName(Config.MODID, "bohr_boots");
        registry.registerAll(bohrHelm, bohrChest, bohrLegs, bohrBoots);
    }
}
