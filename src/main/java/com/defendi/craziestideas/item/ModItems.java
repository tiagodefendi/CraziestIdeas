package com.defendi.craziestideas.item;

import com.defendi.craziestideas.CraziestIdeas;
import com.defendi.craziestideas.item.custom.ChiselItem;
import com.defendi.craziestideas.item.custom.FuelItem;
import com.defendi.craziestideas.item.custom.ScrapperItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CraziestIdeas.MOD_ID);

    // LEAD =========================================================================
    public static final DeferredItem<Item> LEAD_INGOT = ITEMS.register(
            "lead_ingot",
            () -> new Item(new Item.Properties())
    );
    public static final DeferredItem<Item> LEAD_NUGGET = ITEMS.register(
            "lead_nugget",
            () -> new Item(new Item.Properties())
    );
    public static final DeferredItem<Item> LEAD_RAW = ITEMS.register(
            "raw_lead",
            () -> new Item(new Item.Properties())
    );

    public static final DeferredItem<Item> CHISEL = ITEMS.register(
            "chisel",
            () -> new ChiselItem(new Item.Properties().durability(256))
    );
    public static final DeferredItem<Item> SCRAPPER = ITEMS.register(
            "scrapper",
            () -> new ScrapperItem(new Item.Properties().durability(256))
    );

    public static final DeferredItem<Item> DRAGON_FRUIT = ITEMS.register(
            "dragon_fruit",
            () -> new Item(new Item.Properties().food(ModFoodProperties.DRAGON_FRUIT))
    );

    public static final DeferredItem<Item> BIRCH_BARK = ITEMS.register(
            "birch_bark",
            () -> new FuelItem(new Item.Properties(), 12000)
    );


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
