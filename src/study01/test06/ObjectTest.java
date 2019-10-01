package study01.test06;

public class ObjectTest {
	int num1;
	int num2;
	String str = new String("");//메모리 주소가 다름
	
	public static void main(String[]args) {
		ObjectTest ot = new ObjectTest();//()값이 들어 갈 수 있음
		ObjectTest ot2 = new ObjectTest();
		System.out.println(ot.num1 == ot2.num2);//같은 0이기 때문에 true
		System.out.println(ot.str==ot2.str);//같은 빈문자이기 때문에 true
		ot.num1 = 5;
		ot.num2 = 10;
		System.out.println(ot.num1);
		System.out.println(ot.num2);
		ot = new ObjectTest();//다시 초기화 시킴(위에 것은 자바가 알아서 삭제해줌)
		System.out.println(ot.num1);
		System.out.println(ot.num2);
		System.out.println(ot.num1 == ot.num2);
		ot2.str="";
		System.out.println(ot.str == ot2.str);//같은 빈문자이기 때문에 true
		
	}

}
