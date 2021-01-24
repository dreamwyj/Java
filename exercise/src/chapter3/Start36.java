package chapter3;

import java.util.Scanner;

public class Start36 {

	public static void main(String[] args) {
		int[] num = new int[7];
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < num.length; i++) {
			num[i] = scanner.nextInt();
			for (int j = 0; j < num[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
