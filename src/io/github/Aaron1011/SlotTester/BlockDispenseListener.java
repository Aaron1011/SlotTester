package io.github.Aaron1011.SlotTester;

import org.bukkit.Bukkit;
import org.bukkit.entity.Boat;
import org.bukkit.entity.Player;
import org.bukkit.entity.Vehicle;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockDispenseEvent;

public class BlockDispenseListener implements Listener {
	@EventHandler
	public void onBlockDispense(BlockDispenseEvent event) {
		for (Player player: Bukkit.getOnlinePlayers()) {
			player.sendMessage("Slot: " + event.getSlot());

		}

	}
}
