package TheGameSpider.plugins.EnderPearlEffect;

import org.bukkit.Effect;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerTeleportEvent;

public class effect implements Listener {

	@EventHandler
	public void onTP(PlayerTeleportEvent event) {
		Player p = event.getPlayer();
			p.getWorld().playEffect(event.getTo(), Effect.ENDER_SIGNAL, 10);
		
		
	}
}