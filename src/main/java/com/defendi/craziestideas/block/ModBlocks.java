package com.defendi.craziestideas.block;

import com.defendi.craziestideas.CraziestIdeas;
import com.defendi.craziestideas.block.custom.MagicBlock;
import com.defendi.craziestideas.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.WoodType;
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
    public static final DeferredBlock<PressurePlateBlock> LEAD_PRESSURE_PLATE = registerBlock(
            "lead_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.IRON, BlockBehaviour.Properties.of()
                    .strength(
                            5f,
                            6f
                    )
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.METAL)
                    .mapColor(MapColor.METAL)
            )
    );
    public static final DeferredBlock<ButtonBlock> LEAD_BUTTON = registerBlock(
            "lead_button",
            () -> new ButtonBlock(BlockSetType.STONE, 10, BlockBehaviour.Properties.of()
                    .strength(
                            5f,
                            6f
                    )
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.METAL)
                    .mapColor(MapColor.METAL)
                    .noCollission()
            )
    );
    public static final DeferredBlock<DoorBlock> LEAD_DOOR = registerBlock(
            "lead_door",
            () -> new DoorBlock(BlockSetType.IRON, BlockBehaviour.Properties.of()
                    .strength(
                            5f,
                            6f
                    )
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.METAL)
                    .mapColor(MapColor.METAL)
                    .noOcclusion()
            )
    );
    public static final DeferredBlock<TrapDoorBlock> LEAD_TRAPDOOR = registerBlock(
            "lead_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.IRON, BlockBehaviour.Properties.of()
                    .strength(
                            5f,
                            6f
                    )
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.METAL)
                    .mapColor(MapColor.METAL)
                    .noOcclusion()
            )
    );

    // WHITE LEAD =========================================================================
    public static final DeferredBlock<Block> WHITE_LEAD_BLOCK = registerBlock(
            "white_lead_block",
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
    public static final DeferredBlock<Block> RAW_WHITE_LEAD_BLOCK = registerBlock(
            "raw_white_lead_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(5.0F, 6.0F)
                    .requiresCorrectToolForDrops()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .mapColor(MapColor.METAL)
            )
    );
    public static final DeferredBlock<Block> WHITE_LEAD_ORE = registerBlock(
            "white_lead_ore",
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
    public static final DeferredBlock<Block> DEEPSLATE_WHITE_LEAD_ORE = registerBlock(
            "deepslate_white_lead_ore",
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
    public static final DeferredBlock<Block> WHITE_LEAD_BRICKS = registerBlock(
            "white_lead_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(
                            5f,
                            6f
                    )
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.METAL)
                    .mapColor(MapColor.METAL)
            )
    );
    public static final DeferredBlock<Block> WHITE_LEAD_TILES = registerBlock(
            "white_lead_tiles",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(
                            5f,
                            6f
                    )
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.METAL)
                    .mapColor(MapColor.METAL)
            )
    );
    public static final DeferredBlock<StairBlock> WHITE_LEAD_BRICKS_STAIRS = registerBlock(
            "white_lead_bricks_stairs",
            () -> new StairBlock(ModBlocks.WHITE_LEAD_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.of()
                    .strength(
                            5f,
                            6f
                    )
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.METAL)
                    .mapColor(MapColor.METAL)
            )
    );
    public static final DeferredBlock<SlabBlock> WHITE_LEAD_BRICKS_SLAB = registerBlock(
            "white_lead_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .strength(
                            5f,
                            6f
                    )
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.METAL)
                    .mapColor(MapColor.METAL)
            )
    );
    public static final DeferredBlock<StairBlock> WHITE_LEAD_TILES_STAIRS = registerBlock(
            "white_lead_tiles_stairs",
            () -> new StairBlock(ModBlocks.WHITE_LEAD_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.of()
                    .strength(
                            5f,
                            6f
                    )
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.METAL)
                    .mapColor(MapColor.METAL)
            )
    );
    public static final DeferredBlock<SlabBlock> WHITE_LEAD_TILES_SLAB = registerBlock(
            "white_lead_tiles_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .strength(
                            5f,
                            6f
                    )
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.METAL)
                    .mapColor(MapColor.METAL)
            )
    );
    public static final DeferredBlock<PressurePlateBlock> WHITE_LEAD_PRESSURE_PLATE = registerBlock(
            "white_lead_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.GOLD, BlockBehaviour.Properties.of()
                    .strength(
                            5f,
                            6f
                    )
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.METAL)
                    .mapColor(MapColor.METAL)
            )
    );
    public static final DeferredBlock<ButtonBlock> WHITE_LEAD_BUTTON = registerBlock(
            "white_lead_button",
            () -> new ButtonBlock(BlockSetType.OAK, 15, BlockBehaviour.Properties.of()
                    .strength(
                            5f,
                            6f
                    )
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.METAL)
                    .mapColor(MapColor.METAL)
                    .noCollission()
            )
    );
    public static final DeferredBlock<FenceBlock> WHITE_LEAD_BRICKS_FENCE = registerBlock(
            "white_lead_bricks_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of()
                    .strength(
                            5f,
                            6f
                    )
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.METAL)
                    .mapColor(MapColor.METAL)
            )
    );
    public static final DeferredBlock<FenceGateBlock> WHITE_LEAD_BRICKS_FENCE_GATE = registerBlock(
            "white_lead_bricks_fence_gate",
            () -> new FenceGateBlock(WoodType.OAK, BlockBehaviour.Properties.of()
                    .strength(
                            5f,
                            6f
                    )
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.METAL)
                    .mapColor(MapColor.METAL)
            )
    );
    public static final DeferredBlock<WallBlock> WHITE_LEAD_BRICKS_WALL = registerBlock(
            "white_lead_bricks_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .strength(
                            5f,
                            6f
                    )
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.METAL)
                    .mapColor(MapColor.METAL)
            )
    );
    public static final DeferredBlock<FenceBlock> WHITE_LEAD_TILES_FENCE = registerBlock(
            "white_lead_tiles_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of()
                    .strength(
                            5f,
                            6f
                    )
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.METAL)
                    .mapColor(MapColor.METAL)
            )
    );
    public static final DeferredBlock<FenceGateBlock> WHITE_LEAD_TILES_FENCE_GATE = registerBlock(
            "white_lead_tiles_fence_gate",
            () -> new FenceGateBlock(WoodType.OAK, BlockBehaviour.Properties.of()
                    .strength(
                            5f,
                            6f
                    )
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.METAL)
                    .mapColor(MapColor.METAL)
            )
    );
    public static final DeferredBlock<WallBlock> WHITE_LEAD_TILES_WALL = registerBlock(
            "white_lead_tiles_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .strength(
                            5f,
                            6f
                    )
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.METAL)
                    .mapColor(MapColor.METAL)
            )
    );
    public static final DeferredBlock<DoorBlock> WHITE_LEAD_DOOR = registerBlock(
            "white_lead_door",
            () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.of()
                    .strength(
                            5f,
                            6f
                    )
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.METAL)
                    .mapColor(MapColor.METAL)
                    .noOcclusion()
            )
    );
    public static final DeferredBlock<TrapDoorBlock> WHITE_LEAD_TRAPDOOR = registerBlock(
            "white_lead_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.of()
                    .strength(
                            5f,
                            6f
                    )
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.METAL)
                    .mapColor(MapColor.METAL)
                    .noOcclusion()
            )
    );

    // MISC  ==============================================================================
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
