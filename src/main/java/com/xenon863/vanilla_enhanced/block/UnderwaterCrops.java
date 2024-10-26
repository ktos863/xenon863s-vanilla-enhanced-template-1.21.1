package com.xenon863.vanilla_enhanced.block;

import com.mojang.serialization.MapCodec;
import com.xenon863.vanilla_enhanced.item.ModItems;
import net.minecraft.block.*;
import net.minecraft.item.ItemConvertible;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldView;

import static net.minecraft.block.CropBlock.AGE;

public class UnderwaterCrops extends PlantBlock implements Waterloggable {

    protected UnderwaterCrops(Settings settings) {
        super(settings);
        this.setDefaultState(this.stateManager.getDefaultState().with(AGE, 0));
    }


    public VoxelShape getOutlineShape(BlockState state, WorldView world, BlockPos pos, ShapeContext context) {
        return Block.createCuboidShape(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (world.getBlockState(pos.down()).isOf(Blocks.WATER) && state.get(AGE) < 7 && random.nextInt(5) == 0) {
            world.setBlockState(pos, state.with(AGE, state.get(AGE) + 1), 2);
        }
    }

    @Override
    public boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        return floor.isOf(Blocks.WATER);
    }

    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        return world.getBlockState(pos.down()).isOf(Blocks.WATER);
    }

    protected ItemConvertible getSeedsItem() {
        return ModItems.RICE;
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(AGE);
    }

    @Override
    protected MapCodec<? extends PlantBlock> getCodec() {
        return null;
    }
}
