package pkg.deepCurse.onslaught.common.invasions;

import java.util.function.BooleanSupplier;

public class Invasion {
	public short id;
	public short iconID;
	public LocationHints[] locationHints;
	public BooleanSupplier[] conditions;
	public BooleanSupplier[] failureConditions;
	public Wave[] waves;
}
