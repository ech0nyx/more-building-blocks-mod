package net.mrgdev.mbbmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ItemGroup;
import net.mrgdev.mbbmod.MoreBuildingBlocksMod;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MoreBuildingBlocksMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MoreBuildingBlocksMod.LOGGER.info("Registering Mod Items for " + MoreBuildingBlocksMod.MOD_ID);
    }

}
