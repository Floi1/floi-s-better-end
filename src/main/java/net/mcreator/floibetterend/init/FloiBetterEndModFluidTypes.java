
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.floibetterend.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.mcreator.floibetterend.fluid.types.EndoilFluidType;
import net.mcreator.floibetterend.FloiBetterEndMod;

public class FloiBetterEndModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, FloiBetterEndMod.MODID);
	public static final RegistryObject<FluidType> END_OIL_TYPE = REGISTRY.register("end_oil", () -> new EndoilFluidType());
}
