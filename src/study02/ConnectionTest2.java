package study02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;



public class ConnectionTest2 {//static을 쓰는 이유 하나만 바라보게 하기위해 
	public static final String URL;//final이니까 대문자로 입력(상수라는 걸 알려줘야하니까!)
	public static final String ID;//다른데서 접근은 가능한데 값을 못바꿈
	public static final String PWD;
	public static final String DRIVER_NAME;
	
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
	//Connection con//여기에서는 자바가 자동으로 null값을 넣어주지만 안에서는 지역변수이기때문에 null값을 직접 넣어줘야한다
	public static void main(String[]args) {
		
		Connection con = null;//final에서도 사용하기위해 null값
		try {
			con = DriverManager.getConnection(URL,ID,PWD);
			String sql = "select * from user_info ";//띄어주기를 해줘야 sql이랑 안붙음 
			Scanner scan = new Scanner(System.in);
			System.out.println("검색할 아이디를 입력해주세요:");
			String id = "'%"+ scan.nextLine()+"%'";
			sql += "where id like"+ id +" ";//나한테 나 더하기,여기도 띄어쓰기!(다음거랑 안붙게)
			Statement stmt = con.createStatement();//칠판 깔아주기 
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.println(rs.getString("id"));//아이디 ,순서가 중요하다
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {//전화를 끊어줘야 다음 일을 할 수 있으니까 finally 
			if(con!=null) {
				try {
					con.close();//예외상황이 벌어질 수 있으니까 trycatch를 해야한다.
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
