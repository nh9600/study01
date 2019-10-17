package study02;
//시험에 나와!!!!!!!!!!
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Insert {
	public static void main(String[]args) {//static을 사용하는 이유가 여기있음
		
		Connection con = null;
		try {
			con = DriverManager.getConnection(ConnectionTest2.URL,ConnectionTest2.ID,ConnectionTest2.PWD);
			String sql = "insert into user_info(id, pwd, name, age, etc) ";//마지막에 띄어쓰기!,안에 집어넣을거니까 into
			Scanner scan = new Scanner(System.in);
			System.out.println("당신의 정보를 \",\"를 기준으로 입력해주세요.");//특수문자\ 
			String info = scan.nextLine();
			String[] infos = info.split(",");
			
			sql+="values(";
			for(int i=0;i<infos.length;i++) {
				sql+= "'"+ infos[i] + "',";//,(콤마)필수!
			}
			sql = sql.substring(0,sql.length()-1);//마지막 빼기 
			sql+=")";
			
			Statement stmt = con.createStatement();
			int result = stmt.executeUpdate(sql);
			System.out.println("인서트된 갯수:"+result);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
