package net.stohun.spun.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.stohun.spun.Spun;

public class ModItems {

    public static final Item SLUDGE = registerItem("sludge", new Item(new FabricItemSettings()));
    public static final Item CEREBRUM = registerItem("cerebrum", new Item(new FabricItemSettings()));
    public static final Item CEREBRUM_CHARGED = registerItem("cerebrum_charged", new Item(new FabricItemSettings()));

//    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
//        entries.add(SLUDGE);
//        entries.add(CEREBRUM);
//        entries.add(CEREBRUM_CHARGED);
//    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Spun.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Spun.LOGGER.info("Register Mod Items for " + Spun.MOD_ID);

        //ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
