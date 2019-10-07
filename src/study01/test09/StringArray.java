package study01.test09;

import java.util.ArrayList;
import java.util.Random;

public class StringArray {//class를 만드는 이유: 나중에 다시 사용하려고 
	
	public static void main(String[]args) {
		String[] strs = new String[10];
		//입력부
		Random ran = new Random();
		for(int i=0;i<strs.length;i++) {
			int rNum = ran.nextInt(20)+1;//1~20까지
			strs[i]=rNum+"";
		}
		
		//출력부
		for(int i=0;i<strs.length;i++) {
			System.out.println(strs[i]);
		}
		
		String[] str = new String[0];
		System.out.println(str.length);
		strs = new String[1];
		strs[0]= "1";
		
		/*String ArrayList라고 부를 수 있는 것만 넣을 수 있음
		  ArrayList는 어차피 배열*/
		ArrayList<String> strList = new ArrayList<String>();//스트링만 담을 수 있는 ArrayList, strList는 반드시 String으로 구성
		/*strList.add("1");//1추가
		strList.add("2");//1추가 = 총 2
		strList.remove(0);//방을 지움
		System.out.println(strList);//length와 비슷*/
		
		String strss ="ABCD";
		System.out.println(strss.indexOf("C"));//0부터 세니까 2나옴
		
		strList.add("홍길동");
		strList.add("임꺽정");
		strList.add("이문수");
		strList.add("김문수");
		System.out.println("==우리반 출석부==");
		for(int i=0;i<strList.size();i++) {
			System.out.println((i+1)+"."+strList.get(i));
		}
		System.out.println("박문수는"+strList.indexOf("이문수")+"번째 있어요~");
		
		int a = 1;
		Integer i = new Integer(1);//똑같은 인트지만 Integer은 new를 할 수 있음(안씀)
		
		ArrayList<Integer>numList = new ArrayList<Integer>();//Integer,Long덕분에 Object도 가능 
		numList.add(1);
		numList.add(2);
		numList.add(3);//인트니까 실수를 넣으면 오류 
		System.out.println(numList);
	}

}
