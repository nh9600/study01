package study01.test13;

public class Test04 {
	public static void main(String[]args) {
		String[]strs = new String[5];
		strs[0]="일";
		strs[1]="이";
		strs[2]="삼";
		strs[3]="사";
		strs[4]="오";
		String[] tmp = strs;
		strs = new String[strs.length-1];//방하나 삭제
		
		for(int i=0;i<1;i++) {
			strs[i]=tmp[i];//복사한 tmp를 strs에 1보다 작은 방을 넣음
		}
		
		for(int i=1+1;i<tmp.length;i++) {
			strs[i-1]=tmp[i];
		}
		
		for(int i=0;i<strs.length;i++) {
			System.out.println(strs[i]);
		}
		
		
	}

}
