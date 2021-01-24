package chapter4;

import java.util.Scanner;

public class MoveTest48 {
	static final int N = 10;
	static final int M = 4;

	public static void main(String[] args) {
//		int[] num = new int[N];
		int[] num = {1,2,3,4,5,6,7,8,9,0};
//		Scanner scanner = new Scanner(System.in);
//
//		for (int i = 0; i < num.length; i++) {
//			num[i] = scanner.nextInt();
//		}
		// 先把前0～N-M-1个数置换
		fn(num, 0, N - M);
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
		// 再把前N-M～N个数置换
		fn(num, N - M, N);
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		// 最后整体置换
		fn(num, 0, N);
		System.out.println();
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		

	}
	static void fn(int[] num,int start,int end) {
		int j = end - 1;
		for (int i = start; i < end; i++,j--) {
			if (i < j) {
				int temp = num[i];
				num[i] = num[j];
				num[j] = temp;
			}
			
			
		}
	}

}
