package study01.test04;

public class MethodTest2 {// �޼ҵ� ������ �ڱ� ������ �־�� ��
	
	static void test() {/*void��� ������ Ÿ���� ����
	                           �޼ҵ� ����
	                      void�� ����ų �� �ִ� ������ Ÿ���� ���� 
	                            �ƹ��͵� �������� �ʰڴ�.*/
		System.out.println(1);//������ٰ� ������� ����.
	}
	
	static int getNum() {
		return 0;//�޼ҵ��� ������ Ÿ���� ��Ʈ�� ��Ʈ�� �����ؾ���.
	}
	
	public static void main(String[]args) {
		test();//�޼ҵ� ȣ��
		int a = getNum();//getNum�� ���ǰ� �ƴ϶� ȣ���̴�.
	}
}
