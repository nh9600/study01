package study01.test04;

import java.util.Random;

public class ObjectTest {
	static int age;/*���� ���� 
	                 static�� ������ ����
	                     �ʱ�ȭ�����ʾƵ� �ڹٰ� 0���� ����*/
	String name;
	String getStr() {
		return null;//null ����
		
	}
	public static void main(String[]args) {
		ObjectTest ot = new ObjectTest();//age�� ���� �о 0���� �ʱ�ȭ
		System.out.println(ot.age);
		System.out.println(ot.name);		
	}

}
