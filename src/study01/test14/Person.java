 package study01.test14;

public class Person {
	private String name;
	private int age;
	private String addr;
	//겟터메서드,셋터메서드
	public void setName(String name) {//set(셋팅)아무것도 리턴할게 없으니까 void 
		this.name = name;//같은 이름일땐 this생략하면 안됨
	}
	
	
	public void setAge(int age) {//모두다 퍼블릭 
		this.age = age;
	}
	
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getAddr() {
		return addr;
	}
	
	public String toString() {
		return "Person [name="+ name +",age="+ age +",addr="+ addr+"]";
	}

}
