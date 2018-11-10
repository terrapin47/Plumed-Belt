package terrapin47.plumedbelt.init;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import terrapin47.plumedbelt.item.ItemPlumedBelt;

public class ModItems {

    @GameRegistry.ObjectHolder("plumedbelt:plumed_belt")
    public static final ItemPlumedBelt PLUMED_BELT = new ItemPlumedBelt();

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        PLUMED_BELT.initModel();
    }

    public static void registerItems(RegistryEvent.Register<Item> event) {
        PLUMED_BELT.register(event);
    }

}
