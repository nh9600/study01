package study01.haneul01;

import java.util.ArrayList;
import java.util.Random;

public class DoubleListTest {
	public static void main(String[]args) {
		
	
	ArrayList<String> str = new ArrayList<String>();
	ArrayList<Double> db = new ArrayList<Double>();
	Random ran = new Random();
	for(int i=0;i<10;i++) {
		str.add(ran.nextInt(100)+","+ran.nextInt(10));
		db.add(Double.parseDouble(str.get(i)));	
		
		System.out.println(db);
		System.out.println(db.get(0)+db.get(1));
	}


}
}
