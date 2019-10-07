package study01.test08;

class Cat{//하위 클래스는 못씀
	public void sleep() {//모든 데이터 타입은 배열을 만들 수 있음
		System.out.println("고양이가 잡니다.");
	}
}
public class KoShort extends Cat{//상속받은 클래스 안에 메소드 사용가능
	public void sleep() {
		super.sleep();//아빠것도 호출가능
		System.out.println("코숏 고양이가 잡니다.");
	}
	public static void main(String[]args) {//상속을 받았다고해도 아빠의 private에는 손댈 수 없음
		Cat ks = new KoShort();
		ks.sleep();
		
		Cat[] cats = new Cat[4];//캣이라고 불리는 방 4개 만듦
		cats[0] = new Cat();//방번호 꼭 쓰기..
		cats[1] = new KoShort();//코숏 불러오기 
		cats[0].sleep();//new Cat이 들어가 있으니까 "고양이가 잡니다"
		cats[1].sleep();//new KoShort가 들어가 있으니까 "코숏 고양이가 잡니다"
 	}
}
