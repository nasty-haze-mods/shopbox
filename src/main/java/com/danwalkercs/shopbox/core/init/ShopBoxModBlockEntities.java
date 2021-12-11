package com.danwalkercs.shopbox.core.init;

import com.danwalkercs.shopbox.ShopBox;
import com.danwalkercs.shopbox.common.block.entity.ShopBoxBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class ShopBoxModBlockEntities {

    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, ShopBox.MOD_ID);

    public static final RegistryObject<BlockEntityType<ShopBoxBlockEntity>> SHOP_BOX =
            BLOCK_ENTITIES.register("shopbox",
                    () -> BlockEntityType.Builder.of(ShopBoxBlockEntity::new, ShopBoxModBlocks.SHOPBOX_BLOCK.get()).build(null));
}
