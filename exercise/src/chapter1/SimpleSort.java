package chapter1;

import java.util.Scanner;

public class SimpleSort {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int[] num = new int[3];
		for (int i = 0; i < num.length; i++) {
			num[i] = scanner.nextInt();
			
		}
		
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num.length - 1; j++) {
				if (num[j] > num[j + 1]) {
					int temp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = temp;
				}
			}	
		}
		
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]+" ");
			
		}
		
	}

}
