package chapter3;

import java.util.Scanner;

public class ThreeNumber31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[3];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < num.length; i++) {
			num[i] = scanner.nextInt();
			
		}
		for (int i = 0; i < num.length - 1; i++) {
			for (int j = 0; j < num.length - i -1; j++) {
				if (num[j] < num[j + 1]) {
					int temp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		

	}

}
