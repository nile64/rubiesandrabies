// Save this class in your mod and generate all required imports

/**
 * Made with Blockbench 5.0.7 Exported for Minecraft version 1.19 or later with
 * Mojang mappings
 * 
 * @author Author
 */
public class trollentityclosedAnimation {
	public static final AnimationDefinition closed = AnimationDefinition.Builder.withLength(0.4167F).looping()
			.addAnimation("top",
					new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0.0F,
							KeyframeAnimations.degreeVec(90.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)))
			.build();
}