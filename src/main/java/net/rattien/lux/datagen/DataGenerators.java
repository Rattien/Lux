package net.rattien.lux.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;
import net.rattien.lux.Lux;

@Mod.EventBusSubscriber(modid = Lux.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();

        if (event.includeServer()) {
            generator.addProvider(new LuxRecipes(generator));
            //generator.addProvider(new LuxLootTables(generator));
            LuxBlockTags blockTags = new LuxBlockTags(generator, event.getExistingFileHelper());
            generator.addProvider(blockTags);
            generator.addProvider(new LuxItemTags(generator, blockTags, event.getExistingFileHelper()));
        }
        if (event.includeClient()) {
            generator.addProvider(new LuxBlockStates(generator, event.getExistingFileHelper()));
            generator.addProvider(new LuxItemModels(generator, event.getExistingFileHelper()));
            generator.addProvider(new LuxLanguageProvider(generator, "en_us"));
        }
    }

}
