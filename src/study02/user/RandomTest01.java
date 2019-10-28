package study02.user;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomTest01 {
	public static void main(String[]args) {
		List<Integer> list = new ArrayList<Integer>();
		Random ran = new Random();
		for(int i=0;i<6;i++) {
			int rNum = ran.nextInt(45)+1;
			if(list.indexOf(rNum)==-1) {
				list.add(rNum);
			}else {
				i--;
			}
		}
		System.out.println(list);
	}

}
