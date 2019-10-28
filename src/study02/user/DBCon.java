package study02.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//테이블 생성도 
public class DBCon {
	private static final String URL;//final이니까 대문자로 입력(상수라는 걸 알려줘야하니까!)
	private static final String ID;//다른데서 접근은 가능한데 값을 못바꿈
	private static final String PWD;
	private static final String DRIVER_NAME;
	
	static {//자기만에 영역을 가질 수 있다
		URL = "jdbc:oracle:thin:@localhost:1521:xe";
		ID = "bdi";
		PWD = "12345678";
		DRIVER_NAME = "oracle.jdbc.driver.OracleDriver";
		try {
			Class.forName(DRIVER_NAME);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	private static Connection con;
	public static Connection getCon() {//여기저기서 쓸 수 있도록 퍼블릭
		if(con==null) {
			try {
				con = DriverManager.getConnection(URL,ID,PWD);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return con;
		
	}

}
