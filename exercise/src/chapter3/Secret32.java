package chapter3;

import java.util.Scanner;

public class Secret32 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int[] secret = new int[4];
		int m;
		for (int i = 0; i < secret.length; i++) {
			secret[i] = (num % 10 + 5) % 10;
			num /= 10;
			System.out.print(secret[i]);
		}
		

	}

}
