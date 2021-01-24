package chapter2;

import java.util.Iterator;

public class Triangle {
	public static void main(String[] args) {
		for (int i = 3; i >= 0; i--) {//行
			
			for (int j = 0; j < i ; j++) {//打印
				System.out.print(" ");
			}
			for (int j = 0; j < (3-i) * 2 + 1 ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
