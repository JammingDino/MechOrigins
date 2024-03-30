package jammingdino.mechorigins.mixin.playermodification;

import jammingdino.mechorigins.client.ClientVariables;
import net.minecraft.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Entity.class)
public abstract class EntityMixin {

    @Shadow private float stepHeight;

    @Inject(method = "getStepHeight", at = @At("HEAD"))
    public void getStepHeight(CallbackInfoReturnable<Float> cir) {
        if (ClientVariables.currentLegs == 212002) {
            this.stepHeight = 1.1F;
        } else {
            this.stepHeight = 0.6F;
        }
    }
}
