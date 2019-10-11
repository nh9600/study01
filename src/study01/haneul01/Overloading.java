package study01.haneul01;

public class Overloading {
	public void test(int a) {
		System.out.println("ss");
	}
	public void test(String s) {
		System.out.println("ss");
	}
	public void test(int a,String s) {
		System.out.println("ss");
	}
	
	public static void main(String[]args) {
		Overloading ol = new Overloading();
		ol.test(1);
		ol.test("");
	}
	

}
