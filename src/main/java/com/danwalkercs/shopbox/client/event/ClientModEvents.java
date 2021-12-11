package com.danwalkercs.shopbox.client.event;

import com.danwalkercs.shopbox.ShopBox;
import com.danwalkercs.shopbox.client.renderer.blockentity.ShopBoxRenderer;
import com.danwalkercs.shopbox.core.init.ShopBoxModBlockEntities;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ShopBox.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientModEvents {

    @SubscribeEvent
    public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerBlockEntityRenderer(ShopBoxModBlockEntities.SHOP_BOX.get(), ShopBoxRenderer::new);
    }
}
