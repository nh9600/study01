package study01.haneul01;

public class Array01 {
	public static void main(String[]args) {

	String[] str = new String[10];
	for(int i=0;i<str.length;i++) {
		str[i]=(i+1)*10+"";
	}
	
	for(int i=0;i<str.length;i++) {
		System.out.println(str[i]);
	}
	

}
}