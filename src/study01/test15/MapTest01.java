package study01.test15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTest01 {
	public static void main(String[]args) {
		Map<String,String> map = new HashMap<String,String>();
		map.put("아침","사과");
		map.put("점심","밥");
		map.put("저녁","고기");
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println("키:"+key);
			String value = map.get(key);
			System.out.println("밸류:"+value);//값이 있으면 ture 없응면 false
		}
	}

}
