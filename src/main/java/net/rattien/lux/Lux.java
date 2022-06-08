package net.rattien.lux;

import com.mojang.logging.LogUtils;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.rattien.lux.setup.ClientSetup;
import net.rattien.lux.setup.ModSetup;
import net.rattien.lux.setup.Registration;
import org.slf4j.Logger;

@Mod(Lux.MODID)
public class Lux {

    private static final Logger LOGGER = LogUtils.getLogger();
    public static final String MODID = "lux";

    public Lux() {
        // Register the deferred registry
        Registration.init();

        // Register the setup method for modloading
        IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();
        modBus.addListener(ModSetup::init);
        DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> () -> modBus.addListener(ClientSetup::init));
    }

}
