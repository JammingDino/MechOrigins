package jammingdino.mechorigins.mixin;

import io.github.apace100.apoli.component.PowerHolderComponent;
import jammingdino.mechorigins.common.power.MobNeutralityPower;
import jammingdino.mechorigins.common.power.PassiveMobPower;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.mob.WardenEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(WardenEntity.class)
public class WardenEntityMixin {
    @Inject(method = "isValidTarget", at = @At("HEAD"), cancellable = true)
    public void isValidTarget(Entity entity, CallbackInfoReturnable<Boolean> cir) {
        if (entity instanceof LivingEntity target) {
            PowerHolderComponent.getPowers(target, MobNeutralityPower.class).forEach(mobNeutralityPower -> {
                if (mobNeutralityPower.shouldBeNeutral(EntityType.WARDEN)) {
                    cir.setReturnValue(false);
                }
            });
            if (!PowerHolderComponent.getPowers(target, PassiveMobPower.class).isEmpty()) {
                cir.setReturnValue(false);
            }
        }
    }
}
