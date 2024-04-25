package pkg.deepCurse.old.onslaught.mixins.accessors;

import java.util.Set;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

import net.minecraft.entity.ai.EntityAITasks;
import net.minecraft.entity.ai.EntityAITasks.EntityAITaskEntry;
import pkg.deepCurse.old.onslaught.EntityAITasksDuck;

@Mixin(EntityAITasks.class)
public class EntityAITasksAccessor implements EntityAITasksDuck {

	@Shadow
	private Set<EntityAITasks.EntityAITaskEntry> executingTaskEntries;

	@Override
	public Set<EntityAITaskEntry> onslaught_getExecutingTaskEntries() {
		return this.executingTaskEntries;
	}
}
