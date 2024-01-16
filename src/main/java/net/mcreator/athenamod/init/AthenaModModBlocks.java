
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.athenamod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.athenamod.block.ZillaSummonerBlock;
import net.mcreator.athenamod.block.YellowFlowerBlock;
import net.mcreator.athenamod.block.TitaniumOreBlock;
import net.mcreator.athenamod.block.SteelBlockBlock;
import net.mcreator.athenamod.block.SatanicPentagramBlock;
import net.mcreator.athenamod.block.SatanicBaseBlock;
import net.mcreator.athenamod.block.RoseBlock;
import net.mcreator.athenamod.block.ResearchTableBlock;
import net.mcreator.athenamod.block.PowerCrystalBlockBlock;
import net.mcreator.athenamod.block.PowerCrystalBlock;
import net.mcreator.athenamod.block.OldLeavesBlock;
import net.mcreator.athenamod.block.NukeactivatedBlock;
import net.mcreator.athenamod.block.NuclearBombBlock;
import net.mcreator.athenamod.block.MoonRockBlock;
import net.mcreator.athenamod.block.MoonPortalBlock;
import net.mcreator.athenamod.block.LunarSoilBlock;
import net.mcreator.athenamod.block.LogBlock;
import net.mcreator.athenamod.block.HeavenStoneBlock;
import net.mcreator.athenamod.block.HeavenPortalBlock;
import net.mcreator.athenamod.block.HeavenLogBlock;
import net.mcreator.athenamod.block.HeavenLeavesBlock;
import net.mcreator.athenamod.block.HeavenGrassBlockBlock;
import net.mcreator.athenamod.block.HeavenGrassBlock;
import net.mcreator.athenamod.block.GrassBlock;
import net.mcreator.athenamod.block.GoldenWoolBlock;
import net.mcreator.athenamod.block.GoldenAppleTreeLogBlock;
import net.mcreator.athenamod.block.GoldenAppleTreeLeavesBlock;
import net.mcreator.athenamod.block.FossilStoneBlock;
import net.mcreator.athenamod.block.ForgottenLandsPortalBlock;
import net.mcreator.athenamod.block.DinosaurEggBlock;
import net.mcreator.athenamod.block.DawnbladeinstoneBlock;
import net.mcreator.athenamod.block.CrossBlockBlock;
import net.mcreator.athenamod.block.ChurchwoodStairsBlock;
import net.mcreator.athenamod.block.ChurchwoodSlabBlock;
import net.mcreator.athenamod.block.ChurchwoodPlanksBlock;
import net.mcreator.athenamod.block.ChurchDoorBlock;
import net.mcreator.athenamod.block.ChurchBrickBlock;
import net.mcreator.athenamod.block.ChristaniumOreBlock;
import net.mcreator.athenamod.block.CheeseBlockBlock;
import net.mcreator.athenamod.AthenaModMod;

public class AthenaModModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, AthenaModMod.MODID);
	public static final RegistryObject<Block> MOON_PORTAL = REGISTRY.register("moon_portal", () -> new MoonPortalBlock());
	public static final RegistryObject<Block> CHEESE_BLOCK = REGISTRY.register("cheese_block", () -> new CheeseBlockBlock());
	public static final RegistryObject<Block> LUNAR_SOIL = REGISTRY.register("lunar_soil", () -> new LunarSoilBlock());
	public static final RegistryObject<Block> MOON_ROCK = REGISTRY.register("moon_rock", () -> new MoonRockBlock());
	public static final RegistryObject<Block> STEEL_BLOCK = REGISTRY.register("steel_block", () -> new SteelBlockBlock());
	public static final RegistryObject<Block> FOSSIL_STONE = REGISTRY.register("fossil_stone", () -> new FossilStoneBlock());
	public static final RegistryObject<Block> RESEARCH_TABLE = REGISTRY.register("research_table", () -> new ResearchTableBlock());
	public static final RegistryObject<Block> HEAVEN_PORTAL = REGISTRY.register("heaven_portal", () -> new HeavenPortalBlock());
	public static final RegistryObject<Block> TITANIUM_ORE = REGISTRY.register("titanium_ore", () -> new TitaniumOreBlock());
	public static final RegistryObject<Block> HEAVEN_GRASS_BLOCK = REGISTRY.register("heaven_grass_block", () -> new HeavenGrassBlockBlock());
	public static final RegistryObject<Block> HEAVEN_STONE = REGISTRY.register("heaven_stone", () -> new HeavenStoneBlock());
	public static final RegistryObject<Block> HEAVEN_LOG = REGISTRY.register("heaven_log", () -> new HeavenLogBlock());
	public static final RegistryObject<Block> HEAVEN_LEAVES = REGISTRY.register("heaven_leaves", () -> new HeavenLeavesBlock());
	public static final RegistryObject<Block> HEAVEN_GRASS = REGISTRY.register("heaven_grass", () -> new HeavenGrassBlock());
	public static final RegistryObject<Block> CHRISTANIUM_ORE = REGISTRY.register("christanium_ore", () -> new ChristaniumOreBlock());
	public static final RegistryObject<Block> GOLDEN_APPLE_TREE_LOG = REGISTRY.register("golden_apple_tree_log", () -> new GoldenAppleTreeLogBlock());
	public static final RegistryObject<Block> GOLDEN_APPLE_TREE_LEAVES = REGISTRY.register("golden_apple_tree_leaves", () -> new GoldenAppleTreeLeavesBlock());
	public static final RegistryObject<Block> GRASS = REGISTRY.register("grass", () -> new GrassBlock());
	public static final RegistryObject<Block> LOG = REGISTRY.register("log", () -> new LogBlock());
	public static final RegistryObject<Block> ROSE = REGISTRY.register("rose", () -> new RoseBlock());
	public static final RegistryObject<Block> FORGOTTEN_LANDS_PORTAL = REGISTRY.register("forgotten_lands_portal", () -> new ForgottenLandsPortalBlock());
	public static final RegistryObject<Block> OLD_LEAVES = REGISTRY.register("old_leaves", () -> new OldLeavesBlock());
	public static final RegistryObject<Block> YELLOW_FLOWER = REGISTRY.register("yellow_flower", () -> new YellowFlowerBlock());
	public static final RegistryObject<Block> DINOSAUR_EGG = REGISTRY.register("dinosaur_egg", () -> new DinosaurEggBlock());
	public static final RegistryObject<Block> POWER_CRYSTAL = REGISTRY.register("power_crystal", () -> new PowerCrystalBlock());
	public static final RegistryObject<Block> ZILLA_SUMMONER = REGISTRY.register("zilla_summoner", () -> new ZillaSummonerBlock());
	public static final RegistryObject<Block> SATANIC_PENTAGRAM = REGISTRY.register("satanic_pentagram", () -> new SatanicPentagramBlock());
	public static final RegistryObject<Block> SATANIC_BASE = REGISTRY.register("satanic_base", () -> new SatanicBaseBlock());
	public static final RegistryObject<Block> GOLDEN_WOOL = REGISTRY.register("golden_wool", () -> new GoldenWoolBlock());
	public static final RegistryObject<Block> CROSS_BLOCK = REGISTRY.register("cross_block", () -> new CrossBlockBlock());
	public static final RegistryObject<Block> CHURCH_BRICK = REGISTRY.register("church_brick", () -> new ChurchBrickBlock());
	public static final RegistryObject<Block> CHURCH_DOOR = REGISTRY.register("church_door", () -> new ChurchDoorBlock());
	public static final RegistryObject<Block> CHURCHWOOD_PLANKS = REGISTRY.register("churchwood_planks", () -> new ChurchwoodPlanksBlock());
	public static final RegistryObject<Block> CHURCHWOOD_STAIRS = REGISTRY.register("churchwood_stairs", () -> new ChurchwoodStairsBlock());
	public static final RegistryObject<Block> CHURCHWOOD_SLAB = REGISTRY.register("churchwood_slab", () -> new ChurchwoodSlabBlock());
	public static final RegistryObject<Block> NUCLEAR_BOMB = REGISTRY.register("nuclear_bomb", () -> new NuclearBombBlock());
	public static final RegistryObject<Block> POWER_CRYSTAL_BLOCK = REGISTRY.register("power_crystal_block", () -> new PowerCrystalBlockBlock());
	public static final RegistryObject<Block> NUKEACTIVATED = REGISTRY.register("nukeactivated", () -> new NukeactivatedBlock());
	public static final RegistryObject<Block> DAWNBLADEINSTONE = REGISTRY.register("dawnbladeinstone", () -> new DawnbladeinstoneBlock());
}
