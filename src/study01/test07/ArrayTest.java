package study01.test07;

public class ArrayTest {
	public static void main(String[]args) {
		System.out.println("프로그램 시작");
		String[] nums = new String[5];
		for(int i=0;i<nums.length;i++) {
			nums[i]=(i+1)*10+"";//숫자 + 문자 = 문자(문자가 포함되면 모두 문자!!)
		}//입력만
		
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}//출력만
		System.out.println("프로그램 종료");
	}

}
