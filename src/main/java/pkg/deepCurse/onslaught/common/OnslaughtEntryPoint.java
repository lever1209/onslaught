package pkg.deepCurse.onslaught.common;

import java.nio.file.Files;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.relauncher.FMLLaunchHandler;
import pkg.deepCurse.onslaught.client.OnslaughtClientConfig;
import pkg.deepCurse.onslaught.server.OnslaughtServerConfig;
import zone.rong.mixinbooter.MixinBooterPlugin;

@Mod(modid = OnslaughtEntryPoint.modId)
public class OnslaughtEntryPoint {

	// https://gist.github.com/codetaylor/101e856a0800bee3b237bb3d5f63b566
	// https://docs.google.com/document/d/13ys7CE-n8nuzqIyCc96M927622BFZTWZMXdZqttRxfA
	// https://docs.google.com/document/d/18f53XrOCxbvOZY-aO8W5aq_WajEoVIhv8wwziwiltRs
	// https://github.com/BTW-Community/Mobs-Enhancement-Addon?tab=readme-ov-file#skeletons
	// https://docs.google.com/document/d/1RD0mLa9VvPe4vNBBxm9YjcaSm590W74aLq_LnITJKJs/edit
	// https://docs.google.com/document/d/1eITgkmAt948wY0rgqDHJnZ8RUsJpfqZ3n1ATMUD7FEs/edit
	// TODO create sub mod that uses nbt to activate custom ai features of summoned mobs like mining etc

	// entity mob spawners with health and a timer matching the invasion duration, falling block style
	// mob armies, with organization and multiple points of failure, attacking and movement formations
	
	@Mod.Instance
	public static OnslaughtEntryPoint INSTANCE;

	public static final String modId = "onslaught";
	private static final Logger log = LogManager
			.getLogger(FMLLaunchHandler.isDeobfuscatedEnvironment() ? OnslaughtEntryPoint.class.getName()
					: OnslaughtEntryPoint.class.getSimpleName());

	public static final String group = "pkg.deepCurse.onslaught";
	public static final boolean isDebug = Boolean.parseBoolean(
			System.getProperty(group + ".debugMode", String.valueOf(FMLLaunchHandler.isDeobfuscatedEnvironment())));

	public static OnslaughtClientConfig clientConfig;
	public static OnslaughtDebugConfig debugConfig;
	public static OnslaughtCommonConfig commonConfig;
	public static OnslaughtServerConfig serverConfig;

	public OnslaughtEntryPoint() {
		log.info("Loading Onslaught");

		log.info("Applying mixins via mixinbooter.");
		MixinBooterPlugin.initMixinExtra(true);

		if (isDebug) {
			log.info("Using debug configs.");
			clientConfig = OnslaughtClientConfig.loadDebugConfig();
			commonConfig = OnslaughtCommonConfig.loadDebugConfig();
			debugConfig = OnslaughtDebugConfig.loadDebugConfig();
			serverConfig = OnslaughtServerConfig.loadDebugConfig();
		} else {
			log.info("Using release configs.");
			throw new RuntimeException("Release configs are not complete yet, aborting");
			// clientConfig = OnslaughtClientConfig.loadConfig();
			// commonConfig = OnslaughtCommonConfig.loadConfig();
			// debugConfig = OnslaughtDebugConfig.loadConfig();
			// serverConfig = OnslaughtServerConfig.loadConfig();
		}

		try {
			Files.createDirectories(commonConfig.lootDir.toPath());
		} catch (Exception e) {
			throw new RuntimeException(
					String.format("There was an error while creating the %s dir", commonConfig.lootDir.toPath()), e);
		}
	}
}
