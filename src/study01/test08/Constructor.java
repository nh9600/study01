package study01.test08;

class Father{//보이진 않지만 자바가 기본생성자를 만들어줌(자바가 만들어주는 걸 기본생성자라고 함)
	int a = 3;//4
	Father(){//3
	System.out.println("1.난 아빠 클래스의 생성자임!");//5
	}
}

public class Constructor extends Father{/*생성자
	                                      1.클래스명과 대소문자까지 같아야함 
	                                      2.리턴하지않아도 되니까 보이드 생략 
	                                      3.리턴타입을 제외하고는 메소드와 상당히 비슷하다*/
	int b = 10;//6
	Constructor(){//2
		System.out.println(a);//7
		System.out.println(b);
		System.out.println("2.난 생성자 클래스의 생성자임!");//8
	}
	
	public static void main(String[]args) {//1
		Constructor c = new Constructor();
	
	}

}


//오버로딩 
//오버라이딩 