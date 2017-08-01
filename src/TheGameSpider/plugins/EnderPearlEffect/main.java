package TheGameSpider.plugins.EnderPearlEffect;

import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(new effect(), this);
		System.out.println("EnderPearlEffect enabled");
		
}
	
	@Override
	public void onDisable() {
		System.out.println("EnderPearlEffect disabled");
}	
	

}
