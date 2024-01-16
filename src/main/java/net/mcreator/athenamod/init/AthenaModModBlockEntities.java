
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.athenamod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.athenamod.block.entity.ResearchTableBlockEntity;
import net.mcreator.athenamod.block.entity.GoldenWoolBlockEntity;
import net.mcreator.athenamod.AthenaModMod;

public class AthenaModModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, AthenaModMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> RESEARCH_TABLE = register("research_table", AthenaModModBlocks.RESEARCH_TABLE, ResearchTableBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> GOLDEN_WOOL = register("golden_wool", AthenaModModBlocks.GOLDEN_WOOL, GoldenWoolBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
