package me.scarletleaf1000.tempered.block;

import me.scarletleaf1000.tempered.Tempered;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlocks {
    public final static DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Tempered.MOD_ID);

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
