package jammingdino.mechorigins.common.power;

import io.github.apace100.apoli.power.Power;
import io.github.apace100.apoli.power.PowerType;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PassiveMobPower extends Power {
    private final Set<EntityType<?>> entityTypes = new HashSet<>();
    private final boolean inverted;

    public PassiveMobPower(PowerType<?> type, LivingEntity entity, List<EntityType<?>> entityTypes, boolean inverted) {
        super(type, entity);
        this.entityTypes.addAll(entityTypes);
        this.inverted = inverted;
    }

    public boolean shouldBeNeutral(EntityType<?> entityType) {

        return inverted;
    }
}
