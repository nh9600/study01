package study01.test11;

public class TvRemocon implements Remote{

	@Override
	public void on() {
		System.out.println("tv를 킵니다.");
		
	}

	@Override // 정의돼서 오버라이드가 됐을 때(써도그만,안써도그만)
	public void off() {
		System.out.println("tv를 끕니다.");
		
	}

}
