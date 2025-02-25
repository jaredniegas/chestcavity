package net.tigereye.chestcavity.compat.requiem;

import net.minecraft.util.Identifier;
import net.tigereye.chestcavity.ChestCavity;
import net.tigereye.chestcavity.compat.CrossModContent;

public class CCRequiem {
    public static String MODID = "requiem";
    public static String NAME = "Requiem";
    public static boolean REQUIEM_ACTIVE = false;
    public static Identifier PLAYER_SHELL_ID = new Identifier(MODID,"player_shell");

    public static void register(){
        if(CrossModContent.checkIntegration(MODID,NAME,ChestCavity.config.REQUIEM_INTEGRATION)){
            REQUIEM_ACTIVE = true;
        }
    }
}
