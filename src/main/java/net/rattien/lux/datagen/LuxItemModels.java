package net.rattien.lux.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.rattien.lux.Lux;

public class LuxItemModels extends ItemModelProvider {

    public LuxItemModels(DataGenerator generator, ExistingFileHelper helper) {
        super(generator, Lux.MODID, helper);
    }

    @Override
    protected void registerModels() {

    }

}
