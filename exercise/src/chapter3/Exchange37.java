package chapter3;

import java.util.Scanner;

public class Exchange37 {

	public static void main(String[] args) {
		int[] num = new int[10];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < num.length; i++) {
			num[i] = scanner.nextInt();
		}
		int max = num[0],j = 0 ;
		int min = num[0],k = 0;
		for (int i = 0; i < num.length; i++) {
			if (max < num[i]) {
				max = num[i];
				j = i;
			}
			if (min > num[i]) {
				min = num[i];
				k = i;
			}
		}
		change(num,0,j);
		change(num, num.length - 1, k);
		
//		int temp1 = num[j];
//		num[j] = num[0];
//		num[0] = temp1;
//		int temp2 = num[k];
//		num[k] = num[num.length - 1];
//		num[num.length - 1] = temp2;
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}

	}
	static void change(int[] num,int i,int j) {
		int temp = num[i];
		num[i] = num[j];
		num[j] = temp;
	}
	

}
