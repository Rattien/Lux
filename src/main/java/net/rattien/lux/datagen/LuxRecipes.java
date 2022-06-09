package net.rattien.lux.datagen;

import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.Tags;
import net.rattien.lux.setup.Registration;

import static net.rattien.lux.Lux.MODID;

import java.util.function.Consumer;

public class LuxRecipes extends RecipeProvider {

    public LuxRecipes(DataGenerator generator) {
        super(generator);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {

        // ****************************************************************
        // Items
        // ****************************************************************
        ShapedRecipeBuilder.shaped(Registration.LENS.get())
                .pattern(" g ")
                .pattern("gag")
                .pattern(" g ")
                .define('g', Tags.Items.GLASS_COLORLESS)
                .define('a', Tags.Items.GEMS_AMETHYST)
                .group(MODID)
                .unlockedBy("get_amethyst", InventoryChangeTrigger.TriggerInstance.hasItems(Items.AMETHYST_SHARD))
                .save(consumer);

        ShapedRecipeBuilder.shaped(Registration.MAGNIFYING_GLASS.get())
                .pattern(" l")
                .pattern("s ")
                .define('s', Items.STICK)
                .define('l', Registration.LENS.get())
                .group(MODID)
                .unlockedBy("get_lens", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.LENS.get()))
                .save(consumer);

    }

}
