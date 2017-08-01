package TheGameSpider.plugins.EnderPearlEffect;

import org.bukkit.Effect;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerTeleportEvent;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;

public class effect implements Listener {

	@EventHandler
	public void onTP(PlayerTeleportEvent event) {
		Player p = event.getPlayer();
		if(event.getCause() == TeleportCause.ENDER_PEARL) {
			p.getWorld().playEffect(p.getLocation(), Effect.ENDER_SIGNAL, 1);
		}
		
	}
}