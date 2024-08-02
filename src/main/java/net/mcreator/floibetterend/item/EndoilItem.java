
package net.mcreator.floibetterend.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.floibetterend.init.FloiBetterEndModFluids;

public class EndoilItem extends BucketItem {
	public EndoilItem() {
		super(FloiBetterEndModFluids.END_OIL, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON));
	}
}
