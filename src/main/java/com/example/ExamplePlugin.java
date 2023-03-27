package com.example;

import com.google.inject.Provides;

import javax.annotation.Nullable;
import javax.inject.Inject;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.*;
import net.runelite.api.Point;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.events.NpcDespawned;
import net.runelite.api.events.NpcSpawned;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;

import java.awt.*;
import java.awt.image.BufferedImage;

@Slf4j
@PluginDescriptor(
	name = "Example"
)
public class ExamplePlugin extends Plugin
{
	@Inject
	private Client client;

	@Inject
	private ExampleConfig config;

	@Override
	protected void startUp() throws Exception
	{
		log.info("Example started!");

	}

	@Override
	protected void shutDown() throws Exception
	{
		log.info("Example stopped!");
	}

//	@Subscribe
//	public void onGameStateChanged(GameStateChanged gameStateChanged)
//	{
//		if (gameStateChanged.getGameState() == GameState.LOGGED_IN)
//		{
//			client.addChatMessage(ChatMessageType.GAMEMESSAGE, "", "Example says " + config.greeting(), null);
//		}
//	}

	@Provides
	ExampleConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(ExampleConfig.class);
	}

	@Subscribe
	public void onNpcSpawned(NpcSpawned npcSpawned) {
		log.info("onNpcSpawned");

//		NPC npc = getNPC(npcSpawned.getNpc().getIndex());

//		npcSpawned.getActor().setOverheadText();
//		log.info("NPC Spawned: " + npc.getName());
		//client.getCachedNPCs()

	}

	@Subscribe
	public void onNpcDespawned(NpcDespawned npcDespawned)
	{
//		NPC npc = npcDespawned.getNpc();
//		npcs.remove(npc);
	}

	private NPC getNPC(final int index) {
		return new NPC() {
			@Override
			public int getId() {
				return 3127;
			}

			@Override
			public String getName() {
				return "Tiktok Jad";
			}

			@Override
			public int getCombatLevel() {
				return 1;
			}

			@Override
			public int getIndex() {
				return index;
			}

			@Override
			public NPCComposition getComposition() {
				return client.getNpcDefinition(this.getId());
			}

			@Nullable
			@Override
			public NPCComposition getTransformedComposition() {
				return client.getNpcDefinition(this.getId()).transform();
			}

			@Override
			public boolean isInteracting() {
				return false;
			}

			@Override
			public Actor getInteracting() {
				return null;
			}

			@Override
			public int getHealthRatio() {
				return 0;
			}

			@Override
			public int getHealthScale() {
				return 0;
			}

			@Override
			public WorldPoint getWorldLocation() {
				return client.getLocalPlayer().getWorldLocation().dx(1);
			}

			@Override
			public LocalPoint getLocalLocation() {
				return client.getLocalPlayer().getLocalLocation();
			}

			@Override
			public int getOrientation() {
				return 0;
			}

			@Override
			public int getCurrentOrientation() {
				return 0;
			}

			@Override
			public int getAnimation() {
				return 0;
			}

			@Override
			public int getPoseAnimation() {
				return 0;
			}

			@Override
			public void setPoseAnimation(int animation) {

			}

			@Override
			public int getPoseAnimationFrame() {
				return 0;
			}

			@Override
			public void setPoseAnimationFrame(int frame) {

			}

			@Override
			public int getIdlePoseAnimation() {
				return 0;
			}

			@Override
			public void setIdlePoseAnimation(int animation) {

			}

			@Override
			public int getIdleRotateLeft() {
				return 0;
			}

			@Override
			public void setIdleRotateLeft(int animationID) {

			}

			@Override
			public int getIdleRotateRight() {
				return 0;
			}

			@Override
			public void setIdleRotateRight(int animationID) {

			}

			@Override
			public int getWalkAnimation() {
				return 0;
			}

			@Override
			public void setWalkAnimation(int animationID) {

			}

			@Override
			public int getWalkRotateLeft() {
				return 0;
			}

			@Override
			public void setWalkRotateLeft(int animationID) {

			}

			@Override
			public int getWalkRotateRight() {
				return 0;
			}

			@Override
			public void setWalkRotateRight(int animationID) {

			}

			@Override
			public int getWalkRotate180() {
				return 0;
			}

			@Override
			public void setWalkRotate180(int animationID) {

			}

			@Override
			public int getRunAnimation() {
				return 0;
			}

			@Override
			public void setRunAnimation(int animationID) {

			}

			@Override
			public void setAnimation(int animation) {

			}

			@Override
			public int getAnimationFrame() {
				return 0;
			}

			@Override
			public void setActionFrame(int frame) {

			}

			@Override
			public void setAnimationFrame(int frame) {

			}

			@Override
			public int getGraphic() {
				return 0;
			}

			@Override
			public void setGraphic(int graphic) {

			}

			@Override
			public int getGraphicHeight() {
				return 0;
			}

			@Override
			public void setGraphicHeight(int height) {

			}

			@Override
			public int getSpotAnimFrame() {
				return 0;
			}

			@Override
			public void setSpotAnimFrame(int spotAnimFrame) {

			}

			@Override
			public Polygon getCanvasTilePoly() {
				return null;
			}

			@Nullable
			@Override
			public Point getCanvasTextLocation(Graphics2D graphics, String text, int zOffset) {
				return null;
			}

			@Override
			public Point getCanvasImageLocation(BufferedImage image, int zOffset) {
				return null;
			}

			@Override
			public Point getCanvasSpriteLocation(SpritePixels sprite, int zOffset) {
				return null;
			}

			@Override
			public Point getMinimapLocation() {
				return null;
			}

			@Override
			public int getLogicalHeight() {
				return 0;
			}

			@Override
			public Shape getConvexHull() {
				return null;
			}

			@Override
			public WorldArea getWorldArea() {
				return null;
			}

			@Override
			public String getOverheadText() {
				return null;
			}

			@Override
			public void setOverheadText(String overheadText) {

			}

			@Override
			public int getOverheadCycle() {
				return 0;
			}

			@Override
			public void setOverheadCycle(int cycles) {

			}

			@Override
			public boolean isDead() {
				return false;
			}

			@Override
			public void setDead(boolean dead) {

			}

			@Override
			public Model getModel() {
				return null;
			}

			@Override
			public int getModelHeight() {
				return 0;
			}

			@Override
			public void setModelHeight(int modelHeight) {

			}

			@Override
			public void draw(int orientation, int pitchSin, int pitchCos, int yawSin, int yawCos, int x, int y, int z, long hash) {

			}

			@Override
			public Node getNext() {
				return null;
			}

			@Override
			public Node getPrevious() {
				return null;
			}

			@Override
			public long getHash() {
				return 0;
			}
		};
	}
}
