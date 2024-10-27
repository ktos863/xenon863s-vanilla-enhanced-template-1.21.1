package com.xenon863.vanilla_enhanced.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.CropBlock;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;

public class ModCrops extends CropBlock {

    public static final int MAX_AGE = 7;
    public static final IntProperty AGE = IntProperty.of("age", 0, 7);

    private final Item seedItem; // Declare seedItem field

    public ModCrops(Settings settings, Item seedItem) {
        super(settings);
        this.seedItem = seedItem; // Initialize seedItem in constructor
        this.setDefaultState(this.stateManager.getDefaultState().with(AGE, 0));
    }

    // Override getSeedsItem to return the stored seedItem
    @Override
    protected ItemConvertible getSeedsItem() {
        return this.seedItem;
    }

    @Override
    public IntProperty getAgeProperty() {
        return AGE;
    }

    @Override
    public int getMaxAge() {
        return MAX_AGE;
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(AGE);
    }
}
