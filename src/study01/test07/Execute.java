package study01.test07;

class Calc{
	int num1;
	int num2;
	
	public void add() {
		System.out.println(num1+num2);//인트끼리면 산수 가능.
	}
	public void minus() {//
		System.out.println(num1-num2);
	}
	public void multiple() {
		System.out.println(num1*num2);
	}
	public void division() {
		System.out.println(num1/num2);//0 불가능
	}
}

public class Execute {
	
	public static void main(String[]args) {
		Calc calc = new Calc();//Calc가 있다는 것을 알려줌
		calc.num1 = 5;//숫자 대입
		calc.num2 = 2;
		calc.add();//출력
		calc.minus();
		calc.multiple();
		calc.division();//인트니까 소수점 없음(절삭).
		/*Calc calc = new Calc();
		calc.num1 = 5;
		calc.num2 = 3;
		calc.add();
		Calc calc2 = new Calc();
		calc2.add();
		
		Calc[] calcs = new Calc[3];//배열,Calc를 저장할 수 있는 자리를 3개 만드는 것.
		calcs[0] = new Calc();//초기화
		calcs[0].add();//0 출력*/
		
		
		
	}//여기서 싹다 죽음.

}
