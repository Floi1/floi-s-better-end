
package net.mcreator.floibetterend.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.floibetterend.init.FloiBetterEndModItems;
import net.mcreator.floibetterend.init.FloiBetterEndModFluids;
import net.mcreator.floibetterend.init.FloiBetterEndModFluidTypes;
import net.mcreator.floibetterend.init.FloiBetterEndModBlocks;

public abstract class EndoilFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> FloiBetterEndModFluidTypes.END_OIL_TYPE.get(), () -> FloiBetterEndModFluids.END_OIL.get(), () -> FloiBetterEndModFluids.FLOWING_END_OIL.get())
			.explosionResistance(100f).bucket(() -> FloiBetterEndModItems.END_OIL_BUCKET.get()).block(() -> (LiquidBlock) FloiBetterEndModBlocks.END_OIL.get());

	private EndoilFluid() {
		super(PROPERTIES);
	}

	public static class Source extends EndoilFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends EndoilFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
