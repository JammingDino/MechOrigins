package jammingdino.mechorigins.common;

import jammingdino.mechorigins.common.registry.ModPowers;
import jammingdino.mechorigins.common.registry.ModItems;
import jammingdino.mechorigins.common.registry.ModSounds;
import jammingdino.mechorigins.common.registry.TrinketSlots;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class MechOrigins implements ModInitializer {
	public static final String MOD_ID = "mechorigins";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModSounds.registerSounds();
		ModPowers.RegisterModPowers();
		TrinketSlots.registerTrinketSlots();

	}

	public static Identifier id(String value) {
		return new Identifier(MOD_ID, value);
	}

}