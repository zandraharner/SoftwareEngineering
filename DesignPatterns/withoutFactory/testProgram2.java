package withoutFactory;

public class testProgram2 {
	
	public static void main(String[] args) {
		System.out.println("Running Test Program 2");
		DB curdatabase = new            Oracle();
		curdatabase.Connect();
		String tablename = "subscriptions";
		curdatabase.Query(tablename);
		curdatabase.Disconnect();
		
	}
}
