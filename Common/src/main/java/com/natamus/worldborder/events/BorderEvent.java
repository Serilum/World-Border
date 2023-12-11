package com.natamus.worldborder.events;

import com.natamus.collective.functions.BlockPosFunctions;
import com.natamus.collective.functions.StringFunctions;
import com.natamus.worldborder.config.ConfigHandler;
import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.block.Blocks;

import java.util.HashMap;

public class BorderEvent {
	private static final HashMap<String, BlockPos> lastplayerpos = new HashMap<String, BlockPos>();
	
	public static void onPlayerTick(ServerLevel world, ServerPlayer player) {
		if (player.tickCount % 20 != 0) {
			return;
		}
		
		String dimension = world.dimension().location().toString();
		
		int posx;
		int negx;
		int posz;
		int negz;
		if (dimension.equals("minecraft:overworld")) {
			if (!ConfigHandler.enableCustomOverworldBorder) {
				return;
			}
			
			posx = ConfigHandler.overworldBorderPositiveX;
			negx = ConfigHandler.overworldBorderNegativeX;
			posz = ConfigHandler.overworldBorderPositiveZ;
			negz = ConfigHandler.overworldBorderNegativeZ;
		}
		else if (dimension.equals("minecraft:the_nether")) {
			if (!ConfigHandler.enableCustomNetherBorder) {
				return;
			}
			
			posx = ConfigHandler.netherBorderPositiveX;
			negx = ConfigHandler.netherBorderNegativeX;
			posz = ConfigHandler.netherBorderPositiveZ;
			negz = ConfigHandler.netherBorderNegativeZ;
		}
		else if (dimension.equals("minecraft:the_end")) {
			if (!ConfigHandler.enableCustomEndBorder) {
				return;
			}
			
			posx = ConfigHandler.endBorderPositiveX;
			negx = ConfigHandler.endBorderNegativeX;
			posz = ConfigHandler.endBorderPositiveZ;
			negz = ConfigHandler.endBorderNegativeZ;
		}
		else {
			return;
		}
		
		BlockPos ppos = player.blockPosition();
		boolean altered = false;
		boolean shouldloop = ConfigHandler.shouldLoopToOppositeBorder;
		
		int x = ppos.getX();
		int z = ppos.getZ();
		int d = ConfigHandler.distanceTeleportedBack;
		if (x <= negx) {
			if (shouldloop) {
				x = posx - d;
			}
			else {
				x = negx + d;
			}
			altered = true;
		}
		else if (x >= posx) {
			if (shouldloop) {
				x = negx + d;
			}
			else {
				x = posx - d;
			}
			altered = true;
		}
		
		if (z <= negz) {
			if (shouldloop) {
				z = posz - d;
			}
			else {
				z = negz + d;
			}
			altered = true;
		}
		else if (z >= posz) {
			if (shouldloop) {
				z = negz + d;
			}
			else {
				z = posz - d;
			} 
			altered = true;
		}
		
		if (altered) {
			BlockPos centerpos = new BlockPos(0, 0, 0);
			BlockPos newpos = BlockPosFunctions.getSurfaceBlockPos(world, x, z);
			if ((newpos.equals(centerpos) && dimension.equals("minecraft:the_nether") || (newpos.getY() == 128 && dimension.equals("minecraft:the_nether")))) {
				for (BlockPos around : BlockPos.betweenClosed(x - 5, 0, z - 5, x + 5, 128, z + 5)) {
					if (world.getBlockState(around).getBlock().equals(Blocks.AIR)) {
						if (world.getBlockState(around.above()).getBlock().equals(Blocks.AIR)) {
							newpos = around.immutable();
							break;
						}
					}
				}
			}
			
			if (dimension.equals("minecraft:the_nether")) {
				for (BlockPos checkforlavapos : BlockPos.betweenClosed(newpos.getX() - 1, newpos.getY() - 1, newpos.getZ() - 1, newpos.getX() + 1, newpos.getY() + 1, newpos.getZ() + 1)) {
					if (checkforlavapos.getY() > newpos.getY() - 1) {
						world.setBlockAndUpdate(checkforlavapos, Blocks.AIR.defaultBlockState());
					} else if (world.getBlockState(checkforlavapos).getBlock().equals(Blocks.LAVA)) {
						world.setBlockAndUpdate(checkforlavapos, Blocks.OBSIDIAN.defaultBlockState());
					}
				}
			}
			
			if (newpos.getY() < 0) {
				newpos = newpos.above().immutable();
			}
			
			Entity ride = player.getVehicle();
			if (ride != null) {
				ride.ejectPassengers();
				ride.teleportTo(newpos.getX(), newpos.getY(), newpos.getZ());
			}
			
			player.teleportTo(newpos.getX(), newpos.getY(), newpos.getZ());
			
			if (shouldloop) {
				StringFunctions.sendMessage(player, ConfigHandler.loopBorderMessage, ChatFormatting.DARK_GREEN);
			}
			else {
				StringFunctions.sendMessage(player, ConfigHandler.hitBorderMessage, ChatFormatting.RED);
			}
		}
		else {
			boolean shouldmessage = false;
			if (x < 0) {
				if (negx - x < 0 && negx - x > -d) {
					shouldmessage = true;
				}
			}
			else {
				if (posx - x > 0 && posx - x < d) {
					shouldmessage = true;
				}
			}
			
			if (z < 0) {
				if (negz - z < 0 && negz - z > -d) {
					shouldmessage = true;
				}
			}
			else {
				if (posz - z > 0 && posz - z < d) {
					shouldmessage = true;
				}
			}
			
			if (shouldmessage) {
				String playername = player.getName().getString();
				BlockPos lastpos = ppos.immutable();
				if (lastplayerpos.containsKey(playername)) {
					lastpos = lastplayerpos.get(playername);
				}
				
				lastplayerpos.put(playername, ppos.immutable());
				if (lastpos.equals(ppos)) {
					return;
				}
				
				StringFunctions.sendMessage(player, ConfigHandler.nearBorderMessage, ChatFormatting.YELLOW);
			}
		}
	}
}
