package com.danwalkercs.shopbox.core.init;

import com.danwalkercs.shopbox.ShopBox;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class ShopBoxModItems {

    private ShopBoxModItems() {

    }

    // Registry for all mod's items
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ShopBox.MOD_ID);


    // Template for creating a new item.
    public static final RegistryObject<Item> EXAMPLE_ITEM =
            ITEMS.register("example_item",
                    () -> new Item(new Item.Properties()
                            .tab(CreativeModeTab.TAB_MISC)
                            .fireResistant()
                            .stacksTo(64)));

    /*
        BLOCK ITEMS
     */
    // Template for creating a new BlockItem
    public static final RegistryObject<BlockItem> EXAMPLE_BLOCK_ITEM =
            ITEMS.register("example_block",
                    () -> new BlockItem(ShopBoxModBlocks.EXAMPLE_BLOCK.get(),
                            new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
}
