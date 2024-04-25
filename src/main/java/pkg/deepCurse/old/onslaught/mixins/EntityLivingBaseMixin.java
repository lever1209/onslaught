package pkg.deepCurse.old.onslaught.mixins;

import java.util.List;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import com.codetaylor.mc.onslaught.ModOnslaught;
import com.codetaylor.mc.onslaught.modules.onslaught.Tag;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.WorldServer;
import net.minecraft.world.storage.loot.LootContext;
import net.minecraft.world.storage.loot.LootTable;
import net.minecraftforge.common.util.Constants;

/**
 * Responsible for adding loot from the extra tables to the given loot list.
 */
@Mixin(EntityLivingBase.class)
public class EntityLivingBaseMixin {

	@Shadow
	private int recentlyHit;

	// private (static) ReturnType handler(ReceiverType instance, <params of the
	// original call>, Operation<ReturnType> original)
	// @WrapOperation(method = "onDeath", at = @At(value = "INVOKE", target =
	// "net/minecraft/entity/EntityLivingBase.dropLoot(BILnet/minecraft/util/math/Vec3d;)V"))
	@Inject(method = "onDeath", at = { @At("RETURN") })
	private void onslaught_onDeath(DamageSource source, CallbackInfo ci) {

		EntityLiving entityLiving = (EntityLiving) (Object) this;

		if (entityLiving.world.isRemote) {
			return;
		}

		ModOnslaught.LOG.debug("dropping gold block");
		((Entity) entityLiving).entityDropItem(new ItemStack(Blocks.GOLD_BLOCK, 4), 0);
		ModOnslaught.LOG.debug("gold block dropped");

		NBTTagCompound entityData = entityLiving.getEntityData();

		if (!entityData.hasKey(Tag.ONSLAUGHT)) {
			return;
		}

		ModOnslaught.LOG.debug("has tag");

		NBTTagCompound modTag = entityData.getCompoundTag(Tag.ONSLAUGHT);

		if (!modTag.hasKey(Tag.EXTRA_LOOT_TABLES)) {
			return;
		}

		ModOnslaught.LOG.debug("has extra loot tables");

		NBTTagList tagList = modTag.getTagList(Tag.EXTRA_LOOT_TABLES, Constants.NBT.TAG_STRING);

		for (int i = 0; i < tagList.tagCount(); i++) {
			ModOnslaught.LOG.debug("in tag: {}", tagList.getStringTagAt(i));
			String lootTableId = tagList.getStringTagAt(i);
			LootTable lootTable = entityLiving.world.getLootTableManager()
					.getLootTableFromLocation(new ResourceLocation(lootTableId));
			LootContext.Builder builder = new LootContext.Builder((WorldServer) entityLiving.world);
			builder.withLootedEntity(entityLiving);
			builder.withDamageSource(source);

			if (recentlyHit > 0) {
				ModOnslaught.LOG.debug("recently hit");
				Entity attackingEntity = entityLiving.getAttackingEntity();
				if (attackingEntity != null && attackingEntity instanceof EntityPlayer) {
					builder.withLuck(((EntityPlayer) attackingEntity).getLuck());
					builder.withPlayer((EntityPlayer) attackingEntity);
				}
			}

			LootContext lootContext = builder.build();
			List<ItemStack> itemStackList = lootTable.generateLootForPools(entityLiving.world.rand, lootContext);
			ModOnslaught.LOG.debug("built");
			for (ItemStack itemStack : itemStackList) {

				((Entity) entityLiving).entityDropItem(itemStack, 0);
				ModOnslaught.LOG.debug("dropping: {}", itemStack);

//				EntityItem entityItem = new EntityItem(entityLiving.world, entityLiving.posX, entityLiving.posY,
//						entityLiving.posZ, itemStack);
//				((Entity) entityLiving).capturedDrops.add(entityItem);
			}
		}
	}
}
