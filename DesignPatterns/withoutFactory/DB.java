package withoutFactory;

public interface DB {
	
	public int Connect();
	public int Disconnect();	
	public int Query(String tableName);
}
