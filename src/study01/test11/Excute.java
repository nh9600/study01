package study01.test11;

class Test1{
	
}
public class Excute {

	public static void main(String[]args) {
		Remote r = new TvRemocon();//메모리를 생성할 순 없지만 데이터 타입으로는 선언할 수 있다. 
		r.on();
		Remote r2 = new AirconRemocon();//하는 기능은 다르다.
		r2.on();
		
		int age = 10;
		switch(age) {
		case 10:
			System.out.println("10살 이하");
			break;
		case 20:
			System.out.println("20살 이하");
			break;
		case 30:
			System.out.println("30살 이하");
			break;
		default:
			System.out.println("31살 이상");
			break;
		}
	}
}
