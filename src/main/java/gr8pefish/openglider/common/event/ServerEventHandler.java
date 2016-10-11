package gr8pefish.openglider.common.event;

import gr8pefish.openglider.common.capabilities.OpenGliderCapabilities;
import gr8pefish.openglider.common.capabilities.PlayerGlidingCapability;
import gr8pefish.openglider.common.lib.ModInfo;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ServerEventHandler {

    @SubscribeEvent
    public void onAttachCapability(AttachCapabilitiesEvent.Entity event) {
        if (event.getEntity() instanceof EntityPlayer) {
            if (!event.getEntity().hasCapability(OpenGliderCapabilities.GLIDING_CAPABILITY, null)) {
                event.addCapability(new ResourceLocation(ModInfo.MODID + "." + ModInfo.GLIDING_CAPABILITY_STRING), new PlayerGlidingCapability());
            }
        }
    }
}