package study01.test13;

import java.util.ArrayList;
import java.util.List;

public class Test01 {
	public static void main(String[]args) {
		String[] strs = new String[3];
		strs[0]="1";
		strs[1]="2";
		strs[2]="3";
		String[]tmp=strs;//값을 복사할 방을 만들어줌
		strs = new String[strs.length-1];//방을 하나 없애줌 
		for(int i=0;i<1;i++) {//내가 빼고 싶은 방번호를 넣음
			strs[i]=tmp[i];//왼쪽에 있는걸 가져오기
		}
	
	for(int i=1+1;i<tmp.length;i++) {//오른쪽에 있는걸 가져오기
		strs[i-1]=tmp[i];//방번호도 -1해줘야함(안해주면 null값 나옴!)
	}
	
	for(int i=0;i<strs.length;i++) {
		System.out.println(strs[i]);
	}
	

    }
}