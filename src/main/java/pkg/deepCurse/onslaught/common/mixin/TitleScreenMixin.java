package main.java.pkg.deepCurse.onslaught.common.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import com.codetaylor.mc.onslaught.ModOnslaught;

@Mixin(net.minecraft.client.gui.GuiOptions.class)
public class TitleScreenMixin {

	@Inject(method = "initGui()V", at = { @At("RETURN") })
	public void onslaught_initGui(CallbackInfo ci) {
		ModOnslaught.LOG.info("TitleLoaded");
	}

}
