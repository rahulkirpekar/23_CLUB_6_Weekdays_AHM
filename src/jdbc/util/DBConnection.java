package jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	// 1) Make Credentials
	private static final String URLNAME = "jdbc:mysql://localhost:3306/test";
	private static final String DRIVERCLASS = "com.mysql.cj.jdbc.Driver";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "root";

	// 2) create getDbConnection()
	public static Connection getConnection() {
		Connection conn = null;
		try {
			// 3) Load Driverclass
			Class.forName(DRIVERCLASS);

			// 4) pass credentials into DriverManager's getConnection method
			conn = DriverManager.getConnection(URLNAME, USERNAME, PASSWORD);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

	public static void main(String[] args) 
	{
		Connection conn = DBConnection.getConnection();
		
		// 5) Validate connection object
		if (conn!=null) 
		{
			System.out.println("Db Connected : " + conn);
		} else 
		{
			System.out.println("Db not Connected : " + conn);
		}

	}
}
