package net.rattien.lux.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import static net.rattien.lux.Lux.MODID;

public class LuxItemTags extends ItemTagsProvider {

    public LuxItemTags(DataGenerator generator, BlockTagsProvider blockTags, ExistingFileHelper helper) {
        super(generator, blockTags, MODID, helper);
    }

    @Override
    protected void addTags() {

    }

    @Override
    public String getName() {
        return "Lux Tags";
    }

}
