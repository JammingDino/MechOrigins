package jammingdino.mechorigins.common.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class MobCore extends Item {
    public MobCore(Settings settings) {
        super(settings);
    }
    @Override
    public boolean hasGlint(ItemStack stack){
        return true;
    }
}
