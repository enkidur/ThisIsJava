package my_app1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main2 {

	public static void main(String[] args) {
		String url ="jdbc:oracle:thin:@localhost:1521:XE";
		String user = "hr";
		String pass = "1234";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection(url, user, pass);
			Statement stmt = conn.createStatement();
			
			String sql = "select ename from employee";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.println(rs.getString("ename")+ " ");
			}
			
			conn.close();
			stmt.close();
			conn.close();
			
		}catch (Exception e) {
			System.out.println(e);
		}
	}

}
