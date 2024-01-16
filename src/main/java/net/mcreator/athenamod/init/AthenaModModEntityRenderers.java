
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.athenamod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.athenamod.client.renderer.ZillaRenderer;
import net.mcreator.athenamod.client.renderer.WoolysheepRenderer;
import net.mcreator.athenamod.client.renderer.WizardRenderer;
import net.mcreator.athenamod.client.renderer.UfoRenderer;
import net.mcreator.athenamod.client.renderer.TyrannosaurusRexRenderer;
import net.mcreator.athenamod.client.renderer.TylerTheCreatorRenderer;
import net.mcreator.athenamod.client.renderer.TrumpRenderer;
import net.mcreator.athenamod.client.renderer.ThotRenderer;
import net.mcreator.athenamod.client.renderer.TerroristRenderer;
import net.mcreator.athenamod.client.renderer.TayKRenderer;
import net.mcreator.athenamod.client.renderer.SusGuyRenderer;
import net.mcreator.athenamod.client.renderer.SpeedsterRenderer;
import net.mcreator.athenamod.client.renderer.SoldierRenderer;
import net.mcreator.athenamod.client.renderer.SnailRenderer;
import net.mcreator.athenamod.client.renderer.ShrimpRenderer;
import net.mcreator.athenamod.client.renderer.ShearedsheepRenderer;
import net.mcreator.athenamod.client.renderer.SatanRenderer;
import net.mcreator.athenamod.client.renderer.SaddamhussienRenderer;
import net.mcreator.athenamod.client.renderer.RocketLauncherRenderer;
import net.mcreator.athenamod.client.renderer.RockMonsterRenderer;
import net.mcreator.athenamod.client.renderer.RobotRenderer;
import net.mcreator.athenamod.client.renderer.RaptorRenderer;
import net.mcreator.athenamod.client.renderer.PrinceRenderer;
import net.mcreator.athenamod.client.renderer.PigRenderer;
import net.mcreator.athenamod.client.renderer.ObamaRenderer;
import net.mcreator.athenamod.client.renderer.NukeRenderer;
import net.mcreator.athenamod.client.renderer.NukeLauncherRenderer;
import net.mcreator.athenamod.client.renderer.NerdRenderer;
import net.mcreator.athenamod.client.renderer.MrDuckRenderer;
import net.mcreator.athenamod.client.renderer.MfDoomRenderer;
import net.mcreator.athenamod.client.renderer.LumberjackRenderer;
import net.mcreator.athenamod.client.renderer.LancePetersonRenderer;
import net.mcreator.athenamod.client.renderer.KnightRenderer;
import net.mcreator.athenamod.client.renderer.KeyMasterRenderer;
import net.mcreator.athenamod.client.renderer.KanyeRenderer;
import net.mcreator.athenamod.client.renderer.JesusRenderer;
import net.mcreator.athenamod.client.renderer.ImpRenderer;
import net.mcreator.athenamod.client.renderer.HeavenTempleMobRenderer;
import net.mcreator.athenamod.client.renderer.GoblinRenderer;
import net.mcreator.athenamod.client.renderer.GiantRenderer;
import net.mcreator.athenamod.client.renderer.FortniteRenderer;
import net.mcreator.athenamod.client.renderer.EvilKnightRenderer;
import net.mcreator.athenamod.client.renderer.DrugDealerRenderer;
import net.mcreator.athenamod.client.renderer.DragonRenderer;
import net.mcreator.athenamod.client.renderer.DemonRenderer;
import net.mcreator.athenamod.client.renderer.DeermanRenderer;
import net.mcreator.athenamod.client.renderer.DarkDragonRenderer;
import net.mcreator.athenamod.client.renderer.DaisyRenderer;
import net.mcreator.athenamod.client.renderer.CricketRenderer;
import net.mcreator.athenamod.client.renderer.CivilianRenderer;
import net.mcreator.athenamod.client.renderer.Civilian2Renderer;
import net.mcreator.athenamod.client.renderer.ChrisChanRenderer;
import net.mcreator.athenamod.client.renderer.ChiefKeefRenderer;
import net.mcreator.athenamod.client.renderer.BrontosaurusRenderer;
import net.mcreator.athenamod.client.renderer.BeefCakeRenderer;
import net.mcreator.athenamod.client.renderer.AthenaRenderer;
import net.mcreator.athenamod.client.renderer.ApolloRenderer;
import net.mcreator.athenamod.client.renderer.AnoleRenderer;
import net.mcreator.athenamod.client.renderer.AlienRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class AthenaModModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(AthenaModModEntities.LANCE_PETERSON.get(), LancePetersonRenderer::new);
		event.registerEntityRenderer(AthenaModModEntities.APOLLO.get(), ApolloRenderer::new);
		event.registerEntityRenderer(AthenaModModEntities.CRICKET.get(), CricketRenderer::new);
		event.registerEntityRenderer(AthenaModModEntities.ATHENA.get(), AthenaRenderer::new);
		event.registerEntityRenderer(AthenaModModEntities.ALIEN.get(), AlienRenderer::new);
		event.registerEntityRenderer(AthenaModModEntities.SUB_MACHINE_GUN.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(AthenaModModEntities.RAYGUN.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(AthenaModModEntities.ASSAULT_RIFLE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(AthenaModModEntities.PISTOL.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(AthenaModModEntities.UFO.get(), UfoRenderer::new);
		event.registerEntityRenderer(AthenaModModEntities.RIFLE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(AthenaModModEntities.ROCKET_LAUNCHER.get(), RocketLauncherRenderer::new);
		event.registerEntityRenderer(AthenaModModEntities.CIVILIAN.get(), CivilianRenderer::new);
		event.registerEntityRenderer(AthenaModModEntities.ZILLA.get(), ZillaRenderer::new);
		event.registerEntityRenderer(AthenaModModEntities.ZILLA_BEAM.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(AthenaModModEntities.PRINCE.get(), PrinceRenderer::new);
		event.registerEntityRenderer(AthenaModModEntities.CIVILIAN_2.get(), Civilian2Renderer::new);
		event.registerEntityRenderer(AthenaModModEntities.DRUG_DEALER.get(), DrugDealerRenderer::new);
		event.registerEntityRenderer(AthenaModModEntities.SOLDIER.get(), SoldierRenderer::new);
		event.registerEntityRenderer(AthenaModModEntities.SHRIMP.get(), ShrimpRenderer::new);
		event.registerEntityRenderer(AthenaModModEntities.JESUS.get(), JesusRenderer::new);
		event.registerEntityRenderer(AthenaModModEntities.DRAGON.get(), DragonRenderer::new);
		event.registerEntityRenderer(AthenaModModEntities.TYRANNOSAURUS_REX.get(), TyrannosaurusRexRenderer::new);
		event.registerEntityRenderer(AthenaModModEntities.DEERMAN.get(), DeermanRenderer::new);
		event.registerEntityRenderer(AthenaModModEntities.BEEF_CAKE.get(), BeefCakeRenderer::new);
		event.registerEntityRenderer(AthenaModModEntities.THOT.get(), ThotRenderer::new);
		event.registerEntityRenderer(AthenaModModEntities.SPEEDSTER.get(), SpeedsterRenderer::new);
		event.registerEntityRenderer(AthenaModModEntities.WIZARD.get(), WizardRenderer::new);
		event.registerEntityRenderer(AthenaModModEntities.FIRE_ATTACK.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(AthenaModModEntities.PIG.get(), PigRenderer::new);
		event.registerEntityRenderer(AthenaModModEntities.SUS_GUY.get(), SusGuyRenderer::new);
		event.registerEntityRenderer(AthenaModModEntities.GIANT.get(), GiantRenderer::new);
		event.registerEntityRenderer(AthenaModModEntities.MR_DUCK.get(), MrDuckRenderer::new);
		event.registerEntityRenderer(AthenaModModEntities.NERD.get(), NerdRenderer::new);
		event.registerEntityRenderer(AthenaModModEntities.RAPTOR.get(), RaptorRenderer::new);
		event.registerEntityRenderer(AthenaModModEntities.REVOLVER.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(AthenaModModEntities.TERRORIST.get(), TerroristRenderer::new);
		event.registerEntityRenderer(AthenaModModEntities.GOBLIN.get(), GoblinRenderer::new);
		event.registerEntityRenderer(AthenaModModEntities.KNIGHT.get(), KnightRenderer::new);
		event.registerEntityRenderer(AthenaModModEntities.IMP.get(), ImpRenderer::new);
		event.registerEntityRenderer(AthenaModModEntities.WEAK_FIRE_ATTACK.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(AthenaModModEntities.EVIL_KNIGHT.get(), EvilKnightRenderer::new);
		event.registerEntityRenderer(AthenaModModEntities.LUMBERJACK.get(), LumberjackRenderer::new);
		event.registerEntityRenderer(AthenaModModEntities.CHIEF_KEEF.get(), ChiefKeefRenderer::new);
		event.registerEntityRenderer(AthenaModModEntities.GLOCK_WITH_SWITCH.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(AthenaModModEntities.BRONTOSAURUS.get(), BrontosaurusRenderer::new);
		event.registerEntityRenderer(AthenaModModEntities.DEMON.get(), DemonRenderer::new);
		event.registerEntityRenderer(AthenaModModEntities.TAY_K.get(), TayKRenderer::new);
		event.registerEntityRenderer(AthenaModModEntities.SATAN.get(), SatanRenderer::new);
		event.registerEntityRenderer(AthenaModModEntities.ROCK_MONSTER.get(), RockMonsterRenderer::new);
		event.registerEntityRenderer(AthenaModModEntities.SNAIL.get(), SnailRenderer::new);
		event.registerEntityRenderer(AthenaModModEntities.ANOLE.get(), AnoleRenderer::new);
		event.registerEntityRenderer(AthenaModModEntities.SHOTGUN.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(AthenaModModEntities.ASSAULT_PISTOL.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(AthenaModModEntities.SAWED_OFF_SHOTGUN.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(AthenaModModEntities.TRUMP.get(), TrumpRenderer::new);
		event.registerEntityRenderer(AthenaModModEntities.OBAMA.get(), ObamaRenderer::new);
		event.registerEntityRenderer(AthenaModModEntities.SADDAMHUSSIEN.get(), SaddamhussienRenderer::new);
		event.registerEntityRenderer(AthenaModModEntities.KANYE.get(), KanyeRenderer::new);
		event.registerEntityRenderer(AthenaModModEntities.MF_DOOM.get(), MfDoomRenderer::new);
		event.registerEntityRenderer(AthenaModModEntities.FORTNITE.get(), FortniteRenderer::new);
		event.registerEntityRenderer(AthenaModModEntities.TYLER_THE_CREATOR.get(), TylerTheCreatorRenderer::new);
		event.registerEntityRenderer(AthenaModModEntities.CHRIS_CHAN.get(), ChrisChanRenderer::new);
		event.registerEntityRenderer(AthenaModModEntities.BIBLE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(AthenaModModEntities.WOOLYSHEEP.get(), WoolysheepRenderer::new);
		event.registerEntityRenderer(AthenaModModEntities.SHEAREDSHEEP.get(), ShearedsheepRenderer::new);
		event.registerEntityRenderer(AthenaModModEntities.ROBOT.get(), RobotRenderer::new);
		event.registerEntityRenderer(AthenaModModEntities.KEY_MASTER.get(), KeyMasterRenderer::new);
		event.registerEntityRenderer(AthenaModModEntities.DAISY.get(), DaisyRenderer::new);
		event.registerEntityRenderer(AthenaModModEntities.HEAVEN_TEMPLE_MOB.get(), HeavenTempleMobRenderer::new);
		event.registerEntityRenderer(AthenaModModEntities.NUKE.get(), NukeRenderer::new);
		event.registerEntityRenderer(AthenaModModEntities.DARK_DRAGON.get(), DarkDragonRenderer::new);
		event.registerEntityRenderer(AthenaModModEntities.AETHERSWORD.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(AthenaModModEntities.NUKE_LAUNCHER.get(), NukeLauncherRenderer::new);
	}
}
