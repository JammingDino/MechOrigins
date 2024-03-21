package jammingdino.mechorigins.common.registry;

import io.github.apace100.apoli.power.*;
import io.github.apace100.apoli.power.factory.PowerFactory;
import io.github.apace100.apoli.registry.ApoliRegistries;
import io.github.apace100.calio.data.SerializableData;
import io.github.apace100.calio.data.SerializableDataType;
import io.github.apace100.calio.data.SerializableDataTypes;
import jammingdino.mechorigins.common.MechOrigins;
import jammingdino.mechorigins.common.power.*;
import net.minecraft.registry.Registry;

import java.util.Collections;

public class ModPowers {

    public static final PowerFactory<Power> MOB_NEUTRALITY = new PowerFactory<>(MechOrigins.id("mob_neutrality"), new SerializableData().add("entity_types", SerializableDataType.list(SerializableDataTypes.ENTITY_TYPE), Collections.emptyList()).add("inverted", SerializableDataTypes.BOOLEAN, false), data -> (type, entity) -> new MobNeutralityPower(type, entity, data.get("entity_types"), data.getBoolean("inverted"))).allowCondition();
    public static final PowerFactory<Power> PASSIVE_MOB = new PowerFactory<>(MechOrigins.id("passive_mob"), new SerializableData(), data -> (type, entity) -> new PassiveMobPower(type, entity)).allowCondition();
    public static void RegisterModPowers() {
        Registry.register(ApoliRegistries.POWER_FACTORY, MOB_NEUTRALITY.getSerializerId(), MOB_NEUTRALITY);
        Registry.register(ApoliRegistries.POWER_FACTORY, PASSIVE_MOB.getSerializerId(), PASSIVE_MOB);
    }
}