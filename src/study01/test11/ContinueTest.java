package study01.test11;

public class ContinueTest {
	public static void main(String[]args) {
		
	for(int i=1;i<=10;i++) {
		if(i%2==0)continue;//밑에 것을 실행하지 않고 위로 올림(중간에 스킵시켜야할때!)
		System.out.println(i);

	}

  }
}