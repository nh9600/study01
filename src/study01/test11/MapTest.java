package study01.test11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//해시맵,링크드해시맵
public class MapTest {
	public static void main(String[]args) {
		HashMap<String,String> human = new HashMap<String,String>();//데이터타입이 같아야함(나 자신을 바꿈)
		human.put("이름", "홍길동");//이 값은 이름이야! 라고 정확하게 알려주기
		human.put("나이", "33");//이럴때 사용하는게 map
		human.put("주소", "서울 강서구");
		human.put("성별", "남자");
		human.put("성별", "여자");//같은 키니까 남자 것 위에 여자 것을 씌움(변수처럼)
		System.out.println(human.get("이름"));//.get으로 이름만 가져오기 
		System.out.println(human);//human만 찍어도 다 나옴
		
		List<HashMap<String,String>>people =//위에것을 담을 리스트 <키스트링,벨뉴스트링>
				new ArrayList<HashMap<String,String>>();
		people.add(human);//0번째 방
		people.add(human);//1번째 방 add니까 값이 두개 나옴
		people.get(1).put("이름","김길동");//0번째 방과 1번째 방 값은 같음 (똑같이 김길동 나옴)
		human.put("이름","임꺽정");//임꺽정으로 바꿈
		human = new HashMap<String,String>();//메모리를 새로 생성 
		System.out.println(human);//초기화
		System.out.println(people);//피플이 죽을때까지 그대로 남아있음
	}//절대로 중복되지않는 키
	//휴먼이라는 변수를 선언 
	//비어있는 해시맵을 바라봄
	//human.put에 "이름", "홍길동" 값을 집어 넣음 
	//people.add(human)실행 0번째 방에 애가 홍길동을 바라봄 
	//휴먼이 바라보고있는 해시맵이에 홍길동이 임꺽정으로 바뀜 
	//println해서 임꺽정 출력 
	//new 해시맵을 새로 만듦 
	//휴먼이 바라보는걸 끊고 새로운 해시맵을 바라보게함 
	//출력하면 {}이렇게 나옴 
	//피플은 해시맵을 계속 바라보고있기때문에 임꺽정이 나옴
	

}
