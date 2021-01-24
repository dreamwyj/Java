package chapter1;

import java.util.Scanner;

public class Move09 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		boolean isflag = false;

		if (num >= 0) {

			for (int i = 0; i < Math.sqrt(num); i++) {
				int check = (int) Math.pow(2, i);
				if (num == check) {
					isflag = true;
					break;
				}
			}
			if (isflag) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
		;

	}

}
