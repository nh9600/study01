package study01.test10;

import java.util.ArrayList;
import java.util.Random;

public class DoubleList {
	public static void main(String[]args){
		//ArrayList<String> strList = new ArrayList<String>();
		//ArrayList<Double> doubleList = new ArrayList<Double>();
		//Random ran = new Random();//랜덤 변수는 하나만
		//for(int i=0;i<10;i++) {
		//	strList.add(ran.nextInt(100)+"."+ran.nextInt(10));//숫자+문자+숫자=문자(스트링)
		//	doubleList.add(Double.parseDouble(strList.get(i)));//스트링을 더블로 바꿈

		//System.out.println(doubleList);//방에 하나씩 집어 넣음
		//System.out.println(doubleList.get(0)+doubleList.get(1));//0번째방 1번째방 
		
		ArrayList<Double> nums = new ArrayList<Double>();//순서대로 정렬하는게 빠름 
		nums.add(1.1);
		nums.add(1.3);
		nums.add(0.5);

		for(int i=0;i<nums.size();i++) {
			for(int j=i+1;j<nums.size();j++) {	
				if(nums.get(i)>nums.get(j)) {
					double temDouble = nums.get(i);
					nums.set(i,nums.get(j));
					nums.set(j,temDouble);
				}
			}
			System.out.println(nums);
			System.out.println(nums.get(i));	
			

		}
		
		
		
	
	
}
}

/*첫번째 있는 숫자(32.7)를 읽고 비교할게 없으니까 첫번째 방에 저장
 *첫번째 숫자(32.7)를 두번째 숫자(82.5)와 비교해서 더 둘 중에 더 작은 숫자(32.7)를 첫번째 방에 저장
 *32.7을 3번째 숫자(30.1)와 비교, 더 작은 숫자(30.1)을 첫번째 방에 저장
 *30.1을 4번째 숫자(58.0)와 비교, 더 작은 숫자(30.1)을 계속 첫번째 방에 놓기
 *30.1을 5번째 숫자(90.2)와 비교, 더 작은 숫자(30.1)을 계속 첫번째 방에 놓기
 *30.1을 6번째 숫자(68.5)와 비교, 더 작은 숫자(30.1)을 계속 첫번째 방에 놓기
 *30.1을 7번째 숫자(79.0)와 비교, 더 작은 숫자(30.1)을 계속 첫번째 방에 놓기
 *30.1을 8번째 숫자(49.5)와 비교, 더 작은 숫자(30.1)을 계속 첫번째 방에 놓기 
 */