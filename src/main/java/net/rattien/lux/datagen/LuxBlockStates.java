package net.rattien.lux.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.rattien.lux.Lux;

public class LuxBlockStates extends BlockStateProvider {

    public LuxBlockStates(DataGenerator gen, ExistingFileHelper helper) {
        super(gen, Lux.MODID, helper);
    }

    @Override
    protected void registerStatesAndModels() {

    }

}
