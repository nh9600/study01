package study01.test13;

public class Test {
	public static void main(String[]args) {
	String[]strs=new String[3];
	strs[0]="123";
	strs[1]="asb";
	strs[2]="하늘";
	
	String str="[";
	for(int i=0;i<strs.length;i++) {
		str+=strs[i]+",";
	}
	str=str.substring(0,str.length()-1);//마지막 ,빼기
	str+="]";
	System.out.println(str);
	
	String test="12345";
	test=test.substring(2,3);//방번호
	System.out.println(test);//오버로딩 지원 
}
}
