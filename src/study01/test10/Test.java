package study01.test10;

import java.util.Random;

public class Test {
	
	public static void main(String[]args) {
		Random ran = new Random();//import해줘야함
		int fNum = ran.nextInt(100);//0~99, nextInt니까 인트형 데이터타입에 저장
		int sNum = ran.nextInt(10);//0~9
		System.out.println(fNum);
		System.out.println(sNum);//0~9까자의 랜덤값 호출 
		System.out.println(ran);//그냥 ran변수를 넣으면 메모리 주소가 나옴 
		String str = fNum + "." + sNum;//스트링으로 변환
		System.out.println(str);
		double db = Double.parseDouble(str);//스트링을 더블로 바꿔줌
		System.out.println(db+1);
		
		
		
		
	}

}
