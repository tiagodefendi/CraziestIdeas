package com.defendi.craziestideas.item;

import com.defendi.craziestideas.CraziestIdeas;
import com.defendi.craziestideas.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModeCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CraziestIdeas.MOD_ID);

    public static Supplier<CreativeModeTab> CRAZIEST_ITEMS = CREATIVE_MODE_TAB.register(
            "craziest_items_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.DRAGON_FRUIT.get()))
                    .title(Component.translatable("creativetab.craziestideas.craziest_items_tab"))
                    .displayItems(
                            (itemDisplayParameters, output) -> {
                                // LEAD
                                output.accept(ModItems.RAW_LEAD);
                                output.accept(ModItems.LEAD_INGOT);
                                output.accept(ModItems.LEAD_NUGGET);
                                // WHITE LEAD
                                output.accept(ModItems.RAW_WHITE_LEAD);
                                output.accept(ModItems.WHITE_LEAD_INGOT);
                                output.accept(ModItems.WHITE_LEAD_NUGGET);
                                // TOOLS
                                output.accept(ModItems.CHISEL);
                                output.accept(ModItems.SCRAPPER);
                                // FOOD
                                output.accept(ModItems.DRAGON_FRUIT);
                                // FUEL
                                output.accept(ModItems.BIRCH_BARK);
                            }
                    )
                    .build()
    );

    public static Supplier<CreativeModeTab> CRAZIEST_BLOCKS = CREATIVE_MODE_TAB.register(
            "craziest_blocks_tab",
            () -> CreativeModeTab.builder()
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(
                            CraziestIdeas.MOD_ID,
                            "craziest_items_tab"
                    ))
                    .icon(() -> new ItemStack(ModBlocks.MAGIC_BLOCK))
                    .title(Component.translatable("creativetab.craziestideas.craziest_blocks_tab"))
                    .displayItems(
                            (itemDisplayParameters, output) -> {
                                // LEAD
                                output.accept(ModBlocks.LEAD_ORE);
                                output.accept(ModBlocks.DEEPSLATE_LEAD_ORE);
                                output.accept(ModBlocks.RAW_LEAD_BLOCK);
                                output.accept(ModBlocks.LEAD_BLOCK);
                                output.accept(ModBlocks.LEAD_PRESSURE_PLATE);
                                output.accept(ModBlocks.LEAD_BUTTON);
                                output.accept(ModBlocks.LEAD_DOOR);
                                output.accept(ModBlocks.LEAD_TRAPDOOR);
                                // WHITE LEAD
                                output.accept(ModBlocks.WHITE_LEAD_ORE);
                                output.accept(ModBlocks.DEEPSLATE_WHITE_LEAD_ORE);
                                output.accept(ModBlocks.RAW_WHITE_LEAD_BLOCK);
                                output.accept(ModBlocks.WHITE_LEAD_BLOCK);
                                output.accept(ModBlocks.WHITE_LEAD_BRICKS);
                                output.accept(ModBlocks.WHITE_LEAD_BRICKS_STAIRS);
                                output.accept(ModBlocks.WHITE_LEAD_BRICKS_SLAB);
                                output.accept(ModBlocks.WHITE_LEAD_BRICKS_WALL);
                                output.accept(ModBlocks.WHITE_LEAD_BRICKS_FENCE);
                                output.accept(ModBlocks.WHITE_LEAD_BRICKS_FENCE_GATE);
                                output.accept(ModBlocks.WHITE_LEAD_TILES);
                                output.accept(ModBlocks.WHITE_LEAD_TILES_STAIRS);
                                output.accept(ModBlocks.WHITE_LEAD_TILES_SLAB);
                                output.accept(ModBlocks.WHITE_LEAD_TILES_WALL);
                                output.accept(ModBlocks.WHITE_LEAD_TILES_FENCE);
                                output.accept(ModBlocks.WHITE_LEAD_TILES_FENCE_GATE);
                                output.accept(ModBlocks.WHITE_LEAD_PRESSURE_PLATE);
                                output.accept(ModBlocks.WHITE_LEAD_BUTTON);
                                output.accept(ModBlocks.WHITE_LEAD_DOOR);
                                output.accept(ModBlocks.WHITE_LEAD_TRAPDOOR);
                                // MISC
                                output.accept(ModBlocks.MAGIC_BLOCK);
                            }
                    )
                    .build()
    );

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
