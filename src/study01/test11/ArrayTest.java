package study01.test11;

public class ArrayTest {
	public static void main(String[]args) {
		/*int [][] nums = new int[4][];//뒤에 방개수 안넣도 됨,인트 배열배열
		//int 0의 몇번째가 int 
		nums[0] = new int[3];
		System.out.println(nums[0][1]);//출력 == 0
		nums[1] = new int[10];//1층의 방개수는 10개
		System.out.println(nums[0].length);
		System.out.println(nums[1].length);*/
		
		int [][] nums = new int[4][];
		nums[0] = new int[3];
		int[] ns = new int[3];
		System.out.println(ns.length);//3출력
	}

}
