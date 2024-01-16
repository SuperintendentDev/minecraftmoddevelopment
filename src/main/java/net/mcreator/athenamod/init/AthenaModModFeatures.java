
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.athenamod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.athenamod.world.features.plants.YellowFlowerFeature;
import net.mcreator.athenamod.world.features.plants.RoseFeature;
import net.mcreator.athenamod.world.features.plants.HeavenGrassFeature;
import net.mcreator.athenamod.world.features.ores.TitaniumOreFeature;
import net.mcreator.athenamod.world.features.ores.FossilStoneFeature;
import net.mcreator.athenamod.world.features.ores.ChristaniumOreFeature;
import net.mcreator.athenamod.world.features.WizardTowerFeature;
import net.mcreator.athenamod.world.features.WellFeature;
import net.mcreator.athenamod.world.features.TayKprisonFeature;
import net.mcreator.athenamod.world.features.StableFeature;
import net.mcreator.athenamod.world.features.Skyscraper1Feature;
import net.mcreator.athenamod.world.features.SatanicArenaFeature;
import net.mcreator.athenamod.world.features.SaddamhusseinhideoutFeature;
import net.mcreator.athenamod.world.features.PowercrystalsFeature;
import net.mcreator.athenamod.world.features.Overlord3Feature;
import net.mcreator.athenamod.world.features.Overlord2Feature;
import net.mcreator.athenamod.world.features.Overlord1Feature;
import net.mcreator.athenamod.world.features.KeyFortFeature;
import net.mcreator.athenamod.world.features.Heaventree2Feature;
import net.mcreator.athenamod.world.features.Heaventree1Feature;
import net.mcreator.athenamod.world.features.HeavenLootFeature;
import net.mcreator.athenamod.world.features.GoldenAppleTreeFeature;
import net.mcreator.athenamod.world.features.GodtemplespawnerFeature;
import net.mcreator.athenamod.world.features.GodsTempleFeature;
import net.mcreator.athenamod.world.features.DragonDungeonFeature;
import net.mcreator.athenamod.world.features.ChurchFeature;
import net.mcreator.athenamod.world.features.CastleFeature;
import net.mcreator.athenamod.world.features.Cart1Feature;
import net.mcreator.athenamod.world.features.CabinFeature;
import net.mcreator.athenamod.world.features.ApollotempleFeature;
import net.mcreator.athenamod.AthenaModMod;

@Mod.EventBusSubscriber
public class AthenaModModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, AthenaModMod.MODID);
	public static final RegistryObject<Feature<?>> APOLLOTEMPLE = REGISTRY.register("apollotemple", ApollotempleFeature::new);
	public static final RegistryObject<Feature<?>> CASTLE = REGISTRY.register("castle", CastleFeature::new);
	public static final RegistryObject<Feature<?>> FOSSIL_STONE = REGISTRY.register("fossil_stone", FossilStoneFeature::new);
	public static final RegistryObject<Feature<?>> SKYSCRAPER_1 = REGISTRY.register("skyscraper_1", Skyscraper1Feature::new);
	public static final RegistryObject<Feature<?>> TITANIUM_ORE = REGISTRY.register("titanium_ore", TitaniumOreFeature::new);
	public static final RegistryObject<Feature<?>> HEAVEN_GRASS = REGISTRY.register("heaven_grass", HeavenGrassFeature::new);
	public static final RegistryObject<Feature<?>> CHRISTANIUM_ORE = REGISTRY.register("christanium_ore", ChristaniumOreFeature::new);
	public static final RegistryObject<Feature<?>> GOLDEN_APPLE_TREE = REGISTRY.register("golden_apple_tree", GoldenAppleTreeFeature::new);
	public static final RegistryObject<Feature<?>> GODS_TEMPLE = REGISTRY.register("gods_temple", GodsTempleFeature::new);
	public static final RegistryObject<Feature<?>> HEAVEN_LOOT = REGISTRY.register("heaven_loot", HeavenLootFeature::new);
	public static final RegistryObject<Feature<?>> ROSE = REGISTRY.register("rose", RoseFeature::new);
	public static final RegistryObject<Feature<?>> YELLOW_FLOWER = REGISTRY.register("yellow_flower", YellowFlowerFeature::new);
	public static final RegistryObject<Feature<?>> CABIN = REGISTRY.register("cabin", CabinFeature::new);
	public static final RegistryObject<Feature<?>> WIZARD_TOWER = REGISTRY.register("wizard_tower", WizardTowerFeature::new);
	public static final RegistryObject<Feature<?>> WELL = REGISTRY.register("well", WellFeature::new);
	public static final RegistryObject<Feature<?>> OVERLORD_1 = REGISTRY.register("overlord_1", Overlord1Feature::new);
	public static final RegistryObject<Feature<?>> OVERLORD_2 = REGISTRY.register("overlord_2", Overlord2Feature::new);
	public static final RegistryObject<Feature<?>> OVERLORD_3 = REGISTRY.register("overlord_3", Overlord3Feature::new);
	public static final RegistryObject<Feature<?>> STABLE = REGISTRY.register("stable", StableFeature::new);
	public static final RegistryObject<Feature<?>> TAY_KPRISON = REGISTRY.register("tay_kprison", TayKprisonFeature::new);
	public static final RegistryObject<Feature<?>> CART_1 = REGISTRY.register("cart_1", Cart1Feature::new);
	public static final RegistryObject<Feature<?>> POWERCRYSTALS = REGISTRY.register("powercrystals", PowercrystalsFeature::new);
	public static final RegistryObject<Feature<?>> SATANIC_ARENA = REGISTRY.register("satanic_arena", SatanicArenaFeature::new);
	public static final RegistryObject<Feature<?>> SADDAMHUSSEINHIDEOUT = REGISTRY.register("saddamhusseinhideout", SaddamhusseinhideoutFeature::new);
	public static final RegistryObject<Feature<?>> KEY_FORT = REGISTRY.register("key_fort", KeyFortFeature::new);
	public static final RegistryObject<Feature<?>> CHURCH = REGISTRY.register("church", ChurchFeature::new);
	public static final RegistryObject<Feature<?>> HEAVENTREE_1 = REGISTRY.register("heaventree_1", Heaventree1Feature::new);
	public static final RegistryObject<Feature<?>> HEAVENTREE_2 = REGISTRY.register("heaventree_2", Heaventree2Feature::new);
	public static final RegistryObject<Feature<?>> GODTEMPLESPAWNER = REGISTRY.register("godtemplespawner", GodtemplespawnerFeature::new);
	public static final RegistryObject<Feature<?>> DRAGON_DUNGEON = REGISTRY.register("dragon_dungeon", DragonDungeonFeature::new);
}
