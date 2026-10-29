package com.defendi.craziestideas.datagen;

import com.defendi.craziestideas.CraziestIdeas;
import com.defendi.craziestideas.block.ModBlocks;
import com.defendi.craziestideas.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, CraziestIdeas.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        // LEAD ============================
        basicItem(ModItems.LEAD_INGOT.get());
        basicItem(ModItems.LEAD_NUGGET.get());
        basicItem(ModItems.RAW_LEAD.get());
        buttonItem(ModBlocks.LEAD_BUTTON, ModBlocks.LEAD_BLOCK);
        basicItem(ModBlocks.LEAD_DOOR.asItem());
        // WHITE LEAD ============================
        basicItem(ModItems.WHITE_LEAD_INGOT.get());
        basicItem(ModItems.WHITE_LEAD_NUGGET.get());
        basicItem(ModItems.RAW_WHITE_LEAD.get());
        buttonItem(ModBlocks.WHITE_LEAD_BUTTON, ModBlocks.WHITE_LEAD_BLOCK);
        fenceItem(ModBlocks.WHITE_LEAD_BRICKS_FENCE, ModBlocks.WHITE_LEAD_BRICKS);
        wallItem(ModBlocks.WHITE_LEAD_BRICKS_WALL, ModBlocks.WHITE_LEAD_BRICKS);
        fenceItem(ModBlocks.WHITE_LEAD_TILES_FENCE, ModBlocks.WHITE_LEAD_TILES);
        wallItem(ModBlocks.WHITE_LEAD_TILES_WALL, ModBlocks.WHITE_LEAD_TILES);
        basicItem(ModBlocks.WHITE_LEAD_DOOR.asItem());

        // TOOLs ===============================
        basicItem(ModItems.CHISEL.get());
        basicItem(ModItems.SCRAPPER.get());

        // FOOD =====================================
        basicItem(ModItems.DRAGON_FRUIT.get());

        // FUEL ======================================
        basicItem(ModItems.BIRCH_BARK.get());
    }

    public void buttonItem(DeferredBlock<?> block, DeferredBlock<?> baseBlock) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/button_inventory"))
                .texture(
                        "texture",
                        ResourceLocation.fromNamespaceAndPath(
                                CraziestIdeas.MOD_ID,
                                "block/" + baseBlock.getId().getPath()
                        )
                );
    }

    public void fenceItem(DeferredBlock<?> block, DeferredBlock<?> baseBlock) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/fence_inventory"))
                .texture(
                        "texture",
                        ResourceLocation.fromNamespaceAndPath(
                                CraziestIdeas.MOD_ID,
                                "block/" + baseBlock.getId().getPath()
                        )
                );
    }

    public void wallItem(DeferredBlock<?> block, DeferredBlock<?> baseBlock) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/wall_inventory"))
                .texture(
                        "wall",
                        ResourceLocation.fromNamespaceAndPath(
                                CraziestIdeas.MOD_ID,
                                "block/" + baseBlock.getId().getPath()
                        )
                );
    }
}
