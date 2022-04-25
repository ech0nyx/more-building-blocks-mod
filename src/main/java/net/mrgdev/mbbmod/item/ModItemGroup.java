package net.mrgdev.mbbmod.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.mrgdev.mbbmod.MoreBuildingBlocksMod;

public class ModItemGroup {
    public static final ItemGroup MORE_BUILDING_BLOCKS = FabricItemGroupBuilder.build(new Identifier(MoreBuildingBlocksMod.MOD_ID, "more_building_blocks"),
            () -> new ItemStack(Blocks.STONE_BRICKS));
}
