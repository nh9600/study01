package study02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionTest {
	public static void main(String[]args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";//오라클에 전화하려면,뒤에는 아이피
		String id = "bdi";
		String pwd = "12345678";
		
		try {//"oracle.jdbc.driver.OracleDriver" 나 이 드라이버로 할거야~
			Class.forName("oracle.jdbc.driver.OracleDriver");//정해지지않은 Class,forName 삐딱하니까 스테이틱 생성안해도됨!
		Connection con = DriverManager.getConnection(url,id,pwd);//3번째 선택,접속누르는게 이거(연결해주는 역할)
		String sql = "select * from user_info";//이걸 씀(실행하기 전)실행하기 직전  
		Statement stmt = con.createStatement();//stmt(쿼리박스에서 쿼리문을 쓸 수 있는 칠판이 나옴)
		ResultSet rs = stmt.executeQuery(sql);//실행해! "select * from user_info"이거!
		while(rs.next()) {//ture나오면 아래로 내려감(안에 정보를 가지고있음),next()는 불린데이터
			//rs.next()하면 한줄 내려감(꼭 해줘야함!!! 안하면 값을 볼 수 없음) 
			System.out.println(rs.getString("id"));//한번은 무조건 내려야함 
		}
		} catch (ClassNotFoundException | SQLException e) {//나를 써도되지만 예외처리를 꼭 해야함,여기에 불 안날거알지만 소화기를 꼭 설치해야함
			e.printStackTrace();//데이터베이스에 전화걸기(전화는 모두 받음)
		}
		
	}

}
//F2누루면 클래스면 변경가능
