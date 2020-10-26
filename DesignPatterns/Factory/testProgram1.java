package Factory;

public class testProgram1 {
	
	public static void main(String[] args) {
		System.out.println("Running Test Program 1");
		
		String tablename = "books";
		
		DB curdatabase = new DB().getDB(DBInfo.DBName);
		curdatabase.Connect();
		curdatabase.Query(tablename);
		curdatabase.Disconnect();		
	}
}
