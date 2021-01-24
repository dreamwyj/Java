package chapter2;

import java.util.Iterator;
import java.util.Scanner;

public class Date20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scaner = new Scanner(System.in);
		int year = scaner.nextInt();
		int month =scaner.nextInt();
		int day = scaner.nextInt();
		int[] num = new int[13];
		for (int i = 1; i < num.length; i++) {
			if (i == 4||i == 6||i == 9||i == 11) {
				num[i] = 30;
			}
			else if (i == 2) {
				if (year%400 == 0||(year/4==0&&year/100!=0)) {
					num[i] = 29;
				}
				else {
					num[i] = 28;
				}
			}else {
				num[i] = 31;
			}
		}
		int sum = day;
		for (int i = 1; i < month; i++) {
			sum += num[i];
		}
		
		System.out.print(sum);
	}

}
