package withoutBuilder;
/*
 * from https://developer.roblox.com/en-us/articles/roblox-avatars
 * avatar types - R6 and R15
 * */

public class R15RolboxAvatar {
	
	private String head;
	private String upperTorso;
	private String lowerTorso;
	private String leftUpperArm;
	private String leftLowerArm;
	private String leftHand;
	private String rightUpperArm;
	private String rightLowerArm;
	private String rightHand;
	private String leftUpperLeg;
	private String leftLowerLeg;
	private String leftFoot;
	private String rightUpperLeg;
	private String rightFoot;
	
	public R15RolboxAvatar() {		
	}
	
	public R15RolboxAvatar(String head, String upperTorso, String lowerTorso, String leftUpperArm, String leftLowerArm,
			String leftHand, String rightUpperArm, String rightLowerArm, String rightHand, String leftUpperLeg,
			String leftLowerLeg, String leftFoot, String rightUpperLeg, String rightFoot) {
		super();
		this.head = head;
		this.upperTorso = upperTorso;
		this.lowerTorso = lowerTorso;
		this.leftUpperArm = leftUpperArm;
		this.leftLowerArm = leftLowerArm;
		this.leftHand = leftHand;
		this.rightUpperArm = rightUpperArm;
		this.rightLowerArm = rightLowerArm;
		this.rightHand = rightHand;
		this.leftUpperLeg = leftUpperLeg;
		this.leftLowerLeg = leftLowerLeg;
		this.leftFoot = leftFoot;
		this.rightUpperLeg = rightUpperLeg;
		this.rightFoot = rightFoot;
	}
	
	public void walk() {
		System.out.println("avatar walking");
	}
	
	public void sleep() {
		System.out.println("avatar sleeping");
	}
	
	public String getHead() {
		return head;
	}
	public void setHead(String head) {
		this.head = head;
	}
	public String getUpperTorso() {
		return upperTorso;
	}
	public void setUpperTorso(String upperTorso) {
		this.upperTorso = upperTorso;
	}
	public String getLowerTorso() {
		return lowerTorso;
	}
	public void setLowerTorso(String lowerTorso) {
		this.lowerTorso = lowerTorso;
	}
	public String getLeftUpperArm() {
		return leftUpperArm;
	}
	public void setLeftUpperArm(String leftUpperArm) {
		this.leftUpperArm = leftUpperArm;
	}
	public String getLeftLowerArm() {
		return leftLowerArm;
	}
	public void setLeftLowerArm(String leftLowerArm) {
		this.leftLowerArm = leftLowerArm;
	}
	public String getLeftHand() {
		return leftHand;
	}
	public void setLeftHand(String leftHand) {
		this.leftHand = leftHand;
	}
	public String getRightUpperArm() {
		return rightUpperArm;
	}
	public void setRightUpperArm(String rightUpperArm) {
		this.rightUpperArm = rightUpperArm;
	}
	public String getRightLowerArm() {
		return rightLowerArm;
	}
	public void setRightLowerArm(String rightLowerArm) {
		this.rightLowerArm = rightLowerArm;
	}
	public String getRightHand() {
		return rightHand;
	}
	public void setRightHand(String rightHand) {
		this.rightHand = rightHand;
	}
	public String getLeftUpperLeg() {
		return leftUpperLeg;
	}
	public void setLeftUpperLeg(String leftUpperLeg) {
		this.leftUpperLeg = leftUpperLeg;
	}
	public String getLeftLowerLeg() {
		return leftLowerLeg;
	}
	public void setLeftLowerLeg(String leftLowerLeg) {
		this.leftLowerLeg = leftLowerLeg;
	}
	public String getLeftFoot() {
		return leftFoot;
	}
	public void setLeftFoot(String leftFoot) {
		this.leftFoot = leftFoot;
	}
	public String getRightUpperLeg() {
		return rightUpperLeg;
	}
	public void setRightUpperLeg(String rightUpperLeg) {
		this.rightUpperLeg = rightUpperLeg;
	}
	public String getRightFoot() {
		return rightFoot;
	}
	public void setRightFoot(String rightFoot) {
		this.rightFoot = rightFoot;
	}
	

}
