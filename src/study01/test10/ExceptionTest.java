package study01.test10;

public class ExceptionTest {
	
	public static void main(String[]args) {
		String strNum = "일이삼사";
	try {//try catch문/예외처리문 
		int num = Integer.parseInt(strNum);
	}catch(Exception e) {//에러가 나면 잡아줌
		System.out.println(strNum + "은 숫자가 아닙니다.");//에러가 났을때만 실행
	}finally {//에러문구 실행하고 실행
		System.out.println("난 무조건 실행!");
	}
	System.out.println("종료합니다.");

}
}
