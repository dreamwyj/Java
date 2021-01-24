package chapter3;

import java.util.Scanner;

public class Sum38 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int sum = 0;

		int num = 0;
		for (int j = 0; j < b; j++) {// 求单个数字
			num = num * 10 + a;
			sum += num;
			System.out.print(num + " ");
		}
		System.out.println("\nSum:" + sum);

	}

}
