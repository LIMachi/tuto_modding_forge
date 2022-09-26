package com.limachi.tuto;

import com.limachi.tuto.blocks.Chest;
import com.limachi.tuto.items.DynamiteItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Registries {
    public static final DeferredRegister<Item> ITEM_REGISTER = DeferredRegister.create(ForgeRegistries.ITEMS, Tuto.MOD_ID);
    public static final DeferredRegister<Block> BLOCK_REGISTER = DeferredRegister.create(ForgeRegistries.BLOCKS, Tuto.MOD_ID);

    public static final CreativeModeTab TAB = new CreativeModeTab("tab") {
        @Override
        public ItemStack makeIcon() { return new ItemStack(DYNAMITE_ITEM.get()); }
    };

    public static final RegistryObject<Item> DYNAMITE_ITEM = ITEM_REGISTER.register("dynamite", DynamiteItem::new);

    public static final RegistryObject<Block> CHEST_BLOCK = BLOCK_REGISTER.register("chest", Chest::new);
    public static final RegistryObject<Item> CHEST_ITEM = ITEM_REGISTER.register("chest", ()->new BlockItem(CHEST_BLOCK.get(), new Item.Properties().tab(Registries.TAB)));

    public static void registerBus(IEventBus bus) {
        ITEM_REGISTER.register(bus);
        BLOCK_REGISTER.register(bus);
    }
}
