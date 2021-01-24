package chapter1;

import java.util.Scanner;

public class SwitchTest10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner  = new Scanner(System.in);
		int num = scanner.nextInt();
		System.out.print("星期");
		switch (num) {
		case 1: System.out.print("一");break;
		case 2: System.out.print("二");break;
		case 3: System.out.print("三");break;
		case 4: System.out.print("四");break;
		case 5: System.out.print("五");break;
		case 6: System.out.print("六");break;
		case 7: System.out.print("日");break;
		
		}
		

	}

}
