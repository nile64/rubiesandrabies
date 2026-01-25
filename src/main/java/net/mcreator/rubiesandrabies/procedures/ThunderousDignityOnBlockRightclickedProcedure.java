package net.mcreator.rubiesandrabies.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.rubiesandrabies.init.RubiesandrabiesModEntities;
import net.mcreator.rubiesandrabies.init.RubiesandrabiesModBlocks;

public class ThunderousDignityOnBlockRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(BlockPos.containing(x, y, z), RubiesandrabiesModItems.DELETED_MOD_ELEMENT.get().defaultBlockState(), 3);
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = RubiesandrabiesModEntities.KNIGHT_OF_THUNDER.get().spawn(_level, BlockPos.containing(x, y, z), EntitySpawnReason.MOB_SUMMONED);
			if (entityToSpawn != null) {
				entityToSpawn.setDeltaMovement(0, 0.5, 0);
			}
		}
	}
}