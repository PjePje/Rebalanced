package nl.tettelaar.rebalanced.init;

import net.fabricmc.loader.api.FabricLoader;
import nl.tettelaar.rebalanced.Rebalanced;
import nl.tettelaar.rebalanced.init.worldgen.Biomes;
import nl.tettelaar.rebalanced.init.worldgen.DoBiomeModifications;
import nl.tettelaar.rebalanced.init.worldgen.SurfaceBuilders;

public class RebalancedWorldGen {

	public static final int mainContinentSize = 6;
	
	public static final boolean disableRiver = false;
	
	public static final boolean isSimplyImprovedTerrainLoaded = FabricLoader.getInstance()
			.isModLoaded("simplyimprovedterrain");
	
	public static void init() {
		SurfaceBuilders.init();
		Biomes.init();
		DoBiomeModifications.init();
	}

	

}
