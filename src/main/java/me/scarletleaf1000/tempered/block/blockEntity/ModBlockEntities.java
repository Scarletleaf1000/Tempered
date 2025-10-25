package me.scarletleaf1000.tempered.block.blockEntity;

import me.scarletleaf1000.tempered.Tempered;
import me.scarletleaf1000.tempered.block.ModBlocks;
import me.scarletleaf1000.tempered.block.blockEntity.custom.CrudeForgeBlockEntity;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlockEntities {

    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, Tempered.MOD_ID);

    public static final Supplier<BlockEntityType<CrudeForgeBlockEntity>> CRUDE_FORGE_BE =
            BLOCK_ENTITIES.register("crude_forge_be", () -> BlockEntityType.Builder.of(
                    CrudeForgeBlockEntity::new, ModBlocks.CRUDE_FORGE.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
