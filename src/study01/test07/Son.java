package study01.test07;

class Mother{//한 클래스는 하나의 클래스만 상속(다중 상속 안됨)
	public void cook() {
		System.out.println("재료가 없으니 물에 밥말아 먹어라.");
	}
}
public class Son extends Mother {//합법적으로 맺어줌
	/*public Son() {
		기본 생성자
	}*/
	public void cook(String str) {/*1. int a 오버로딩(엄마껄 호출)
	                           2. 엄마껄 상속받아서 그 위에 아들껄 올림(오버라이딩: 우선적으로)
	                           3. 엄마껀 사라지지 않음*/
		//super.cook();엄마것도 호출!)
		System.out.println("물밥 지겹다. 라면을 끓여 먹겠다.");
	}
	public static void main(String[]args) {
		
		Son s = new Son();//생성자의 호출(메모리를 생성할때 무조건 실행되는 것)
		s.cook();//메소드의 호출
		s.cook("a");
	}

}
