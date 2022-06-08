package net.rattien.lux.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;
import net.rattien.lux.Lux;

public class LuxLanguageProvider extends LanguageProvider {

    public LuxLanguageProvider(DataGenerator generator, String locale) {
        super(generator, Lux.MODID, locale);
    }


    @Override
    protected void addTranslations() {

    }
}
