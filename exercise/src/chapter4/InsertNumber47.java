package chapter4;

import java.util.Iterator;
import java.util.Scanner;

public class InsertNumber47 {
	public static void main(String[] args) {
		int[] num = {1,2,4,5,6,7,8};
		int[] num2 = new int[num.length + 1];
		for (int i = 0; i < num.length; i++) {
			num2[i] = num[i];
			System.out.print(num[i] + " ");
		}
		System.out.println();
		System.out.println("输入插入的数:");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int k = 0;//记录插入的位置
		for (int i = num.length - 1; i >= 0; i--) {
			if (num[i] < a) {
				k = i+1;
				break;
			}
		}
		for (int i = num2.length - 1; i >= k; i--) {
			if (i > k) {
				num2[i] = num2[i - 1];
			}
			else {
				num2[i] = a;
			}
		}
		for (int i = 0; i < num2.length; i++) {
			System.out.print(num2[i] + " ");
		}
		
	}

}
