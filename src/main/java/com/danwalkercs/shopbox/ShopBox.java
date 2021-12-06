package com.danwalkercs.shopbox;


import com.danwalkercs.shopbox.core.init.ShopBoxModBlocks;
import com.danwalkercs.shopbox.core.init.ShopBoxModEntities;
import com.danwalkercs.shopbox.core.init.ShopBoxModItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;


// The value here should match an entry in the META-INF/mods.toml file
@Mod(ShopBox.MOD_ID)
public class ShopBox
{
    public static final String MOD_ID = "shopbox";

    public ShopBox() {
        /*
         * Everything in Forge works on a bus.
         * The bus picks up events and delivers them to the hooks.
         * There are 2 buses: the mod bus and the forge bus.
         * For registering objects, we use the mod bus.
         */
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Register the object registries with the bus
        ShopBoxModBlocks.BLOCKS.register(eventBus);
        ShopBoxModItems.ITEMS.register(eventBus);
        ShopBoxModEntities.ENTITIES.register(eventBus);
    }
}
