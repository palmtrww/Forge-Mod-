package club.palmtrww.ForgeMod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class ForgeMod {

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        System.out.println("Im ggg on!");
    }
}
