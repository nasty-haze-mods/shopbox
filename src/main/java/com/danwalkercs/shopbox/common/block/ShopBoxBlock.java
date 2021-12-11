package com.danwalkercs.shopbox.common.block;


import com.danwalkercs.shopbox.core.init.ShopBoxModBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

public class ShopBoxBlock extends Block implements EntityBlock {
    public ShopBoxBlock(Properties properties) {
        super(properties);
    }

    // Creates the block entity once the block is placed
    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return ShopBoxModBlockEntities.SHOP_BOX.get().create(pos, state);
    }
}
