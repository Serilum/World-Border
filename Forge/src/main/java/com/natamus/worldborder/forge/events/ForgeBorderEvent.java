package com.natamus.worldborder.forge.events;

import com.natamus.worldborder.events.BorderEvent;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.TickEvent.PlayerTickEvent;
import net.minecraftforge.eventbus.api.listener.SubscribeEvent;

public class ForgeBorderEvent {
	public static void registerEventsInBus() {
		// BusGroup.DEFAULT.register(MethodHandles.lookup(), ForgeBorderEvent.class);

		PlayerTickEvent.Pre.BUS.addListener(ForgeBorderEvent::onPlayerTick);
	}

	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent.Pre e) {
		Player player = e.player();
		Level level = player.level();
		if (level.isClientSide()) {
			return;
		}

		BorderEvent.onPlayerTick((ServerLevel)level, (ServerPlayer)player);
	}
}
