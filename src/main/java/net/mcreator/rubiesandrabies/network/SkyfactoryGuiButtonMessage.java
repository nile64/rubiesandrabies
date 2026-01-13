package net.mcreator.rubiesandrabies.network;

@EventBusSubscriber
public record SkyfactoryGuiButtonMessage(int buttonID, int x, int y, int z) implements CustomPacketPayload {

	public static final Type<SkyfactoryGuiButtonMessage> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(RubiesandrabiesMod.MODID, "skyfactory_gui_buttons"));

	public static final StreamCodec<RegistryFriendlyByteBuf, SkyfactoryGuiButtonMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, SkyfactoryGuiButtonMessage message) -> {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}, (RegistryFriendlyByteBuf buffer) -> new SkyfactoryGuiButtonMessage(buffer.readInt(), buffer.readInt(), buffer.readInt(), buffer.readInt()));

	@Override
	public Type<SkyfactoryGuiButtonMessage> type() {
		return TYPE;
	}

	public static void handleData(final SkyfactoryGuiButtonMessage message, final IPayloadContext context) {
		if (context.flow() == PacketFlow.SERVERBOUND) {
			context.enqueueWork(() -> handleButtonAction(context.player(), message.buttonID, message.x, message.y, message.z)).exceptionally(e -> {
				context.connection().disconnect(Component.literal(e.getMessage()));
				return null;
			});
		}
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level();

		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;

	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		RubiesandrabiesMod.addNetworkMessage(SkyfactoryGuiButtonMessage.TYPE, SkyfactoryGuiButtonMessage.STREAM_CODEC, SkyfactoryGuiButtonMessage::handleData);
	}

}