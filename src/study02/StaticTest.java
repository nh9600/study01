package study02;

public class StaticTest {
	static int a;
	static {
		a=10;
	}
	public static void main(String[]args) {//먼저(프리로딩) ,필요할때만(레이지로딩)
		System.out.println(StaticTest.a);
	}

}
