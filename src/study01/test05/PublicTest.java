package study01.test05;

import study01.test04.PrivateTest;

public class PublicTest {
	public int num;
	
	public static void main(String[]args) {
		PublicTest pt = new PublicTest();
		System.out.println(pt.num);
		PrivateTest pt2 = new PrivateTest();
		System.out.println(pt2.num);//접근제어자가 다르면 사용못함 
		
	}

}
