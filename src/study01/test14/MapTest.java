package study01.test14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MapTest {
	
	public static void main(String[]args) {
		HashMap<String,String> map = new HashMap<String,String>();
		map.put("이름","홍길동");//String이라고 부를 수 있어야함
		map.put("나이","33");//리스트라고 부룰수있는 이유 인터페이스 리스트를 설계삼아서 구현할 수 있기때문이다.
		List<HashMap<String,String>> mapList
		= new ArrayList<HashMap<String,String>>();//하나의 테이블
		mapList.add(map);//add를 했으니까
		map.put("성별","남자");//추가!
		System.out.println(mapList);
		
		HashMap<String,List<HashMap<String,String>>> totalMap;//엑셀로 따지면 시트
	}

}
