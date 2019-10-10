package study01.test11;

interface Promise{
	int test();//메소드 영역 없음
	void test1();
}


public class InterfaceTest implements Promise{//implements = 구현하다
	public int test() {//반드시 오버라이딩 해줘야 함
		//인터페이스 접근제어자가 public이니까 사용
		//이 설계서를 통해서 구현하겠다.
		return 1;
	}
	public void test1() {//오버로딩
		
	}
	
	
	
	
}

//메소드는 크게 두가지로 나뉨 1.리턴하느냐 2. 리턴하지않느냐 
/*인터페이스 설명
 * 메소드 영역 없음
 * 디폴트라고 선언하지않으면 퍼블릭임
 * 자동 퍼블릭이라도 public이라고 써도 무관
 * 리턴타입까지 같아야 함(리턴타입을 어기면 안됨)
 */