package study01.test15;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest2 {
	public static void main(String[]args) {
		Map<String,String> map = new LinkedHashMap<String,String>();//순서는 없음,순서가 있는 것처럼 보이는 것
		map.put("좋아하는음료수1","커피");
		map.put("좋아하는음료수2","맥주");
		map.put("좋아하는음료수3","진로이즈백");
		map.put("좋아하는음료수4","소주");
		map.put("좋아하는음료수5","콜라");
		map.put("좋아하는음료수6","사이다");
		map.put("좋아하는음료수7","환타");
		map.put("좋아하는음료수8","토마토쥬스");
		map.put("좋아하는음료수9","당근쥬스");
		
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println("key:"+key+",value:"+map.get(key));
		}
		
		
	}

}
