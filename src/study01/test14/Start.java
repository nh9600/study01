package study01.test14;

class End{
	final void test() {//final이므로 오버라이딩 안됨
		System.out.println("난 test메소드야~");
	}
}
public class Start {
	static final String STR_EXAM = "abc";
	void test() {
		System.out.println("난 Start's test메소드야~");
	}
	
	public static void main(String[]args) {
		
	}
	

}
