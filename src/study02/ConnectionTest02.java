package study02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionTest02 {
	public static void main(String[]args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "bdi";
		String pwd = "12345678";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDiver");
			Connection con = DriverManager.getConnection(url,id,pwd);//접속!
			String sql = "select * from user_info";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				System.out.println(rs.getString("id"));
				System.out.println(rs.getString("pwd"));
				System.out.println(rs.getString("age"));
				System.out.println(rs.getString("name"));
				System.out.println(rs.getString("etc"));
				
			}
		} catch (ClassNotFoundException | SQLException e) {
		
			e.printStackTrace();
		}
	
	}

}
