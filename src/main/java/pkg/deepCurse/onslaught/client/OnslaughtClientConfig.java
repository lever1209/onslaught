package pkg.deepCurse.onslaught.client;

import java.io.File;

import net.minecraftforge.fml.common.Loader;

public class OnslaughtClientConfig {
	
	// public File lootTableFile;
	
	public OnslaughtClientConfig() {
		// this.lootTableFile = lootTableFile;
	}

	public static OnslaughtClientConfig loadDebugConfig() {
		return new OnslaughtClientConfig();
	}

}
