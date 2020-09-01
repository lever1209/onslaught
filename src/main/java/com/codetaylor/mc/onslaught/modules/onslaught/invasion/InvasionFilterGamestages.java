package com.codetaylor.mc.onslaught.modules.onslaught.invasion;

import com.codetaylor.mc.athenaeum.integration.gamestages.GameStages;
import com.codetaylor.mc.athenaeum.integration.gamestages.Stages;
import com.codetaylor.mc.onslaught.modules.onslaught.data.invasion.InvasionTemplate;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.Loader;

import java.util.Map;
import java.util.function.Predicate;

public class InvasionFilterGamestages
    implements Predicate<Map.Entry<String, InvasionTemplate>> {

  private static final String MODID = "gamestages";

  private final EntityPlayer player;

  public InvasionFilterGamestages(EntityPlayer player) {

    this.player = player;
  }

  @Override
  public boolean test(Map.Entry<String, InvasionTemplate> entry) {

    if (Loader.isModLoaded(MODID)) {
      InvasionTemplate template = entry.getValue();
      Stages gamestages = template.selector.gamestages;
      return GameStages.allowed(this.player, gamestages);
    }

    return true;
  }
}
