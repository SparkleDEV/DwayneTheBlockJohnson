package gay.sparkle.dwaynetheblockjohnson.datagen;

import gay.sparkle.dwaynetheblockjohnson.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
	public ModRecipeProvider(FabricDataOutput output) {
		super(output);
	}

	@Override
	public void generate(Consumer<RecipeJsonProvider> exporter) {
		ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModBlocks.DWAYNE_BLOCK, 1)
				.pattern("###")
				.pattern("###")
				.pattern("###")
				.input('#', Items.STONE)
				.criterion(hasItem(Items.STONE), conditionsFromItem(Items.STONE))
				.offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DWAYNE_BLOCK)));

	}
}
