package study01.test11;

public class PadTest {
	public static void main(String[]args) {
		String str = "1";
		int max = 4-str.length();
		for(int i=1;i<=max;i++){//4-1=3
			str +="0";
			System.out.println(str);
		}
	}

}

//F6 = 내려옴
			