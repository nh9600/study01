package study01.test05;

class Father{//공통 클래스를 만들어서 다른 클래스에 상속 시켜줌
	void work() {
		System.out.println("아버지가 일을 하십니다.");
	}
}

public class Son extends Father{//내가 법적으로 맺어줘야함(extends), 아빠를 상속
	void work() {//work를 사용 안해도 되지만 다른 일을 하고싶다면 사용. 
		System.out.println("나도 일을 한다!");//오버라이딩,아빠껀 그대로 두고 아들껄 올림.
	}
	public static void main(String[]args) {//아규먼트
		Son s = new Son();
		s.work();//아버지의 워크를 아들이 상속 받았기 때문에 사용가능)
	}

}
