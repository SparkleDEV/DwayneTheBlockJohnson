package gay.sparkle.dwaynetheblockjohnson;

import gay.sparkle.dwaynetheblockjohnson.datagen.ModBlockLootTableProvider;
import gay.sparkle.dwaynetheblockjohnson.datagen.ModBlockTagProvider;
import gay.sparkle.dwaynetheblockjohnson.datagen.ModModelProvider;
import gay.sparkle.dwaynetheblockjohnson.datagen.ModRecipeProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class DwayneTheBlockJohnsonModDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModBlockLootTableProvider::new);
		pack.addProvider(ModBlockTagProvider::new);
		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModRecipeProvider::new);
	}
}
