package com.defendi.craziestideas.block;

import com.defendi.craziestideas.CraziestIdeas;
import com.defendi.craziestideas.block.custom.MagicBlock;
import com.defendi.craziestideas.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(CraziestIdeas.MOD_ID);

    // LEAD =========================================================================
    public static final DeferredBlock<Block> LEAD_BLOCK = registerBlock(
            "lead_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(
                            5f,
                            6f
                    )
                    .requiresCorrectToolForDrops()
                    .instrument(NoteBlockInstrument.IRON_XYLOPHONE)
                    .sound(SoundType.METAL)
                    .mapColor(MapColor.METAL)
            )
    );
    public static final DeferredBlock<Block> RAW_LEAD_BLOCK = registerBlock(
            "raw_lead_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(5.0F, 6.0F)
                    .requiresCorrectToolForDrops()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .mapColor(MapColor.METAL)
            )
    );
    public static final DeferredBlock<Block> LEAD_ORE = registerBlock(
            "lead_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(
                            3f,
                            3f
                    )
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.DEEPSLATE)
                    .mapColor(MapColor.STONE)
            )
    );
    public static final DeferredBlock<Block> DEEPSLATE_LEAD_ORE = registerBlock(
            "deepslate_lead_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(
                            4.5f,
                            3f
                    )
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.DEEPSLATE)
                    .mapColor(MapColor.DEEPSLATE)
            )
    );

    // ==============================================================================
    public static final DeferredBlock<Block> MAGIC_BLOCK = registerBlock(
            "magic_block",
            () -> new MagicBlock(BlockBehaviour.Properties.of()
                    .strength(
                            2f,
                            2f
                    )
                    .requiresCorrectToolForDrops()
            )
    );

    // ==============================================================================
    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(
                name,
                () -> new BlockItem(
                        block.get(),
                        new Item.Properties()
                )
        );
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
