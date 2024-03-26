package jammingdino.mechorigins.mixin;

import io.github.apace100.apoli.component.PowerHolderComponent;
import jammingdino.mechorigins.common.power.MobNeutralityPower;
import jammingdino.mechorigins.common.power.PassiveMobPower;
import net.minecraft.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(LivingEntity.class)
public class LivingEntityMixin {
    @Inject(method = "canTarget(Lnet/minecraft/entity/LivingEntity;)Z", at = @At("HEAD"), cancellable = true)
    public void canTarget(LivingEntity target, CallbackInfoReturnable<Boolean> cir){
        PowerHolderComponent.getPowers(target, MobNeutralityPower.class).forEach(mobNeutralityPower -> {
            if (target != null && mobNeutralityPower.shouldBeNeutral(((LivingEntity)(Object)this).getType())) {
                cir.setReturnValue(Boolean.FALSE);
            }
        });
        if (!PowerHolderComponent.getPowers(target, PassiveMobPower.class).isEmpty()) {
            cir.setReturnValue(Boolean.FALSE);
        }
    }
}
