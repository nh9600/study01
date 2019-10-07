package study01.test07;

class Calc2{
	private int num1;
	private int num2;
	
	public Calc2(int num1,int num2){//메소드명은 똑같이.
		this.num1 = num1;
		this.num2 = num2;
	}
	public void add() {//퍼블릭 안써도 가능
		System.out.println(num1+num2);
	}
	public void minus() {//연산한 값을 받으려면 리턴 출력만하면 void. 
		System.out.println(num1-num2);
	}
	public void multiple() {
		System.out.println(num1*num2);
	}
	public void division() {
		System.out.println(num1/num2);
	}
	
}

public class Execute2 {
	public static void main(String[]args) {
		Calc2 calc = new Calc2(4,2);
		calc.add();
		calc.minus();
		calc.multiple();
		calc.division();
	}

}
