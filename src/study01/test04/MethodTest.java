package study01.test04;

public class MethodTest {//대문자 영어, 클래스는 어디 안에 있어도 상관없음
	static int num = 1;// 같은 영역에서 같은 변수명을 두번 선언할 수 없다.
	
	static int num() {//변수와 메소드 명은 다르다.
		return 1;
	}//괄호를 닫기까지 메소드의 선언
	
	public static void main(String[]args) {//영역 안에 변수 선언, 메인 메소드 선언
	System.out.println(num);
	}

}
