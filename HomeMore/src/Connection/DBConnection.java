package Connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	public static Connection getConnection() {
		Connection con = null;
		try {
			String url = "jdbc:sqlserver://DESKTOP-TQP4CVH:1433;databaseName=homemore";
			
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			con = DriverManager.getConnection(url, "sa", "123");
			/* System.out.println("ket noi thanh cong"); */
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("ket noi that bai");
		}
		return con;
	}

	public static void main(String[] arg) {
		System.out.println(getConnection());
	}
}
