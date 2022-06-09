package net.rattien.lux.setup;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static net.rattien.lux.Lux.MODID;

public class Registration {

    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

    public static void init() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ITEMS.register(bus);
    }

    // ****************************************************************
    // Item Properties
    // ****************************************************************
    public static final Item.Properties DEFAULT_ITEM_PROPERTIES = new Item.Properties().tab(ModSetup.TAB_LUX);
    public static final Item.Properties NONSTACKABLE_ITEM_PROPERTIES = DEFAULT_ITEM_PROPERTIES.stacksTo(1);

    // ****************************************************************
    // Items
    // ****************************************************************
    public static final RegistryObject<Item> LENS = ITEMS.register("lens", () -> new Item(DEFAULT_ITEM_PROPERTIES));
    public static final RegistryObject<Item> MAGNIFYING_GLASS = ITEMS.register("magnifying_glass", () -> new Item(NONSTACKABLE_ITEM_PROPERTIES));

}
