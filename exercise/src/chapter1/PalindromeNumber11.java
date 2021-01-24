package chapter1;

import java.util.Scanner;

public class PalindromeNumber11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int[] flag = new int[5];
		boolean isflag = true;
		flag[0] = num/10000;
		flag[1] = num%10000/1000;
		flag[2] = num%10000%1000/100;
		flag[3] = num%10000%1000%100/10;
		flag[4] = num%10;
		for(int i = 0; i < flag.length/2; i++) {
			int j = flag.length - i - 1;
			if (i!=j && flag[i] != flag[j]) {
				isflag = false;
				break;
			}
		}
		if (isflag) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
	}

}
