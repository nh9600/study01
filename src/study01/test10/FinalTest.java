package study01.test10;

public class FinalTest {
	//final int num; 상수값은 내가 초기화를 시켜줘야함(내가 정의한 값만 넣을 수 있음),static과 같이 쓸 수 있음
	public static void main(String[]args) {
		final int a = 3;//상수(치종) 'a'값은 더이상 변하지 않음
		
		int num = 3;
		String str = "넘은 3이 맞습니다.";
		if(num!=3) {
			str="넘은 3이 아닙니다.";
		}
		str = (num==3)?"넘은 3이 맞습니다.":"넘은 3이 아닙니다.";
		System.out.println(str);
		
		
		System.out.println(str instanceof String);//instanceof는 이거 스트링이라고 불러도 돼?(라고 물어보는 것)
	}

}
