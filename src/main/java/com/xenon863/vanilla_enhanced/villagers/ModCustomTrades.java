package com.xenon863.vanilla_enhanced.villagers;

import com.xenon863.vanilla_enhanced.block.ModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradedItem;

import java.util.List;
import java.util.Random;

public class ModCustomTrades {

    public static void registerCustomTrades(){
        TradeOfferHelper.registerVillagerOffers(ModVillagers.FORESTER, 1, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Items.POPPY, 10),
                    new ItemStack(Items.EMERALD, 1),
                    12,
                    1,
                    0.05f
            ));
            factories.add((entity, random) -> {
                Block randomFlower = flowers.get(random.nextInt(flowers.size()));

                return new TradeOffer(
                        new TradedItem(new BlockItem(randomFlower, new Item.Settings()), 5),
                        new ItemStack(Items.EMERALD, 1),
                        12,
                        1,
                        0.05f
                );
            });
            factories.add((entity, random) -> {
                Block randomTallFlower = tallFlowers.get(random.nextInt(tallFlowers.size()));

                return new TradeOffer(
                        new TradedItem(new BlockItem(randomTallFlower, new Item.Settings()), 3),
                        new ItemStack(Items.EMERALD, 1),
                        12,
                        1,
                        0.05f
                );
            });
        });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.FORESTER, 2, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Items.EMERALD),
                    new ItemStack(Items.HONEY_BOTTLE, 4),
                    12,
                    2,
                    0.05f
            ));
            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Items.EMERALD),
                    new ItemStack(Items.HONEYCOMB, 4),
                    12,
                    2,
                    0.05f
            ));
            factories.add((entity, random) -> {
                Block randomSapling = saplings.get(random.nextInt(saplings.size()));

                return new TradeOffer(
                        new TradedItem(new BlockItem(randomSapling, new Item.Settings()), 4),
                        new ItemStack(Items.EMERALD, 1),
                        12,
                        1,
                        0.05f
                );
            });
        });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.FORESTER, 3, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Items.EMERALD),
                    new ItemStack(ModBlocks.AZALEA_LOG, 4),
                    12,
                    4,
                    0.05f
            ));
            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Items.IRON_AXE),
                    new ItemStack(Items.EMERALD, 2),
                    3,
                    4,
                    0.05f
            ));
        });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.FORESTER, 4, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Items.EMERALD, 4),
                    new ItemStack(Items.GOLDEN_APPLE, 1),
                    4,
                    8,
                    0.05f
            ));
            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Items.SWEET_BERRIES, 10),
                    new ItemStack(Items.EMERALD),
                    12,
                    8,
                    0.05f
            ));
        });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.FORESTER, 5, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Items.EMERALD, 4),
                    new ItemStack(Blocks.WITHER_ROSE, 1),
                    4,
                    8,
                    0.05f
            ));
            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Items.EMERALD, 3),
                    new ItemStack(Items.CHORUS_FRUIT, 12),
                    12,
                    8,
                    0.05f
            ));
        });
    }
    private static final List<Block> flowers = List.of(
            Blocks.DANDELION,
            Blocks.BLUE_ORCHID,
            Blocks.ALLIUM,
            Blocks.AZURE_BLUET,
            Blocks.RED_TULIP,
            Blocks.ORANGE_TULIP,
            Blocks.WHITE_TULIP,
            Blocks.PINK_TULIP,
            Blocks.OXEYE_DAISY,
            Blocks.CORNFLOWER,
            Blocks.LILY_OF_THE_VALLEY
    );
    private static final List<Block> tallFlowers = List.of(
            Blocks.SUNFLOWER,
            Blocks.LILAC,
            Blocks.ROSE_BUSH,
            Blocks.PEONY
    );
    private static final List<Block> saplings = List.of(
            Blocks.OAK_SAPLING,
            Blocks.SPRUCE_SAPLING,
            Blocks.BIRCH_SAPLING,
            Blocks.JUNGLE_SAPLING,
            Blocks.ACACIA_SAPLING,
            Blocks.DARK_OAK_SAPLING,
            Blocks.MANGROVE_PROPAGULE,
            Blocks.CHERRY_SAPLING
    );
}
