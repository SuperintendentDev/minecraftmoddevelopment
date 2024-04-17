
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.athenamod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.athenamod.entity.ZombieAstronautEntity;
import net.mcreator.athenamod.entity.ZillaEntity;
import net.mcreator.athenamod.entity.ZillaBeamProjectileEntity;
import net.mcreator.athenamod.entity.ZalgorEntity;
import net.mcreator.athenamod.entity.WoolysheepEntity;
import net.mcreator.athenamod.entity.WizardEntity;
import net.mcreator.athenamod.entity.WeakFireAttackProjectileEntity;
import net.mcreator.athenamod.entity.UfoEntity;
import net.mcreator.athenamod.entity.TyrannosaurusRexEntity;
import net.mcreator.athenamod.entity.TylerTheCreatorEntity;
import net.mcreator.athenamod.entity.TrumpEntity;
import net.mcreator.athenamod.entity.ThotEntity;
import net.mcreator.athenamod.entity.TerroristEntity;
import net.mcreator.athenamod.entity.TayKEntity;
import net.mcreator.athenamod.entity.SusGuyEntity;
import net.mcreator.athenamod.entity.SubMachineGunProjectileEntity;
import net.mcreator.athenamod.entity.SpeedsterEntity;
import net.mcreator.athenamod.entity.SoldierEntity;
import net.mcreator.athenamod.entity.SnailEntity;
import net.mcreator.athenamod.entity.ShrimpEntity;
import net.mcreator.athenamod.entity.ShotgunProjectileEntity;
import net.mcreator.athenamod.entity.ShearedsheepEntity;
import net.mcreator.athenamod.entity.SawedOffShotgunProjectileEntity;
import net.mcreator.athenamod.entity.SatanEntity;
import net.mcreator.athenamod.entity.SaddamhussienEntity;
import net.mcreator.athenamod.entity.RocketLauncherProjectileEntity;
import net.mcreator.athenamod.entity.RockMonsterEntity;
import net.mcreator.athenamod.entity.RobotEntity;
import net.mcreator.athenamod.entity.RifleProjectileEntity;
import net.mcreator.athenamod.entity.RevolverProjectileEntity;
import net.mcreator.athenamod.entity.RaygunProjectileEntity;
import net.mcreator.athenamod.entity.RaptorEntity;
import net.mcreator.athenamod.entity.PrinceEntity;
import net.mcreator.athenamod.entity.PistolProjectileEntity;
import net.mcreator.athenamod.entity.PigEntity;
import net.mcreator.athenamod.entity.OrkEntity;
import net.mcreator.athenamod.entity.ObamaEntity;
import net.mcreator.athenamod.entity.NukeLauncherProjectileEntity;
import net.mcreator.athenamod.entity.NukeEntity;
import net.mcreator.athenamod.entity.NerdEntity;
import net.mcreator.athenamod.entity.MrDuckEntity;
import net.mcreator.athenamod.entity.MoonMiteEntity;
import net.mcreator.athenamod.entity.MfDoomEntity;
import net.mcreator.athenamod.entity.LumberjackEntity;
import net.mcreator.athenamod.entity.LancePetersonEntity;
import net.mcreator.athenamod.entity.KnightEntity;
import net.mcreator.athenamod.entity.KeyMasterEntity;
import net.mcreator.athenamod.entity.KanyeEntity;
import net.mcreator.athenamod.entity.JesusEntity;
import net.mcreator.athenamod.entity.ImpEntity;
import net.mcreator.athenamod.entity.HeavenTempleMobEntity;
import net.mcreator.athenamod.entity.GoblinEntity;
import net.mcreator.athenamod.entity.GlockWithSwitchProjectileEntity;
import net.mcreator.athenamod.entity.GiantEntity;
import net.mcreator.athenamod.entity.GhostEntity;
import net.mcreator.athenamod.entity.FortniteEntity;
import net.mcreator.athenamod.entity.FireAttackProjectileEntity;
import net.mcreator.athenamod.entity.EvilKnightEntity;
import net.mcreator.athenamod.entity.DrugDealerEntity;
import net.mcreator.athenamod.entity.DragonEntity;
import net.mcreator.athenamod.entity.DemonEntity;
import net.mcreator.athenamod.entity.DeermanEntity;
import net.mcreator.athenamod.entity.DarkDragonEntity;
import net.mcreator.athenamod.entity.DaisyEntity;
import net.mcreator.athenamod.entity.CricketEntity;
import net.mcreator.athenamod.entity.CivilianEntity;
import net.mcreator.athenamod.entity.Civilian2Entity;
import net.mcreator.athenamod.entity.ChrisChanEntity;
import net.mcreator.athenamod.entity.ChiefKeefEntity;
import net.mcreator.athenamod.entity.BrontosaurusEntity;
import net.mcreator.athenamod.entity.BibleProjectileEntity;
import net.mcreator.athenamod.entity.BeefCakeEntity;
import net.mcreator.athenamod.entity.AssaultRifleProjectileEntity;
import net.mcreator.athenamod.entity.AssaultPistolProjectileEntity;
import net.mcreator.athenamod.entity.ApolloEntity;
import net.mcreator.athenamod.entity.AnoleEntity;
import net.mcreator.athenamod.entity.AlienEntity;
import net.mcreator.athenamod.entity.AetherswordProjectileEntity;
import net.mcreator.athenamod.AthenaModMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AthenaModModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, AthenaModMod.MODID);
	public static final RegistryObject<EntityType<LancePetersonEntity>> KING = register("king",
			EntityType.Builder.<LancePetersonEntity>of(LancePetersonEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(LancePetersonEntity::new)

					.sized(1f, 2.4f));
	public static final RegistryObject<EntityType<ApolloEntity>> GECKO = register("gecko",
			EntityType.Builder.<ApolloEntity>of(ApolloEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ApolloEntity::new)

					.sized(0.6f, 1f));
	public static final RegistryObject<EntityType<CricketEntity>> CRICKET = register("cricket",
			EntityType.Builder.<CricketEntity>of(CricketEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CricketEntity::new)

					.sized(0.6f, 0.6f));
	public static final RegistryObject<EntityType<AlienEntity>> ALIEN = register("alien",
			EntityType.Builder.<AlienEntity>of(AlienEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AlienEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<UfoEntity>> UFO = register("ufo",
			EntityType.Builder.<UfoEntity>of(UfoEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(UfoEntity::new)

					.sized(3f, 3f));
	public static final RegistryObject<EntityType<CivilianEntity>> CIVILIAN = register("civilian",
			EntityType.Builder.<CivilianEntity>of(CivilianEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CivilianEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ZillaEntity>> ZILLA = register("zilla",
			EntityType.Builder.<ZillaEntity>of(ZillaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(120).setUpdateInterval(3).setCustomClientFactory(ZillaEntity::new).fireImmune().sized(2f, 5f));
	public static final RegistryObject<EntityType<PrinceEntity>> PRINCE = register("prince",
			EntityType.Builder.<PrinceEntity>of(PrinceEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PrinceEntity::new)

					.sized(0.6f, 1f));
	public static final RegistryObject<EntityType<Civilian2Entity>> CIVILIAN_2 = register("civilian_2",
			EntityType.Builder.<Civilian2Entity>of(Civilian2Entity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Civilian2Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DrugDealerEntity>> DRUG_DEALER = register("drug_dealer",
			EntityType.Builder.<DrugDealerEntity>of(DrugDealerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DrugDealerEntity::new)

					.sized(0.6f, 2f));
	public static final RegistryObject<EntityType<SoldierEntity>> SOLDIER = register("soldier",
			EntityType.Builder.<SoldierEntity>of(SoldierEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(80).setUpdateInterval(3).setCustomClientFactory(SoldierEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ShrimpEntity>> SHRIMP = register("shrimp",
			EntityType.Builder.<ShrimpEntity>of(ShrimpEntity::new, MobCategory.WATER_CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ShrimpEntity::new)

					.sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<JesusEntity>> JESUS = register("jesus",
			EntityType.Builder.<JesusEntity>of(JesusEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(JesusEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DragonEntity>> DRAGON = register("dragon",
			EntityType.Builder.<DragonEntity>of(DragonEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(100).setUpdateInterval(3).setCustomClientFactory(DragonEntity::new).fireImmune().sized(3f, 3f));
	public static final RegistryObject<EntityType<TyrannosaurusRexEntity>> TYRANNOSAURUS_REX = register("tyrannosaurus_rex",
			EntityType.Builder.<TyrannosaurusRexEntity>of(TyrannosaurusRexEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(100).setUpdateInterval(3).setCustomClientFactory(TyrannosaurusRexEntity::new)

					.sized(2f, 3f));
	public static final RegistryObject<EntityType<DeermanEntity>> DEERMAN = register("deerman",
			EntityType.Builder.<DeermanEntity>of(DeermanEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DeermanEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BeefCakeEntity>> BEEF_CAKE = register("beef_cake",
			EntityType.Builder.<BeefCakeEntity>of(BeefCakeEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BeefCakeEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ThotEntity>> THOT = register("thot",
			EntityType.Builder.<ThotEntity>of(ThotEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ThotEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SpeedsterEntity>> SPEEDSTER = register("speedster",
			EntityType.Builder.<SpeedsterEntity>of(SpeedsterEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SpeedsterEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<WizardEntity>> WIZARD = register("wizard",
			EntityType.Builder.<WizardEntity>of(WizardEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(WizardEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PigEntity>> PIG = register("pig",
			EntityType.Builder.<PigEntity>of(PigEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PigEntity::new)

					.sized(0.9f, 0.9f));
	public static final RegistryObject<EntityType<SusGuyEntity>> SUS_GUY = register("sus_guy",
			EntityType.Builder.<SusGuyEntity>of(SusGuyEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SusGuyEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GiantEntity>> GIANT = register("giant",
			EntityType.Builder.<GiantEntity>of(GiantEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(72).setUpdateInterval(3).setCustomClientFactory(GiantEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MrDuckEntity>> MR_DUCK = register("mr_duck",
			EntityType.Builder.<MrDuckEntity>of(MrDuckEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MrDuckEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<NerdEntity>> NERD = register("nerd",
			EntityType.Builder.<NerdEntity>of(NerdEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NerdEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<RaptorEntity>> RAPTOR = register("raptor",
			EntityType.Builder.<RaptorEntity>of(RaptorEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(100).setUpdateInterval(3).setCustomClientFactory(RaptorEntity::new)

					.sized(1f, 1.8f));
	public static final RegistryObject<EntityType<TerroristEntity>> TERRORIST = register("terrorist",
			EntityType.Builder.<TerroristEntity>of(TerroristEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(80).setUpdateInterval(3).setCustomClientFactory(TerroristEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GoblinEntity>> GOBLIN = register("goblin",
			EntityType.Builder.<GoblinEntity>of(GoblinEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GoblinEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<KnightEntity>> KNIGHT = register("knight",
			EntityType.Builder.<KnightEntity>of(KnightEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(KnightEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ImpEntity>> IMP = register("imp",
			EntityType.Builder.<ImpEntity>of(ImpEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ImpEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EvilKnightEntity>> EVIL_KNIGHT = register("evil_knight",
			EntityType.Builder.<EvilKnightEntity>of(EvilKnightEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EvilKnightEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<LumberjackEntity>> LUMBERJACK = register("lumberjack",
			EntityType.Builder.<LumberjackEntity>of(LumberjackEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(LumberjackEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ChiefKeefEntity>> CHIEF_KEEF = register("chief_keef",
			EntityType.Builder.<ChiefKeefEntity>of(ChiefKeefEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ChiefKeefEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BrontosaurusEntity>> BRONTOSAURUS = register("brontosaurus",
			EntityType.Builder.<BrontosaurusEntity>of(BrontosaurusEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BrontosaurusEntity::new)

					.sized(2.5f, 4f));
	public static final RegistryObject<EntityType<DemonEntity>> DEMON = register("demon",
			EntityType.Builder.<DemonEntity>of(DemonEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DemonEntity::new).fireImmune().sized(1f, 2f));
	public static final RegistryObject<EntityType<TayKEntity>> TAY_K = register("tay_k",
			EntityType.Builder.<TayKEntity>of(TayKEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TayKEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SatanEntity>> SATAN = register("satan",
			EntityType.Builder.<SatanEntity>of(SatanEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(150).setUpdateInterval(3).setCustomClientFactory(SatanEntity::new).fireImmune().sized(1.5f, 6f));
	public static final RegistryObject<EntityType<RockMonsterEntity>> ROCK_MONSTER = register("rock_monster", EntityType.Builder.<RockMonsterEntity>of(RockMonsterEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RockMonsterEntity::new).fireImmune().sized(1f, 3f));
	public static final RegistryObject<EntityType<SnailEntity>> SNAIL = register("snail",
			EntityType.Builder.<SnailEntity>of(SnailEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SnailEntity::new)

					.sized(0.6f, 1f));
	public static final RegistryObject<EntityType<AnoleEntity>> ANOLE = register("anole",
			EntityType.Builder.<AnoleEntity>of(AnoleEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AnoleEntity::new)

					.sized(0.6f, 0.6f));
	public static final RegistryObject<EntityType<TrumpEntity>> TRUMP = register("trump",
			EntityType.Builder.<TrumpEntity>of(TrumpEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TrumpEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ObamaEntity>> OBAMA = register("obama",
			EntityType.Builder.<ObamaEntity>of(ObamaEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ObamaEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SaddamhussienEntity>> SADDAMHUSSIEN = register("saddamhussien",
			EntityType.Builder.<SaddamhussienEntity>of(SaddamhussienEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SaddamhussienEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<KanyeEntity>> KANYE = register("kanye",
			EntityType.Builder.<KanyeEntity>of(KanyeEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(KanyeEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MfDoomEntity>> MF_DOOM = register("mf_doom",
			EntityType.Builder.<MfDoomEntity>of(MfDoomEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MfDoomEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<FortniteEntity>> FORTNITE = register("fortnite",
			EntityType.Builder.<FortniteEntity>of(FortniteEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FortniteEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<TylerTheCreatorEntity>> TYLER_THE_CREATOR = register("tyler_the_creator",
			EntityType.Builder.<TylerTheCreatorEntity>of(TylerTheCreatorEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TylerTheCreatorEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ChrisChanEntity>> CHRIS_CHAN = register("chris_chan",
			EntityType.Builder.<ChrisChanEntity>of(ChrisChanEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ChrisChanEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<WoolysheepEntity>> WOOLYSHEEP = register("woolysheep",
			EntityType.Builder.<WoolysheepEntity>of(WoolysheepEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(WoolysheepEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ShearedsheepEntity>> SHEAREDSHEEP = register("shearedsheep",
			EntityType.Builder.<ShearedsheepEntity>of(ShearedsheepEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ShearedsheepEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<RobotEntity>> ROBOT = register("robot",
			EntityType.Builder.<RobotEntity>of(RobotEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RobotEntity::new).fireImmune().sized(1f, 3f));
	public static final RegistryObject<EntityType<KeyMasterEntity>> KEY_MASTER = register("key_master",
			EntityType.Builder.<KeyMasterEntity>of(KeyMasterEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(100).setUpdateInterval(3).setCustomClientFactory(KeyMasterEntity::new).fireImmune().sized(1f, 3f));
	public static final RegistryObject<EntityType<DaisyEntity>> DAISY = register("daisy",
			EntityType.Builder.<DaisyEntity>of(DaisyEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DaisyEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<HeavenTempleMobEntity>> HEAVEN_TEMPLE_MOB = register("heaven_temple_mob",
			EntityType.Builder.<HeavenTempleMobEntity>of(HeavenTempleMobEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(HeavenTempleMobEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<NukeEntity>> NUKE = register("nuke",
			EntityType.Builder.<NukeEntity>of(NukeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NukeEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DarkDragonEntity>> DARK_DRAGON = register("dark_dragon", EntityType.Builder.<DarkDragonEntity>of(DarkDragonEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(100)
			.setUpdateInterval(3).setCustomClientFactory(DarkDragonEntity::new).fireImmune().sized(3f, 3f));
	public static final RegistryObject<EntityType<RaygunProjectileEntity>> RAYGUN_PROJECTILE = register("projectile_raygun_projectile", EntityType.Builder.<RaygunProjectileEntity>of(RaygunProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(RaygunProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<SubMachineGunProjectileEntity>> SUB_MACHINE_GUN_PROJECTILE = register("projectile_sub_machine_gun_projectile",
			EntityType.Builder.<SubMachineGunProjectileEntity>of(SubMachineGunProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(SubMachineGunProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<AssaultRifleProjectileEntity>> ASSAULT_RIFLE_PROJECTILE = register("projectile_assault_rifle_projectile",
			EntityType.Builder.<AssaultRifleProjectileEntity>of(AssaultRifleProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(AssaultRifleProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<PistolProjectileEntity>> PISTOL_PROJECTILE = register("projectile_pistol_projectile", EntityType.Builder.<PistolProjectileEntity>of(PistolProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(PistolProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<RifleProjectileEntity>> RIFLE_PROJECTILE = register("projectile_rifle_projectile", EntityType.Builder.<RifleProjectileEntity>of(RifleProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(RifleProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<RocketLauncherProjectileEntity>> ROCKET_LAUNCHER_PROJECTILE = register("projectile_rocket_launcher_projectile",
			EntityType.Builder.<RocketLauncherProjectileEntity>of(RocketLauncherProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(RocketLauncherProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ZillaBeamProjectileEntity>> ZILLA_BEAM_PROJECTILE = register("projectile_zilla_beam_projectile", EntityType.Builder.<ZillaBeamProjectileEntity>of(ZillaBeamProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(ZillaBeamProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<FireAttackProjectileEntity>> FIRE_ATTACK_PROJECTILE = register("projectile_fire_attack_projectile", EntityType.Builder.<FireAttackProjectileEntity>of(FireAttackProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(FireAttackProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<RevolverProjectileEntity>> REVOLVER_PROJECTILE = register("projectile_revolver_projectile", EntityType.Builder.<RevolverProjectileEntity>of(RevolverProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(RevolverProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<WeakFireAttackProjectileEntity>> WEAK_FIRE_ATTACK_PROJECTILE = register("projectile_weak_fire_attack_projectile",
			EntityType.Builder.<WeakFireAttackProjectileEntity>of(WeakFireAttackProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(WeakFireAttackProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<GlockWithSwitchProjectileEntity>> GLOCK_WITH_SWITCH_PROJECTILE = register("projectile_glock_with_switch_projectile",
			EntityType.Builder.<GlockWithSwitchProjectileEntity>of(GlockWithSwitchProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(GlockWithSwitchProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ShotgunProjectileEntity>> SHOTGUN_PROJECTILE = register("projectile_shotgun_projectile", EntityType.Builder.<ShotgunProjectileEntity>of(ShotgunProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(ShotgunProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<AssaultPistolProjectileEntity>> ASSAULT_PISTOL_PROJECTILE = register("projectile_assault_pistol_projectile",
			EntityType.Builder.<AssaultPistolProjectileEntity>of(AssaultPistolProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(AssaultPistolProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<SawedOffShotgunProjectileEntity>> SAWED_OFF_SHOTGUN_PROJECTILE = register("projectile_sawed_off_shotgun_projectile",
			EntityType.Builder.<SawedOffShotgunProjectileEntity>of(SawedOffShotgunProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(SawedOffShotgunProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BibleProjectileEntity>> BIBLE_PROJECTILE = register("projectile_bible_projectile", EntityType.Builder.<BibleProjectileEntity>of(BibleProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(BibleProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<AetherswordProjectileEntity>> AETHERSWORD_PROJECTILE = register("projectile_aethersword_projectile",
			EntityType.Builder.<AetherswordProjectileEntity>of(AetherswordProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(AetherswordProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<NukeLauncherProjectileEntity>> NUKE_LAUNCHER_PROJECTILE = register("projectile_nuke_launcher_projectile",
			EntityType.Builder.<NukeLauncherProjectileEntity>of(NukeLauncherProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(NukeLauncherProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<MoonMiteEntity>> MOON_MITE = register("moon_mite",
			EntityType.Builder.<MoonMiteEntity>of(MoonMiteEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MoonMiteEntity::new)

					.sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ZalgorEntity>> ZALGOR = register("zalgor",
			EntityType.Builder.<ZalgorEntity>of(ZalgorEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(100).setUpdateInterval(3).setCustomClientFactory(ZalgorEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GhostEntity>> GHOST = register("ghost",
			EntityType.Builder.<GhostEntity>of(GhostEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(100).setUpdateInterval(3).setCustomClientFactory(GhostEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ZombieAstronautEntity>> ZOMBIE_ASTRONAUT = register("zombie_astronaut",
			EntityType.Builder.<ZombieAstronautEntity>of(ZombieAstronautEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ZombieAstronautEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<OrkEntity>> ORK = register("ork",
			EntityType.Builder.<OrkEntity>of(OrkEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(OrkEntity::new)

					.sized(1f, 2f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			LancePetersonEntity.init();
			ApolloEntity.init();
			CricketEntity.init();
			AlienEntity.init();
			UfoEntity.init();
			CivilianEntity.init();
			ZillaEntity.init();
			PrinceEntity.init();
			Civilian2Entity.init();
			DrugDealerEntity.init();
			SoldierEntity.init();
			ShrimpEntity.init();
			JesusEntity.init();
			DragonEntity.init();
			TyrannosaurusRexEntity.init();
			DeermanEntity.init();
			BeefCakeEntity.init();
			ThotEntity.init();
			SpeedsterEntity.init();
			WizardEntity.init();
			PigEntity.init();
			SusGuyEntity.init();
			GiantEntity.init();
			MrDuckEntity.init();
			NerdEntity.init();
			RaptorEntity.init();
			TerroristEntity.init();
			GoblinEntity.init();
			KnightEntity.init();
			ImpEntity.init();
			EvilKnightEntity.init();
			LumberjackEntity.init();
			ChiefKeefEntity.init();
			BrontosaurusEntity.init();
			DemonEntity.init();
			TayKEntity.init();
			SatanEntity.init();
			RockMonsterEntity.init();
			SnailEntity.init();
			AnoleEntity.init();
			TrumpEntity.init();
			ObamaEntity.init();
			SaddamhussienEntity.init();
			KanyeEntity.init();
			MfDoomEntity.init();
			FortniteEntity.init();
			TylerTheCreatorEntity.init();
			ChrisChanEntity.init();
			WoolysheepEntity.init();
			ShearedsheepEntity.init();
			RobotEntity.init();
			KeyMasterEntity.init();
			DaisyEntity.init();
			HeavenTempleMobEntity.init();
			NukeEntity.init();
			DarkDragonEntity.init();
			MoonMiteEntity.init();
			ZalgorEntity.init();
			GhostEntity.init();
			ZombieAstronautEntity.init();
			OrkEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(KING.get(), LancePetersonEntity.createAttributes().build());
		event.put(GECKO.get(), ApolloEntity.createAttributes().build());
		event.put(CRICKET.get(), CricketEntity.createAttributes().build());
		event.put(ALIEN.get(), AlienEntity.createAttributes().build());
		event.put(UFO.get(), UfoEntity.createAttributes().build());
		event.put(CIVILIAN.get(), CivilianEntity.createAttributes().build());
		event.put(ZILLA.get(), ZillaEntity.createAttributes().build());
		event.put(PRINCE.get(), PrinceEntity.createAttributes().build());
		event.put(CIVILIAN_2.get(), Civilian2Entity.createAttributes().build());
		event.put(DRUG_DEALER.get(), DrugDealerEntity.createAttributes().build());
		event.put(SOLDIER.get(), SoldierEntity.createAttributes().build());
		event.put(SHRIMP.get(), ShrimpEntity.createAttributes().build());
		event.put(JESUS.get(), JesusEntity.createAttributes().build());
		event.put(DRAGON.get(), DragonEntity.createAttributes().build());
		event.put(TYRANNOSAURUS_REX.get(), TyrannosaurusRexEntity.createAttributes().build());
		event.put(DEERMAN.get(), DeermanEntity.createAttributes().build());
		event.put(BEEF_CAKE.get(), BeefCakeEntity.createAttributes().build());
		event.put(THOT.get(), ThotEntity.createAttributes().build());
		event.put(SPEEDSTER.get(), SpeedsterEntity.createAttributes().build());
		event.put(WIZARD.get(), WizardEntity.createAttributes().build());
		event.put(PIG.get(), PigEntity.createAttributes().build());
		event.put(SUS_GUY.get(), SusGuyEntity.createAttributes().build());
		event.put(GIANT.get(), GiantEntity.createAttributes().build());
		event.put(MR_DUCK.get(), MrDuckEntity.createAttributes().build());
		event.put(NERD.get(), NerdEntity.createAttributes().build());
		event.put(RAPTOR.get(), RaptorEntity.createAttributes().build());
		event.put(TERRORIST.get(), TerroristEntity.createAttributes().build());
		event.put(GOBLIN.get(), GoblinEntity.createAttributes().build());
		event.put(KNIGHT.get(), KnightEntity.createAttributes().build());
		event.put(IMP.get(), ImpEntity.createAttributes().build());
		event.put(EVIL_KNIGHT.get(), EvilKnightEntity.createAttributes().build());
		event.put(LUMBERJACK.get(), LumberjackEntity.createAttributes().build());
		event.put(CHIEF_KEEF.get(), ChiefKeefEntity.createAttributes().build());
		event.put(BRONTOSAURUS.get(), BrontosaurusEntity.createAttributes().build());
		event.put(DEMON.get(), DemonEntity.createAttributes().build());
		event.put(TAY_K.get(), TayKEntity.createAttributes().build());
		event.put(SATAN.get(), SatanEntity.createAttributes().build());
		event.put(ROCK_MONSTER.get(), RockMonsterEntity.createAttributes().build());
		event.put(SNAIL.get(), SnailEntity.createAttributes().build());
		event.put(ANOLE.get(), AnoleEntity.createAttributes().build());
		event.put(TRUMP.get(), TrumpEntity.createAttributes().build());
		event.put(OBAMA.get(), ObamaEntity.createAttributes().build());
		event.put(SADDAMHUSSIEN.get(), SaddamhussienEntity.createAttributes().build());
		event.put(KANYE.get(), KanyeEntity.createAttributes().build());
		event.put(MF_DOOM.get(), MfDoomEntity.createAttributes().build());
		event.put(FORTNITE.get(), FortniteEntity.createAttributes().build());
		event.put(TYLER_THE_CREATOR.get(), TylerTheCreatorEntity.createAttributes().build());
		event.put(CHRIS_CHAN.get(), ChrisChanEntity.createAttributes().build());
		event.put(WOOLYSHEEP.get(), WoolysheepEntity.createAttributes().build());
		event.put(SHEAREDSHEEP.get(), ShearedsheepEntity.createAttributes().build());
		event.put(ROBOT.get(), RobotEntity.createAttributes().build());
		event.put(KEY_MASTER.get(), KeyMasterEntity.createAttributes().build());
		event.put(DAISY.get(), DaisyEntity.createAttributes().build());
		event.put(HEAVEN_TEMPLE_MOB.get(), HeavenTempleMobEntity.createAttributes().build());
		event.put(NUKE.get(), NukeEntity.createAttributes().build());
		event.put(DARK_DRAGON.get(), DarkDragonEntity.createAttributes().build());
		event.put(MOON_MITE.get(), MoonMiteEntity.createAttributes().build());
		event.put(ZALGOR.get(), ZalgorEntity.createAttributes().build());
		event.put(GHOST.get(), GhostEntity.createAttributes().build());
		event.put(ZOMBIE_ASTRONAUT.get(), ZombieAstronautEntity.createAttributes().build());
		event.put(ORK.get(), OrkEntity.createAttributes().build());
	}
}
