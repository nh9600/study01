package study01.test05;

class Father{//���� Ŭ������ ���� �ٸ� Ŭ������ ��� ������
	void work() {
		System.out.println("�ƹ����� ���� �Ͻʴϴ�.");
	}
}

public class Son extends Father{//���� �������� �ξ������(extends), �ƺ��� ���
	void work() {//work�� ��� ���ص� ������ �ٸ� ���� �ϰ�ʹٸ� ���. 
		System.out.println("���� ���� �Ѵ�!");//�������̵�,�ƺ��� �״�� �ΰ� �Ƶ鲬 �ø�.
	}
	public static void main(String[]args) {//�ƱԸ�Ʈ
		Son s = new Son();
		s.work();//�ƹ����� ��ũ�� �Ƶ��� ��� �޾ұ� ������ ��밡��)
	}

}
