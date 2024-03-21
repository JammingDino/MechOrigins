package jammingdino.mechorigins.common.power;

import io.github.apace100.apoli.power.Power;
import io.github.apace100.apoli.power.PowerType;
import net.minecraft.entity.LivingEntity;

public class PassiveMobPower extends Power {
    public PassiveMobPower(PowerType<?> type, LivingEntity entity) {
        super(type, entity);
    }
}
