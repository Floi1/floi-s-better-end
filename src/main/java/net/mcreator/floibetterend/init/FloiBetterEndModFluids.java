
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.floibetterend.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.floibetterend.fluid.EndoilFluid;
import net.mcreator.floibetterend.FloiBetterEndMod;

public class FloiBetterEndModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, FloiBetterEndMod.MODID);
	public static final RegistryObject<FlowingFluid> END_OIL = REGISTRY.register("end_oil", () -> new EndoilFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_END_OIL = REGISTRY.register("flowing_end_oil", () -> new EndoilFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class FluidsClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(END_OIL.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_END_OIL.get(), RenderType.translucent());
		}
	}
}
