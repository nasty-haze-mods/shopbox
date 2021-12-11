package com.danwalkercs.shopbox.core.init;

import com.danwalkercs.shopbox.ShopBox;
import net.minecraft.world.entity.EntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ShopBoxModEntities {

    public static final DeferredRegister<EntityType<?>> ENTITIES =
            DeferredRegister.create(ForgeRegistries.ENTITIES, ShopBox.MOD_ID);


}
