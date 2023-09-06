package gay.sparkle.dwaynetheblockjohnson.block;

import gay.sparkle.dwaynetheblockjohnson.DwayneTheBlockJohnsonMod;
import gay.sparkle.dwaynetheblockjohnson.block.custom.DwayneBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class ModBlocks {
	public static final Block DWAYNE_BLOCK = registerBlock("dwayne_block",
			new DwayneBlock(FabricBlockSettings.copyOf(Blocks.STONE).requiresTool()),
			new FabricItemSettings().rarity(Rarity.EPIC).fireproof()
	);

	private static Block registerBlock(String name, Block block, Item.Settings itemsettings) {
		registerBlockItem(name, block, itemsettings);
		return Registry.register(Registries.BLOCK, new Identifier(DwayneTheBlockJohnsonMod.MOD_ID, name), block);
	}

	private static Item registerBlockItem(String name, Block block, Item.Settings itemsettings) {
		return Registry.register(Registries.ITEM, new Identifier(DwayneTheBlockJohnsonMod.MOD_ID, name),
				new BlockItem(block, itemsettings));
	}

	private static void addBlocksToItemGroup() {
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
			entries.add(DWAYNE_BLOCK);
		});
	}

	public static void registerModBlocks() {
		DwayneTheBlockJohnsonMod.LOGGER.debug("Registering Blocks for " + DwayneTheBlockJohnsonMod.MOD_ID);

		addBlocksToItemGroup();
	}
}
