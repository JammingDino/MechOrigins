package jammingdino.mechorigins.common.registry;

import dev.emi.trinkets.api.SlotReference;
import dev.emi.trinkets.api.SlotType;
import dev.emi.trinkets.api.TrinketComponent;
import dev.emi.trinkets.api.TrinketsApi;
import jammingdino.mechorigins.common.MechOrigins;
import net.fabricmc.fabric.api.util.TriState;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Pair;

import java.util.List;
import java.util.Optional;

public class TrinketSlots {

    public static void registerTrinketSlots() {
        for (int i = 0; i < 4; i++) {
            EquipmentSlot slot = EquipmentSlot.fromTypeIndex(EquipmentSlot.Type.ARMOR, i);
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

    public static ItemStack getPart(LivingEntity entity, EquipmentSlot slot) {
        Optional<TrinketComponent> component = TrinketsApi.getTrinketComponent(entity);
        if (component.isPresent()) {
            List<Pair<SlotReference, ItemStack>> list = component.get().getEquipped(stack -> stack.isIn(ModTags.Items.CORES) || stack.isIn(ModTags.Items.ARMS) || stack.isIn(ModTags.Items.LEGS));
            for (Pair<SlotReference, ItemStack> equipped : list) {
                SlotType slotType = equipped.getLeft().inventory().getSlotType();
                if (!slotType.getName().equals("part")) {
                    continue;
                }
                if (!slotType.getGroup().equalsIgnoreCase(slot.getName())) {
                    continue;
                }
                return equipped.getRight();
            }
        }
        return ItemStack.EMPTY;
    }

}
