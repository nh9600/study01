package study01.test15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTest {//맵은 순서가 중요할때 쓰는게 아니라 키값이 중요할때(맵은 순서가 없다)
	public static void main(String[]args) {
		Map<String,String> map = new HashMap<String,String>();//아빠일수도있고 설계서일수도 있다.(이건 인터페이스)
		map.put("보물1호","컴퓨터");//순서가 아니다
		map.put("선호음식","컴퓨터");//누가있는지는 알아야함
		map.put("해야할일","많다...");//키가 저장되는곳과 벨뉴가 저장되어있는 곳은 따로있다, 그냥 연결되었을 뿐
		Iterator<String> it = map.keySet().iterator();//맵이랑 리스트, 셋(세트)
		                      //keySet()메서드의 호출,iterator()는 메소드 
	
		while(it.hasNext()) {//has(가지고있어?) is(의문문) = 불린(참거짓)
			String key = it.next();//언제가는 끝이 나올테니까 나올때까지 돌리기(몇갠지는 모름)-모르지만 다음꺼 있냐고 계속 물어봄 
			System.out.println("key:"+key);//순서대로 나오지는 않지만 키값이 다 나옴 
			String value = map.get(key);//키값을 보면 벨류를 알 수 있으니까 키값을 뽑아옴 
			System.out.println("value:"+ value);
		}//계속 물어보고있는거(바닥까지 내려가보자!),포문은 값이 정확할때,둘다 써도 상관없는데 여기서는 와일문이 더 쓰기 편하다.
		//벨류만 뽑아올수도 있지만 딱히 쓸 일 없음 
		System.out.println(map.get("보물1호")==map.get("선호음식"));
		
		
	}

}
