package pkg.deepCurse.onslaught.common;

import java.io.File;

import net.minecraftforge.fml.common.Loader;

public class OnslaughtCommonConfig {

	public File lootDir;

	public OnslaughtCommonConfig(File lootDir) {
		this.lootDir = lootDir;
	}

	public static OnslaughtCommonConfig loadDebugConfig() {
		return new OnslaughtCommonConfig(Loader.instance().getConfigDir());
	}

}
