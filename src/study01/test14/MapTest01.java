package study01.test14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MapTest01 {
	public static void main(String[]args) {
		HashMap<String,String> map = new HashMap<String,String>();		
		List<HashMap<String,String>> mapList = new ArrayList<HashMap<String,String>>();
		for(int i=0;i<=30;i++) {
			map = new HashMap<String,String>();
			map.put("이름","박하늘"+i);
			map.put("나이",i+"");
			map.put("성별","여자");
			if(i%2==0) {
				map.put("성별","남자");//여자,남자 둘다 호출
			}
			mapList.add(map);
		}
		for(int i=0;i<mapList.size();i++) {
			System.out.println(mapList.get(i));
		}
		
		map.put("직업","학생");
		System.out.println(mapList);
		
	}

}
