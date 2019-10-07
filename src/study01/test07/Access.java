package study01.test07;

class Cat{//private는 건들 수 없으니까 public 메소드를 만듦. 
	private int age;//변수는 반드시 private를 사용하고 메소드는 public을 사용해야함=POJO방식
	private String name;//직접적으로 못 건드리게 함.
	private String type;//에러는 안나는데 합리적이지 못할때 밑줄
	
	public void setAge(int age) {//(변수의 선언만 가능!),주입은 반드시 set
		this.age = age;
	}//주입
	
	public int getAge() {//받는건 반드시 get
		return age;
	}
	
	public void setName(String name) {//set에는 값만 주입시킴. 리턴할게 없으니까 void.
		this.name = name;
	}
	
	public String getName() {//주입받은 값을 리턴
		return name;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
}

public class Access {
	public static void main(String[]args) {
	Cat c = new Cat();
	c.setAge(4);//(인트면 인트!!)
	c.setName("젤리");//입력하는 메소드들
	c.setType("스코티쉬폴드");
	System.out.println("고양이의 나이는: "+ c.getAge());
	System.out.println("고양이의 이름은: "+ c.getName());
	System.out.println("고양이의 종류는: "+ c.getType());
	
	}

}
