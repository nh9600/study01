package study01.test14;
//엄청 중요!!!!!!!
import java.util.ArrayList;
import java.util.List;

public class Excute {
	public static void main(String[]args) {
		List<Person> pList = new ArrayList<Person>();
		
		Person p = new Person();//Person메모리 생성
		p.setName("박도영");
		p.setAge(24);
		p.setAddr("안양");
		pList.add(p);//0번째 방이 박도영을 바라봄
		
		p = new Person();//new하고 바꿔버렸으니까 새로운 방에 하늘을 넣음 
		
		p.setName("하늘");
		p.setAge(24);
		p.setAddr("인천");
		pList.add(p);//1번째 방은 하늘을 바라봄
		
		p=pList.get(0);
		p=pList.get(1);
		
		p.setName("재빈");//나를 바꾸는 건 안되지만 내 안에 있는 것을 바꾸는 건 가능!
		
		System.out.println(pList);
		System.out.println(pList.get(0));
		System.out.println(pList.get(1));
	}

}
