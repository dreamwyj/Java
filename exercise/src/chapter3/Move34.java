package chapter3;

import java.util.Scanner;

public class Move34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		for (int i = 0; i < 3; i++) {
			num = num/10;
		}
		System.out.println(num);

	}

}
