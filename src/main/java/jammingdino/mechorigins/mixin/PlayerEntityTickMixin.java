package jammingdino.mechorigins.mixin;

import jammingdino.mechorigins.common.registry.ModTags;
import jammingdino.mechorigins.common.registry.TrinketSlots;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.HashMap;
import java.util.Map;

@Mixin(PlayerEntity.class)
public abstract class PlayerEntityTickMixin extends LivingEntity{

    static {
        Map<String, Integer> legsDictionary = new HashMap<String, Integer>();
    }
    @Shadow public abstract Text getDisplayName();

    protected PlayerEntityTickMixin(EntityType<? extends LivingEntity> entityType, World world) {
        super(entityType, world);
        currentCore = 5;
    }

    private int currentCore = 0;
    private int oldCore = 0;
    private Map<String, Integer> coreDictionary= new HashMap<String, Integer>();
    private int currentArms = 0;
    private int oldArms = 0;
    private Map<String, Integer> armsDictionary = new HashMap<String, Integer>();
    private int currentLegs = 0;
    private int oldLegs = 0;
    private Map<String, Integer> legsDictionary = new HashMap<String, Integer>();
    private int Initialized = 0;

    @Inject(method = "tick", at = @At("HEAD"))
    public void tick(CallbackInfo ci) {

        if (Initialized == 0) {
            Initialized = 1;
            legsDictionary.put("Base Legs", 212000);
            legsDictionary.put("Jump Legs", 212001);
            legsDictionary.put("Wheel Legs", 212002);
            legsDictionary.put("Jetpack Legs", 212003);
            legsDictionary.put("Water Walk Legs", 212004);
            legsDictionary.put("Lava Walk Legs", 212005);
            legsDictionary.put("Armor Legs", 212006);
            legsDictionary.put("Athletic Legs", 212007);
            legsDictionary.put("Clmbing Legs", 212008);
            legsDictionary.put("Flipper Legs", 212009);
            legsDictionary.put("Accelerator Legs", 212010);

            coreDictionary.put("Base Core", 212011);
            coreDictionary.put("Mining Core", 212012);
            coreDictionary.put("Speed Core", 212013);
            coreDictionary.put("Launch Core", 212014);
            coreDictionary.put("Heavy Core", 212015);
            coreDictionary.put("Thrust Core", 212016);
            coreDictionary.put("Wing Core", 212017);
            coreDictionary.put("Xp Core", 212018);
            coreDictionary.put("Accuracy Core", 212019);
            coreDictionary.put("Haze Core", 212020);
            coreDictionary.put("Rage Core", 212021);
            coreDictionary.put("Zombie Core", 212022);
            coreDictionary.put("Skeleton Core", 212023);
            coreDictionary.put("Spider Core", 212024);
            coreDictionary.put("Creeper Core", 212025);
            coreDictionary.put("Zombified Piglin Core", 212026);
            coreDictionary.put("Wither Skeleton Core", 212027);
            coreDictionary.put("Magma Cube Core", 212028);
            coreDictionary.put("Hoglin Core", 212029);
            coreDictionary.put("Piglin Core", 212030);
            coreDictionary.put("Zoglin Core", 212031);
            coreDictionary.put("Piglin Brute Core", 212032);
            coreDictionary.put("Ghast Core", 212033);
            coreDictionary.put("Blaze Core", 212034);
            coreDictionary.put("Enderman Core", 212035);
            coreDictionary.put("Silverfish Core", 212036);
            coreDictionary.put("Endermite Core", 212037);
            coreDictionary.put("Shulker Core", 212038);
            coreDictionary.put("Ravager Core", 212039);
            coreDictionary.put("Iron Golem Core", 212040);
            coreDictionary.put("Vex Core", 212041);
            coreDictionary.put("Vindicator Core", 212042);
            coreDictionary.put("Pillager Core", 212043);
            coreDictionary.put("Evoker Core", 212044);
            coreDictionary.put("Stray Core", 212045);
            coreDictionary.put("Slime Core", 212046);
            coreDictionary.put("Husk Core", 212047);
            coreDictionary.put("Drowned Core", 212048);
            coreDictionary.put("Cave Spider Core", 212049);
            coreDictionary.put("Witch Core", 212050);
            coreDictionary.put("Guardian Core", 212051);
            coreDictionary.put("Elder Guardian Core", 212052);
            coreDictionary.put("Common Mob Core", 212053);
            coreDictionary.put("End Mob Core", 212054);
            coreDictionary.put("Nether Mob Core", 212055);
            coreDictionary.put("Ravaging Mob Core", 212056);
            coreDictionary.put("Strange Mob Core", 212057);
            coreDictionary.put("Mob Core", 212058);
            coreDictionary.put("Ender Dragon Core", 212059);
            coreDictionary.put("Wither Core", 212060);
            coreDictionary.put("Warden Core", 212061);
            coreDictionary.put("Boss Core", 212062);

            armsDictionary.put("Base Arms", 212022);
            armsDictionary.put("Drill Arms", 212023);
            armsDictionary.put("Fire Arms", 212024);
            armsDictionary.put("Fireball Arms", 212025);
            armsDictionary.put("Fling Arms", 212026);
            armsDictionary.put("Agro Arms", 212027);
            armsDictionary.put("Armor Arms", 212028);
            armsDictionary.put("Fin Arms", 212029);
            armsDictionary.put("Farmer Arms", 212030);
            armsDictionary.put("Bow Arms", 212031);
            armsDictionary.put("Airstrike Arms", 212032);
        }

        for (int i = 0; i < 3; i++) {
            EquipmentSlot slot = EquipmentSlot.fromTypeIndex(EquipmentSlot.Type.ARMOR, i);
            ItemStack part = TrinketSlots.getPart(this, slot);
            if (!part.getItem().getName().getString().contains("Air")) {
                if (part.isIn(ModTags.Items.CORES)) {
                    currentCore = coreDictionary.get(part.getName().getString());
                } else if (part.isIn(ModTags.Items.ARMS)) {
                    currentArms = armsDictionary.get(part.getName().getString());
                } else if (part.isIn(ModTags.Items.LEGS)) {
                    currentLegs = legsDictionary.get(part.getName().getString());
                }
            } else {
                if (slot.getName().contains("chest")) {
                    currentCore = coreDictionary.get("Base Core");
                } else if (slot.getName().contains("legs")) {
                    currentArms = armsDictionary.get("Base Arms");
                } else if (slot.getName().contains("feet")) {
                    currentLegs = legsDictionary.get("Base Legs");
                }
            }
            if (oldCore != currentCore) {
                if (this.getServer() != null) {
                    this.getServer().getCommandManager().executeWithPrefix(this.getServer().getCommandSource(), "resource set @p mechorigins:core_attachments_current_core " + Integer.toString(currentCore));
                }
            }
            if (oldArms != currentArms) {
                if (this.getServer() != null) {
                    this.getServer().getCommandManager().execute(this.getServer().getCommandManager().getDispatcher().parse("resource set @p mechorigins:arm_attachments_current_arms " + Integer.toString(currentArms), this.getServer().getCommandSource()), "resource set @p mechorigins:arm_attachments_current_arms " + Integer.toString(currentArms));
                }
            }
            if (oldLegs != currentLegs) {
                if (this.getServer() != null) {
                    this.getServer().getCommandManager().executeWithPrefix(this.getServer().getCommandSource(), "resource set @p mechorigins:leg_attachments_current_legs " + Integer.toString(currentLegs));
                }
            }
            oldCore = currentCore;
            oldLegs = currentLegs;
            oldArms = currentArms;
        }
    }
}
