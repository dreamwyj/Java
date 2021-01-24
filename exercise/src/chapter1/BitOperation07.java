package chapter1;

import java.util.Scanner;

public class BitOperation07 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		System.out.println(Integer.toBinaryString(num1));
		int num2 = ~num1;
		System.out.println(Integer.toBinaryString(num2));
		int num3 = num2 + 1;
		System.out.println(Integer.toBinaryString(num3));
		System.out.println(num3);
		
	}

}
