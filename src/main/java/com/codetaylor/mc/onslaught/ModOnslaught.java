package com.codetaylor.mc.onslaught;

import java.util.HashSet;
import java.util.Set;

import org.apache.logging.log4j.LogManager;

import com.codetaylor.mc.athenaeum.module.ModuleBase;
import com.codetaylor.mc.athenaeum.module.ModuleManager;
import com.codetaylor.mc.onslaught.modules.onslaught.ModuleOnslaught;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLConstructionEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLLoadCompleteEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerAboutToStartEvent;
import net.minecraftforge.fml.common.event.FMLServerStartedEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.event.FMLServerStoppedEvent;
import net.minecraftforge.fml.common.event.FMLServerStoppingEvent;

//@Mod(modid = ModOnslaught.MOD_ID, useMetadata = true)
public class ModOnslaught {

	public static final String MOD_ID = "onslaught";

	public static final CreativeTabs CREATIVE_TAB = new CreativeTabs(MOD_ID) {
		@Override
		public ItemStack createIcon() {
			return new ItemStack(Blocks.STONE);
		}
	};
	public static org.apache.logging.log4j.Logger LOG;

//	@Mod.Instance
//	public static ModOnslaught INSTANCE;
	private final ModuleManager moduleManager;

	private final Set<Class<? extends ModuleBase>> registeredModules = new HashSet<>();

	public ModOnslaught() {

		this.moduleManager = new ModuleManager(MOD_ID);
	}

	@Mod.EventHandler
	public void onConstructionEvent(FMLConstructionEvent event) {

		// --- MODULES ---

		registerModule(ModuleOnslaught.class);

		// --- POST ---

		this.moduleManager.onConstructionEvent();
		this.moduleManager.routeFMLStateEvent(event);
	}

	private void registerModule(Class<? extends ModuleBase> moduleClass) {

		this.moduleManager.registerModules(moduleClass);
		this.registeredModules.add(moduleClass);
	}

	public boolean isModuleEnabled(Class<? extends ModuleBase> moduleClass) {

		return this.registeredModules.contains(moduleClass);
	}

	@Mod.EventHandler
	public void onPreInitializationEvent(FMLPreInitializationEvent event) {
		LOG = LogManager.getLogger(ModOnslaught.MOD_ID);
		LOG.info("Initialized logger");

		this.moduleManager.routeFMLStateEvent(event);
	}

	@Mod.EventHandler
	public void onInitializationEvent(FMLInitializationEvent event) {

		this.moduleManager.routeFMLStateEvent(event);
	}

	@Mod.EventHandler
	public void onPostInitializationEvent(FMLPostInitializationEvent event) {

		this.moduleManager.routeFMLStateEvent(event);
	}

	@Mod.EventHandler
	public void onLoadCompleteEvent(FMLLoadCompleteEvent event) {

		this.moduleManager.routeFMLStateEvent(event);
	}

	@Mod.EventHandler
	public void onServerAboutToStartEvent(FMLServerAboutToStartEvent event) {

		this.moduleManager.routeFMLStateEvent(event);
	}

	@Mod.EventHandler
	public void onServerStartingEvent(FMLServerStartingEvent event) {

		this.moduleManager.routeFMLStateEvent(event);
	}

	@Mod.EventHandler
	public void onServerStartedEvent(FMLServerStartedEvent event) {

		this.moduleManager.routeFMLStateEvent(event);
	}

	@Mod.EventHandler
	public void onServerStoppingEvent(FMLServerStoppingEvent event) {

		this.moduleManager.routeFMLStateEvent(event);
	}

	@Mod.EventHandler
	public void onServerStoppedEvent(FMLServerStoppedEvent event) {

		this.moduleManager.routeFMLStateEvent(event);
	}
}
