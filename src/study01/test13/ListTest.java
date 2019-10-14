package study01.test13;

import java.util.ArrayList;

public class ListTest {
	private String[] strs;
	
	public ListTest() {
		this.strs = new String[0];//시작은 0부터!
	}
	public int size() {
		return this.strs.length;
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
		lt.add("a");
		lt.add("b");
		lt.add("c");
		
		System.out.println(lt.size());//3이 나옴 
		System.out.println(lt.strs[0]);//a값을 넣었다가 방을 새로 만들어서 null
		System.out.println(lt.strs[1]);//1번째방에 b를 넣었다가 방을 새로 만들어서 null
		System.out.println(lt.strs[2]);//마지막 방에서 끝나니까 c값만 들어가고 끝!
		System.out.println(lt.strs[0]+","+ lt.strs[1]+","+ lt.strs[2]);
		
	
		
		
	}
//뉴스의 내용을 캡쳐해도 가능!
	
}
