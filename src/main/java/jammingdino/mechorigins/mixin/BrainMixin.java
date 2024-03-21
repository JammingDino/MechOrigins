package jammingdino.mechorigins.mixin;

import io.github.apace100.apoli.component.PowerHolderComponent;
import jammingdino.mechorigins.common.power.MobNeutralityPower;
import jammingdino.mechorigins.common.power.PassiveMobPower;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.brain.Brain;
import net.minecraft.entity.ai.brain.Memory;
import net.minecraft.entity.ai.brain.MemoryModuleType;
import net.minecraft.server.world.ServerWorld;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Optional;

@Mixin(Brain.class)
public abstract class BrainMixin {

    @Unique
    LivingEntity entity = null;

    @Inject(method = "tick", at = @At("HEAD"))
    private void tick(ServerWorld world, LivingEntity self, CallbackInfo ci) {
        if (self != null) {
            entity = self;
        }
    }

    @Inject(method = "setMemory", at = @At("HEAD"), cancellable = true)
    private <U> void setMemory(MemoryModuleType<U> type, Optional<? extends Memory<? extends LivingEntity>> memory, CallbackInfo ci) {

        if (type == MemoryModuleType.ATTACK_TARGET && memory.isPresent()){
            PowerHolderComponent.getPowers(memory.get().getValue(), MobNeutralityPower.class).forEach(mobNeutralityPower -> {
                if (mobNeutralityPower.shouldBeNeutral(entity.getType())) {
                    ci.cancel();
                }
            });
            if (!PowerHolderComponent.getPowers(memory.get().getValue(), PassiveMobPower.class).isEmpty()) {
                ci.cancel();
            }
        }
    }
}
