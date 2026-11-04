package com.robloxtop;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block BLACK_QUARTZ_BLOCK = register(
            new BlackQuartzBlock(AbstractBlock.Settings.create()
                    .strength(3.0f, 1200.0f)
                    .luminance(state -> 0)
                    .requiresTool()),
            "black_quartz_block",
            true);

    public static Block register(Block block, String name, boolean shouldRegisterItem) {
        Identifier id = Identifier.of(BlackQuartzMod.MOD_ID, name);
        if (shouldRegisterItem) {
            BlockItem blockItem = new BlockItem(block, new Item.Settings());
            Registry.register(Registries.ITEM, id, blockItem);
        }
        return Registry.register(Registries.BLOCK, id, block);
    }

    public static void initialize() {
    }
}
