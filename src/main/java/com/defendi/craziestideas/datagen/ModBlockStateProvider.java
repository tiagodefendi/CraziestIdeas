package com.defendi.craziestideas.datagen;

import com.defendi.craziestideas.CraziestIdeas;
import com.defendi.craziestideas.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, CraziestIdeas.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        // LEAD ==================================
        blockWithItem(ModBlocks.LEAD_BLOCK);
        blockWithItem(ModBlocks.RAW_LEAD_BLOCK);
        blockWithItem(ModBlocks.LEAD_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_LEAD_ORE);
        buttonBlock(
                ModBlocks.LEAD_BUTTON.get(),
                blockTexture(ModBlocks.LEAD_BLOCK.get())
        );
        pressurePlateBlock(
                ModBlocks.LEAD_PRESSURE_PLATE.get(),
                blockTexture(ModBlocks.LEAD_BLOCK.get())
        );
        blockItem(ModBlocks.LEAD_PRESSURE_PLATE);
        doorBlockWithRenderType(
                ModBlocks.LEAD_DOOR.get(),
                modLoc("block/lead_door_bottom"),
                modLoc("block/lead_door_top"),
                "cutout"
        );
        trapdoorBlockWithRenderType(
                ModBlocks.LEAD_TRAPDOOR.get(),
                modLoc("block/lead_trapdoor"),
                true,
                "cutout"
        );
        blockItem(ModBlocks.LEAD_TRAPDOOR, "_bottom");
        // WHITE LEAD ==================================
        blockWithItem(ModBlocks.WHITE_LEAD_BLOCK);
        blockWithItem(ModBlocks.RAW_WHITE_LEAD_BLOCK);
        blockWithItem(ModBlocks.WHITE_LEAD_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_WHITE_LEAD_ORE);
        blockWithItem(ModBlocks.WHITE_LEAD_BRICKS);
        stairsBlock(
                ModBlocks.WHITE_LEAD_BRICKS_STAIRS.get(),
                blockTexture(ModBlocks.WHITE_LEAD_BRICKS.get())
        );
        blockItem(ModBlocks.WHITE_LEAD_BRICKS_STAIRS);
        slabBlock(
                ModBlocks.WHITE_LEAD_BRICKS_SLAB.get(),
                blockTexture(ModBlocks.WHITE_LEAD_BRICKS.get()),
                blockTexture(ModBlocks.WHITE_LEAD_BRICKS.get())
        );
        blockItem(ModBlocks.WHITE_LEAD_BRICKS_SLAB);
        wallBlock(
                ModBlocks.WHITE_LEAD_BRICKS_WALL.get(),
                blockTexture(ModBlocks.WHITE_LEAD_BRICKS.get())
        );
        fenceBlock(
                ModBlocks.WHITE_LEAD_BRICKS_FENCE.get(),
                blockTexture(ModBlocks.WHITE_LEAD_BRICKS.get())
        );
        fenceGateBlock(
                ModBlocks.WHITE_LEAD_BRICKS_FENCE_GATE.get(),
                blockTexture(ModBlocks.WHITE_LEAD_BRICKS.get())
        );
        blockItem(ModBlocks.WHITE_LEAD_BRICKS_FENCE_GATE);
        blockWithItem(ModBlocks.WHITE_LEAD_TILES);
        stairsBlock(
                ModBlocks.WHITE_LEAD_TILES_STAIRS.get(),
                blockTexture(ModBlocks.WHITE_LEAD_TILES.get())
        );
        blockItem(ModBlocks.WHITE_LEAD_TILES_STAIRS);
        slabBlock(
                ModBlocks.WHITE_LEAD_TILES_SLAB.get(),
                blockTexture(ModBlocks.WHITE_LEAD_TILES.get()),
                blockTexture(ModBlocks.WHITE_LEAD_TILES.get())
        );
        blockItem(ModBlocks.WHITE_LEAD_TILES_SLAB);
        wallBlock(
                ModBlocks.WHITE_LEAD_TILES_WALL.get(),
                blockTexture(ModBlocks.WHITE_LEAD_TILES.get())
        );
        fenceBlock(
                ModBlocks.WHITE_LEAD_TILES_FENCE.get(),
                blockTexture(ModBlocks.WHITE_LEAD_TILES.get())
        );
        fenceGateBlock(
                ModBlocks.WHITE_LEAD_TILES_FENCE_GATE.get(),
                blockTexture(ModBlocks.WHITE_LEAD_TILES.get())
        );
        blockItem(ModBlocks.WHITE_LEAD_TILES_FENCE_GATE);
        buttonBlock(
                ModBlocks.WHITE_LEAD_BUTTON.get(),
                blockTexture(ModBlocks.WHITE_LEAD_BLOCK.get())
        );
        pressurePlateBlock(
                ModBlocks.WHITE_LEAD_PRESSURE_PLATE.get(),
                blockTexture(ModBlocks.WHITE_LEAD_BLOCK.get())
        );
        blockItem(ModBlocks.WHITE_LEAD_PRESSURE_PLATE);
        doorBlockWithRenderType(
                ModBlocks.WHITE_LEAD_DOOR.get(),
                modLoc("block/white_lead_door_bottom"),
                modLoc("block/white_lead_door_top"),
                "cutout"
        );
        trapdoorBlockWithRenderType(
                ModBlocks.WHITE_LEAD_TRAPDOOR.get(),
                modLoc("block/white_lead_trapdoor"),
                true,
                "cutout"
        );
        blockItem(ModBlocks.WHITE_LEAD_TRAPDOOR, "_bottom");
        // MAGIC BLOCK ==================================
        blockWithItem(ModBlocks.MAGIC_BLOCK);
    }

    private void blockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }

    private void blockItem(DeferredBlock<?> deferredBlock) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("craziestideas:block/" + deferredBlock.getId().getPath()));
    }

    private void blockItem(DeferredBlock<?> deferredBlock, String appendix) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("craziestideas:block/" + deferredBlock.getId().getPath() + appendix));
    }
}
