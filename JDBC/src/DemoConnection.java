import java.sql.DriverManager;
import java.sql.SQLException;

public class DemoConnection {

	public static void main(String[] args) {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			System.out.println("Driver loaded successfully");
			DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=citi","sa","sa123");
			System.out.println("connection successful");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
