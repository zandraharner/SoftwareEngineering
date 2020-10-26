package Factory;

public class testProgram2 {
	
	public static void main(String[] args) {
		System.out.println("Running Test Program 2");
		String tablename = "subscriptions";
		
		DB curdatabase = DB.getDB(DBInfo.DBName);
		curdatabase.Connect();
		curdatabase.Query(tablename);
		curdatabase.Disconnect();	
		
	}
}
