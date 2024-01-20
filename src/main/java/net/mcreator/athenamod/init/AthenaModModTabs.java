
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.athenamod.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.athenamod.AthenaModMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AthenaModModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AthenaModMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(AthenaModModBlocks.STEEL_BLOCK.get().asItem());
			tabData.accept(AthenaModModBlocks.SATANIC_BASE.get().asItem());
			tabData.accept(AthenaModModBlocks.CROSS_BLOCK.get().asItem());
			tabData.accept(AthenaModModBlocks.CHURCH_BRICK.get().asItem());
			tabData.accept(AthenaModModBlocks.CHURCH_DOOR.get().asItem());
			tabData.accept(AthenaModModBlocks.CHURCHWOOD_PLANKS.get().asItem());
			tabData.accept(AthenaModModBlocks.CHURCHWOOD_STAIRS.get().asItem());
			tabData.accept(AthenaModModBlocks.CHURCHWOOD_SLAB.get().asItem());
			tabData.accept(AthenaModModBlocks.POWER_CRYSTAL_BLOCK.get().asItem());
		}

		if (tabData.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
			tabData.accept(AthenaModModBlocks.RESEARCH_TABLE.get().asItem());
			tabData.accept(AthenaModModBlocks.SATANIC_PENTAGRAM.get().asItem());
			tabData.accept(AthenaModModBlocks.DAWNBLADEINSTONE.get().asItem());
		}

		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(AthenaModModItems.BULLET.get());
			tabData.accept(AthenaModModItems.RIFLE_BULLET.get());
			tabData.accept(AthenaModModItems.ROCKET.get());
			tabData.accept(AthenaModModItems.ZILLA_SWORD.get());
			tabData.accept(AthenaModModItems.OVERLORD_HELMET.get());
			tabData.accept(AthenaModModItems.OVERLORD_CHESTPLATE.get());
			tabData.accept(AthenaModModItems.OVERLORD_LEGGINGS.get());
			tabData.accept(AthenaModModItems.OVERLORD_BOOTS.get());
			tabData.accept(AthenaModModItems.OVERLORD_TOOLS_SWORD.get());
			tabData.accept(AthenaModModItems.STEEL_SWORD.get());
			tabData.accept(AthenaModModItems.TITANIUM_SWORD.get());
			tabData.accept(AthenaModModItems.SHOTGUN_SHELL.get());
			tabData.accept(AthenaModModBlocks.NUCLEAR_BOMB.get().asItem());
			tabData.accept(AthenaModModItems.DAWN_BLADE.get());
			tabData.accept(AthenaModModItems.SUB_MACHINE_GUN.get());
			tabData.accept(AthenaModModItems.RAYGUN.get());
			tabData.accept(AthenaModModItems.ASSAULT_RIFLE.get());
			tabData.accept(AthenaModModItems.PISTOL.get());
			tabData.accept(AthenaModModItems.RIFLE.get());
			tabData.accept(AthenaModModItems.ROCKET_LAUNCHER.get());
			tabData.accept(AthenaModModItems.ZILLA_BEAM.get());
			tabData.accept(AthenaModModItems.FIRE_ATTACK.get());
			tabData.accept(AthenaModModItems.REVOLVER.get());
			tabData.accept(AthenaModModItems.GLOCK_WITH_SWITCH.get());
			tabData.accept(AthenaModModItems.SHOTGUN.get());
			tabData.accept(AthenaModModItems.ASSAULT_PISTOL.get());
			tabData.accept(AthenaModModItems.SAWED_OFF_SHOTGUN.get());
			tabData.accept(AthenaModModItems.BIBLE.get());
			tabData.accept(AthenaModModItems.AETHERSWORD.get());
			tabData.accept(AthenaModModItems.NUKE_LAUNCHER.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(AthenaModModItems.LANCE_PETERSON_SPAWN_EGG.get());
			tabData.accept(AthenaModModItems.APOLLO_SPAWN_EGG.get());
			tabData.accept(AthenaModModItems.CRICKET_SPAWN_EGG.get());
			tabData.accept(AthenaModModItems.ATHENA_SPAWN_EGG.get());
			tabData.accept(AthenaModModItems.ALIEN_SPAWN_EGG.get());
			tabData.accept(AthenaModModItems.UFO_SPAWN_EGG.get());
			tabData.accept(AthenaModModItems.CIVILIAN_SPAWN_EGG.get());
			tabData.accept(AthenaModModItems.ZILLA_SPAWN_EGG.get());
			tabData.accept(AthenaModModItems.PRINCE_SPAWN_EGG.get());
			tabData.accept(AthenaModModItems.CIVILIAN_2_SPAWN_EGG.get());
			tabData.accept(AthenaModModItems.DRUG_DEALER_SPAWN_EGG.get());
			tabData.accept(AthenaModModItems.SOLDIER_SPAWN_EGG.get());
			tabData.accept(AthenaModModItems.SHRIMP_SPAWN_EGG.get());
			tabData.accept(AthenaModModItems.JESUS_SPAWN_EGG.get());
			tabData.accept(AthenaModModItems.DRAGON_SPAWN_EGG.get());
			tabData.accept(AthenaModModItems.TYRANNOSAURUS_REX_SPAWN_EGG.get());
			tabData.accept(AthenaModModItems.DEERMAN_SPAWN_EGG.get());
			tabData.accept(AthenaModModItems.BEEF_CAKE_SPAWN_EGG.get());
			tabData.accept(AthenaModModItems.THOT_SPAWN_EGG.get());
			tabData.accept(AthenaModModItems.SPEEDSTER_SPAWN_EGG.get());
			tabData.accept(AthenaModModItems.WIZARD_SPAWN_EGG.get());
			tabData.accept(AthenaModModItems.PIG_SPAWN_EGG.get());
			tabData.accept(AthenaModModItems.GIANT_SPAWN_EGG.get());
			tabData.accept(AthenaModModItems.MR_DUCK_SPAWN_EGG.get());
			tabData.accept(AthenaModModItems.NERD_SPAWN_EGG.get());
			tabData.accept(AthenaModModItems.RAPTOR_SPAWN_EGG.get());
			tabData.accept(AthenaModModItems.TERRORIST_SPAWN_EGG.get());
			tabData.accept(AthenaModModBlocks.DINOSAUR_EGG.get().asItem());
			tabData.accept(AthenaModModItems.GOBLIN_SPAWN_EGG.get());
			tabData.accept(AthenaModModItems.KNIGHT_SPAWN_EGG.get());
			tabData.accept(AthenaModModItems.IMP_SPAWN_EGG.get());
			tabData.accept(AthenaModModItems.EVIL_KNIGHT_SPAWN_EGG.get());
			tabData.accept(AthenaModModItems.LUMBERJACK_SPAWN_EGG.get());
			tabData.accept(AthenaModModItems.CHIEF_KEEF_SPAWN_EGG.get());
			tabData.accept(AthenaModModItems.BRONTOSAURUS_SPAWN_EGG.get());
			tabData.accept(AthenaModModItems.DEMON_SPAWN_EGG.get());
			tabData.accept(AthenaModModItems.TAY_K_SPAWN_EGG.get());
			tabData.accept(AthenaModModItems.SATAN_SPAWN_EGG.get());
			tabData.accept(AthenaModModItems.ROCK_MONSTER_SPAWN_EGG.get());
			tabData.accept(AthenaModModItems.SNAIL_SPAWN_EGG.get());
			tabData.accept(AthenaModModBlocks.ZILLA_SUMMONER.get().asItem());
			tabData.accept(AthenaModModItems.ANOLE_SPAWN_EGG.get());
			tabData.accept(AthenaModModItems.TRUMP_SPAWN_EGG.get());
			tabData.accept(AthenaModModItems.OBAMA_SPAWN_EGG.get());
			tabData.accept(AthenaModModItems.SADDAMHUSSIEN_SPAWN_EGG.get());
			tabData.accept(AthenaModModItems.KANYE_SPAWN_EGG.get());
			tabData.accept(AthenaModModItems.MF_DOOM_SPAWN_EGG.get());
			tabData.accept(AthenaModModItems.FORTNITE_SPAWN_EGG.get());
			tabData.accept(AthenaModModItems.TYLER_THE_CREATOR_SPAWN_EGG.get());
			tabData.accept(AthenaModModItems.CHRIS_CHAN_SPAWN_EGG.get());
			tabData.accept(AthenaModModItems.WOOLYSHEEP_SPAWN_EGG.get());
			tabData.accept(AthenaModModItems.ROBOT_SPAWN_EGG.get());
			tabData.accept(AthenaModModItems.KEY_MASTER_SPAWN_EGG.get());
			tabData.accept(AthenaModModItems.DAISY_SPAWN_EGG.get());
			tabData.accept(AthenaModModItems.DARK_DRAGON_SPAWN_EGG.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(AthenaModModItems.STEELINGOT.get());
			tabData.accept(AthenaModModItems.RECIEVER.get());
			tabData.accept(AthenaModModItems.GUN_BARREL.get());
			tabData.accept(AthenaModModItems.LONG_GUN_BARREL.get());
			tabData.accept(AthenaModModItems.MAGAZINE.get());
			tabData.accept(AthenaModModItems.WOOD_GUN_STOCK.get());
			tabData.accept(AthenaModModItems.FOSSIL.get());
			tabData.accept(AthenaModModItems.ZILLA_SPINE.get());
			tabData.accept(AthenaModModItems.RAW_TITANIUM.get());
			tabData.accept(AthenaModModItems.TITANIUM_INGOT.get());
			tabData.accept(AthenaModModItems.CHRISTANIUM_GEM.get());
			tabData.accept(AthenaModModItems.GOLDEN_LEAF.get());
			tabData.accept(AthenaModModItems.GLOCK_SWITCH.get());
			tabData.accept(AthenaModModItems.SNAIL_SHELL.get());
			tabData.accept(AthenaModModItems.POWER_CRYSTAL_SHARD.get());
			tabData.accept(AthenaModModItems.ALIEN_TECH.get());
			tabData.accept(AthenaModModItems.FALLEN_ANGEL_BLOOD.get());
			tabData.accept(AthenaModModItems.NUCLEAR_WARHEAD.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.COLORED_BLOCKS) {
			tabData.accept(AthenaModModBlocks.GOLDEN_WOOL.get().asItem());
		}

		if (tabData.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
			tabData.accept(AthenaModModItems.ELFBAR.get());
			tabData.accept(AthenaModModItems.DEAD_CRICKET.get());
			tabData.accept(AthenaModModItems.MOON.get());
			tabData.accept(AthenaModModItems.CHEESE.get());
			tabData.accept(AthenaModModBlocks.CHEESE_BLOCK.get().asItem());
			tabData.accept(AthenaModModItems.LIZARD.get());
			tabData.accept(AthenaModModItems.BRONTOSAURUS_MEAT.get());
			tabData.accept(AthenaModModItems.TYRANNOSAURUS_MEAT.get());
			tabData.accept(AthenaModModItems.RAPTOR_MEAT.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(AthenaModModBlocks.LUNAR_SOIL.get().asItem());
			tabData.accept(AthenaModModBlocks.MOON_ROCK.get().asItem());
			tabData.accept(AthenaModModBlocks.FOSSIL_STONE.get().asItem());
			tabData.accept(AthenaModModBlocks.TITANIUM_ORE.get().asItem());
			tabData.accept(AthenaModModBlocks.HEAVEN_GRASS_BLOCK.get().asItem());
			tabData.accept(AthenaModModBlocks.HEAVEN_STONE.get().asItem());
			tabData.accept(AthenaModModBlocks.HEAVEN_LOG.get().asItem());
			tabData.accept(AthenaModModBlocks.HEAVEN_LEAVES.get().asItem());
			tabData.accept(AthenaModModBlocks.HEAVEN_GRASS.get().asItem());
			tabData.accept(AthenaModModBlocks.CHRISTANIUM_ORE.get().asItem());
			tabData.accept(AthenaModModBlocks.GOLDEN_APPLE_TREE_LOG.get().asItem());
			tabData.accept(AthenaModModBlocks.GOLDEN_APPLE_TREE_LEAVES.get().asItem());
			tabData.accept(AthenaModModBlocks.GRASS.get().asItem());
			tabData.accept(AthenaModModBlocks.LOG.get().asItem());
			tabData.accept(AthenaModModBlocks.ROSE.get().asItem());
			tabData.accept(AthenaModModBlocks.OLD_LEAVES.get().asItem());
			tabData.accept(AthenaModModBlocks.YELLOW_FLOWER.get().asItem());
			tabData.accept(AthenaModModBlocks.POWER_CRYSTAL.get().asItem());
		}

		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(AthenaModModItems.HEAVEN.get());
			tabData.accept(AthenaModModItems.FORGOTTEN_LANDS.get());
			tabData.accept(AthenaModModItems.OVERLORD_TOOLS_PICKAXE.get());
			tabData.accept(AthenaModModItems.OVERLORD_TOOLS_AXE.get());
			tabData.accept(AthenaModModItems.OVERLORD_TOOLS_SHOVEL.get());
			tabData.accept(AthenaModModItems.OVERLORD_TOOLS_HOE.get());
			tabData.accept(AthenaModModItems.STEEL_PICKAXE.get());
			tabData.accept(AthenaModModItems.STEEL_AXE.get());
			tabData.accept(AthenaModModItems.STEEL_SHOVEL.get());
			tabData.accept(AthenaModModItems.STEEL_HOE.get());
			tabData.accept(AthenaModModItems.TITANIUM_PICKAXE.get());
			tabData.accept(AthenaModModItems.TITANIUM_AXE.get());
			tabData.accept(AthenaModModItems.TITANIUM_SHOVEL.get());
			tabData.accept(AthenaModModItems.TITANIUM_HOE.get());
			tabData.accept(AthenaModModItems.DONT_LIKE.get());
			tabData.accept(AthenaModModItems.HARD.get());
			tabData.accept(AthenaModModItems.DOOMSDAY.get());
			tabData.accept(AthenaModModItems.TREEHOME_95.get());
			tabData.accept(AthenaModModItems.KEY.get());
		}
	}
}
