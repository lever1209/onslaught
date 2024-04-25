package pkg.deepCurse.onslaught.common;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin;
import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin.MCVersion;
import zone.rong.mixinbooter.IEarlyMixinLoader;

@MCVersion("1.12.2")
public class OnslaughtCoreMod implements IFMLLoadingPlugin, IEarlyMixinLoader {

	@Override
	public List<String> getMixinConfigs() {
		return new ArrayList<String>();
//		return Arrays.asList(new String[] { String.format("%s.mixins.json", OnslaughtEntryPoint.modId) });
	}

	@Override
	public String[] getASMTransformerClass() {
		return new String[0];
	}

	@Override
	public String getModContainerClass() {
		return null;
	}

	@Override
	public String getSetupClass() {
		return null;
	}

	@Override
	public void injectData(Map<String, Object> data) {
	}

	@Override
	public String getAccessTransformerClass() {
		return null;
	}

}
