package chapter2;

import java.util.Scanner;

public class PrintTest22 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
//		System.out.println(scanner);
		int[] flag = new int[5];
//		flag[0] = num%10;
		int k = 0;
		for (; k < flag.length ; k++) {
			if (num == 0) {
				break;
			}
			flag[k] = num % 10;
			num /= 10;
			
		}
		System.out.println(k);
		for (int i = 0; i < k ; i++) {
			System.out.print(flag[i]);
		}

	}

}
