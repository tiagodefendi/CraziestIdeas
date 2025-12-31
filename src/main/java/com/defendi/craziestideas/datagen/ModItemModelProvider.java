package com.defendi.craziestideas.datagen;

import com.defendi.craziestideas.CraziestIdeas;
import com.defendi.craziestideas.item.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

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

        // TOOLs ===============================
        basicItem(ModItems.CHISEL.get());
        basicItem(ModItems.SCRAPPER.get());

        // FOOD =====================================
        basicItem(ModItems.DRAGON_FRUIT.get());

        // FUEL ======================================
        basicItem(ModItems.BIRCH_BARK.get());
    }
}
