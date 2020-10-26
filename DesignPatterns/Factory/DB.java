package Factory;

public class DB {
	
	public int Connect() { return 0;};
	public int Disconnect() { return 0;};	
	public int Query(String tableName) { return 0;};
	
	// The key method for Factory Design Pattern
	public static DB getDB(String DBName) {
		if (DBName == "Oracle")
			return new Oracle();
		else if (DBName == "Cassandra")
			return new Cassandra();
		else return null;
	}
}
