package DataBaseTesting.DBDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcConnection {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String host = "localhost";
		String port = "3306";

		Connection con = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/QaDatabaseTest", "root",
				"admin");
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from employeeinfo where location = 'India'");
		while (rs.next()) {
			System.out.println(rs.getString("name"));
			System.out.println(rs.getInt("id"));
			System.out.println(rs.getString("location"));
			System.out.println(rs.getInt("age"));
		}
	}

}
