package study01.test11;

import java.util.ArrayList;

public class WhileTest {
	
	public static void main(String[]args) {
		/*for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
		int i=1;
		while(i<=10) {
			System.out.println(i);
			i++;
		}*/
		
		ArrayList<String> strList = new ArrayList<String>();
		while(strList.size()<7) {
			strList.add("암거나");
		}//만족하지 않으면 실행하지 않음
		
		do {
			strList.add("암거나");//일단 한번은 실행함 
		}while(strList.size()<7);
	}

}
