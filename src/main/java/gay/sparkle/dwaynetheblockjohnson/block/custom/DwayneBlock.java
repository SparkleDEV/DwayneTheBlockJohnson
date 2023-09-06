package gay.sparkle.dwaynetheblockjohnson.block.custom;

import gay.sparkle.dwaynetheblockjohnson.DwayneTheBlockJohnsonMod;
import net.minecraft.block.Block;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.BlockView;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class DwayneBlock extends Block {
	public DwayneBlock(Settings settings) {
		super(settings);
	}

	@Override
	public void appendTooltip(ItemStack stack, @Nullable BlockView world, List<Text> tooltip, TooltipContext options) {
		tooltip.add(Text.translatable("tooltip." + DwayneTheBlockJohnsonMod.MOD_ID + ".dwayne_block.tooltip"));
		super.appendTooltip(stack, world, tooltip, options);
	}
}
