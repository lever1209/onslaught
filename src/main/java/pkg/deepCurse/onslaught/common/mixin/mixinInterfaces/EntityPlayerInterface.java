package pkg.deepCurse.onslaught.common.mixin.mixinInterfaces;

import java.util.ArrayList;
import java.util.UUID;

public interface EntityPlayerInterface {

	public ArrayList<UUID> getInvasions();
	public void setInvasions(UUID... invasions);
	public void addInvasions(UUID... invasions);
	public void removeInvasions(UUID... invasions);

	// public long getInvasionStartTick();
	// public void setInvasionStartTick(long i);
	// public long getInvasionDuration();
	// public void setInvasionDuration(long i);
}
