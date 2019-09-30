package study01.test04;

import java.util.Random;

public class ArrayTest {
	
	public static void main(String[]args) {
		int[] nums = new int[6];
		Random r = new Random();//컨트롤+쉬프트+o
		for(int i=0;i<nums.length;i++) {//6번 반복,i=0 초기화
			nums[i] = r.nextInt(10)+1; //6개의 방에 차례대로 들어감
			for(int j=i-1;i>=0;j--) {
				if(nums[i]==nums[j]) {
					i--;
					break;
					
				}
			}
		}
		
	}

}
