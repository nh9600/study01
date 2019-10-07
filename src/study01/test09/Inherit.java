package study01.test09;

import study01.test08.Atom;//test08에 있는 아톰을 바라보게하려면 import사용

public class Inherit extends Atom{
	public String toString() {//오브젝트가 가지고 있는 toString을 덮어 씌움
		return "아 나는 메모리 주소 찍기 싫다고!!";//오버라이딩이 됨
	}
	public static void main(String[]args) {
		Inherit i = new Inherit();
		//i.defaultTest();패키지가 달라서 안됨
		//i.protectedTest();
		Object o = new Inherit();
	
		
	}

}
