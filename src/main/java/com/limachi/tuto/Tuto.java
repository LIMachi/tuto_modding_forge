package com.limachi.tuto;

import com.limachi.tuto.items.DynamiteItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

@Mod(Tuto.MOD_ID)
public class Tuto
{
    public static final String MOD_ID = "tuto";

    public static final DeferredRegister<Item> ITEM_REGISTER = DeferredRegister.create(ForgeRegistries.ITEMS, MOD_ID);

    public static final CreativeModeTab TAB = new CreativeModeTab("tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(DYNAMITE_ITEM.get());
        }
    };

    public static final Supplier<Item> DYNAMITE_ITEM = ITEM_REGISTER.register("dynamite", DynamiteItem::new);

    public Tuto() {
        ITEM_REGISTER.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
