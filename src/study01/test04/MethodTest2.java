package study01.test04;

public class MethodTest2 {// 메소드 끝에는 자기 영역이 있어야 함
	
	static void test() {/*void라는 데이터 타입은 없음
	                           메소드 선언
	                      void가 가르킬 수 있는 데이터 타입은 없음 
	                            아무것도 리턴하지 않겠다.*/
		System.out.println(1);//만들었다고 실행되지 않음.
	}
	
	static int getNum() {
		return 0;//메소드의 데이터 타입이 인트면 인트로 리턴해야함.
	}
	
	public static void main(String[]args) {
		test();//메소드 호출
		int a = getNum();//getNum은 정의가 아니라 호출이다.
	}
}
