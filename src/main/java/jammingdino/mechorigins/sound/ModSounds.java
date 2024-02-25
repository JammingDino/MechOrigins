package jammingdino.mechorigins.sound;

import jammingdino.mechorigins.common.MechOrigins;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {

    public static final SoundEvent JETPACK_START = registerSoundEvent("jetpack_start");
    public static final SoundEvent JETPACK_LOOP = registerSoundEvent("jetpack_loop");
    public static final SoundEvent JETPACK_END = registerSoundEvent("jetpack_end");

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(MechOrigins.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds(){
        MechOrigins.LOGGER.info("Registering Sounds for " + MechOrigins.MOD_ID);
    }
}
