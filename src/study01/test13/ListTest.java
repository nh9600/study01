package study01.test13;

import java.util.ArrayList;
//
public class ListTest {//배열에는 length라는 메소드가 없음,그냥 정해진거라고 생각,배열은 length를 기본으로 제공
	private String[] strs;//스트링 배열 
	
	public ListTest() {
		this.strs = new String[0];//시작은 0부터!
	}
	public int size() {//간
		return this.strs.length;
	}
	public String toString() {//오버로딩:메서드의 데이터타입,파라메터 기준,아빠꺼랑 맞춰줘야하니까 스트링
		String str="[";
		for(int i=0;i<strs.length;i++) {//str
			str+=strs[i]+",";
		}
		str=str.substring(0,str.length()-1);//마지막 ,잘라내기
		str+="]";
		return str;
		
	}
	
	public void add(String str) {//집어 넣으려고 add
		String[]tmpStr = this.strs;
		this.strs = new String[strs.length+1];//속성이라()안들어감, 0+1 = 1(방 한개 만듦)
		//new하니까 넣었다가 새로 만들고해서 null 그래서 마지막 값만 마지막 방에 들어감
		this.strs[strs.length-1]=str;
		for(int i=0;i<tmpStr.length;i++) {
			this.strs[i]= tmpStr[i];
		}
	}
	public static void main(String[]args) {
		ListTest lt = new ListTest();
		lt.add("a");//0번방
		lt.add("b");//1번방
		lt.add("c");//2번방
		lt.add("d");
		lt.add("e");
		lt.add("f");

		System.out.println(lt);
		System.out.println(lt.size());//3이 나옴 
		System.out.println(lt.strs[0]);//a값을 넣었다가 방을 새로 만들어서 null
		System.out.println(lt.strs[1]);//1번째방에 b를 넣었다가 방을 새로 만들어서 null
		System.out.println(lt.strs[2]);//마지막 방에서 끝나니까 c값만 들어가고 끝!
		System.out.println(lt.strs[0]+","+ lt.strs[1]+","+ lt.strs[2]);
		
	
		
		
	}
//뉴스의 내용을 캡쳐해도 가능!
	
}
