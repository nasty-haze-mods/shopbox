package com.danwalkercs.shopbox.core.init;

import com.danwalkercs.shopbox.ShopBox;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class ShopBoxModItems {

    // Registry for all mod's items
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ShopBox.MOD_ID);

    /*
    * ITEMS
    * */


    /*
     * BLOCK_ITEMS
     * */

    public static final RegistryObject<BlockItem> SHOPBOX_BLOCK_ITEM =
            ITEMS.register("shopbox",
                    () -> new BlockItem(ShopBoxModBlocks.SHOPBOX_BLOCK.get(),
                            new Item.Properties().tab(ShopBox.SHOPBOX_TAB)));
}
