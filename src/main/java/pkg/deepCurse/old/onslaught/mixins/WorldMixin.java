package pkg.deepCurse.old.onslaught.mixins;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import com.codetaylor.mc.onslaught.modules.onslaught.ModuleOnslaught;
import com.codetaylor.mc.onslaught.modules.onslaught.loot.CustomLootTableManager;

import net.minecraft.world.World;
import net.minecraft.world.storage.loot.LootTableManager;

/** Responsible for injecting the custom loot table manager. */
@Mixin(World.class)
public class WorldMixin {

	@Shadow
	@Mutable
	private LootTableManager lootTable;

	// realistically we would just use the constructor at '<init>*' butthe loot
	// tables are not initialized there, and are instead initialized at another
	// method called init
	@Inject(method = "init", at = { @At("RETURN") })
	private void onslaught_cInjector(CallbackInfoReturnable<World> cir) {
		LootTableManager lootTableManager = ((World) (Object) this).getLootTableManager();
		lootTable = new CustomLootTableManager(ModuleOnslaught.LootTableFile, lootTableManager);
	}
}
