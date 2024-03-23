package jammingdino.mechorigins.common.registry;

import dev.emi.trinkets.api.TrinketsApi;
import jammingdino.mechorigins.common.MechOrigins;
import net.fabricmc.fabric.api.util.TriState;
import net.minecraft.entity.EquipmentSlot;

public class TrinketSlots {

    public static void registerTrinketSlots() {
        for (int i = 0; i < 4; i++) {
            EquipmentSlot slot = EquipmentSlot.fromTypeIndex(EquipmentSlot.Type.ARMOR, i);
            System.out.println(slot.getName());
            TrinketsApi.registerTrinketPredicate(MechOrigins.id(slot.getName()), (stack, slotReference, entity) -> {
                if (slot.getName().contains("chest"))
                    if (stack.isIn(ModTags.Items.CORES))
                        return TriState.TRUE;
                if (slot.getName().contains("legs"))
                    if (stack.isIn(ModTags.Items.ARMS))
                        return TriState.TRUE;
                if (slot.getName().contains("feet"))
                    if (stack.isIn(ModTags.Items.LEGS))
                        return TriState.TRUE;

                return TriState.DEFAULT;
            });
        }
    }


}
