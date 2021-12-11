package com.danwalkercs.shopbox;


import com.danwalkercs.shopbox.core.init.ShopBoxModBlockEntities;
import com.danwalkercs.shopbox.core.init.ShopBoxModBlocks;
import com.danwalkercs.shopbox.core.init.ShopBoxModEntities;
import com.danwalkercs.shopbox.core.init.ShopBoxModItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;


// The value here should match an entry in the META-INF/mods.toml file
@Mod(ShopBox.MOD_ID)
public class ShopBox
{
    public static final String MOD_ID = "shopbox";

    public ShopBox() {

        // Forge Event Bus
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Register the object registries with the bus
        ShopBoxModBlocks.BLOCKS.register(eventBus);
        ShopBoxModBlockEntities.BLOCK_ENTITIES.register(eventBus);
        ShopBoxModItems.ITEMS.register(eventBus);
        ShopBoxModEntities.ENTITIES.register(eventBus);
        
    }

    public static final CreativeModeTab SHOPBOX_TAB = new CreativeModeTab(MOD_ID) {
        @Override
        public ItemStack makeIcon() {
            return ShopBoxModItems.SHOPBOX_BLOCK_ITEM.get().getDefaultInstance();
        }
    };
}
