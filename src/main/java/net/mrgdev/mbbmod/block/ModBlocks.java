package net.mrgdev.mbbmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.WallBlock;
import net.mrgdev.mbbmod.MoreBuildingBlocksMod;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.mrgdev.mbbmod.item.ModItemGroup;

public class ModBlocks {
    // ----------------------------- SOLID BLOCKS -----------------------------

    public static final Block POLISHED_TUFF = registerBlock("polished_tuff",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroup.MORE_BUILDING_BLOCKS);

    public static final Block TUFF_BRICKS = registerBlock("tuff_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroup.MORE_BUILDING_BLOCKS);

    public static final Block CRACKED_TUFF_BRICKS = registerBlock("cracked_tuff_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroup.MORE_BUILDING_BLOCKS);

    public static final Block TUFF_TILES = registerBlock("tuff_tiles",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroup.MORE_BUILDING_BLOCKS);

    public static final Block CRACKED_TUFF_TILES = registerBlock("cracked_tuff_tiles",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroup.MORE_BUILDING_BLOCKS);

    public static final Block POLISHED_CALCITE = registerBlock("polished_calcite",
            new Block(FabricBlockSettings.of(Material.STONE).strength(1.25f).requiresTool()), ModItemGroup.MORE_BUILDING_BLOCKS);

    public static final Block CALCITE_BRICKS = registerBlock("calcite_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(1.25f).requiresTool()), ModItemGroup.MORE_BUILDING_BLOCKS);

    public static final Block CRACKED_CALCITE_BRICKS = registerBlock("cracked_calcite_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(1.25f).requiresTool()), ModItemGroup.MORE_BUILDING_BLOCKS);

    public static final Block CALCITE_TILES = registerBlock("calcite_tiles",
            new Block(FabricBlockSettings.of(Material.STONE).strength(1.25f).requiresTool()), ModItemGroup.MORE_BUILDING_BLOCKS);

    public static final Block CRACKED_CALCITE_TILES = registerBlock("cracked_calcite_tiles",
            new Block(FabricBlockSettings.of(Material.STONE).strength(1.25f).requiresTool()), ModItemGroup.MORE_BUILDING_BLOCKS);

    public static final Block POLISHED_DRIPSTONE = registerBlock("polished_dripstone",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroup.MORE_BUILDING_BLOCKS);

    public static final Block DRIPSTONE_BRICKS = registerBlock("dripstone_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroup.MORE_BUILDING_BLOCKS);

    public static final Block CRACKED_DRIPSTONE_BRICKS = registerBlock("cracked_dripstone_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroup.MORE_BUILDING_BLOCKS);

    public static final Block DRIPSTONE_TILES = registerBlock("dripstone_tiles",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroup.MORE_BUILDING_BLOCKS);

    public static final Block CRACKED_DRIPSTONE_TILES = registerBlock("cracked_dripstone_tiles",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroup.MORE_BUILDING_BLOCKS);

    public static final Block POLISHED_BASALT = registerBlock("polished_basalt",
            new Block(FabricBlockSettings.of(Material.STONE).strength(1.75f).requiresTool()), ModItemGroup.MORE_BUILDING_BLOCKS);

    public static final Block BASALT_BRICKS = registerBlock("basalt_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(1.75f).requiresTool()), ModItemGroup.MORE_BUILDING_BLOCKS);

    public static final Block CRACKED_BASALT_BRICKS = registerBlock("cracked_basalt_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(1.75f).requiresTool()), ModItemGroup.MORE_BUILDING_BLOCKS);

    public static final Block BASALT_TILES = registerBlock("basalt_tiles",
            new Block(FabricBlockSettings.of(Material.STONE).strength(1.75f).requiresTool()), ModItemGroup.MORE_BUILDING_BLOCKS);

    public static final Block CRACKED_BASALT_TILES = registerBlock("cracked_basalt_tiles",
            new Block(FabricBlockSettings.of(Material.STONE).strength(1.75f).requiresTool()), ModItemGroup.MORE_BUILDING_BLOCKS);

   // ---------------------------- WALLS ----------------------------

    public static final Block TUFF_WALL = registerBlock("tuff_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroup.MORE_BUILDING_BLOCKS);

    public static final Block POLISHED_TUFF_WALL = registerBlock("polished_tuff_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroup.MORE_BUILDING_BLOCKS);

    public static final Block TUFF_BRICK_WALL = registerBlock("tuff_brick_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroup.MORE_BUILDING_BLOCKS);

    public static final Block TUFF_TILE_WALL = registerBlock("tuff_tile_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroup.MORE_BUILDING_BLOCKS);

    public static final Block CALCITE_WALL = registerBlock("calcite_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroup.MORE_BUILDING_BLOCKS);

    public static final Block POLISHED_CALCITE_WALL = registerBlock("polished_calcite_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroup.MORE_BUILDING_BLOCKS);

    public static final Block CALCITE_BRICK_WALL = registerBlock("calcite_brick_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroup.MORE_BUILDING_BLOCKS);

    public static final Block CALCITE_TILE_WALL = registerBlock("calcite_tile_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroup.MORE_BUILDING_BLOCKS);

    public static final Block DRIPSTONE_WALL = registerBlock("dripstone_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroup.MORE_BUILDING_BLOCKS);

    public static final Block POLISHED_DRIPSTONE_WALL = registerBlock("polished_dripstone_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroup.MORE_BUILDING_BLOCKS);

    public static final Block DRIPSTONE_BRICK_WALL = registerBlock("dripstone_brick_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroup.MORE_BUILDING_BLOCKS);

    public static final Block DRIPSTONE_TILE_WALL = registerBlock("dripstone_tile_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroup.MORE_BUILDING_BLOCKS);

    public static final Block BASALT_WALL = registerBlock("basalt_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).strength(1.75f).requiresTool()), ModItemGroup.MORE_BUILDING_BLOCKS);

    public static final Block POLISHED_BASALT_WALL = registerBlock("polished_basalt_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).strength(1.75f).requiresTool()), ModItemGroup.MORE_BUILDING_BLOCKS);

    public static final Block BASALT_BRICK_WALL = registerBlock("basalt_brick_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).strength(1.75f).requiresTool()), ModItemGroup.MORE_BUILDING_BLOCKS);

    public static final Block BASALT_TILE_WALL = registerBlock("basalt_tile_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).strength(1.75f).requiresTool()), ModItemGroup.MORE_BUILDING_BLOCKS);

    // ---------------------------- STAIRS ----------------------------

    // ---------------------------- SLABS ----------------------------

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(MoreBuildingBlocksMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(MoreBuildingBlocksMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks() {
        MoreBuildingBlocksMod.LOGGER.info("Registering ModBlocks for " + MoreBuildingBlocksMod.MOD_ID);
    }
}
