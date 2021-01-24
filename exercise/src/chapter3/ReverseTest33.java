package chapter3;

import java.util.Scanner;

public class ReverseTest33 {
	
	public static void main(String[] args) {
		int[] num = new int[10];
		
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < num.length; i++) {
			num[i] = scanner.nextInt();
		}
		for (int i = 0; i < num.length; i++) {
			int j = num.length - i - 1;
			if (i >= j) {
				break;
			}
			else {
				int temp = num[i];
				num[i] = num[j];
				num[j] = temp;
			}
		}
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
	}

}
