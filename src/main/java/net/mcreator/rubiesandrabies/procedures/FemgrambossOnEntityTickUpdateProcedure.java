package net.mcreator.rubiesandrabies.procedures;

import net.neoforged.bus.api.Event;

public class FemgrambossOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("fgkick", (entity.getPersistentData().getDoubleOr("fgkick", 0) + 1));
		if (entity.getPersistentData().getDoubleOr("fgkick", 0) > 0) {
			if (entity instanceof LivingEntity _livEnt3 && _livEnt3.swinging) {
				if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity _livEnt5 && _livEnt5.isBlocking()) {
					if (((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.SHIELD
							|| ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == Items.SHIELD) {
						if (entity instanceof FemgrambossEntity _datEntSetI)
							_datEntSetI.getEntityData().set(FemgrambossEntity.DATA_punch, 1);
						if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof Player _player)
							_player.getCooldowns().addCooldown(new ItemStack(Items.SHIELD), 100);
						if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof ServerPlayer _ent) {
							BlockPos _bpos = BlockPos.containing(x, y, z);
							_ent.openMenu(new MenuProvider() {
								@Override
								public Component getDisplayName() {
									return Component.literal("SkyfactoryGui");
								}

								@Override
								public boolean shouldTriggerClientSideContainerClosingOnOpen() {
									return false;
								}

								@Override
								public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
									return new SkyfactoryGuiMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
								}
							}, _bpos);
						}
						if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof Player _player)
							_player.closeContainer();
					}
					RubiesandrabiesMod.queueServerWork(30, () -> {
						if (entity instanceof FemgrambossEntity _datEntSetI)
							_datEntSetI.getEntityData().set(FemgrambossEntity.DATA_punch, 2);
					});
				}
			}
		}
	}
}