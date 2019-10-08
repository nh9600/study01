package study01.test10;

class Mother{
	public void time() {
		System.out.println("오늘 저녁 10시안으로 들어와라.");
	}
}	
public class Son extends Mother{
	public void time(String str) {
		System.out.println("싫어요. 저녁 11시안으로 들어갈게요!");
		}

	public static void main(String[]args) {

		Son s = new Son();
		s.time();
		s.time("");
    }
}



	


