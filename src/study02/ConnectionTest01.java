package study02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConnectionTest01 {
	public static void main(String[]args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "bdi";
		String pwd = "12345678";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");//소문자로 시작하는 패키지이름은 없다.
			Connection con = DriverManager.getConnection(url,id,pwd);//접속!,무조건trycatch 안에
			String sql = "select * from user_info";//작성!
			Statement stmt = con.createStatement();//칠판 생성!
			ResultSet rs = stmt.executeQuery(sql);//실행!
			List<Map<String,String>> userList = new ArrayList<Map<String,String>>();
			while(rs.next()) {//한줄 내려줌!
				Map<String,String> userMap = new HashMap<String,String>();
				userMap.put("id", rs.getString("id"));
				userMap.put("pwd", rs.getString("pwd"));
				userMap.put("name", rs.getString("name"));
				userMap.put("age", rs.getString("age"));
				userMap.put("etc", rs.getString("etc"));
				userList.add(userMap);//값
			}
			System.out.println(userList);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();//출력할 값이 없으면 끝!
		}//
		
	}

}
