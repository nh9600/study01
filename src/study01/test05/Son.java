package study01.test05;

class Father{
	void work() {
		System.out.println("아버지가 일을 하십니다.");
	}
}

public class Son extends Father{//내가 법적으로 맺어줘야함, 아빠를 상속
	void work() {
		System.out.println("나도 일을 한다!");//오버라이딩,아빠껀 그대로 두고 아들껄 올림.
	}
	public static void main(String[]args) {
		Son s = new Son();
		s.work();
	}
	

}
