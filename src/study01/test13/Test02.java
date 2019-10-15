package study01.test13;

public class Test02 {
	public static void main(String[]args) {
		String[]strs=new String[3];
		strs[0]="1";
		strs[1]="2";
		strs[2]="3";
		String[]tmp=strs;
		strs=new String[strs.length-1];
		for(int i=0;i<0;i++) {
			strs[i]=tmp[i];
		}
		for(int i=0+1;i<tmp.length;i++) {
			strs[i-1]=tmp[i];
		}
		
		for(int i=0;i<strs.length;i++) {
			System.out.println(strs[i]);
		}
		
	}

}
