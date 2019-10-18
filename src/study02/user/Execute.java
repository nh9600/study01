package study02.user;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Execute {
	Connection con = DBCon.getCon();
	Scanner scan = new Scanner(System.in);
	
	void insert() {//전체
		System.out.println("id를 입력해주세요.");
		String id = "'"+scan.nextLine()+"'";
		
		System.out.println("pwd를 입력해주세요.");
		String pwd = "'"+scan.nextLine()+"'";
		
		System.out.println("name를 입력해주세요.");
		String name = "'"+scan.nextLine()+"'";
		
		System.out.println("age를 입력해주세요.");
		String age = "'"+scan.nextLine()+"'";
		
		System.out.println("etc를 입력해주세요.");
		String etc = "'"+scan.nextLine()+"'";
		String sql = "insert into user_info(id,pwd,name,age,etc)";
		sql+="values("+id+","+pwd+","+name+","+age+","+etc+")";
		
		try {
			Statement stmt = con.createStatement();//칠판 만들어주고 
			//칠판을 만들고 trycatch를 해주는 이유 
			//가다가 끊어질 수 있으니까 
			int result = stmt.executeUpdate(sql);//sql실행
			System.out.println("인서트된 갯수:"+result);//넣은 갯수
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	void update() {//이름,아이디
		System.out.println("id를 입력해주세요.");
		String id = "'"+scan.nextLine()+"'";
		System.out.println("해당 id의 변경할 이름값을 입력해주세요.");
		String name = "'"+scan.nextLine()+"'";
		String sql = "update user_info set name="+ name + " where id="+id;
		
		try {
			Statement stmt = con.createStatement();
			int result = stmt.executeUpdate(sql);
			System.out.println("업데이트 갯수"+ result);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	void delete() {//아이디
		System.out.println("삭제할 id를 입력해주세요.");
		String id = "'"+scan.nextLine()+"'";
		String sql = "delete from user_info where id="+ id;
		
        try {
			Statement stmt = con.createStatement();
			int result = stmt.executeUpdate(sql);
			System.out.println("삭제된 갯수"+result);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	void select() {//이름
		String sql = "select * from user_info ";
		System.out.println("name를 입력해주세요.");
		String name = "'"+scan.nextLine()+"'";
		sql += "where name like"+ name +" ";
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.println(rs.getString("name"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
		

	void initResponse() {
		String res = "";
        while(!res.equals("p")) {
		System.out.println("원하는 서비스 번호를 입력하세요.");
		System.out.println("1.유저 생성");
		System.out.println("2.유저 삭제");
		System.out.println("3.유저 수정");
		System.out.println("4.유저 조회");
		System.out.println("q.종료");
		res=scan.nextLine();
		if("1".equals(res)) {
			
		}else if("2".equals(res)) {
			
		}else if("3".equals(res)) {
			
		}else if("4".equals(res)) {
			
		}else if("q".equals(res)) {
			System.out.println("시스템이 종료됩니다.");
		}else
		{			
		System.out.println("입력하신 서비스번호가 없습니다.");
		}
	}
	}
		public static void main(String[]args) {
			Execute ec = new Execute();
			ec.initResponse();
	}
}

