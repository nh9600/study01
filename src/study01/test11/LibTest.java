package study01.test11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

public class LibTest {
	
	public static void main(String[]args) {
		List<String> ages = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		
		for(int i=1;i<=3;i++) {
			System.out.println("나이를 입력해주세요:");
			String age = scan.nextLine();
			age = StringUtils.leftPad(age,3,"0");//접근제어자 퍼블릭
			ages.add(age);
		}		

		Collections.sort(ages);//차례대로 정렬
		for(int i=0;i<ages.size();i++) {
			System.out.println(ages.get(i));
			
		}
	}

}
