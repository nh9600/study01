package study01.test11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListTest {
	
	public static void main(String[]args) {
		List<String> list1 = new ArrayList<String>();//공통 List 안됨
		List<String> list2 = new LinkedList<String>();//순서를 아는게 아니라 앞뒤를 아는것
		//단순하게 순서대로할거면 ArrayList가 짱!
		//LinkedList 입력을 받은 것 중에 삭제를 하거나 추가를 하거나 누락시킬때
		list1.add("1");
		list1.add("2");
		list1.add("3");
		list2.add("1");
		list2.add("2");
		list2.add("3");
		System.out.println(list1);//[1,2,3]
		System.out.println(list2);//[1,2,3]
		list1.remove(0);//0번째 방 삭제
		list2.remove(0);
		System.out.println(list1);//[2,3]
		System.out.println(list2);//[2,3]
		list1.set(0,"4");//0번째 방값을 4로 변경
		list2.set(0,"4");
		System.out.println(list1);//[4,3]
		System.out.println(list2);//[4,3]
		System.out.println(list1.size());//
		System.out.println(list2.size());//
		
		
		
	}
}

//List<String> strList3 = new Vector<String>();//이건 쓰지마!!