package net.stohun.spun.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.stohun.spun.Spun;
import net.stohun.spun.block.ModBlocks;

public class ModItemGroups {

    public static final ItemGroup SPUN_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Spun.MOD_ID, "spun"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.spun"))
                    .icon(() -> new ItemStack(ModItems.SLUDGE)).entries((displayContext, entries) -> {
                        entries.add(ModItems.SLUDGE);
                        entries.add(ModItems.CEREBRUM);
                        entries.add(ModItems.CEREBRUM_CHARGED);
                        entries.add(ModBlocks.CEREBRUM_BLOCK);
                        entries.add(ModBlocks.CEREBRUM_CHARGED_BLOCK);

                    }).build());

    public static void registerItemGroups() {
        Spun.LOGGER.info("Registering Item Groups for " + Spun.MOD_ID);
    }
}
