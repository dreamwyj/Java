package chapter2;

import java.util.Scanner;

public class WeekTest26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String string1 = scan.next();
		String string = string1.toUpperCase();
		char[] c = new char[20];
		c = string.toCharArray();
		if (c[0] == 'T') {
			if (c[1] == 'U') {
				System.out.println("星期二");
			}
			if (c[1] == 'H') {
				System.out.println("星期四");
			}
		}else if (c[0] == 'S') {
			if (c[1] == 'A') {
				System.out.println("星期六");
			}
			if (c[1] == 'U') {
				System.out.println("星期日");
			}
		}
		else {
			switch (c[0]) {
			case 'M':System.out.println("星期一");break;
			case 'W':System.out.println("星期三");break;
			case 'F':System.out.println("星期五");break;

			default:System.out.println("输入错误");break;
			}
		}
		
		

	}

}
