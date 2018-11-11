package terrapin47.plumedbelt;

import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;
import terrapin47.plumedbelt.proxy.CommonProxy;

@Mod(modid = PlumedBelt.MODID, name = PlumedBelt.MODNAME, version = PlumedBelt.MODVERSION, useMetadata = true, dependencies = "required-after:baubles;required-after:botania")
public class PlumedBelt {

    public static final String MODID = "plumedbelt";
    public static final String MODNAME = "Plumed Belt";
    public static final String MODVERSION= "1.0.1";

    @SidedProxy(clientSide = "terrapin47.plumedbelt.proxy.ClientProxy", serverSide = "terrapin47.plumedbelt.proxy.ServerProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static PlumedBelt instance;

    public static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);

        if(!Loader.isModLoaded("baubles"))
            System.out.println("Required mod Baubles isn't installed");

        if(!Loader.isModLoaded("botania"))
            System.out.println("Required mod Botania isn't installed");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }
}
