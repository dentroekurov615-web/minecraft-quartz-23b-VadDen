package com.robloxtop;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item BLACK_QUARTZ_SHARD = register("black_quartz_shard", new Item(new Item.Settings()));

    private static Item register(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(BlackQuartzMod.MOD_ID, name), item);
    }

    public static void initialize() {
    }
}
