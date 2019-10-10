package study01.test11;
//생성자를 만드는 이유: 메모리가 생성되었을때 반드시 동작하게 할때 
//자기만에 영역에 뭘할지 
public interface Remote {//인터페이스도 데이터 타입이 될 수 있다
	public void on();//영역 못함
	public void off();//생성자를 만들 수 없음(new 못함)
}
