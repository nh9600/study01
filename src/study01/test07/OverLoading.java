package study01.test07;

public class OverLoading {//오버로딩,같은 메소드명
	public void test() {
		System.out.println("test()메소드 호출!");
	}
	public void test(int num) {
		System.out.println("test(int num)메소드 호출!");
	}
	public void test(String str) {//파라미터의 이름이 다르거나, 갯수가 다르거나, 위치가 다르거나 
		System.out.println("test(String str)메소드 호출!");
	}
	public void test(String str,int num) {//스트링과 인트의 자리가 바뀌어도 됨.
		System.out.println("test(String str,int num)메소드 호출!");
	}
	public void test(int num,String str) {
		System.out.println("test(int num,String str)메소드 호출!");
	}
	
	public static void main(String[]args) {//실행==호출
		OverLoading ol = new OverLoading();
		ol.test("ㅋㅋ",1);
		ol.test("ㅎㅎ");
		ol.test(1);
		ol.test(1,"욜로~");
	}

	/*레퍼런스 참조 
	스트링은 주소가 아니라 값을 비교 */
}
