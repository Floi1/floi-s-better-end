
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.floibetterend.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.floibetterend.FloiBetterEndMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class FloiBetterEndModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FloiBetterEndMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(FloiBetterEndModBlocks.BOB.get().asItem());
			tabData.accept(FloiBetterEndModBlocks.PURPLEOREBLOCK.get().asItem());
			tabData.accept(FloiBetterEndModBlocks.GREENENDROCK.get().asItem());
			tabData.accept(FloiBetterEndModBlocks.REDENDROCK.get().asItem());
			tabData.accept(FloiBetterEndModBlocks.BLUEENDROCK.get().asItem());
			tabData.accept(FloiBetterEndModBlocks.YELLOWENDROCK.get().asItem());
			tabData.accept(FloiBetterEndModBlocks.ORANGEENDROCK.get().asItem());
			tabData.accept(FloiBetterEndModBlocks.SHINE.get().asItem());
			tabData.accept(FloiBetterEndModBlocks.PACKEDBLOB.get().asItem());
			tabData.accept(FloiBetterEndModBlocks.BLACKENDROCK.get().asItem());
			tabData.accept(FloiBetterEndModBlocks.BLOBBRICK.get().asItem());
			tabData.accept(FloiBetterEndModBlocks.BLOBSLABBRICK.get().asItem());
			tabData.accept(FloiBetterEndModBlocks.CORRUPTEDPURPLESTONE.get().asItem());
			tabData.accept(FloiBetterEndModBlocks.BLUEREEL.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(FloiBetterEndModItems.BLOBSWORD.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(FloiBetterEndModItems.P_URPLEORE.get());
			tabData.accept(FloiBetterEndModItems.END_OIL_BUCKET.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(FloiBetterEndModBlocks.ENDGRASS.get().asItem());
			tabData.accept(FloiBetterEndModBlocks.TALLTALLPURPLEPLANT.get().asItem());
			tabData.accept(FloiBetterEndModBlocks.ENDFLOWER.get().asItem());
			tabData.accept(FloiBetterEndModBlocks.ENDVINES.get().asItem());
			tabData.accept(FloiBetterEndModBlocks.SMALLVINES.get().asItem());
		}
	}
}
