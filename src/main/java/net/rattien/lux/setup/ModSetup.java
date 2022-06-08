package net.rattien.lux.setup;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

public class ModSetup {

    public static final String TAB_LUX_NAME = "Lux";

    public static final CreativeModeTab TAB_LUX = new CreativeModeTab(TAB_LUX_NAME) {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Items.CANDLE);
        }
    };

    public static void init(FMLCommonSetupEvent event) {

    }

}
