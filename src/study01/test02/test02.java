package study01.test02;

public class test02 {
	public static void main(String[]args) {
		int money1 = 0;
		int money2 = 100;
		int money3 = 500;
		int money4 = 1000;
		
		int[] moneys = new int[4];
		moneys[0] = 0;
		moneys[1] = 100;
		moneys[2] = 500;
		moneys[3] = 1000;
		
		System.out.println(moneys.length);//"."~ÀÇ ¼Ó¼º
		for(int i=0;i<moneys.length;i=i+1) {
			System.out.println(moneys[i]);
		}
	}

}
