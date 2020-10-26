package withoutFactory;

public class testProgram1 {
	
	public static void main(String[] args) {
		System.out.println("Running Test Program 1");
		String tablename = "books";
		DB curdatabase = new Oracle();
		curdatabase.Connect();
		curdatabase.Query(tablename);
		curdatabase.Disconnect();		
	}
}
