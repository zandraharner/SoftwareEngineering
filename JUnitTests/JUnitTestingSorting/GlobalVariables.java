package JUnitExampleSorting;

import java.util.Random;

public class GlobalVariables {
	
	private static Integer ID = null;
	
	public static int numOfQuestions = 10;

	public synchronized static Integer getID() {
		if (ID == null)
			ID = 0;
		else 
			ID++;
		return ID;
	}

}
