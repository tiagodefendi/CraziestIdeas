package com.defendi.craziestideas.datagen;

import com.defendi.craziestideas.CraziestIdeas;
import com.defendi.craziestideas.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                               @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, CraziestIdeas.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                // LEAD ============================
                .add(ModBlocks.LEAD_BLOCK.get())
                .add(ModBlocks.RAW_LEAD_BLOCK.get())
                .add(ModBlocks.LEAD_ORE.get())
                .add(ModBlocks.DEEPSLATE_LEAD_ORE.get())
                .add(ModBlocks.LEAD_PRESSURE_PLATE.get())
                .add(ModBlocks.LEAD_BUTTON.get())
                .add(ModBlocks.LEAD_DOOR.get())
                .add(ModBlocks.LEAD_TRAPDOOR.get())
                // WHITE LEAD ============================
                .add(ModBlocks.WHITE_LEAD_BLOCK.get())
                .add(ModBlocks.RAW_WHITE_LEAD_BLOCK.get())
                .add(ModBlocks.WHITE_LEAD_ORE.get())
                .add(ModBlocks.DEEPSLATE_WHITE_LEAD_ORE.get())
                .add(ModBlocks.WHITE_LEAD_BRICKS.get())
                .add(ModBlocks.WHITE_LEAD_BRICKS_STAIRS.get())
                .add(ModBlocks.WHITE_LEAD_BRICKS_SLAB.get())
                .add(ModBlocks.WHITE_LEAD_BRICKS_WALL.get())
                .add(ModBlocks.WHITE_LEAD_BRICKS_FENCE.get())
                .add(ModBlocks.WHITE_LEAD_BRICKS_FENCE_GATE.get())
                .add(ModBlocks.WHITE_LEAD_TILES.get())
                .add(ModBlocks.WHITE_LEAD_TILES_STAIRS.get())
                .add(ModBlocks.WHITE_LEAD_TILES_SLAB.get())
                .add(ModBlocks.WHITE_LEAD_TILES_WALL.get())
                .add(ModBlocks.WHITE_LEAD_TILES_FENCE.get())
                .add(ModBlocks.WHITE_LEAD_TILES_FENCE_GATE.get())
                .add(ModBlocks.WHITE_LEAD_PRESSURE_PLATE.get())
                .add(ModBlocks.WHITE_LEAD_BUTTON.get())
                .add(ModBlocks.WHITE_LEAD_DOOR.get())
                .add(ModBlocks.WHITE_LEAD_TRAPDOOR.get())
                // MAGIC BLOCK ============================
                .add(ModBlocks.MAGIC_BLOCK.get())
                ;

        tag(BlockTags.NEEDS_IRON_TOOL)
                // LEAD ============================
                .add(ModBlocks.LEAD_BLOCK.get())
                .add(ModBlocks.RAW_LEAD_BLOCK.get())
                .add(ModBlocks.LEAD_ORE.get())
                .add(ModBlocks.DEEPSLATE_LEAD_ORE.get())
                .add(ModBlocks.LEAD_PRESSURE_PLATE.get())
                .add(ModBlocks.LEAD_BUTTON.get())
                .add(ModBlocks.LEAD_DOOR.get())
                .add(ModBlocks.LEAD_TRAPDOOR.get())
                // WHITE LEAD ============================
                .add(ModBlocks.WHITE_LEAD_BLOCK.get())
                .add(ModBlocks.RAW_WHITE_LEAD_BLOCK.get())
                .add(ModBlocks.WHITE_LEAD_ORE.get())
                .add(ModBlocks.DEEPSLATE_WHITE_LEAD_ORE.get())
                .add(ModBlocks.WHITE_LEAD_BRICKS.get())
                .add(ModBlocks.WHITE_LEAD_BRICKS_STAIRS.get())
                .add(ModBlocks.WHITE_LEAD_BRICKS_SLAB.get())
                .add(ModBlocks.WHITE_LEAD_BRICKS_WALL.get())
                .add(ModBlocks.WHITE_LEAD_BRICKS_FENCE.get())
                .add(ModBlocks.WHITE_LEAD_BRICKS_FENCE_GATE.get())
                .add(ModBlocks.WHITE_LEAD_TILES.get())
                .add(ModBlocks.WHITE_LEAD_TILES_STAIRS.get())
                .add(ModBlocks.WHITE_LEAD_TILES_SLAB.get())
                .add(ModBlocks.WHITE_LEAD_TILES_WALL.get())
                .add(ModBlocks.WHITE_LEAD_TILES_FENCE.get())
                .add(ModBlocks.WHITE_LEAD_TILES_FENCE_GATE.get())
                .add(ModBlocks.WHITE_LEAD_PRESSURE_PLATE.get())
                .add(ModBlocks.WHITE_LEAD_BUTTON.get())
                .add(ModBlocks.WHITE_LEAD_DOOR.get())
                .add(ModBlocks.WHITE_LEAD_TRAPDOOR.get())
        ;

        tag(BlockTags.FENCES)
                .add(ModBlocks.WHITE_LEAD_BRICKS_FENCE.get())
                .add(ModBlocks.WHITE_LEAD_TILES_FENCE.get())
        ;

        tag(BlockTags.FENCE_GATES)
                .add(ModBlocks.WHITE_LEAD_BRICKS_FENCE_GATE.get())
                .add(ModBlocks.WHITE_LEAD_TILES_FENCE_GATE.get())
        ;

        tag(BlockTags.WALLS)
                .add(ModBlocks.WHITE_LEAD_BRICKS_WALL.get())
                .add(ModBlocks.WHITE_LEAD_TILES_WALL.get())
        ;

    }
}
