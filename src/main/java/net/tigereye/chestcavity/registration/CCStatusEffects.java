package net.tigereye.chestcavity.registration;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.tigereye.chestcavity.ChestCavity;
import net.tigereye.chestcavity.mob_effect.CCStatusEffect;
import net.tigereye.chestcavity.mob_effect.OrganRejection;

public class CCStatusEffects {

    public static final StatusEffect ORGAN_REJECTION = new OrganRejection();
    public static final StatusEffect ARROW_DODGE_COOLDOWN = new CCStatusEffect(StatusEffectType.NEUTRAL,0x000000);
    public static final StatusEffect EXPLOSION_COOLDOWN = new CCStatusEffect(StatusEffectType.NEUTRAL,0x000000);
    public static final StatusEffect SILK_COOLDOWN = new CCStatusEffect(StatusEffectType.NEUTRAL,0x000000);
    public static final StatusEffect VENOM_COOLDOWN = new CCStatusEffect(StatusEffectType.NEUTRAL,0x000000);
    public static final StatusEffect WATER_VULNERABILITY = new CCStatusEffect(StatusEffectType.NEUTRAL,0x000000);


    public static void register(){
        Registry.register(Registry.STATUS_EFFECT, new Identifier(ChestCavity.MODID, "organ_rejection"), ORGAN_REJECTION);
        Registry.register(Registry.STATUS_EFFECT, new Identifier(ChestCavity.MODID, "arrow_dodge_cooldown"), ARROW_DODGE_COOLDOWN);
        Registry.register(Registry.STATUS_EFFECT, new Identifier(ChestCavity.MODID, "explosion_cooldown"), EXPLOSION_COOLDOWN);
        Registry.register(Registry.STATUS_EFFECT, new Identifier(ChestCavity.MODID, "silk_cooldown"), SILK_COOLDOWN);
        Registry.register(Registry.STATUS_EFFECT, new Identifier(ChestCavity.MODID, "venom_cooldown"), VENOM_COOLDOWN);
        Registry.register(Registry.STATUS_EFFECT, new Identifier(ChestCavity.MODID, "water_vulnerability"), WATER_VULNERABILITY);
    }
}
