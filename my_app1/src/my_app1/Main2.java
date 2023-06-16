package my_app1;

import java.sql.Connection;
import java.sql.DriverManager;

public class Main2 {

	public static void main(String[] args) {
		String url ="jdbc:oracle:thin:@localhost:1521:XE";
		String user = "hr";
		String pass = "1234";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection(url, user, pass);
			System.out.println("ok");
			conn.close();
		}catch (Exception e) {
			System.out.println(e);
		}
	}

}
