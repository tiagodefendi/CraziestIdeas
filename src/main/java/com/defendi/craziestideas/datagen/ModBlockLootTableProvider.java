package com.defendi.craziestideas.datagen;

import com.defendi.craziestideas.block.ModBlocks;
import com.defendi.craziestideas.item.ModItems;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    protected ModBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        // LEAD ===============================================================
        dropSelf(ModBlocks.LEAD_BLOCK.get());
        dropSelf(ModBlocks.RAW_LEAD_BLOCK.get());
        add(ModBlocks.LEAD_ORE.get(),
                block -> createOreDrop(
                        ModBlocks.LEAD_ORE.get(),
                        ModItems.RAW_LEAD.get()
                )
        );
        add(ModBlocks.DEEPSLATE_LEAD_ORE.get(),
                block -> createOreDrop(
                        ModBlocks.DEEPSLATE_LEAD_ORE.get(),
                        ModItems.RAW_LEAD.get()
                )
        );
        dropSelf(ModBlocks.LEAD_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.LEAD_BUTTON.get());
        add(ModBlocks.LEAD_DOOR.get(),
                block -> createDoorTable(
                        ModBlocks.LEAD_DOOR.get()
                )
        );
        dropSelf(ModBlocks.LEAD_TRAPDOOR.get());
        // WHITE LEAD ===============================================================
        dropSelf(ModBlocks.WHITE_LEAD_BLOCK.get());
        dropSelf(ModBlocks.RAW_WHITE_LEAD_BLOCK.get());
        add(ModBlocks.WHITE_LEAD_ORE.get(),
                block -> createOreDrop(
                        ModBlocks.WHITE_LEAD_ORE.get(),
                        ModItems.RAW_WHITE_LEAD.get()
                )
        );
        add(ModBlocks.DEEPSLATE_WHITE_LEAD_ORE.get(),
                block -> createOreDrop(
                        ModBlocks.DEEPSLATE_WHITE_LEAD_ORE.get(),
                        ModItems.RAW_WHITE_LEAD.get()
                )
        );
        dropSelf(ModBlocks.WHITE_LEAD_BRICKS.get());
        dropSelf(ModBlocks.WHITE_LEAD_BRICKS_STAIRS.get());
        add(ModBlocks.WHITE_LEAD_BRICKS_SLAB.get(),
                block -> createSlabItemTable(
                        ModBlocks.WHITE_LEAD_BRICKS_SLAB.get()
                )
        );
        dropSelf(ModBlocks.WHITE_LEAD_BRICKS_WALL.get());
        dropSelf(ModBlocks.WHITE_LEAD_BRICKS_FENCE.get());
        dropSelf(ModBlocks.WHITE_LEAD_BRICKS_FENCE_GATE.get());
        dropSelf(ModBlocks.WHITE_LEAD_TILES.get());
        dropSelf(ModBlocks.WHITE_LEAD_TILES_STAIRS.get());
        add(ModBlocks.WHITE_LEAD_TILES_SLAB.get(),
                block -> createSlabItemTable(
                        ModBlocks.WHITE_LEAD_TILES_SLAB.get()
                )
        );
        dropSelf(ModBlocks.WHITE_LEAD_TILES_WALL.get());
        dropSelf(ModBlocks.WHITE_LEAD_TILES_FENCE.get());
        dropSelf(ModBlocks.WHITE_LEAD_TILES_FENCE_GATE.get());
        dropSelf(ModBlocks.WHITE_LEAD_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.WHITE_LEAD_BUTTON.get());
        add(ModBlocks.WHITE_LEAD_DOOR.get(),
                block -> createDoorTable(
                        ModBlocks.WHITE_LEAD_DOOR.get()
                )
        );
        dropSelf(ModBlocks.WHITE_LEAD_TRAPDOOR.get());
        // MAGIC BLOCK ===================================================
        dropSelf(ModBlocks.MAGIC_BLOCK.get());
    }

    protected LootTable.Builder createChunkOreDrops(Block pBlock, Item item, float minDrops, float maxDrops) {
        HolderLookup.RegistryLookup<Enchantment> registrylookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        return this.createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock, LootItem.lootTableItem(item)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrops, maxDrops)))
                        .apply(ApplyBonusCount.addOreBonusCount(registrylookup.getOrThrow(Enchantments.FORTUNE)))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
