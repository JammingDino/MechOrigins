package jammingdino.mechorigins.common.registry;

import jammingdino.mechorigins.common.MechOrigins;
import jammingdino.mechorigins.common.item.MobCore;
import jammingdino.mechorigins.common.item.WheelLegs;
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
    public static Item JUMP_LEGS = registerItem("jump_legs", new Item(new FabricItemSettings().maxCount(1)));
    public static Item WHEEL_LEGS = registerItem("wheel_legs", new WheelLegs(new FabricItemSettings().maxCount(1)));
    public static Item ACCELERATION_LEGS = registerItem("acceleration_legs", new Item(new FabricItemSettings().maxCount(1)));
    public static Item ARMOR_LEGS = registerItem("armor_legs", new Item(new FabricItemSettings().maxCount(1)));
    public static Item ATHLETIC_LEGS = registerItem("athletic_legs", new Item(new FabricItemSettings().maxCount(1)));
    public static Item CLIMBING_LEGS = registerItem("climbing_legs", new Item(new FabricItemSettings().maxCount(1)));
    public static Item FLIPPER_LEGS = registerItem("flipper_legs", new Item(new FabricItemSettings().maxCount(1)));
    public static Item JETPACK_LEGS = registerItem("jetpack_legs", new Item(new FabricItemSettings().maxCount(1)));
    public static Item LAVA_WALK_LEGS = registerItem("lava_walk_legs", new Item(new FabricItemSettings().maxCount(1)));
    public static Item WATER_WALK_LEGS = registerItem("water_walk_legs", new Item(new FabricItemSettings().maxCount(1)));
    public static Item BASE_LEGS = registerItem("base_legs", new Item(new FabricItemSettings().maxCount(1)));
    //All Core Items
    public static Item ACCURACY_CORE = registerItem("accuracy_core", new Item(new FabricItemSettings().maxCount(1)));
    public static Item HAZE_CORE = registerItem("haze_core", new Item(new FabricItemSettings().maxCount(1)));
    public static Item HEAVY_CORE = registerItem("heavy_core", new Item(new FabricItemSettings().maxCount(1)));
    public static Item LAUNCH_CORE = registerItem("launch_core", new Item(new FabricItemSettings().maxCount(1)));
    public static Item MINING_CORE = registerItem("mining_core", new Item(new FabricItemSettings().maxCount(1)));
    public static Item RAGE_CORE = registerItem("rage_core", new Item(new FabricItemSettings().maxCount(1)));
    public static Item SPEED_CORE = registerItem("speed_core", new Item(new FabricItemSettings().maxCount(1)));
    public static Item THRUST_CORE = registerItem("thrust_core", new Item(new FabricItemSettings().maxCount(1)));
    public static Item WING_CORE = registerItem("wing_core", new Item(new FabricItemSettings().maxCount(1)));
    public static Item XP_CORE = registerItem("xp_core", new Item(new FabricItemSettings().maxCount(1)));
    public static Item BASE_CORE = registerItem("base_core", new Item(new FabricItemSettings().maxCount(1)));
    public static Item ZOMBIE_CORE = registerItem("zombie_core", new Item(new FabricItemSettings().maxCount(1)));
    public static Item SKELETON_CORE = registerItem("skeleton_core", new Item(new FabricItemSettings().maxCount(1)));
    public static Item SPIDER_CORE = registerItem("spider_core", new Item(new FabricItemSettings().maxCount(1)));
    public static Item CREEPER_CORE = registerItem("creeper_core", new Item(new FabricItemSettings().maxCount(1)));
    public static Item ZOMBIFIED_PIGLIN_CORE = registerItem("zombified_piglin_core", new Item(new FabricItemSettings().maxCount(1)));
    public static Item WITHER_SKELETON_CORE = registerItem("wither_skeleton_core", new Item(new FabricItemSettings().maxCount(1)));
    public static Item MAGMA_CUBE_CORE = registerItem("magma_cube_core", new Item(new FabricItemSettings().maxCount(1)));
    public static Item HOGLIN_CORE = registerItem("hoglin_core", new Item(new FabricItemSettings().maxCount(1)));
    public static Item PIGLIN_CORE = registerItem("piglin_core", new Item(new FabricItemSettings().maxCount(1)));
    public static Item ZOGLIN_CORE = registerItem("zoglin_core", new Item(new FabricItemSettings().maxCount(1)));
    public static Item PIGLIN_BRUTE_CORE = registerItem("piglin_brute_core", new Item(new FabricItemSettings().maxCount(1)));
    public static Item GHAST_CORE = registerItem("ghast_core", new Item(new FabricItemSettings().maxCount(1)));
    public static Item BLAZE_CORE = registerItem("blaze_core", new Item(new FabricItemSettings().maxCount(1)));
    public static Item ENDERMAN_CORE = registerItem("enderman_core", new Item(new FabricItemSettings().maxCount(1)));
    public static Item SILVERFISH_CORE = registerItem("silverfish_core", new Item(new FabricItemSettings().maxCount(1)));
    public static Item ENDERMITE_CORE = registerItem("endermite_core", new Item(new FabricItemSettings().maxCount(1)));
    public static Item SHULKER_CORE = registerItem("shulker_core", new Item(new FabricItemSettings().maxCount(1)));
    public static Item RAVAGER_CORE = registerItem("ravager_core", new Item(new FabricItemSettings().maxCount(1)));
    public static Item IRON_GOLEM_CORE = registerItem("iron_golem_core", new Item(new FabricItemSettings().maxCount(1)));
    public static Item VEX_CORE = registerItem("vex_core", new Item(new FabricItemSettings().maxCount(1)));
    public static Item VINDICATOR_CORE = registerItem("vindicator_core", new Item(new FabricItemSettings().maxCount(1)));
    public static Item PILLAGER_CORE = registerItem("pillager_core", new Item(new FabricItemSettings().maxCount(1)));
    public static Item EVOKER_CORE = registerItem("evoker_core", new Item(new FabricItemSettings().maxCount(1)));
    public static Item STRAY_CORE = registerItem("stray_core", new Item(new FabricItemSettings().maxCount(1)));
    public static Item SLIME_CORE = registerItem("slime_core", new Item(new FabricItemSettings().maxCount(1)));
    public static Item HUSK_CORE = registerItem("husk_core", new Item(new FabricItemSettings().maxCount(1)));
    public static Item DROWNED_CORE = registerItem("drowned_core", new Item(new FabricItemSettings().maxCount(1)));
    public static Item CAVE_SPIDER_CORE = registerItem("cave_spider_core", new Item(new FabricItemSettings().maxCount(1)));
    public static Item WITCH_CORE = registerItem("witch_core", new Item(new FabricItemSettings().maxCount(1)));
    public static Item GUARDIAN_CORE = registerItem("guardian_core", new Item(new FabricItemSettings().maxCount(1)));
    public static Item ELDER_GUARDIAN_CORE = registerItem("elder_guardian_core", new Item(new FabricItemSettings().maxCount(1)));
    public static Item ENDER_DRAGON_CORE = registerItem("ender_dragon_core", new Item(new FabricItemSettings().maxCount(1)));
    public static Item WITHER_CORE = registerItem("wither_core", new Item(new FabricItemSettings().maxCount(1)));
    public static Item WARDEN_CORE = registerItem("warden_core", new Item(new FabricItemSettings().maxCount(1)));
    public static Item COMMON_MOB_CORE = registerItem("common_mob_core", new Item(new FabricItemSettings().maxCount(1)));
    public static Item END_MOB_CORE = registerItem("end_mob_core", new Item(new FabricItemSettings().maxCount(1)));
    public static Item NETHER_MOB_CORE = registerItem("nether_mob_core", new Item(new FabricItemSettings().maxCount(1)));
    public static Item RAVAGING_MOB_CORE = registerItem("ravaging_mob_core", new Item(new FabricItemSettings().maxCount(1)));
    public static Item STRANGE_MOB_CORE = registerItem("strange_mob_core", new Item(new FabricItemSettings().maxCount(1)));
    public static Item BOSS_CORE = registerItem("boss_core", new Item(new FabricItemSettings().maxCount(1)));
    public static Item MOB_CORE = registerItem("mob_core", new MobCore(new FabricItemSettings().maxCount(1)));
    //All Arm Items
    public static Item AGRO_ARMS = registerItem("agro_arms", new Item(new FabricItemSettings().maxCount(1)));
    public static Item AIRSTRIKE_ARMS = registerItem("airstrike_arms", new Item(new FabricItemSettings().maxCount(1)));
    public static Item ARMOR_ARMS = registerItem("armor_arms", new Item(new FabricItemSettings().maxCount(1)));
    public static Item BOW_ARMS = registerItem("bow_arms", new Item(new FabricItemSettings().maxCount(1)));
    public static Item DRILL_ARMS = registerItem("drill_arms", new Item(new FabricItemSettings().maxCount(1)));
    public static Item FARMER_ARMS = registerItem("farmer_arms", new Item(new FabricItemSettings().maxCount(1)));
    public static Item FIN_ARMS = registerItem("fin_arms", new Item(new FabricItemSettings().maxCount(1)));
    public static Item FIRE_ARMS = registerItem("fire_arms", new Item(new FabricItemSettings().maxCount(1)));
    public static Item FIREBALL_ARMS = registerItem("fireball_arms", new Item(new FabricItemSettings().maxCount(1)));
    public static Item FLING_ARMS = registerItem("fling_arms", new Item(new FabricItemSettings().maxCount(1)));
    public static Item BASE_ARMS = registerItem("base_arms", new Item(new FabricItemSettings().maxCount(1)));


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
        entries.add(ZOMBIE_CORE);
        entries.add(SKELETON_CORE);
        entries.add(SPIDER_CORE);
        entries.add(CREEPER_CORE);
        entries.add(ZOMBIFIED_PIGLIN_CORE);
        entries.add(WITHER_SKELETON_CORE);
        entries.add(MAGMA_CUBE_CORE);
        entries.add(HOGLIN_CORE);
        entries.add(PIGLIN_CORE);
        entries.add(ZOGLIN_CORE);
        entries.add(PIGLIN_BRUTE_CORE);
        entries.add(GHAST_CORE);
        entries.add(BLAZE_CORE);
        entries.add(ENDERMAN_CORE);
        entries.add(SILVERFISH_CORE);
        entries.add(ENDERMITE_CORE);
        entries.add(SHULKER_CORE);
        entries.add(RAVAGER_CORE);
        entries.add(IRON_GOLEM_CORE);
        entries.add(VEX_CORE);
        entries.add(VINDICATOR_CORE);
        entries.add(PILLAGER_CORE);
        entries.add(EVOKER_CORE);
        entries.add(STRAY_CORE);
        entries.add(SLIME_CORE);
        entries.add(HUSK_CORE);
        entries.add(DROWNED_CORE);
        entries.add(CAVE_SPIDER_CORE);
        entries.add(WITCH_CORE);
        entries.add(GUARDIAN_CORE);
        entries.add(ELDER_GUARDIAN_CORE);
        entries.add(ENDER_DRAGON_CORE);
        entries.add(WITHER_CORE);
        entries.add(WARDEN_CORE);
        entries.add(COMMON_MOB_CORE);
        entries.add(END_MOB_CORE);
        entries.add(NETHER_MOB_CORE);
        entries.add(RAVAGING_MOB_CORE);
        entries.add(STRANGE_MOB_CORE);
        entries.add(BOSS_CORE);
        entries.add(MOB_CORE);

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
