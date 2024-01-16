
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.athenamod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.athenamod.item.ZillaSwordItem;
import net.mcreator.athenamod.item.ZillaSpineItem;
import net.mcreator.athenamod.item.ZillaBeamItem;
import net.mcreator.athenamod.item.WoodGunStockItem;
import net.mcreator.athenamod.item.WeakFireAttackItem;
import net.mcreator.athenamod.item.TyrannosaurusMeatItem;
import net.mcreator.athenamod.item.Treehome95Item;
import net.mcreator.athenamod.item.TitaniumSwordItem;
import net.mcreator.athenamod.item.TitaniumShovelItem;
import net.mcreator.athenamod.item.TitaniumPickaxeItem;
import net.mcreator.athenamod.item.TitaniumIngotItem;
import net.mcreator.athenamod.item.TitaniumHoeItem;
import net.mcreator.athenamod.item.TitaniumAxeItem;
import net.mcreator.athenamod.item.TestitemItem;
import net.mcreator.athenamod.item.SubMachineGunItem;
import net.mcreator.athenamod.item.SteelingotItem;
import net.mcreator.athenamod.item.SteelSwordItem;
import net.mcreator.athenamod.item.SteelShovelItem;
import net.mcreator.athenamod.item.SteelPickaxeItem;
import net.mcreator.athenamod.item.SteelHoeItem;
import net.mcreator.athenamod.item.SteelAxeItem;
import net.mcreator.athenamod.item.SnailShellItem;
import net.mcreator.athenamod.item.ShotgunShellItem;
import net.mcreator.athenamod.item.ShotgunItem;
import net.mcreator.athenamod.item.SawedOffShotgunItem;
import net.mcreator.athenamod.item.RocketLauncherItem;
import net.mcreator.athenamod.item.RocketItem;
import net.mcreator.athenamod.item.RifleItem;
import net.mcreator.athenamod.item.RifleBulletItem;
import net.mcreator.athenamod.item.RevolverItem;
import net.mcreator.athenamod.item.RecieverItem;
import net.mcreator.athenamod.item.RaygunItem;
import net.mcreator.athenamod.item.RawTitaniumItem;
import net.mcreator.athenamod.item.RaptorMeatItem;
import net.mcreator.athenamod.item.PowerCrystalShardItem;
import net.mcreator.athenamod.item.PistolItem;
import net.mcreator.athenamod.item.OverlordToolsSwordItem;
import net.mcreator.athenamod.item.OverlordToolsShovelItem;
import net.mcreator.athenamod.item.OverlordToolsPickaxeItem;
import net.mcreator.athenamod.item.OverlordToolsHoeItem;
import net.mcreator.athenamod.item.OverlordToolsAxeItem;
import net.mcreator.athenamod.item.OverlordItem;
import net.mcreator.athenamod.item.NukeLauncherItem;
import net.mcreator.athenamod.item.NuclearWarheadItem;
import net.mcreator.athenamod.item.NothingItem;
import net.mcreator.athenamod.item.MoonItem;
import net.mcreator.athenamod.item.MagazineItem;
import net.mcreator.athenamod.item.LongGunBarrelItem;
import net.mcreator.athenamod.item.LizardItem;
import net.mcreator.athenamod.item.LaserItem;
import net.mcreator.athenamod.item.KeyItem;
import net.mcreator.athenamod.item.HeavenItem;
import net.mcreator.athenamod.item.HardItem;
import net.mcreator.athenamod.item.GunBarrelItem;
import net.mcreator.athenamod.item.GoldenLeafItem;
import net.mcreator.athenamod.item.GlockWithSwitchItem;
import net.mcreator.athenamod.item.GlockSwitchItem;
import net.mcreator.athenamod.item.FossilItem;
import net.mcreator.athenamod.item.ForgottenLandsItem;
import net.mcreator.athenamod.item.FireAttackItem;
import net.mcreator.athenamod.item.FallenAngelBloodItem;
import net.mcreator.athenamod.item.ElfbarItem;
import net.mcreator.athenamod.item.DoomsdayItem;
import net.mcreator.athenamod.item.DontLikeItem;
import net.mcreator.athenamod.item.DinosaurDnaItem;
import net.mcreator.athenamod.item.DeadCricketItem;
import net.mcreator.athenamod.item.DawnBladeItem;
import net.mcreator.athenamod.item.CrossItem;
import net.mcreator.athenamod.item.ChristaniumGemItem;
import net.mcreator.athenamod.item.CheeseItem;
import net.mcreator.athenamod.item.BulletItem;
import net.mcreator.athenamod.item.BrontosaurusMeatItem;
import net.mcreator.athenamod.item.BibleItem;
import net.mcreator.athenamod.item.AssaultRifleItem;
import net.mcreator.athenamod.item.AssaultPistolItem;
import net.mcreator.athenamod.item.AlienTechItem;
import net.mcreator.athenamod.item.AetherswordItem;
import net.mcreator.athenamod.AthenaModMod;

public class AthenaModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, AthenaModMod.MODID);
	public static final RegistryObject<Item> LANCE_PETERSON_SPAWN_EGG = REGISTRY.register("lance_peterson_spawn_egg", () -> new ForgeSpawnEggItem(AthenaModModEntities.LANCE_PETERSON, -1, -13159, new Item.Properties()));
	public static final RegistryObject<Item> ELFBAR = REGISTRY.register("elfbar", () -> new ElfbarItem());
	public static final RegistryObject<Item> APOLLO_SPAWN_EGG = REGISTRY.register("apollo_spawn_egg", () -> new ForgeSpawnEggItem(AthenaModModEntities.APOLLO, -13261, -103, new Item.Properties()));
	public static final RegistryObject<Item> DEAD_CRICKET = REGISTRY.register("dead_cricket", () -> new DeadCricketItem());
	public static final RegistryObject<Item> CRICKET_SPAWN_EGG = REGISTRY.register("cricket_spawn_egg", () -> new ForgeSpawnEggItem(AthenaModModEntities.CRICKET, -6724096, -6711040, new Item.Properties()));
	public static final RegistryObject<Item> ATHENA_SPAWN_EGG = REGISTRY.register("athena_spawn_egg", () -> new ForgeSpawnEggItem(AthenaModModEntities.ATHENA, -16777216, -13312, new Item.Properties()));
	public static final RegistryObject<Item> MOON = REGISTRY.register("moon", () -> new MoonItem());
	public static final RegistryObject<Item> CHEESE = REGISTRY.register("cheese", () -> new CheeseItem());
	public static final RegistryObject<Item> CHEESE_BLOCK = block(AthenaModModBlocks.CHEESE_BLOCK);
	public static final RegistryObject<Item> STEELINGOT = REGISTRY.register("steelingot", () -> new SteelingotItem());
	public static final RegistryObject<Item> LUNAR_SOIL = block(AthenaModModBlocks.LUNAR_SOIL);
	public static final RegistryObject<Item> MOON_ROCK = block(AthenaModModBlocks.MOON_ROCK);
	public static final RegistryObject<Item> ALIEN_SPAWN_EGG = REGISTRY.register("alien_spawn_egg", () -> new ForgeSpawnEggItem(AthenaModModEntities.ALIEN, -10896839, -6843501, new Item.Properties()));
	public static final RegistryObject<Item> SUB_MACHINE_GUN = REGISTRY.register("sub_machine_gun", () -> new SubMachineGunItem());
	public static final RegistryObject<Item> RAYGUN = REGISTRY.register("raygun", () -> new RaygunItem());
	public static final RegistryObject<Item> LASER = REGISTRY.register("laser", () -> new LaserItem());
	public static final RegistryObject<Item> BULLET = REGISTRY.register("bullet", () -> new BulletItem());
	public static final RegistryObject<Item> ASSAULT_RIFLE = REGISTRY.register("assault_rifle", () -> new AssaultRifleItem());
	public static final RegistryObject<Item> RIFLE_BULLET = REGISTRY.register("rifle_bullet", () -> new RifleBulletItem());
	public static final RegistryObject<Item> PISTOL = REGISTRY.register("pistol", () -> new PistolItem());
	public static final RegistryObject<Item> RECIEVER = REGISTRY.register("reciever", () -> new RecieverItem());
	public static final RegistryObject<Item> GUN_BARREL = REGISTRY.register("gun_barrel", () -> new GunBarrelItem());
	public static final RegistryObject<Item> LONG_GUN_BARREL = REGISTRY.register("long_gun_barrel", () -> new LongGunBarrelItem());
	public static final RegistryObject<Item> MAGAZINE = REGISTRY.register("magazine", () -> new MagazineItem());
	public static final RegistryObject<Item> STEEL_BLOCK = block(AthenaModModBlocks.STEEL_BLOCK);
	public static final RegistryObject<Item> WOOD_GUN_STOCK = REGISTRY.register("wood_gun_stock", () -> new WoodGunStockItem());
	public static final RegistryObject<Item> UFO_SPAWN_EGG = REGISTRY.register("ufo_spawn_egg", () -> new ForgeSpawnEggItem(AthenaModModEntities.UFO, -10921639, -5460820, new Item.Properties()));
	public static final RegistryObject<Item> RIFLE = REGISTRY.register("rifle", () -> new RifleItem());
	public static final RegistryObject<Item> FOSSIL_STONE = block(AthenaModModBlocks.FOSSIL_STONE);
	public static final RegistryObject<Item> ROCKET_LAUNCHER = REGISTRY.register("rocket_launcher", () -> new RocketLauncherItem());
	public static final RegistryObject<Item> ROCKET = REGISTRY.register("rocket", () -> new RocketItem());
	public static final RegistryObject<Item> FOSSIL = REGISTRY.register("fossil", () -> new FossilItem());
	public static final RegistryObject<Item> RESEARCH_TABLE = block(AthenaModModBlocks.RESEARCH_TABLE);
	public static final RegistryObject<Item> CIVILIAN_SPAWN_EGG = REGISTRY.register("civilian_spawn_egg", () -> new ForgeSpawnEggItem(AthenaModModEntities.CIVILIAN, -11843769, -8423047, new Item.Properties()));
	public static final RegistryObject<Item> ZILLA_SPAWN_EGG = REGISTRY.register("zilla_spawn_egg", () -> new ForgeSpawnEggItem(AthenaModModEntities.ZILLA, -14140119, -15591149, new Item.Properties()));
	public static final RegistryObject<Item> ZILLA_BEAM = REGISTRY.register("zilla_beam", () -> new ZillaBeamItem());
	public static final RegistryObject<Item> ZILLA_SPINE = REGISTRY.register("zilla_spine", () -> new ZillaSpineItem());
	public static final RegistryObject<Item> ZILLA_SWORD = REGISTRY.register("zilla_sword", () -> new ZillaSwordItem());
	public static final RegistryObject<Item> PRINCE_SPAWN_EGG = REGISTRY.register("prince_spawn_egg", () -> new ForgeSpawnEggItem(AthenaModModEntities.PRINCE, -16777216, -16764109, new Item.Properties()));
	public static final RegistryObject<Item> CIVILIAN_2_SPAWN_EGG = REGISTRY.register("civilian_2_spawn_egg", () -> new ForgeSpawnEggItem(AthenaModModEntities.CIVILIAN_2, -11843769, -8423047, new Item.Properties()));
	public static final RegistryObject<Item> DRUG_DEALER_SPAWN_EGG = REGISTRY.register("drug_dealer_spawn_egg", () -> new ForgeSpawnEggItem(AthenaModModEntities.DRUG_DEALER, -10066432, -10079488, new Item.Properties()));
	public static final RegistryObject<Item> SOLDIER_SPAWN_EGG = REGISTRY.register("soldier_spawn_egg", () -> new ForgeSpawnEggItem(AthenaModModEntities.SOLDIER, -10066432, -13159, new Item.Properties()));
	public static final RegistryObject<Item> SHRIMP_SPAWN_EGG = REGISTRY.register("shrimp_spawn_egg", () -> new ForgeSpawnEggItem(AthenaModModEntities.SHRIMP, -915962, -1617326, new Item.Properties()));
	public static final RegistryObject<Item> HEAVEN = REGISTRY.register("heaven", () -> new HeavenItem());
	public static final RegistryObject<Item> RAW_TITANIUM = REGISTRY.register("raw_titanium", () -> new RawTitaniumItem());
	public static final RegistryObject<Item> TITANIUM_ORE = block(AthenaModModBlocks.TITANIUM_ORE);
	public static final RegistryObject<Item> TITANIUM_INGOT = REGISTRY.register("titanium_ingot", () -> new TitaniumIngotItem());
	public static final RegistryObject<Item> HEAVEN_GRASS_BLOCK = block(AthenaModModBlocks.HEAVEN_GRASS_BLOCK);
	public static final RegistryObject<Item> HEAVEN_STONE = block(AthenaModModBlocks.HEAVEN_STONE);
	public static final RegistryObject<Item> HEAVEN_LOG = block(AthenaModModBlocks.HEAVEN_LOG);
	public static final RegistryObject<Item> HEAVEN_LEAVES = block(AthenaModModBlocks.HEAVEN_LEAVES);
	public static final RegistryObject<Item> HEAVEN_GRASS = block(AthenaModModBlocks.HEAVEN_GRASS);
	public static final RegistryObject<Item> CHRISTANIUM_GEM = REGISTRY.register("christanium_gem", () -> new ChristaniumGemItem());
	public static final RegistryObject<Item> CHRISTANIUM_ORE = block(AthenaModModBlocks.CHRISTANIUM_ORE);
	public static final RegistryObject<Item> JESUS_SPAWN_EGG = REGISTRY.register("jesus_spawn_egg", () -> new ForgeSpawnEggItem(AthenaModModEntities.JESUS, -1, -1, new Item.Properties()));
	public static final RegistryObject<Item> GOLDEN_APPLE_TREE_LOG = block(AthenaModModBlocks.GOLDEN_APPLE_TREE_LOG);
	public static final RegistryObject<Item> GOLDEN_APPLE_TREE_LEAVES = block(AthenaModModBlocks.GOLDEN_APPLE_TREE_LEAVES);
	public static final RegistryObject<Item> GOLDEN_LEAF = REGISTRY.register("golden_leaf", () -> new GoldenLeafItem());
	public static final RegistryObject<Item> DRAGON_SPAWN_EGG = REGISTRY.register("dragon_spawn_egg", () -> new ForgeSpawnEggItem(AthenaModModEntities.DRAGON, -3918025, -10085605, new Item.Properties()));
	public static final RegistryObject<Item> GRASS = block(AthenaModModBlocks.GRASS);
	public static final RegistryObject<Item> LOG = block(AthenaModModBlocks.LOG);
	public static final RegistryObject<Item> TYRANNOSAURUS_REX_SPAWN_EGG = REGISTRY.register("tyrannosaurus_rex_spawn_egg", () -> new ForgeSpawnEggItem(AthenaModModEntities.TYRANNOSAURUS_REX, -9084588, -12766167, new Item.Properties()));
	public static final RegistryObject<Item> DEERMAN_SPAWN_EGG = REGISTRY.register("deerman_spawn_egg", () -> new ForgeSpawnEggItem(AthenaModModEntities.DEERMAN, -4348839, -4348812, new Item.Properties()));
	public static final RegistryObject<Item> BEEF_CAKE_SPAWN_EGG = REGISTRY.register("beef_cake_spawn_egg", () -> new ForgeSpawnEggItem(AthenaModModEntities.BEEF_CAKE, -1531002, -65536, new Item.Properties()));
	public static final RegistryObject<Item> THOT_SPAWN_EGG = REGISTRY.register("thot_spawn_egg", () -> new ForgeSpawnEggItem(AthenaModModEntities.THOT, -3593943, -1461104, new Item.Properties()));
	public static final RegistryObject<Item> SPEEDSTER_SPAWN_EGG = REGISTRY.register("speedster_spawn_egg", () -> new ForgeSpawnEggItem(AthenaModModEntities.SPEEDSTER, -14142007, -65536, new Item.Properties()));
	public static final RegistryObject<Item> WIZARD_SPAWN_EGG = REGISTRY.register("wizard_spawn_egg", () -> new ForgeSpawnEggItem(AthenaModModEntities.WIZARD, -13429538, -863201, new Item.Properties()));
	public static final RegistryObject<Item> FIRE_ATTACK = REGISTRY.register("fire_attack", () -> new FireAttackItem());
	public static final RegistryObject<Item> ROSE = block(AthenaModModBlocks.ROSE);
	public static final RegistryObject<Item> FORGOTTEN_LANDS = REGISTRY.register("forgotten_lands", () -> new ForgottenLandsItem());
	public static final RegistryObject<Item> OLD_LEAVES = block(AthenaModModBlocks.OLD_LEAVES);
	public static final RegistryObject<Item> PIG_SPAWN_EGG = REGISTRY.register("pig_spawn_egg", () -> new ForgeSpawnEggItem(AthenaModModEntities.PIG, -26948, -1017949, new Item.Properties()));
	public static final RegistryObject<Item> YELLOW_FLOWER = block(AthenaModModBlocks.YELLOW_FLOWER);
	public static final RegistryObject<Item> GIANT_SPAWN_EGG = REGISTRY.register("giant_spawn_egg", () -> new ForgeSpawnEggItem(AthenaModModEntities.GIANT, -12963127, -13338584, new Item.Properties()));
	public static final RegistryObject<Item> MR_DUCK_SPAWN_EGG = REGISTRY.register("mr_duck_spawn_egg", () -> new ForgeSpawnEggItem(AthenaModModEntities.MR_DUCK, -197380, -26880, new Item.Properties()));
	public static final RegistryObject<Item> NERD_SPAWN_EGG = REGISTRY.register("nerd_spawn_egg", () -> new ForgeSpawnEggItem(AthenaModModEntities.NERD, -3355444, -6710887, new Item.Properties()));
	public static final RegistryObject<Item> OVERLORD_HELMET = REGISTRY.register("overlord_helmet", () -> new OverlordItem.Helmet());
	public static final RegistryObject<Item> OVERLORD_CHESTPLATE = REGISTRY.register("overlord_chestplate", () -> new OverlordItem.Chestplate());
	public static final RegistryObject<Item> OVERLORD_LEGGINGS = REGISTRY.register("overlord_leggings", () -> new OverlordItem.Leggings());
	public static final RegistryObject<Item> OVERLORD_BOOTS = REGISTRY.register("overlord_boots", () -> new OverlordItem.Boots());
	public static final RegistryObject<Item> OVERLORD_TOOLS_PICKAXE = REGISTRY.register("overlord_tools_pickaxe", () -> new OverlordToolsPickaxeItem());
	public static final RegistryObject<Item> OVERLORD_TOOLS_AXE = REGISTRY.register("overlord_tools_axe", () -> new OverlordToolsAxeItem());
	public static final RegistryObject<Item> OVERLORD_TOOLS_SWORD = REGISTRY.register("overlord_tools_sword", () -> new OverlordToolsSwordItem());
	public static final RegistryObject<Item> OVERLORD_TOOLS_SHOVEL = REGISTRY.register("overlord_tools_shovel", () -> new OverlordToolsShovelItem());
	public static final RegistryObject<Item> OVERLORD_TOOLS_HOE = REGISTRY.register("overlord_tools_hoe", () -> new OverlordToolsHoeItem());
	public static final RegistryObject<Item> RAPTOR_SPAWN_EGG = REGISTRY.register("raptor_spawn_egg", () -> new ForgeSpawnEggItem(AthenaModModEntities.RAPTOR, -3842018, -7974123, new Item.Properties()));
	public static final RegistryObject<Item> REVOLVER = REGISTRY.register("revolver", () -> new RevolverItem());
	public static final RegistryObject<Item> STEEL_PICKAXE = REGISTRY.register("steel_pickaxe", () -> new SteelPickaxeItem());
	public static final RegistryObject<Item> STEEL_AXE = REGISTRY.register("steel_axe", () -> new SteelAxeItem());
	public static final RegistryObject<Item> STEEL_SWORD = REGISTRY.register("steel_sword", () -> new SteelSwordItem());
	public static final RegistryObject<Item> STEEL_SHOVEL = REGISTRY.register("steel_shovel", () -> new SteelShovelItem());
	public static final RegistryObject<Item> STEEL_HOE = REGISTRY.register("steel_hoe", () -> new SteelHoeItem());
	public static final RegistryObject<Item> TITANIUM_PICKAXE = REGISTRY.register("titanium_pickaxe", () -> new TitaniumPickaxeItem());
	public static final RegistryObject<Item> TITANIUM_AXE = REGISTRY.register("titanium_axe", () -> new TitaniumAxeItem());
	public static final RegistryObject<Item> TITANIUM_SWORD = REGISTRY.register("titanium_sword", () -> new TitaniumSwordItem());
	public static final RegistryObject<Item> TITANIUM_SHOVEL = REGISTRY.register("titanium_shovel", () -> new TitaniumShovelItem());
	public static final RegistryObject<Item> TITANIUM_HOE = REGISTRY.register("titanium_hoe", () -> new TitaniumHoeItem());
	public static final RegistryObject<Item> TERRORIST_SPAWN_EGG = REGISTRY.register("terrorist_spawn_egg", () -> new ForgeSpawnEggItem(AthenaModModEntities.TERRORIST, -12763868, -12306646, new Item.Properties()));
	public static final RegistryObject<Item> DINOSAUR_DNA = REGISTRY.register("dinosaur_dna", () -> new DinosaurDnaItem());
	public static final RegistryObject<Item> DINOSAUR_EGG = block(AthenaModModBlocks.DINOSAUR_EGG);
	public static final RegistryObject<Item> GOBLIN_SPAWN_EGG = REGISTRY.register("goblin_spawn_egg", () -> new ForgeSpawnEggItem(AthenaModModEntities.GOBLIN, -10066432, -13421824, new Item.Properties()));
	public static final RegistryObject<Item> KNIGHT_SPAWN_EGG = REGISTRY.register("knight_spawn_egg", () -> new ForgeSpawnEggItem(AthenaModModEntities.KNIGHT, -1924483, -9671052, new Item.Properties()));
	public static final RegistryObject<Item> IMP_SPAWN_EGG = REGISTRY.register("imp_spawn_egg", () -> new ForgeSpawnEggItem(AthenaModModEntities.IMP, -3650227, -6796983, new Item.Properties()));
	public static final RegistryObject<Item> WEAK_FIRE_ATTACK = REGISTRY.register("weak_fire_attack", () -> new WeakFireAttackItem());
	public static final RegistryObject<Item> EVIL_KNIGHT_SPAWN_EGG = REGISTRY.register("evil_knight_spawn_egg", () -> new ForgeSpawnEggItem(AthenaModModEntities.EVIL_KNIGHT, -1924483, -12500412, new Item.Properties()));
	public static final RegistryObject<Item> LUMBERJACK_SPAWN_EGG = REGISTRY.register("lumberjack_spawn_egg", () -> new ForgeSpawnEggItem(AthenaModModEntities.LUMBERJACK, -4700345, -1793689, new Item.Properties()));
	public static final RegistryObject<Item> CHIEF_KEEF_SPAWN_EGG = REGISTRY.register("chief_keef_spawn_egg", () -> new ForgeSpawnEggItem(AthenaModModEntities.CHIEF_KEEF, -11589109, -13736275, new Item.Properties()));
	public static final RegistryObject<Item> DONT_LIKE = REGISTRY.register("dont_like", () -> new DontLikeItem());
	public static final RegistryObject<Item> NOTHING = REGISTRY.register("nothing", () -> new NothingItem());
	public static final RegistryObject<Item> GLOCK_WITH_SWITCH = REGISTRY.register("glock_with_switch", () -> new GlockWithSwitchItem());
	public static final RegistryObject<Item> GLOCK_SWITCH = REGISTRY.register("glock_switch", () -> new GlockSwitchItem());
	public static final RegistryObject<Item> BRONTOSAURUS_SPAWN_EGG = REGISTRY.register("brontosaurus_spawn_egg", () -> new ForgeSpawnEggItem(AthenaModModEntities.BRONTOSAURUS, -6383729, -10725550, new Item.Properties()));
	public static final RegistryObject<Item> DEMON_SPAWN_EGG = REGISTRY.register("demon_spawn_egg", () -> new ForgeSpawnEggItem(AthenaModModEntities.DEMON, -4109750, -7453371, new Item.Properties()));
	public static final RegistryObject<Item> TAY_K_SPAWN_EGG = REGISTRY.register("tay_k_spawn_egg", () -> new ForgeSpawnEggItem(AthenaModModEntities.TAY_K, -11589109, -16777216, new Item.Properties()));
	public static final RegistryObject<Item> HARD = REGISTRY.register("hard", () -> new HardItem());
	public static final RegistryObject<Item> SATAN_SPAWN_EGG = REGISTRY.register("satan_spawn_egg", () -> new ForgeSpawnEggItem(AthenaModModEntities.SATAN, -8836839, -12117231, new Item.Properties()));
	public static final RegistryObject<Item> ROCK_MONSTER_SPAWN_EGG = REGISTRY.register("rock_monster_spawn_egg", () -> new ForgeSpawnEggItem(AthenaModModEntities.ROCK_MONSTER, -11647679, -12306897, new Item.Properties()));
	public static final RegistryObject<Item> SNAIL_SHELL = REGISTRY.register("snail_shell", () -> new SnailShellItem());
	public static final RegistryObject<Item> SNAIL_SPAWN_EGG = REGISTRY.register("snail_spawn_egg", () -> new ForgeSpawnEggItem(AthenaModModEntities.SNAIL, -8950961, -1999344, new Item.Properties()));
	public static final RegistryObject<Item> POWER_CRYSTAL_SHARD = REGISTRY.register("power_crystal_shard", () -> new PowerCrystalShardItem());
	public static final RegistryObject<Item> POWER_CRYSTAL = block(AthenaModModBlocks.POWER_CRYSTAL);
	public static final RegistryObject<Item> LIZARD = REGISTRY.register("lizard", () -> new LizardItem());
	public static final RegistryObject<Item> ZILLA_SUMMONER = block(AthenaModModBlocks.ZILLA_SUMMONER);
	public static final RegistryObject<Item> ANOLE_SPAWN_EGG = REGISTRY.register("anole_spawn_egg", () -> new ForgeSpawnEggItem(AthenaModModEntities.ANOLE, -6724096, -6711040, new Item.Properties()));
	public static final RegistryObject<Item> SATANIC_PENTAGRAM = block(AthenaModModBlocks.SATANIC_PENTAGRAM);
	public static final RegistryObject<Item> SATANIC_BASE = block(AthenaModModBlocks.SATANIC_BASE);
	public static final RegistryObject<Item> SHOTGUN = REGISTRY.register("shotgun", () -> new ShotgunItem());
	public static final RegistryObject<Item> SHOTGUN_SHELL = REGISTRY.register("shotgun_shell", () -> new ShotgunShellItem());
	public static final RegistryObject<Item> ALIEN_TECH = REGISTRY.register("alien_tech", () -> new AlienTechItem());
	public static final RegistryObject<Item> ASSAULT_PISTOL = REGISTRY.register("assault_pistol", () -> new AssaultPistolItem());
	public static final RegistryObject<Item> SAWED_OFF_SHOTGUN = REGISTRY.register("sawed_off_shotgun", () -> new SawedOffShotgunItem());
	public static final RegistryObject<Item> FALLEN_ANGEL_BLOOD = REGISTRY.register("fallen_angel_blood", () -> new FallenAngelBloodItem());
	public static final RegistryObject<Item> TRUMP_SPAWN_EGG = REGISTRY.register("trump_spawn_egg", () -> new ForgeSpawnEggItem(AthenaModModEntities.TRUMP, -26368, -205, new Item.Properties()));
	public static final RegistryObject<Item> OBAMA_SPAWN_EGG = REGISTRY.register("obama_spawn_egg", () -> new ForgeSpawnEggItem(AthenaModModEntities.OBAMA, -10994927, -14609402, new Item.Properties()));
	public static final RegistryObject<Item> SADDAMHUSSIEN_SPAWN_EGG = REGISTRY.register("saddamhussien_spawn_egg", () -> new ForgeSpawnEggItem(AthenaModModEntities.SADDAMHUSSIEN, -65536, -65536, new Item.Properties()));
	public static final RegistryObject<Item> KANYE_SPAWN_EGG = REGISTRY.register("kanye_spawn_egg", () -> new ForgeSpawnEggItem(AthenaModModEntities.KANYE, -11853047, -15071229, new Item.Properties()));
	public static final RegistryObject<Item> MF_DOOM_SPAWN_EGG = REGISTRY.register("mf_doom_spawn_egg", () -> new ForgeSpawnEggItem(AthenaModModEntities.MF_DOOM, -15512823, -15071229, new Item.Properties()));
	public static final RegistryObject<Item> FORTNITE_SPAWN_EGG = REGISTRY.register("fortnite_spawn_egg", () -> new ForgeSpawnEggItem(AthenaModModEntities.FORTNITE, -8676791, -12971256, new Item.Properties()));
	public static final RegistryObject<Item> DOOMSDAY = REGISTRY.register("doomsday", () -> new DoomsdayItem());
	public static final RegistryObject<Item> TYLER_THE_CREATOR_SPAWN_EGG = REGISTRY.register("tyler_the_creator_spawn_egg", () -> new ForgeSpawnEggItem(AthenaModModEntities.TYLER_THE_CREATOR, -16168124, -13296376, new Item.Properties()));
	public static final RegistryObject<Item> TREEHOME_95 = REGISTRY.register("treehome_95", () -> new Treehome95Item());
	public static final RegistryObject<Item> CHRIS_CHAN_SPAWN_EGG = REGISTRY.register("chris_chan_spawn_egg", () -> new ForgeSpawnEggItem(AthenaModModEntities.CHRIS_CHAN, -3199185, -14669599, new Item.Properties()));
	public static final RegistryObject<Item> BIBLE = REGISTRY.register("bible", () -> new BibleItem());
	public static final RegistryObject<Item> CROSS = REGISTRY.register("cross", () -> new CrossItem());
	public static final RegistryObject<Item> GOLDEN_WOOL = block(AthenaModModBlocks.GOLDEN_WOOL);
	public static final RegistryObject<Item> WOOLYSHEEP_SPAWN_EGG = REGISTRY.register("woolysheep_spawn_egg", () -> new ForgeSpawnEggItem(AthenaModModEntities.WOOLYSHEEP, -803566, -995917, new Item.Properties()));
	public static final RegistryObject<Item> CROSS_BLOCK = block(AthenaModModBlocks.CROSS_BLOCK);
	public static final RegistryObject<Item> CHURCH_BRICK = block(AthenaModModBlocks.CHURCH_BRICK);
	public static final RegistryObject<Item> CHURCH_DOOR = block(AthenaModModBlocks.CHURCH_DOOR);
	public static final RegistryObject<Item> KEY = REGISTRY.register("key", () -> new KeyItem());
	public static final RegistryObject<Item> ROBOT_SPAWN_EGG = REGISTRY.register("robot_spawn_egg", () -> new ForgeSpawnEggItem(AthenaModModEntities.ROBOT, -6710887, -26368, new Item.Properties()));
	public static final RegistryObject<Item> BRONTOSAURUS_MEAT = REGISTRY.register("brontosaurus_meat", () -> new BrontosaurusMeatItem());
	public static final RegistryObject<Item> TYRANNOSAURUS_MEAT = REGISTRY.register("tyrannosaurus_meat", () -> new TyrannosaurusMeatItem());
	public static final RegistryObject<Item> RAPTOR_MEAT = REGISTRY.register("raptor_meat", () -> new RaptorMeatItem());
	public static final RegistryObject<Item> CHURCHWOOD_PLANKS = block(AthenaModModBlocks.CHURCHWOOD_PLANKS);
	public static final RegistryObject<Item> CHURCHWOOD_STAIRS = block(AthenaModModBlocks.CHURCHWOOD_STAIRS);
	public static final RegistryObject<Item> CHURCHWOOD_SLAB = block(AthenaModModBlocks.CHURCHWOOD_SLAB);
	public static final RegistryObject<Item> KEY_MASTER_SPAWN_EGG = REGISTRY.register("key_master_spawn_egg", () -> new ForgeSpawnEggItem(AthenaModModEntities.KEY_MASTER, -14080, -26368, new Item.Properties()));
	public static final RegistryObject<Item> DAISY_SPAWN_EGG = REGISTRY.register("daisy_spawn_egg", () -> new ForgeSpawnEggItem(AthenaModModEntities.DAISY, -1261410, -1052689, new Item.Properties()));
	public static final RegistryObject<Item> NUCLEAR_BOMB = block(AthenaModModBlocks.NUCLEAR_BOMB);
	public static final RegistryObject<Item> POWER_CRYSTAL_BLOCK = block(AthenaModModBlocks.POWER_CRYSTAL_BLOCK);
	public static final RegistryObject<Item> NUCLEAR_WARHEAD = REGISTRY.register("nuclear_warhead", () -> new NuclearWarheadItem());
	public static final RegistryObject<Item> NUKEACTIVATED = block(AthenaModModBlocks.NUKEACTIVATED);
	public static final RegistryObject<Item> DARK_DRAGON_SPAWN_EGG = REGISTRY.register("dark_dragon_spawn_egg", () -> new ForgeSpawnEggItem(AthenaModModEntities.DARK_DRAGON, -13434829, -10092442, new Item.Properties()));
	public static final RegistryObject<Item> DAWN_BLADE = REGISTRY.register("dawn_blade", () -> new DawnBladeItem());
	public static final RegistryObject<Item> DAWNBLADEINSTONE = block(AthenaModModBlocks.DAWNBLADEINSTONE);
	public static final RegistryObject<Item> AETHERSWORD = REGISTRY.register("aethersword", () -> new AetherswordItem());
	public static final RegistryObject<Item> NUKE_LAUNCHER = REGISTRY.register("nuke_launcher", () -> new NukeLauncherItem());
	public static final RegistryObject<Item> TESTITEM = REGISTRY.register("testitem", () -> new TestitemItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
