package com.defendi.craziestideas.item;

import com.defendi.craziestideas.CraziestIdeas;
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

    public static final DeferredItem<Item> LEAD_RAW = ITEMS.register(
            "raw_lead",
            () -> new Item(new Item.Properties())
    );

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
