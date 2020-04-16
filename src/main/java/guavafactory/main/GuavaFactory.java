package guavafactory.main;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.Mod.Metadata;
import net.minecraftforge.fml.common.ModMetadata;
import net.minecraftforge.fml.common.event.FMLConstructionEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION, acceptedMinecraftVersions=Reference.ACCEPTED_MINECRAFT_VERSIONS)
public class GuavaFactory
{
	@Instance
	public static GuavaFactory instance;
	
	@Metadata(Reference.MOD_ID)
	private static ModMetadata meta;

	@Mod.EventHandler
    public void construct(FMLConstructionEvent event) 
	{
        MinecraftForge.EVENT_BUS.register(this);
    }
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) 
	{
		GuavaFactoryInfoCore.registerInfo(meta);
		//AddModEvent
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {}
}
