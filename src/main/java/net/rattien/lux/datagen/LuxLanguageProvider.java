package net.rattien.lux.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;
import net.rattien.lux.Lux;
import net.rattien.lux.setup.ModSetup;
import net.rattien.lux.setup.Registration;

public class LuxLanguageProvider extends LanguageProvider {

    public LuxLanguageProvider(DataGenerator generator, String locale) {
        super(generator, Lux.MODID, locale);
    }


    @Override
    protected void addTranslations() {

        // Creative Tabs
        add("itemGroup." + ModSetup.TAB_LUX_NAME, ModSetup.TAB_LUX_NAME);

        // Items
        add(Registration.LENS.get(), "Lens");
        add(Registration.MAGNIFYING_GLASS.get(), "Magnifying Glass");

    }
}
