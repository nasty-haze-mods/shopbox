package com.danwalkercs.shopbox.core.init;

import com.danwalkercs.shopbox.ShopBox;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class ShopBoxModBlocks {

    private ShopBoxModBlocks() {}

    // Registry for Blocks
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, ShopBox.MOD_ID);


    // Copy another block's properties directly
    public static final RegistryObject<Block> EXAMPLE_BLOCK =
            BLOCKS.register("example_block",
                    () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));

    /*
    // Customize properties
    public static final RegistryObject<Block> EXAMPLE_BLOCK =
            BLOCKS.register("example_block",
                    () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_MAGENTA)
                            .strength(2f, 15f)
                            .requiresCorrectToolForDrops()));

     */
}
