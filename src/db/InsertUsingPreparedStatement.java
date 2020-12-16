package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertUsingPreparedStatement {
	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB = "jdbc:mysql://localhost:3306/admission";
	
	// 1. Database User name & Password
	static final String USER = "admin";
	static final String PWD = "sjcet123";
	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		PreparedStatement pstmt = null;
		try {
			
			// 2. Register JDBC driver
			Class.forName(JDBC_DRIVER);
			
			// 3. Open a connection
			System.out.println("Connecting to database...");
			con = DriverManager.getConnection(DB, USER, PWD);
			
			// 4. Execute a query
			System.out.println("Inserting record..");
			stmt = con.createStatement();
			
			String sql = "INSERT INTO user values(?,?,?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, 1);
			pstmt.setString(2, "Test");
			pstmt.setString(3, "test@gmail.com");
			pstmt.setString(4, "9447233663");
			pstmt.execute();
						} 
		catch (SQLException e) {
			System.out.println(e.getMessage());
		} 
		catch (Exception e) {
			System.out.println(e.getMessage());
		} 
		finally {
			try {
				System.out.println("Closing Connection");
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} 
			catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("Ending Program..");
	}

}
