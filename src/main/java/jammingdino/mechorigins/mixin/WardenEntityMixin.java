package jammingdino.mechorigins.mixin;

import io.github.apace100.apoli.component.PowerHolderComponent;
import jammingdino.mechorigins.common.power.MobNeutralityPower;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.mob.WardenEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(WardenEntity.class)
public class WardenEntityMixin {
    @Inject(method = "tryAttack", at = @At("HEAD"), cancellable = true)
    public void tryAttack(Entity target, CallbackInfoReturnable<Boolean> cir){
        PowerHolderComponent.getPowers(target, MobNeutralityPower.class).forEach(mobNeutralityPower -> {
            if (mobNeutralityPower.shouldBeNeutral(EntityType.WARDEN)) {
                cir.setReturnValue(false);
            }
        });
    }
    @Inject(method = "updateAttackTarget", at = @At("HEAD"), cancellable = true)
    public void updateAttackTarget(LivingEntity target, CallbackInfo cir){
        PowerHolderComponent.getPowers(target, MobNeutralityPower.class).forEach(mobNeutralityPower -> {
            if (mobNeutralityPower.shouldBeNeutral(EntityType.WARDEN)) {
                cir.cancel();
            }
        });
    }
}
