package gay.sparkle.dwaynetheblockjohnson;

import gay.sparkle.dwaynetheblockjohnson.block.ModBlocks;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DwayneTheBlockJohnsonMod implements ModInitializer {
	public static final String MOD_ID = "dwaynetheblockjohnson";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModBlocks.registerModBlocks();

		LOGGER.info(MOD_ID + " initialized");
	}
}
