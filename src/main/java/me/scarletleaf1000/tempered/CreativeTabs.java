package me.scarletleaf1000.tempered;

import me.scarletleaf1000.tempered.block.ModBlocks;
import me.scarletleaf1000.tempered.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class CreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Tempered.MOD_ID);

    public static final Supplier<CreativeModeTab> TEMPERED_BLOCKS_ITEMS_TAB = CREATIVE_MODE_TAB.register("tempered_blocks_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.CRUDE_FORGE))
                    .title(Component.translatable("creativetab.tempered.blocks_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.CRUDE_FORGE);
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
