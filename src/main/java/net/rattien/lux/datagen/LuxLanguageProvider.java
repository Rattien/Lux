package net.rattien.lux.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;
import net.rattien.lux.setup.ModSetup;
import net.rattien.lux.setup.Registration;

import static net.rattien.lux.Lux.MODID;

public class LuxLanguageProvider extends LanguageProvider {

    public LuxLanguageProvider(DataGenerator generator, String locale) {
        super(generator, MODID, locale);
    }


    @Override
    protected void addTranslations() {

        // ****************************************************************
        // Creative Tabs
        // ****************************************************************
        add("itemGroup." + ModSetup.TAB_LUX_NAME, "Lux");

        // ****************************************************************
        // Items
        // ****************************************************************
        add(Registration.LENS.get(), "Lens");
        add(Registration.MAGNIFYING_GLASS.get(), "Magnifying Glass");

    }
}
