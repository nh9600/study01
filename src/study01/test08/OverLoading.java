package study01.test08;

public class OverLoading {/*기본요건 같은 영역에서 같은 메소드명!
                           (,)피라미터 갯수, 데이터 타입이 다르거나, 위치가 다르면 가능 */
	public void a() {//void는 리턴하지 않음
		
	}
	
	public int a(int a) {
		return 1;
	}
	
	public void a(int a, String s) {
		
	}
	
	public void a(String a) {
		
	}
	
	public void a(String s, int a) {
		
	}

}
