package study01.test03;

import java.util.Scanner;

public class HowOldRU {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("너 몇살이야?");
		String age = scan.nextLine();
		int num = Integer.parseInt(age);//parseInt 분석
		if(num<=10) {
			System.out.println("어린이입니당~");
		}
			else if(num<=20) {
				System.out.println("청소년입니당~");
			}
			else if(num<=40) {
				System.out.println("청년입니당~");
			}
			else {
				System.out.println("꼰대세요~?");
			}
			
		}
	
}
