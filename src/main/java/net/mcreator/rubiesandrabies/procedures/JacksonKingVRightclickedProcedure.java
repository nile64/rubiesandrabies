package net.mcreator.rubiesandrabies.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.rubiesandrabies.init.RubiesandrabiesModEntities;

public class JacksonKingVRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, ItemStack itemstack) {
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = RubiesandrabiesModEntities.DAVE_MUSTAINE.get().spawn(_level, BlockPos.containing(x, y, z), EntitySpawnReason.MOB_SUMMONED);
			if (entityToSpawn != null) {
				entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
			}
		}
		itemstack.shrink(1);
	}
}