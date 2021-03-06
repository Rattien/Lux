package net.rattien.lux.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.rattien.lux.setup.Registration;

import static net.rattien.lux.Lux.MODID;

public class LuxItemModels extends ItemModelProvider {

    public LuxItemModels(DataGenerator generator, ExistingFileHelper helper) {
        super(generator, MODID, helper);
    }

    @Override
    protected void registerModels() {

        singleTexture(Registration.LENS.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/lens"));
        singleTexture(Registration.MAGNIFYING_GLASS.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/magnifying_glass"));

    }

}
