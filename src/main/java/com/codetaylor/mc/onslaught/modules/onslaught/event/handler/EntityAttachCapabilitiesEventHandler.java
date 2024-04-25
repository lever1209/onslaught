package com.codetaylor.mc.onslaught.modules.onslaught.event.handler;

import com.codetaylor.mc.onslaught.ModOnslaught;
import com.codetaylor.mc.onslaught.modules.onslaught.capability.CapabilityAntiAirProvider;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/** Responsible for attaching the player data capabilities. */
public class EntityAttachCapabilitiesEventHandler {

	@SubscribeEvent
	public void on(AttachCapabilitiesEvent<Entity> event) {

		Entity entity = event.getObject();

		if (entity instanceof EntityPlayer && !(entity instanceof FakePlayer)) {
			event.addCapability(new ResourceLocation(ModOnslaught.MOD_ID, "anti_air"), new CapabilityAntiAirProvider());
		}
	}
}