package study01.test10;

import java.util.ArrayList;

public class IntegerList {
	
	public static void main(String[]args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		
		for(int i=0;i<al.size();i++) {
		System.out.println(al.get(i));//뭔가를 가져올땐 get!!(방을 하나씩 가져옴)
		}
		
	}

}
