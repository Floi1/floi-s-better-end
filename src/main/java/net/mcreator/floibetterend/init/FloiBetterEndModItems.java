
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.floibetterend.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.BlockItem;

import net.mcreator.floibetterend.item.PUrpleoreItem;
import net.mcreator.floibetterend.item.EndoilItem;
import net.mcreator.floibetterend.item.BlobswordItem;
import net.mcreator.floibetterend.FloiBetterEndMod;

public class FloiBetterEndModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, FloiBetterEndMod.MODID);
	public static final RegistryObject<Item> BOB = block(FloiBetterEndModBlocks.BOB);
	public static final RegistryObject<Item> PURPLEOREBLOCK = block(FloiBetterEndModBlocks.PURPLEOREBLOCK);
	public static final RegistryObject<Item> P_URPLEORE = REGISTRY.register("p_urpleore", () -> new PUrpleoreItem());
	public static final RegistryObject<Item> ENDGRASS = block(FloiBetterEndModBlocks.ENDGRASS);
	public static final RegistryObject<Item> TALLTALLPURPLEPLANT = doubleBlock(FloiBetterEndModBlocks.TALLTALLPURPLEPLANT);
	public static final RegistryObject<Item> GREENENDROCK = block(FloiBetterEndModBlocks.GREENENDROCK);
	public static final RegistryObject<Item> ENDFLOWER = block(FloiBetterEndModBlocks.ENDFLOWER);
	public static final RegistryObject<Item> END_OIL_BUCKET = REGISTRY.register("end_oil_bucket", () -> new EndoilItem());
	public static final RegistryObject<Item> REDENDROCK = block(FloiBetterEndModBlocks.REDENDROCK);
	public static final RegistryObject<Item> BLUEENDROCK = block(FloiBetterEndModBlocks.BLUEENDROCK);
	public static final RegistryObject<Item> YELLOWENDROCK = block(FloiBetterEndModBlocks.YELLOWENDROCK);
	public static final RegistryObject<Item> ENDVINES = block(FloiBetterEndModBlocks.ENDVINES);
	public static final RegistryObject<Item> ORANGEENDROCK = block(FloiBetterEndModBlocks.ORANGEENDROCK);
	public static final RegistryObject<Item> SHINE = block(FloiBetterEndModBlocks.SHINE);
	public static final RegistryObject<Item> PACKEDBLOB = block(FloiBetterEndModBlocks.PACKEDBLOB);
	public static final RegistryObject<Item> BLACKENDROCK = block(FloiBetterEndModBlocks.BLACKENDROCK);
	public static final RegistryObject<Item> BLOBSWORD = REGISTRY.register("blobsword", () -> new BlobswordItem());
	public static final RegistryObject<Item> BLOBBRICK = block(FloiBetterEndModBlocks.BLOBBRICK);
	public static final RegistryObject<Item> BLOBSLABBRICK = block(FloiBetterEndModBlocks.BLOBSLABBRICK);
	public static final RegistryObject<Item> SMALLVINES = doubleBlock(FloiBetterEndModBlocks.SMALLVINES);
	public static final RegistryObject<Item> CORRUPTEDPURPLESTONE = block(FloiBetterEndModBlocks.CORRUPTEDPURPLESTONE);
	public static final RegistryObject<Item> BLUEREEL = block(FloiBetterEndModBlocks.BLUEREEL);
	public static final RegistryObject<Item> LOGREEL = block(FloiBetterEndModBlocks.LOGREEL);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}

	private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties()));
	}
}
