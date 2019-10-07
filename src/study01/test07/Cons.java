package study01.test07;

public class Cons {//메소드는 반드시 데이터 타입이 필요함
	int num = 1;
	public Cons() {//메소드가 가지고 있는 성격과 똑같음(리턴 타입 없음)
		System.out.println(num);//1.출력
		System.out.println("아 내가 호출되었구나!");//2.출력
	}
	public Cons(int num) {//얘는 호출 안됨
		System.out.println("아 num파라메터가 있는 날 호출하였구나~");
	}
	public static void main(String[]args) {//실행부
	Cons c = new Cons();//생성자, 위에껀 static이 아니니까 불러와야함,제일 먼저 실행
	System.out.println(c.num);//3.출력
	//Scanner를 사용할때 뭐를 읽을지 꼭 알려줘야함(System.in)
	}

}
