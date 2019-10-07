package study01.test07;

class Calc1{//대문자!!
	int num1;//변수 선언!!
	int num2;
	
	public void add() {//더하기 메소드
		System.out.println(num1+num2);
	}
	public void minus() {
		System.out.println(num1-num2);
	}
	public void multiple() {
		System.out.println(num1*num2);
	}
	public void division() {
		System.out.println(num1/num2);
	}
}

public class Execute1 {
	public static void main(String[]args) {//메인 메소드 까먹지 않기ㅠㅠ!!!!!
	Calc1 calc = new Calc1();//Calc 위치 알려주기
	calc.num1 = 6;
	calc.num2 = 5;
	calc.add();
	calc.minus();
	calc.multiple();
	calc.division();
}
}
