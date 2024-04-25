package pkg.deepCurse.old.onslaught.mixins.accessors;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;

import net.minecraft.entity.EntityLiving;
import pkg.deepCurse.old.onslaught.EntityLivingDuck;

@Mixin(EntityLiving.class)
public class EntityLivingAccessor implements EntityLivingDuck {

	@Shadow
	@Mutable
	private boolean persistenceRequired;

	@Override
	public void onslaught_setEntityPersistence(boolean value) {
		this.persistenceRequired = value;
	}
}
