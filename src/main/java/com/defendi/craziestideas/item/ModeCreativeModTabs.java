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
                    .icon(() -> new ItemStack(ModItems.LEAD_INGOT.get()))
                    .title(Component.translatable("creativetab.craziestideas.craziest_items_tab"))
                    .displayItems(
                            (itemDisplayParameters, output) -> {
                                output.accept(ModItems.LEAD_RAW);
                                output.accept(ModItems.LEAD_INGOT);
                                output.accept(ModItems.LEAD_NUGGET);

                                output.accept(ModItems.CHISEL);
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
                    .icon(() -> new ItemStack(ModBlocks.LEAD_BLOCK))
                    .title(Component.translatable("creativetab.craziestideas.craziest_blocks_tab"))
                    .displayItems(
                            (itemDisplayParameters, output) -> {
                                output.accept(ModBlocks.LEAD_ORE);
                                output.accept(ModBlocks.DEEPSLATE_LEAD_ORE);
                                output.accept(ModBlocks.RAW_LEAD_BLOCK);
                                output.accept(ModBlocks.LEAD_BLOCK);
                            }
                    )
                    .build()
    );

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
