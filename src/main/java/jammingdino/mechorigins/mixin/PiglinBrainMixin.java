package jammingdino.mechorigins.mixin;

import io.github.apace100.apoli.component.PowerHolderComponent;
import jammingdino.mechorigins.common.power.MobNeutralityPower;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.mob.PiglinBrain;
import net.minecraft.entity.mob.PiglinEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PiglinBrain.class)
public class PiglinBrainMixin {
    @Inject(method = "wearsGoldArmor", at = @At("HEAD"), cancellable = true)
    private static void mechorigins$mobNeutrality(LivingEntity target, CallbackInfoReturnable<Boolean> cir) {
        PowerHolderComponent.getPowers(target, MobNeutralityPower.class).forEach(mobNeutralityPower -> {
            if (mobNeutralityPower.shouldBeNeutral(EntityType.PIGLIN)) {
                cir.setReturnValue(true);
            }
        });
    }

    @Inject(method = "onAttacked", at = @At("HEAD"), cancellable = true)
    private static void mechorigins$mobNeutrality(PiglinEntity piglin, LivingEntity attacker, CallbackInfo callbackInfo) {
        PowerHolderComponent.getPowers(attacker, MobNeutralityPower.class).forEach(mobNeutralityPower -> {
            if (mobNeutralityPower.shouldBeNeutral(EntityType.PIGLIN)) {
                callbackInfo.cancel();
            }
        });
    }
}
