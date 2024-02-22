package jammingdino.mechorigins.item;

import jammingdino.mechorigins.common.MechOrigins;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    //All Leg Items
    public static Item JUMP_LEGS = registerItem("jump_legs", new Item(new FabricItemSettings()));
    public static Item WHEEL_LEGS = registerItem("wheel_legs", new Item(new FabricItemSettings()));
    public static Item ACCELERATION_LEGS = registerItem("acceleration_legs", new Item(new FabricItemSettings()));
    public static Item ARMOR_LEGS = registerItem("armor_legs", new Item(new FabricItemSettings()));
    public static Item ATHLETIC_LEGS = registerItem("athletic_legs", new Item(new FabricItemSettings()));
    public static Item CLIMBING_LEGS = registerItem("climbing_legs", new Item(new FabricItemSettings()));
    public static Item FLIPPER_LEGS = registerItem("flipper_legs", new Item(new FabricItemSettings()));
    public static Item JETPACK_LEGS = registerItem("jetpack_legs", new Item(new FabricItemSettings()));
    public static Item LAVA_WALK_LEGS = registerItem("lava_walk_legs", new Item(new FabricItemSettings()));
    public static Item WATER_WALK_LEGS = registerItem("water_walk_legs", new Item(new FabricItemSettings()));
    public static Item BASE_LEGS = registerItem("base_legs", new Item(new FabricItemSettings()));
    //All Core Items
    public static Item ACCURACY_CORE = registerItem("accuracy_core", new Item(new FabricItemSettings()));
    public static Item HAZE_CORE = registerItem("haze_core", new Item(new FabricItemSettings()));
    public static Item HEAVY_CORE = registerItem("heavy_core", new Item(new FabricItemSettings()));
    public static Item LAUNCH_CORE = registerItem("launch_core", new Item(new FabricItemSettings()));
    public static Item MINING_CORE = registerItem("mining_core", new Item(new FabricItemSettings()));
    public static Item RAGE_CORE = registerItem("rage_core", new Item(new FabricItemSettings()));
    public static Item SPEED_CORE = registerItem("speed_core", new Item(new FabricItemSettings()));
    public static Item THRUST_CORE = registerItem("thrust_core", new Item(new FabricItemSettings()));
    public static Item WING_CORE = registerItem("wing_core", new Item(new FabricItemSettings()));
    public static Item XP_CORE = registerItem("xp_core", new Item(new FabricItemSettings()));
    public static Item BASE_CORE = registerItem("base_core", new Item(new FabricItemSettings()));
    //All Arm Items
    public static Item AGRO_ARMS = registerItem("agro_arms", new Item(new FabricItemSettings()));
    public static Item AIRSTRIKE_ARMS = registerItem("airstrike_arms", new Item(new FabricItemSettings()));
    public static Item ARMOR_ARMS = registerItem("armor_arms", new Item(new FabricItemSettings()));
    public static Item BOW_ARMS = registerItem("bow_arms", new Item(new FabricItemSettings()));
    public static Item DRILL_ARMS = registerItem("drill_arms", new Item(new FabricItemSettings()));
    public static Item FARMER_ARMS = registerItem("farmer_arms", new Item(new FabricItemSettings()));
    public static Item FIN_ARMS = registerItem("fin_arms", new Item(new FabricItemSettings()));
    public static Item FIRE_ARMS = registerItem("fire_arms", new Item(new FabricItemSettings()));
    public static Item FIREBALL_ARMS = registerItem("fireball_arms", new Item(new FabricItemSettings()));
    public static Item FLING_ARMS = registerItem("fling_arms", new Item(new FabricItemSettings()));
    public static Item BASE_ARMS = registerItem("base_arms", new Item(new FabricItemSettings()));


    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(JUMP_LEGS);
        entries.add(WHEEL_LEGS);
        entries.add(ACCELERATION_LEGS);
        entries.add(ARMOR_LEGS);
        entries.add(ATHLETIC_LEGS);
        entries.add(CLIMBING_LEGS);
        entries.add(FLIPPER_LEGS);
        entries.add(JETPACK_LEGS);
        entries.add(LAVA_WALK_LEGS);
        entries.add(WATER_WALK_LEGS);
        entries.add(BASE_LEGS);

        entries.add(ACCURACY_CORE);
        entries.add(HAZE_CORE);
        entries.add(HEAVY_CORE);
        entries.add(LAUNCH_CORE);
        entries.add(MINING_CORE);
        entries.add(RAGE_CORE);
        entries.add(SPEED_CORE);
        entries.add(THRUST_CORE);
        entries.add(WING_CORE);
        entries.add(XP_CORE);
        entries.add(BASE_CORE);

        entries.add(AGRO_ARMS);
        entries.add(AIRSTRIKE_ARMS);
        entries.add(ARMOR_ARMS);
        entries.add(BOW_ARMS);
        entries.add(DRILL_ARMS);
        entries.add(FARMER_ARMS);
        entries.add(FIN_ARMS);
        entries.add(FIRE_ARMS);
        entries.add(FIREBALL_ARMS);
        entries.add(FLING_ARMS);
        entries.add(BASE_ARMS);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(MechOrigins.MOD_ID, name), item);
    }
    public static void registerModItems() {
        MechOrigins.LOGGER.info("Registering Mod Items for "+ MechOrigins.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ModItems::addItemsToIngredientItemGroup);
    }

}
