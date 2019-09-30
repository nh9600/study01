package study01.test04;

import java.util.Random;

public class ObjectTest {
	static int age;/*변수 선언 
	                 static이 없으면 오류
	                     초기화하지않아도 자바가 0으로 해줌*/
	String name;
	String getStr() {
		return null;//null 가능
		
	}
	public static void main(String[]args) {
		ObjectTest ot = new ObjectTest();//age의 값을 읽어서 0으로 초기화
		System.out.println(ot.age);
		System.out.println(ot.name);		
	}

}
