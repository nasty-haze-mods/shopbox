package com.danwalkercs.shopbox.core.init;

import com.danwalkercs.shopbox.ShopBox;
import com.danwalkercs.shopbox.common.block.ShopBoxBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class ShopBoxModBlocks {

    // Registry for Blocks
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, ShopBox.MOD_ID);

    public static final RegistryObject<ShopBoxBlock> SHOPBOX_BLOCK =
            BLOCKS.register("shopbox",
                    () -> new ShopBoxBlock(BlockBehaviour.Properties.copy(Blocks.OBSIDIAN)
                            .requiresCorrectToolForDrops()
                            .noOcclusion()
                            .dynamicShape()));

}
