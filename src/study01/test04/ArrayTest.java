package study01.test04;

import java.util.Random;

public class ArrayTest {
	
	public static void main(String[]args) {
		int[] nums = new int[6];
		Random r = new Random();//��Ʈ��+����Ʈ+o
		for(int i=0;i<nums.length;i++) {//6�� �ݺ�,i=0 �ʱ�ȭ
			nums[i] = r.nextInt(10)+1; //6���� �濡 ���ʴ�� ��
			for(int j=i-1;i>=0;j--) {
				if(nums[i]==nums[j]) {
					i--;
					break;
					
				}
			}
		}
		
	}

}
