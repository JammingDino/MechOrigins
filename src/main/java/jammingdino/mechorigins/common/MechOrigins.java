package jammingdino.mechorigins.common;

import jammingdino.mechorigins.item.ModItems;
import jammingdino.mechorigins.sound.ModSounds;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class MechOrigins implements ModInitializer {
	public static final String MOD_ID = "mechorigins";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModSounds.registerSounds();

	}


}