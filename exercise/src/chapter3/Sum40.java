package chapter3;

import java.util.Scanner;

public class Sum40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println(sum(n));

	}
	static double sum(int n) {
		int end = 1;
		if (n % 2 == 0) {
			end = 2;
		}
		double sum = 0;
		for (int i = n; i >= end; i--) {
			double num = 1;
			num = num/i;
//			System.out.print(i + " ");
			sum += num;
		}
		return sum;
	}

}
