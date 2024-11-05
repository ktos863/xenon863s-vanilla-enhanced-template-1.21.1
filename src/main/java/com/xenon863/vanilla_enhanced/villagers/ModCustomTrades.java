package com.xenon863.vanilla_enhanced.villagers;

import com.xenon863.vanilla_enhanced.block.ModBlocks;
import com.xenon863.vanilla_enhanced.item.ModItems;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffers;
import net.minecraft.village.VillagerProfession;

public class ModCustomTrades {

    public static void registerCustomTrades(){
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 1, factories -> {
            factories.add(new TradeOffers.SellItemFactory(ModItems.RICE, 1, 1, 1));
            factories.add(new TradeOffers.SellItemFactory(ModItems.CORN_GRAINS, 1, 1, 1));
            factories.add(new TradeOffers.BuyItemFactory(ModItems.RICE, 20, 16, 2));
            factories.add(new TradeOffers.BuyItemFactory(ModItems.CORN, 10, 16, 2));
        });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 5, factories -> {
            factories.add(new TradeOffers.SellItemFactory(ModItems.GOLDEN_RICE, 3, 1, 20));
            factories.add(new TradeOffers.SellItemFactory(ModItems.BOWL_OF_GOLDEN_RICE, 4, 2, 20));
        });

        TradeOfferHelper.registerVillagerOffers(ModVillagers.FORESTER, 1, factories -> {
            factories.add(new TradeOffers.BuyItemFactory(Blocks.ALLIUM.asItem(), 10, 16, 2));
            factories.add(new TradeOffers.BuyItemFactory(Blocks.AZURE_BLUET.asItem(), 10, 16, 2));
            factories.add(new TradeOffers.BuyItemFactory(Blocks.BLUE_ORCHID.asItem(), 10, 16, 2));
            factories.add(new TradeOffers.BuyItemFactory(Blocks.CORNFLOWER.asItem(), 10, 16, 2));
            factories.add(new TradeOffers.BuyItemFactory(Blocks.DANDELION.asItem(), 10, 16, 2));
            factories.add(new TradeOffers.BuyItemFactory(Blocks.LILY_OF_THE_VALLEY.asItem(), 10, 16, 2));
            factories.add(new TradeOffers.BuyItemFactory(Blocks.OXEYE_DAISY.asItem(), 10, 16, 2));
            factories.add(new TradeOffers.BuyItemFactory(Blocks.POPPY.asItem(), 10, 16, 2));
            factories.add(new TradeOffers.BuyItemFactory(Blocks.PINK_PETALS.asItem(), 10, 16, 2));
            factories.add(new TradeOffers.BuyItemFactory(Blocks.ORANGE_TULIP.asItem(), 10, 16, 2));
            factories.add(new TradeOffers.BuyItemFactory(Blocks.PINK_TULIP.asItem(), 10, 16, 2));
            factories.add(new TradeOffers.BuyItemFactory(Blocks.RED_TULIP.asItem(), 10, 16, 2));
            factories.add(new TradeOffers.BuyItemFactory(Blocks.WHITE_TULIP.asItem(), 10, 16, 2));
        });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.FORESTER, 2, factories -> {
            factories.add(new TradeOffers.SellItemFactory(Items.HONEY_BOTTLE, 1,4, 5));
            factories.add(new TradeOffers.SellItemFactory(Items.HONEYCOMB, 1, 4, 5));
            factories.add(new TradeOffers.BuyItemFactory(Blocks.OAK_SAPLING.asItem(), 4, 16, 10));
            factories.add(new TradeOffers.BuyItemFactory(Blocks.BIRCH_SAPLING.asItem(), 4, 16, 10));
            factories.add(new TradeOffers.BuyItemFactory(Blocks.SPRUCE_SAPLING.asItem(), 4, 16, 10));
            factories.add(new TradeOffers.BuyItemFactory(Blocks.DARK_OAK_SAPLING.asItem(), 4, 16, 10));
            factories.add(new TradeOffers.BuyItemFactory(Blocks.ACACIA_SAPLING.asItem(), 4, 16, 10));
            factories.add(new TradeOffers.BuyItemFactory(Blocks.JUNGLE_SAPLING.asItem(), 4, 16, 10));
            factories.add(new TradeOffers.BuyItemFactory(Blocks.MANGROVE_PROPAGULE.asItem(), 4, 16, 10));
            factories.add(new TradeOffers.BuyItemFactory(Blocks.CHERRY_SAPLING.asItem(), 4, 16, 10));
        });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.FORESTER, 3, factories -> {
            factories.add(new TradeOffers.BuyItemFactory(Blocks.BAMBOO.asItem(), 32, 16, 20));
            factories.add(new TradeOffers.BuyItemFactory(Blocks.AZALEA.asItem(), 4, 16, 20));
            factories.add(new TradeOffers.BuyItemFactory(Blocks.FLOWERING_AZALEA.asItem(), 4, 16, 20));
            factories.add(new TradeOffers.BuyItemFactory(Items.IRON_AXE, 1, 3, 20));
            factories.add(new TradeOffers.SellItemFactory(ModBlocks.AZALEA_LOG, 1, 4, 16, 15));
        });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.FORESTER, 4, factories -> {
            factories.add(new TradeOffers.BuyItemFactory(Items.SWEET_BERRIES, 10, 16, 30));
            factories.add(new TradeOffers.SellItemFactory(Blocks.BEEHIVE.asItem(), 3, 1, 15));
            factories.add(new TradeOffers.SellItemFactory(Blocks.SPORE_BLOSSOM.asItem(), 4, 2, 15));
            factories.add(new TradeOffers.SellItemFactory(ModItems.COPPER_PEAR, 2, 3, 15));
        });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.FORESTER, 5, factories -> {
            factories.add(new TradeOffers.SellItemFactory(Items.GOLDEN_APPLE, 10, 2, 20));
            factories.add(new TradeOffers.SellItemFactory(Items.CHORUS_FRUIT, 1, 3, 20));
        });

        TradeOfferHelper.registerVillagerOffers(ModVillagers.ENGINEER, 1, factories -> {
            factories.add(new TradeOffers.SellItemFactory(Items.REDSTONE, 1, 2, 1));
            factories.add(new TradeOffers.BuyItemFactory(Blocks.STONE_BUTTON.asItem(), 20, 3, 2));
            factories.add(new TradeOffers.SellItemFactory(Blocks.REDSTONE_LAMP.asItem(), 2, 3, 1));
        });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.ENGINEER, 2, factories -> {
            factories.add(new TradeOffers.BuyItemFactory(Blocks.REDSTONE_TORCH.asItem(), 2, 16, 10));
            factories.add(new TradeOffers.SellItemFactory(Blocks.HOPPER.asItem(), 3, 1, 5));
            factories.add(new TradeOffers.BuyItemFactory(Blocks.LEVER.asItem(), 14, 16, 10));
        });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.ENGINEER, 3, factories -> {
            factories.add(new TradeOffers.SellItemFactory(Blocks.DAYLIGHT_DETECTOR.asItem(), 1, 1, 10));
            factories.add(new TradeOffers.SellItemFactory(Blocks.REPEATER.asItem(), 1, 1, 10));
            factories.add(new TradeOffers.SellItemFactory(Blocks.PISTON.asItem(), 1, 2, 10));
        });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.ENGINEER, 4, factories -> {
            factories.add(new TradeOffers.SellItemFactory(Blocks.OBSERVER.asItem(), 2, 3, 15));
            factories.add(new TradeOffers.SellItemFactory(Items.TNT_MINECART.asItem(), 3, 1, 15));
            factories.add(new TradeOffers.SellItemFactory(Blocks.COPPER_BULB.asItem(), 4, 1, 15));
        });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.ENGINEER, 5, factories -> {
            factories.add(new TradeOffers.SellItemFactory(Blocks.REDSTONE_BLOCK.asItem(), 3, 1, 20));
            factories.add(new TradeOffers.SellItemFactory(Blocks.COMPARATOR.asItem(), 1, 1, 20));
            factories.add(new TradeOffers.SellItemFactory(Blocks.SCULK_SENSOR.asItem(), 6, 1, 20));
        });

        TradeOfferHelper.registerVillagerOffers(ModVillagers.MINER, 1, factories -> {
            factories.add(new TradeOffers.BuyItemFactory(Items.STONE_PICKAXE, 1, 1, 2));
            factories.add(new TradeOffers.SellItemFactory(Items.COAL, 1, 10, 1));
            factories.add(new TradeOffers.SellItemFactory(Blocks.COBBLESTONE.asItem(), 1, 64, 1));
            factories.add(new TradeOffers.SellItemFactory(Blocks.SAND.asItem(), 1, 16, 1));
            factories.add(new TradeOffers.SellItemFactory(Blocks.DIRT.asItem(), 1, 24, 1));
        });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.MINER, 2, factories -> {
            factories.add(new TradeOffers.SellItemFactory(Blocks.RAIL.asItem(), 1, 16, 5));
            factories.add(new TradeOffers.BuyItemFactory(Items.MINECART, 1, 1, 10));
            factories.add(new TradeOffers.SellItemFactory(Blocks.IRON_ORE.asItem(), 1, 2, 5));
            factories.add(new TradeOffers.SellItemFactory(Blocks.COAL_ORE.asItem(), 1, 6, 5));
            factories.add(new TradeOffers.SellItemFactory(Blocks.COPPER_ORE.asItem(), 1, 4, 5));
        });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.MINER, 3, factories -> {
            factories.add(new TradeOffers.SellItemFactory(Blocks.DEEPSLATE_COPPER_ORE.asItem(), 1, 3, 10));
            factories.add(new TradeOffers.BuyItemFactory(Items.IRON_PICKAXE, 1, 4, 20, 2));
            factories.add(new TradeOffers.SellItemFactory(Blocks.DEEPSLATE_IRON_ORE.asItem(), 2, 3, 10));
            factories.add(new TradeOffers.SellItemFactory(Blocks.LAPIS_ORE.asItem(), 1, 6, 10));
            factories.add(new TradeOffers.SellItemFactory(Blocks.DEEPSLATE_LAPIS_ORE.asItem(), 1, 4, 10));
        });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.MINER, 4, factories -> {
            factories.add(new TradeOffers.SellItemFactory(Blocks.DEEPSLATE_GOLD_ORE.asItem(), 3, 1, 15));
            factories.add(new TradeOffers.BuyItemFactory(Items.DIAMOND_PICKAXE, 1, 2, 30, 15));
            factories.add(new TradeOffers.SellItemFactory(Blocks.DEEPSLATE_REDSTONE_ORE.asItem(), 2, 1, 15));
            factories.add(new TradeOffers.SellItemFactory(Blocks.REDSTONE_ORE.asItem(), 2, 1, 15));
            factories.add(new TradeOffers.SellItemFactory(Items.AXOLOTL_BUCKET, 10, 1, 15));
        });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.MINER, 5, factories -> {
            factories.add(new TradeOffers.SellItemFactory(Blocks.GOLD_ORE.asItem(), 3, 1, 20));
            factories.add(new TradeOffers.SellItemFactory(Blocks.EMERALD_ORE.asItem(), 10, 1, 20));
            factories.add(new TradeOffers.SellItemFactory(Blocks.DIAMOND_ORE.asItem(), 20, 1, 20));
            factories.add(new TradeOffers.SellItemFactory(Blocks.DEEPSLATE_COAL_ORE.asItem(), 1, 2, 20));
            factories.add(new TradeOffers.SellItemFactory(Blocks.DEEPSLATE_DIAMOND_ORE.asItem(), 3, 1, 20));
            factories.add(new TradeOffers.SellItemFactory(ModBlocks.TUNGSTEN_ORE.asItem(), 14, 1, 20));
            factories.add(new TradeOffers.SellItemFactory(ModBlocks.DEEPSLATE_TUNGSTEN_ORE.asItem(), 14, 1, 20));
        });
    }
}
