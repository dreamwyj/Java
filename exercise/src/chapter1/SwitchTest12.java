package chapter1;

import java.util.Scanner;

public class SwitchTest12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt()/10;
		
		switch (score) {
		case 10:
		case 9:System.out.println("优");break;
		case 8:System.out.println("良");break;
		case 7:System.out.println("中");break;
		case 6:System.out.println("及格");break;
		default:System.out.println("不及格");
	};
	}
}
