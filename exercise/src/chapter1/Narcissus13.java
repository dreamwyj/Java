package chapter1;

import java.util.Scanner;

public class Narcissus13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[3];
		for (int i = 100; i < 1000; i++) {
			num[0] = i/100;
			num[1] = i%100/10;
			num[2] = i%10;
			int sum = 0;
			for (int j = 0; j < num.length; j++) {
				sum += (int)Math.pow(num[j], 3);
			}
			if (sum == i) {
				System.out.print(i + " ");
			}
			
		}
		

	}

}
