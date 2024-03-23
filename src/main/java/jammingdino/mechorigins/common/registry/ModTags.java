package jammingdino.mechorigins.common.registry;

import jammingdino.mechorigins.common.MechOrigins;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;

public class ModTags {

    public static class Items {
        public static final TagKey<Item> CORES = createTag("cores");
        public static final TagKey<Item> ARMS = createTag("arms");
        public static final TagKey<Item> LEGS = createTag("legs");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, MechOrigins.id(name));
        }
    }
}
