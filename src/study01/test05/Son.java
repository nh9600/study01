package study01.test05;

class Father{
	void work() {
		System.out.println("�ƹ����� ���� �Ͻʴϴ�.");
	}
}

public class Son extends Father{//���� �������� �ξ������, �ƺ��� ���
	void work() {
		System.out.println("���� ���� �Ѵ�!");//�������̵�,�ƺ��� �״�� �ΰ� �Ƶ鲬 �ø�.
	}
	public static void main(String[]args) {
		Son s = new Son();
		s.work();
	}
	

}
