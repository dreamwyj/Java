package chapter2;

import java.util.Scanner;

public class DivisionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int k = 0;//用k判断

		while (num != 1) {//被整除最后一定是1

			if (num % 9 == 0) {//整除没有余数

				num /= 9;
				k++;

			} else {
				k = -1;
				break;
			}

		}
		if (k > 0) {

			System.out.println(k);
		} else {
			System.out.println("No");
		}

	}

}
