package study01.test06;

public class MethodTest {
	
	public static void main(String[]args) {
		String str3 = "123";//스트링만 new생략 가능, 기존에 있던 위치에 "123"을 생성
		String str1 = new String("123");//new를 붙여으니까 새로운 위치에 "123"을 만듦 
		String str2 = new String("123");//new를 붙여으니까 '또' 새로운 위치에 "123"을 생성
		System.out.println(str1=="123");//==은 저장된 메모리 위치를 확인 		
		System.out.println(str3.equals(str1));/*'str의 equals(str1)의 메소드'비교 대상의 값을 비교
		                                                  이퀄스는 스트링이 가지고 있는 것*/
		//정해져 있는 데이터 타입은 new를 사용 안함(배열은 됨)
		int a = 1;//변수는 변수 배열은 배열!
		System.out.println(a==1);
		System.out.println("123");//"123"을 저장
		System.out.println("123");//앞에 "123"을 가져옴
		System.out.println("1234");//앞에 "123"과 다른 위치에 "1234"가 저장됨.
		
		
		String str = "1234567";
		int idx = str.indexOf("5");//매우 중요, 괄호가 없으면 메소드의 호출, 정해져 있지 않은 데이터 타입
		System.out.println("1은 str의" + idx + " index자리에 있네요");
		
		String name = "경훈,선호,영현,종서,동민,혜영";//,를 기준으로 배열을 만듦
		String[]strs = name.split(",");//split가 ,(기준점)을 없애줌.
		for(int i=0;i<strs.length;i++) {
			System.out.println("이름:"+strs[i]);//이름:경훈
			
		}
		
	}

}
