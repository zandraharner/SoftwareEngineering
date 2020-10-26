package withoutBuilder;

public class testR15RolboxAvatar {

	public static void main(String[] args) {
		R15RolboxAvatar avatar1 = new R15RolboxAvatar("0011000111", "110002222", 
				null, null, null, null, null, null, null, null, null, null, null, null);
		
		// avatar1 do something 
		
		avatar1.walk();
		avatar1.sleep();
		
		R15RolboxAvatar avatar2 = new R15RolboxAvatar();
		avatar2.setHead("0011000111");
		avatar2.setUpperTorso("11000111");
		avatar2.setLowerTorso("01010101");
		
		avatar2.walk();
		avatar2.sleep();
		
	}

}
