package withBuilder;

public class testR15RolboxAvatar {

	public static void main(String[] args) {
		
		R15RolboxAvatar avatar1 = new R15RolboxAvatarBuilder().withHead("0011000111").withRightLowerLeg("011111000")
				.withLeftFoot("01010101").build();
		
		// avatar1 do something 
		
		avatar1.walk();
		avatar1.sleep();
		
		R15RolboxAvatar avatar2 = new R15RolboxAvatarBuilder() 
									.withHead("01010101").withLeftHand("10111100")
									.withRightHand("01010101").withLeftUpperArm("1010101")
									.withLeftLowerArm("0101010").build();
		avatar2.sleep();
		
	}

}
