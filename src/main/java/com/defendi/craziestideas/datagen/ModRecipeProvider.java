package com.defendi.craziestideas.datagen;

import com.defendi.craziestideas.CraziestIdeas;
import com.defendi.craziestideas.block.ModBlocks;
import com.defendi.craziestideas.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        // LEAD =========================================================
        // Block
        ShapedRecipeBuilder.shaped(
                        RecipeCategory.MISC,
                        ModBlocks.LEAD_BLOCK.get()
                )
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.LEAD_INGOT.get())
                .unlockedBy("has_lead_ingot", has(ModItems.LEAD_INGOT))
                .save(recipeOutput);

        // Ingot
        ShapelessRecipeBuilder.shapeless(
                        RecipeCategory.MISC,
                        ModItems.LEAD_INGOT.get(),
                        9
                )
                .requires(ModBlocks.LEAD_BLOCK.get())
                .unlockedBy("has_lead_ingot", has(ModItems.LEAD_INGOT))
                .save(recipeOutput, "craziestideas:lead_ingot_from_block");

        ShapedRecipeBuilder.shaped(
                        RecipeCategory.MISC,
                        ModItems.LEAD_INGOT.get()
                )
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.LEAD_NUGGET.get())
                .unlockedBy("has_lead_ingot", has(ModItems.LEAD_INGOT))
                .save(recipeOutput, "craziestideas:lead_ingot_from_nugget");

        List<ItemLike> leadSmeltable = List.of(
                ModItems.RAW_LEAD,
                ModBlocks.LEAD_ORE,
                ModBlocks.DEEPSLATE_LEAD_ORE
        );

        oreSmelting(
                recipeOutput,
                leadSmeltable,
                RecipeCategory.MISC,
                ModItems.LEAD_INGOT.get(),
                0.25f,
                200,
                "lead_ingot"
        );

        oreBlasting(
                recipeOutput,
                leadSmeltable,
                RecipeCategory.MISC,
                ModItems.LEAD_INGOT.get(),
                0.25f,
                200,
                "lead_ingot"
        );

        // Nugget
        ShapelessRecipeBuilder.shapeless(
                        RecipeCategory.MISC,
                        ModItems.LEAD_NUGGET.get(),
                        9
                )
                .requires(ModItems.LEAD_INGOT.get())
                .unlockedBy("has_lead_ingot", has(ModItems.LEAD_INGOT))
                .save(recipeOutput);

        // Raw Block
        ShapedRecipeBuilder.shaped(
                        RecipeCategory.MISC,
                        ModBlocks.RAW_LEAD_BLOCK.get()
                )
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.RAW_LEAD.get())
                .unlockedBy("has_raw_lead", has(ModItems.RAW_LEAD))
                .save(recipeOutput);

        // Raw
        ShapelessRecipeBuilder.shapeless(
                        RecipeCategory.MISC,
                        ModItems.RAW_LEAD.get(),
                        9
                )
                .requires(ModBlocks.RAW_LEAD_BLOCK.get())
                .unlockedBy("has_raw_lead", has(ModItems.RAW_LEAD))
                .save(recipeOutput);

        // Redstone
        ShapedRecipeBuilder.shaped(
                        RecipeCategory.REDSTONE,
                        ModBlocks.LEAD_BUTTON.get()
                )
                .pattern("AA")
                .pattern("AA")
                .define('A', ModItems.LEAD_NUGGET.get())
                .unlockedBy("has_lead_nugget", has(ModItems.LEAD_NUGGET))
                .save(recipeOutput);
        pressurePlate(
                recipeOutput,
                ModBlocks.LEAD_PRESSURE_PLATE.get(),
                ModItems.LEAD_INGOT.get()
        );
        doorBuilder(
                ModBlocks.LEAD_DOOR,
                Ingredient.of(ModItems.LEAD_INGOT)
        )
                .group("lead_ingot")
                .unlockedBy("has_lead_ingot", has(ModItems.LEAD_INGOT))
                .save(recipeOutput);
        trapdoorBuilder(
                ModBlocks.LEAD_TRAPDOOR,
                Ingredient.of(ModItems.LEAD_INGOT)
        )
                .group("lead_ingot")
                .unlockedBy("has_lead_ingot", has(ModItems.LEAD_INGOT))
                .save(recipeOutput);

        // WHITE LEAD =========================================================
        // Block
        ShapedRecipeBuilder.shaped(
                        RecipeCategory.MISC,
                        ModBlocks.WHITE_LEAD_BLOCK.get()
                )
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.WHITE_LEAD_INGOT.get())
                .unlockedBy("has_white_lead_ingot", has(ModItems.WHITE_LEAD_INGOT))
                .save(recipeOutput);

        // Ingot
        ShapelessRecipeBuilder.shapeless(
                        RecipeCategory.MISC,
                        ModItems.WHITE_LEAD_INGOT.get(),
                        9
                )
                .requires(ModBlocks.WHITE_LEAD_BLOCK.get())
                .unlockedBy("has_white_lead_ingot", has(ModItems.WHITE_LEAD_INGOT))
                .save(recipeOutput, "craziestideas:white_lead_ingot_from_block");

        ShapedRecipeBuilder.shaped(
                        RecipeCategory.MISC,
                        ModItems.WHITE_LEAD_INGOT.get()
                )
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.WHITE_LEAD_NUGGET.get())
                .unlockedBy("has_white_lead_ingot", has(ModItems.WHITE_LEAD_INGOT))
                .save(recipeOutput, "craziestideas:white_lead_ingot_from_nugget");

        List<ItemLike> whiteLeadSmeltable = List.of(
                ModItems.RAW_WHITE_LEAD,
                ModBlocks.WHITE_LEAD_ORE,
                ModBlocks.DEEPSLATE_WHITE_LEAD_ORE
        );

        oreSmelting(
                recipeOutput,
                whiteLeadSmeltable,
                RecipeCategory.MISC,
                ModItems.WHITE_LEAD_INGOT.get(),
                0.25f,
                200,
                "white_lead_ingot"
        );

        oreBlasting(
                recipeOutput,
                whiteLeadSmeltable,
                RecipeCategory.MISC,
                ModItems.WHITE_LEAD_INGOT.get(),
                0.25f,
                200,
                "white_lead_ingot"
        );

        // Nugget
        ShapelessRecipeBuilder.shapeless(
                        RecipeCategory.MISC,
                        ModItems.WHITE_LEAD_NUGGET.get(),
                        9
                )
                .requires(ModItems.WHITE_LEAD_INGOT.get())
                .unlockedBy("has_white_lead_ingot", has(ModItems.WHITE_LEAD_INGOT))
                .save(recipeOutput);

        // Raw Block
        ShapedRecipeBuilder.shaped(
                        RecipeCategory.MISC,
                        ModBlocks.RAW_WHITE_LEAD_BLOCK.get()
                )
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.RAW_WHITE_LEAD.get())
                .unlockedBy("has_raw_white_lead", has(ModItems.RAW_WHITE_LEAD))
                .save(recipeOutput);

        // Raw
        ShapelessRecipeBuilder.shapeless(
                        RecipeCategory.MISC,
                        ModItems.RAW_WHITE_LEAD.get(),
                        9
                )
                .requires(ModBlocks.RAW_WHITE_LEAD_BLOCK.get())
                .unlockedBy("has_raw_white_lead", has(ModItems.RAW_WHITE_LEAD))
                .save(recipeOutput);

        // Bricks
        ShapedRecipeBuilder.shaped(
                        RecipeCategory.BUILDING_BLOCKS,
                        ModBlocks.WHITE_LEAD_BRICKS.get(),
                 4
                )
                .pattern("AA")
                .pattern("AA")
                .define('A', ModBlocks.WHITE_LEAD_BLOCK.get())
                .unlockedBy("has_white_lead_block", has(ModBlocks.WHITE_LEAD_BLOCK))
                .save(recipeOutput);
        stairBuilder(
                ModBlocks.WHITE_LEAD_BRICKS_STAIRS,
                Ingredient.of(ModBlocks.WHITE_LEAD_BRICKS)
        )
                .group("white_lead_bricks")
                .unlockedBy("has_white_lead_bricks", has(ModBlocks.WHITE_LEAD_BRICKS))
                .save(recipeOutput);
        slab(
                recipeOutput,
                RecipeCategory.BUILDING_BLOCKS,
                ModBlocks.WHITE_LEAD_BRICKS_SLAB.get(),
                ModBlocks.WHITE_LEAD_BRICKS.get()
        );
        fenceBuilder(
                ModBlocks.WHITE_LEAD_BRICKS_FENCE,
                Ingredient.of(ModBlocks.WHITE_LEAD_BRICKS)
        )
                .group("white_lead_bricks")
                .unlockedBy("has_white_lead_bricks", has(ModBlocks.WHITE_LEAD_BRICKS))
                .save(recipeOutput);
        fenceGateBuilder(
                ModBlocks.WHITE_LEAD_BRICKS_FENCE_GATE,
                Ingredient.of(ModBlocks.WHITE_LEAD_BRICKS)
        )
                .group("white_lead_bricks")
                .unlockedBy("has_white_lead_bricks", has(ModBlocks.WHITE_LEAD_BRICKS))
                .save(recipeOutput);
        wall(
                recipeOutput,
                RecipeCategory.BUILDING_BLOCKS,
                ModBlocks.WHITE_LEAD_BRICKS_WALL.get(),
                ModBlocks.WHITE_LEAD_BRICKS.get()
        );


        // Tiles
        ShapedRecipeBuilder.shaped(
                        RecipeCategory.BUILDING_BLOCKS,
                        ModBlocks.WHITE_LEAD_TILES.get(),
                 4
                )
                .pattern("AA")
                .pattern("AA")
                .define('A', ModBlocks.WHITE_LEAD_BRICKS.get())
                .unlockedBy("has_white_lead_bricks", has(ModBlocks.WHITE_LEAD_BRICKS))
                .save(recipeOutput);
        stairBuilder(
                ModBlocks.WHITE_LEAD_TILES_STAIRS,
                Ingredient.of(ModBlocks.WHITE_LEAD_TILES)
        )
                .group("white_lead_tiles")
                .unlockedBy("has_white_lead_tiles", has(ModBlocks.WHITE_LEAD_TILES))
                .save(recipeOutput);
        slab(
                recipeOutput,
                RecipeCategory.BUILDING_BLOCKS,
                ModBlocks.WHITE_LEAD_TILES_SLAB.get(),
                ModBlocks.WHITE_LEAD_TILES.get()
        );
        fenceBuilder(
                ModBlocks.WHITE_LEAD_TILES_FENCE,
                Ingredient.of(ModBlocks.WHITE_LEAD_TILES)
        )
                .group("white_lead_tiles")
                .unlockedBy("has_white_lead_tiles", has(ModBlocks.WHITE_LEAD_TILES))
                .save(recipeOutput);
        fenceGateBuilder(
                ModBlocks.WHITE_LEAD_TILES_FENCE_GATE,
                Ingredient.of(ModBlocks.WHITE_LEAD_TILES)
        )
                .group("white_lead_tiles")
                .unlockedBy("has_white_lead_tiles", has(ModBlocks.WHITE_LEAD_TILES))
                .save(recipeOutput);
        wall(
                recipeOutput,
                RecipeCategory.BUILDING_BLOCKS,
                ModBlocks.WHITE_LEAD_TILES_WALL.get(),
                ModBlocks.WHITE_LEAD_TILES.get()
        );

        // Redstone
        ShapedRecipeBuilder.shaped(
                        RecipeCategory.REDSTONE,
                        ModBlocks.WHITE_LEAD_BUTTON.get()
                )
                .pattern("AA")
                .pattern("AA")
                .define('A', ModItems.WHITE_LEAD_NUGGET.get())
                .unlockedBy("has_white_lead_nugget", has(ModItems.WHITE_LEAD_NUGGET))
                .save(recipeOutput);
        pressurePlate(
                recipeOutput,
                ModBlocks.WHITE_LEAD_PRESSURE_PLATE.get(),
                ModItems.WHITE_LEAD_INGOT.get()
        );
        doorBuilder(
                ModBlocks.WHITE_LEAD_DOOR,
                Ingredient.of(ModItems.WHITE_LEAD_INGOT)
        )
                .group("white_lead_ingot")
                .unlockedBy("has_white_lead_ingot", has(ModItems.WHITE_LEAD_INGOT))
                .save(recipeOutput);
        trapdoorBuilder(
                ModBlocks.WHITE_LEAD_TRAPDOOR,
                Ingredient.of(ModItems.WHITE_LEAD_INGOT)
        )
                .group("white_lead_ingot")
                .unlockedBy("has_white_lead_ingot", has(ModItems.WHITE_LEAD_INGOT))
                .save(recipeOutput);

        // TOOLs ======================================================================
        // Chisel
        ShapedRecipeBuilder.shaped(
                        RecipeCategory.MISC,
                        ModItems.CHISEL.get()
                )
                .pattern("A")
                .pattern("B")
                .define('A', ModItems.LEAD_INGOT.get())
                .define('B', Items.STICK)
                .unlockedBy("has_lead_ingot", has(ModItems.LEAD_INGOT))
                .save(recipeOutput);

        // Scrapper
        ShapedRecipeBuilder.shaped(
                        RecipeCategory.MISC,
                        ModItems.SCRAPPER.get()
                )
                .pattern("CAC")
                .pattern(" B ")
                .define('A', ModItems.LEAD_INGOT.get())
                .define('B', Items.STICK)
                .define('C', ModItems.LEAD_NUGGET.get())
                .unlockedBy("has_lead_ingot", has(ModItems.LEAD_INGOT))
                .save(recipeOutput);
    }

    protected static void oreSmelting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.SMELTING_RECIPE, SmeltingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTime, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.BLASTING_RECIPE, BlastingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static <T extends AbstractCookingRecipe> void oreCooking(RecipeOutput recipeOutput, RecipeSerializer<T> pCookingSerializer, AbstractCookingRecipe.Factory<T> factory,
                                                                       List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime, pCookingSerializer, factory).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(recipeOutput, CraziestIdeas.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}
