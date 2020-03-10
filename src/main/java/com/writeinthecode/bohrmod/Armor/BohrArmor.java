package com.writeinthecode.bohrmod.Armor;

import com.writeinthecode.bohrmod.Config.Config;
import com.writeinthecode.bohrmod.Init.RegisterArmor;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.world.World;

public class BohrArmor extends ArmorItem {

    public BohrArmor(IArmorMaterial materialIn, EquipmentSlotType slots, Properties properties) {
        super(materialIn, slots, properties);
    }

     @Override
    public void onArmorTick(ItemStack stack, World world, PlayerEntity player) {
         BohrArmor bohr_helm = RegisterArmor.bohrHelm;
         BohrArmor bohr_chest = RegisterArmor.bohrChest;
         BohrArmor bohr_legs = RegisterArmor.bohrLegs;
         BohrArmor bohr_boots = RegisterArmor.bohrBoots;

         if (Config.enable_statuseffects.get()) {
             if (player.getItemStackFromSlot(EquipmentSlotType.FEET).getItem().equals(bohr_boots) &&
                 player.getItemStackFromSlot(EquipmentSlotType.LEGS).getItem().equals(bohr_legs) &&
                 player.getItemStackFromSlot(EquipmentSlotType.CHEST).getItem().equals(bohr_chest) &&
                 player.getItemStackFromSlot(EquipmentSlotType.HEAD).getItem().equals(bohr_helm)) {
                    player.addPotionEffect(new EffectInstance(Effect.get(12), 20, 0));
                    player.addPotionEffect(new EffectInstance(Effect.get(11), 20, 0));
             }

             if (player.getItemStackFromSlot(EquipmentSlotType.FEET).getItem().equals(bohr_boots) &&
                    player.getItemStackFromSlot(EquipmentSlotType.LEGS).getItem().equals(bohr_legs) &&
                    player.getItemStackFromSlot(EquipmentSlotType.CHEST).getItem().equals(bohr_chest) &&
                    player.getItemStackFromSlot(EquipmentSlotType.HEAD).getItem().equals(bohr_helm)) {
                        player.addPotionEffect(new EffectInstance(Effect.get(12), 20, 0));
             }
         }
     }
}
