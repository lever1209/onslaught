package pkg.deepCurse.onslaught.common.mixin;

import java.util.ArrayList;
import java.util.UUID;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import pkg.deepCurse.onslaught.common.mixin.mixinInterfaces.EntityPlayerInterface;

@Mixin(EntityPlayer.class)
public class EntityPlayerMixin implements EntityPlayerInterface {

	private ArrayList<UUID> invasionUUIDs;

	@Inject(method = "<init>*", at = @At(value = "RETURN"))
	private void onslaught_entityPlayerConstructorReturn(World world, BlockPos pos, float yaw, GameProfile gameProfile,
			CallbackInfo ci) {
		this.invasionUUIDs = new ArrayList<>();
	}

	// @Inject(method = "onUpdate", at = @At(value = "RETURN"))
	// private void onslaught_entityPlayerOnUpdate(CallbackInfo ci) {
	// EntityPlayer self = ((EntityPlayer) (Object) this);
	// long currentTickTime = self.world.getTotalWorldTime();
	// }

	@Override
	public ArrayList<UUID> getInvasions() {
		return this.invasionUUIDs;
	}

	@Override
	public void setInvasions(UUID... invasions) {
		this.invasionUUIDs = Lists.newArrayList(invasions);
	}

	@Override
	public void addInvasions(UUID... invasions) {
		for (UUID i : invasions) {
			this.invasionUUIDs.add(i);
		}
	}

	@Override
	public void removeInvasions(UUID... invasions) {
		for (UUID i : invasions) {
			this.invasionUUIDs.remove(i);
		}
	}
}
