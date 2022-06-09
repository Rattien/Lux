package net.rattien.lux.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import static net.rattien.lux.Lux.MODID;

public class LuxBlockTags extends BlockTagsProvider {

    public LuxBlockTags(DataGenerator generator, ExistingFileHelper helper) {
        super(generator, MODID, helper);
    }

    @Override
    protected void addTags() {

    }

    @Override
    public String getName() {
        return "Lux Tags";
    }

}
