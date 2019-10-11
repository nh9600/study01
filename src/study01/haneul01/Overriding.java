package study01.haneul01;
class Mother{
	public void test() {
		System.out.println("zz");
	}
}
public class Overriding {
	public void test() {
		System.out.println("dd");
	}
	
	public static void main(String[]args) {
		Overriding or = new Overriding();
		
		or.test();
	}
	

}
