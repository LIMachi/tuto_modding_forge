package com.limachi.tuto;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Tuto.MOD_ID)
public class Tuto
{
    public static final String MOD_ID = "tuto";

    public Tuto() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        Registries.registerBus(bus);
    }
}
