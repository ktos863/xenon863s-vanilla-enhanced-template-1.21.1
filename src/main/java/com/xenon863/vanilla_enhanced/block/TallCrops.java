package com.xenon863.vanilla_enhanced.block;

import com.xenon863.vanilla_enhanced.item.ModItems;
import net.minecraft.block.*;
import net.minecraft.item.ItemConvertible;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.IntProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public class TallCrops extends CropBlock {

    public static final IntProperty AGE = IntProperty.of("age", 0, 15);
    public static final BooleanProperty IS_TOP = BooleanProperty.of("is_top");

    private static final VoxelShape[] AGE_TO_SHAPE = new VoxelShape[]{
            Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
            Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
            Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
            Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
            Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
            Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
            Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
            Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 16.0, 16.0),
            Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
            Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
            Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
            Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
            Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
            Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
            Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
            Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
    };

    public TallCrops(Settings settings) {
        super(settings);
        this.setDefaultState(this.stateManager.getDefaultState().with(AGE, 0).with(IS_TOP, false));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(AGE, IS_TOP);
    }

    @Override
    protected void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (world.getBaseLightLevel(pos, 0) >= 9) {
            int age = this.getAge(state);
            if (age < this.getMaxAge()) {
                float f = getAvailableMoisture(this, world, pos);
                if (random.nextInt((int) (25.0F / f) + 1) == 0) {
                    if (age < 7) {
                        world.setBlockState(pos, this.withAge(age + 1).with(IS_TOP, false), 2);
                    } else if (age == 7 && world.getBlockState(pos.up()).isAir()) {
                        world.setBlockState(pos.up(), this.withAge(age + 1).with(IS_TOP, true), 2);
                    } else if (age > 7 && age < 15) {
                        world.setBlockState(pos, this.withAge(age + 1).with(IS_TOP, state.get(IS_TOP)), 2);
                    }
                }
            }
        }
    }

    @Override
    public void applyGrowth(World world, BlockPos pos, BlockState state) {
        int age = this.getAge(state);
        int newAge = Math.min(age + this.getGrowthAmount(world), this.getMaxAge());

        if (age < 7) {
            world.setBlockState(pos, this.withAge(newAge).with(IS_TOP, false), 2);
        } else if (age == 7 && world.getBlockState(pos.up()).isAir()) {
            world.setBlockState(pos.up(), this.withAge(newAge).with(IS_TOP, true), 2);
        } else if (age > 7 && age < 15 && state.get(IS_TOP) && world.getBlockState(pos.down()).getBlock() == this) {
            world.setBlockState(pos, this.withAge(newAge).with(IS_TOP, true), 2);
        } else if (age > 7 && !state.get(IS_TOP) && world.getBlockState(pos.up()).isOf(this)) {
            world.setBlockState(pos, this.withAge(newAge).with(IS_TOP, false), 2);
        }
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return AGE_TO_SHAPE[this.getAge(state)];
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return ModItems.CORN_GRAINS;
    }

    @Override
    public IntProperty getAgeProperty() {
        return AGE;
    }

    @Override
    public int getMaxAge() {
        return 15;
    }
}
