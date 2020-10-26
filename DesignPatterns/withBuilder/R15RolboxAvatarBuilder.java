package withBuilder;
/*
 * from https://developer.roblox.com/en-us/articles/roblox-avatars
 * avatar types - R6 and R15
 * */

public class R15RolboxAvatarBuilder {
	
	private R15RolboxAvatar avatar = new R15RolboxAvatar();
	
	public R15RolboxAvatar build() {
		return this.avatar;
	}		
	
	public R15RolboxAvatarBuilder withHead(String head) {
		avatar.setHead(head);
		return this;
	}
	
	public R15RolboxAvatarBuilder withUpperTorso(String upperTorso) {
		avatar.setLowerTorso(upperTorso);
		return this;
	}	
	
	public R15RolboxAvatarBuilder withLowerTorso(String lowerTorso) {
		avatar.setLowerTorso(lowerTorso);
		return this;
	}
	
	public R15RolboxAvatarBuilder withLeftHand(String leftHand) {
		avatar.setLeftHand(leftHand);
		return this;
	}

	public R15RolboxAvatarBuilder withRightHand(String rightHand) {
		avatar.setRightHand(rightHand);
		return this;
	}
	
	public R15RolboxAvatarBuilder withLeftFoot(String leftFoot) {
		avatar.setLeftFoot(leftFoot);
		return this;
	}

	public R15RolboxAvatarBuilder withRightFoot(String rightFoot) {
		avatar.setRightFoot(rightFoot);
		return this;
	}
	
	public R15RolboxAvatarBuilder withLeftUpperArm(String leftUpperArm) {
		avatar.setLeftUpperArm(leftUpperArm);
		return this;
	}

	public R15RolboxAvatarBuilder withRightUpperArm(String rightUpperArm) {
		avatar.setRightUpperArm(rightUpperArm);
		return this;
	}

	public R15RolboxAvatarBuilder withLeftLowerArm(String leftLowerArm) {
		avatar.setLeftLowerArm(leftLowerArm);
		return this;
	}

	public R15RolboxAvatarBuilder withRightLowerArm(String rightLowerArm) {
		avatar.setRightLowerArm(rightLowerArm);
		return this;
	}
	
	public R15RolboxAvatarBuilder withLeftUpperLeg(String leftUpperLeg) {
		avatar.setLeftUpperLeg(leftUpperLeg);
		return this;
	}

	public R15RolboxAvatarBuilder withRightUpperLeg(String rightUpperLeg) {
		avatar.setRightUpperLeg(rightUpperLeg);
		return this;
	}

	public R15RolboxAvatarBuilder withLeftLowerLeg(String leftLowerLeg) {
		avatar.setLeftLowerLeg(leftLowerLeg);
		return this;
	}

	public R15RolboxAvatarBuilder withRightLowerLeg(String rightLowerLeg) {
		avatar.setRightLowerLeg(rightLowerLeg);
		return this;
	}

}
