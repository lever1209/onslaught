package pkg.deepCurse.onslaught.common.mixin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.minecraft.world.WorldServer;
import pkg.deepCurse.onslaught.common.invasions.InvasionPlayerData;
import pkg.deepCurse.onslaught.common.invasions.Invasion;

@Mixin(WorldServer.class)
public class WorldServerMixin {

	// TODO self restructuring id translation on add, update subscriber
	// use faster internal values with string external values
	private HashMap<String, Invasion> invasions = new HashMap<>();
	private ArrayList<InvasionPlayerData> activeInvasions = new ArrayList<>();

	@Inject(method = "tick", at = @At("RETURN"))
	private void onslaught_endTickInjection(CallbackInfo ci) {
		handleInvasions();
	}

	private void handleInvasions() {
		// WorldServer self = (WorldServer) (Object) this;

		// Iterator<InvasionPlayerData> iter = activeInvasions.iterator();
		// while (iter.hasNext()) {
			// InvasionPlayerData c = iter.next();
			// if (c.tick(self.getTotalWorldTime())) {
			// 	activeInvasions.remove(c);
			// 	continue;
			// }
		// }
	}
}
