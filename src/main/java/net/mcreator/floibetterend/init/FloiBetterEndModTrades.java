
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.floibetterend.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.WandererTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class FloiBetterEndModTrades {
	@SubscribeEvent
	public static void registerWanderingTrades(WandererTradesEvent event) {
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.ENDER_PEARL, 8),

				new ItemStack(FloiBetterEndModBlocks.BOB.get(), 4), 16, 5, 0.05f));
	}
}
