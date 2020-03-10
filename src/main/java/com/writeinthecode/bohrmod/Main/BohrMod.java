package com.writeinthecode.bohrmod.Main;

import com.writeinthecode.bohrmod.Config.BohrModConfig;
import com.writeinthecode.bohrmod.Config.Config;
import com.writeinthecode.bohrmod.Proxy.ClientProxy;
import com.writeinthecode.bohrmod.Proxy.CommonProxy;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;

@Mod(Config.MODID)
//@EventBusSubscriber(modid = Config.MODID, bus = Bus.MOD)
public class BohrMod {

    private static CommonProxy proxy = DistExecutor.runForDist(() -> ClientProxy::new, () -> CommonProxy::new);

    public BohrMod(){
        FMLJavaModLoadingContext.get().getModEventBus().register(this);
        proxy.construct();
        BohrModConfig.loadConfig(BohrModConfig.Server_Config,
                FMLPaths.CONFIGDIR.get().resolve("bohrmod.toml"));
    }

    @SubscribeEvent
    public void setup(FMLCommonSetupEvent event){
        proxy.setup();
    }

    @SubscribeEvent
    public void ready(FMLLoadCompleteEvent event){
        proxy.complete();
    }
}
