package study02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest2 {
	public static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";//final이니까 대문자로 입력(상수라는 걸 알려줘야하니까!)
	public static final String ID = "bdi";//다른데서 접근은 가능한데 값을 못바꿈
	public static final String PWD = "12345678";
	public static final String DRIVER_NAME = "oracle.jdbc.driver.OracleDriver";
	
	public static void main(String[]args) {
		try {
			Class.forName(DRIVER_NAME);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		Connection con = null;
		try {
			con = DriverManager.getConnection(URL,ID,PWD);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
