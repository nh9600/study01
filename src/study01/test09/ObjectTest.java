package study01.test09;

public class ObjectTest {
	
	int num1 = 1;
	static int num2;/*삐딱하게 서있으면 static
	                  static이 0을 넣어줌*/
	
	public static void main(String[]args) {//static 필수
		/*System.out.println(num2);//같은 ObjectTest안에 있기 때문에 생략 가능. 
		num2 = 3;
		System.out.println(num2);
		
		ObjectTest oj = new ObjectTest();
		oj.num1 = 10;
		System.out.println(oj.num1);*/
		
		ObjectTest ot = new ObjectTest();
		ot.num2 = 10;
		ot = new ObjectTest();//num2의 값을 바라보고있기때문에 초기화 안됨(static이기 때문에 삭제되지 않음!)
		System.out.println(ot.num2);		
		
		String str1 = "1";
		String str2 = new String("1");
		
		System.out.println(str1 == str2);//위치가 다름
 	}//static num2는 여기서 죽음

}
