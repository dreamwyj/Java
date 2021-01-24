package chapter3;

import java.util.Scanner;

public class CommonFactor39 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int m2 = scanner.nextInt();
		int n2 = scanner.nextInt();
		int m = m2;
		int n = n2;
	    while (m != 0) {
	    	if (m < n) {
				int temp = n;
				n = m;
				m = temp;
			}
			m = m % n;
		}
	    System.out.println("最小公约数:" + n);
		m = m2/n * n2;
		System.out.println("最大公倍数:" + m);

	}

}
