package com.natamus.worldborder.config;

import com.natamus.collective.config.DuskConfig;
import com.natamus.worldborder.util.Reference;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ConfigHandler extends DuskConfig {
	public static HashMap<String, List<String>> configMetaData = new HashMap<String, List<String>>();

	@Entry public static boolean enableCustomOverworldBorder = true;
	@Entry public static boolean enableCustomNetherBorder = false;
	@Entry public static boolean enableCustomEndBorder = true;
	@Entry public static boolean shouldLoopToOppositeBorder = true;
	@Entry(min = 0, max = 1000) public static int distanceTeleportedBack = 10;
	@Entry public static String nearBorderMessage = "You're getting close to the world border!";
	@Entry public static String hitBorderMessage = "You've hit the world border, and were teleported inside!";
	@Entry public static String loopBorderMessage = "You've hit the world border, and have looped around the world!";
	@Entry(min = 0, max = 100000) public static int overworldBorderPositiveX = 5000;
	@Entry(min = -100000, max = 0) public static int overworldBorderNegativeX = -5000;
	@Entry(min = 0, max = 100000) public static int overworldBorderPositiveZ = 5000;
	@Entry(min = -100000, max = 0) public static int overworldBorderNegativeZ = -5000;
	@Entry(min = 0, max = 100000) public static int netherBorderPositiveX = 625;
	@Entry(min = -100000, max = 0) public static int netherBorderNegativeX = -625;
	@Entry(min = 0, max = 100000) public static int netherBorderPositiveZ = 625;
	@Entry(min = -100000, max = 0) public static int netherBorderNegativeZ = -625;
	@Entry(min = 0, max = 100000) public static int endBorderPositiveX = 5000;
	@Entry(min = -100000, max = 0) public static int endBorderNegativeX = -5000;
	@Entry(min = 0, max = 100000) public static int endBorderPositiveZ = 5000;
	@Entry(min = -100000, max = 0) public static int endBorderNegativeZ = -5000;

	public static void initConfig() {
		configMetaData.put("enableCustomOverworldBorder", Arrays.asList(
			"When enabled, uses the overworldBorderCoords to set the border."
		));
		configMetaData.put("enableCustomNetherBorder", Arrays.asList(
			"When enabled, uses the netherBorderCoords to set the border."
		));
		configMetaData.put("enableCustomEndBorder", Arrays.asList(
			"When enabled, uses the endBorderCoords to set the border."
		));
		configMetaData.put("shouldLoopToOppositeBorder", Arrays.asList(
			"When enabled, instead of teleporting the player inside near where they were, teleports them from the positive to the negative x/z coord and vice versa."
		));
		configMetaData.put("distanceTeleportedBack", Arrays.asList(
			"The amount of blocks the player is teleported inside after hitting the border."
		));
		configMetaData.put("nearBorderMessage", Arrays.asList(
			"The message which will be sent to the player when they are within 'distanceTeleportedBack' to the world border."
		));
		configMetaData.put("hitBorderMessage", Arrays.asList(
			"The message which will be sent to the player when they hit the world border."
		));
		configMetaData.put("loopBorderMessage", Arrays.asList(
			"The message sent to the player when they hit the border and 'shouldLoopToOppositeBorder' is enabled."
		));
		configMetaData.put("overworldBorderPositiveX", Arrays.asList(
			"The overworld border located at the positive x coordinate."
		));
		configMetaData.put("overworldBorderNegativeX", Arrays.asList(
			"The overworld border located at the negative x coordinate."
		));
		configMetaData.put("overworldBorderPositiveZ", Arrays.asList(
			"The overworld border located at the positive z coordinate."
		));
		configMetaData.put("overworldBorderNegativeZ", Arrays.asList(
			"The overworld border located at the negative z coordinate."
		));
		configMetaData.put("netherBorderPositiveX", Arrays.asList(
			"The nether border located at the positive x coordinate."
		));
		configMetaData.put("netherBorderNegativeX", Arrays.asList(
			"The nether border located at the negative x coordinate."
		));
		configMetaData.put("netherBorderPositiveZ", Arrays.asList(
			"The nether border located at the positive z coordinate."
		));
		configMetaData.put("netherBorderNegativeZ", Arrays.asList(
			"The nether border located at the negative z coordinate."
		));
		configMetaData.put("endBorderPositiveX", Arrays.asList(
			"The end border located at the positive x coordinate."
		));
		configMetaData.put("endBorderNegativeX", Arrays.asList(
			"The end border located at the negative x coordinate."
		));
		configMetaData.put("endBorderPositiveZ", Arrays.asList(
			"The end border located at the positive z coordinate."
		));
		configMetaData.put("endBorderNegativeZ", Arrays.asList(
			"The end border located at the negative z coordinate."
		));

		DuskConfig.init(Reference.NAME, Reference.MOD_ID, ConfigHandler.class);
	}
}