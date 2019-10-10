package study01.test10;

class Father{
	public void test() {
		System.out.println("난 아빠 테스트");
	}
	
}
    public class Son1 extends Father{
	public void test() {
		System.out.println("난 아들 테스트");
	}
	public void sontest() {
		System.out.println("난 아빠한테는 없는 기능이 있음");
	}
	
	public static void main(String[]args) {
		Father s = new Son1();
		
		
		Son1 s1 = (Son1)s;//형변환을 해줌
		s1.sontest();
		

		Father f = new Father();
		if(f instanceof Son1) {/*f를 Son1이라고 불러도 돼?
		                               자바가 ture하면 해줌*/
			s1 = (Son1)f;//형변환을 해줌
			s1.sontest();//아들거 호출 
		}
		s.test();//아들 호출
		f.test();//아빠 호출
	}

}
