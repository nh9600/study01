package study01.test14;

class Son extends AbstractTest{

	@Override
	public void test() {
		System.out.println("test");
	}
	
}

public abstract class AbstractTest {//몸통이 있어야 하는 이유 new테스트가 있다는건 어딘가에 저장을 할 수 있다는 말
	public abstract void test(); //클래스는 new를 할 수 있거, 인터페이스는 new를 할 수 없으니까 
	public static void main(String[]args) {
		AbstractTest at = new Son();
		at.test();
	}
}


//추상클래스는 new를 할 수 없음(인터페이스와 같은 의미) 
//상속을 받은 클래스는 new를 할 수 있음
//설계와 구현을 한 곳에서 할 수 있다고 생각(클래스와 인터페이스를 합친 느낌)
	