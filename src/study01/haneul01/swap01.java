package study01.haneul01;

public class swap01 {
	public static void main(String[]args) {
		int[]nums = new int[5];
		for(int i=0;i<nums.length;i++) {
			nums[i]=i+1;
		}
		int[] tmpNums = nums;
		System.out.println(tmpNums[0]);
		nums[0] = tmpNums[0];
		nums[1] = tmpNums[1];
		nums[2] = tmpNums[2];
		nums[3] = tmpNums[3];
		nums[4] = 8;
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}

	}

}
