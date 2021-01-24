package chapter2;

import java.util.Scanner;

public class PalindromeNumber25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int[] flag = new int[5];
		for (int i = 0; i < flag.length; i++) {
			if (num != 0) {
				break;
			}
			flag[i] = num%10;
			num /= 10;
		}
		boolean isflag = true;
		for (int i = 0; i < flag.length/2; i++) {
			int j = flag.length - 1 - i;
			if (i == j) {
				
				break;
			}
			if (flag[i] != flag[j]) {
				isflag = false;
				break;
			}
			
		}
		if (isflag) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}

}
