package study01.test06;
//변수와 메소드는 독고다이로 쓸 수 없는 영역(반드시 어떤 영역 안에 포함되어야 함)
public class MethodTest2 {//메소드는 반드시 클래스 바로 밑에서만 가능.
  static int num;//클래스 안에서면 어디서든 쓸 수 있음.
  
  int getNum() {
	System.out.println(num);
	int num = 3;
	System.out.println(num);//위에 있는 변수(num)를 읽음
	System.out.println(this.num);
	return 1;
  }
  
  public static void main(String[]args) {
	int num; //같은 변수명(num)으로는 두번 선언 불가능
	MethodTest2 mt2 = new MethodTest2();//여기서 자바가 초기화 안되있는 걸 보고 초기화 시켜줌
	System.out.println(mt2.num);
	mt2.getNum();
  }
}