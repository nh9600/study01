package study01.test08;

class Animal{/*객체(오브젝트)를 상속받고 있음, 아래 상속받고 있는 진도도 오브젝트를 상속받고 있음.
                   최상위 클래스는 하위 클래스 내용을 모름, 자바는 무조건 단일 상속!*/
	
}
class Dog{//오버라이딩(상속)
	public void test() {
		System.out.println("난 도그의 테스트 메소드야!");
	}
}

public class Jindo extends Dog {/*자바파일명과 같은 진도 앞에만 퍼블릭 가능
	                                     진도를 개라고 부를 수 있지만 개를 진도라고 부를 수 없음(퍼블릭)*/
	public static void main(String[]args) {//진도는 진도만, 도그는 도그와 진도 
		Jindo jindo = new Jindo();
		jindo.test();
	}

}
