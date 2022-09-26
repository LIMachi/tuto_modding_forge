package com.limachi.tuto.items;

import com.limachi.tuto.Registries;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class DynamiteItem extends Item {
    public DynamiteItem() {
        super(new Properties().tab(Registries.TAB));
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        player.kill();
        return super.use(level, player, hand);
    }
}
