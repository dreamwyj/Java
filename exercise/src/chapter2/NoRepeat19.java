package chapter2;

import java.util.Iterator;

public class NoRepeat19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int flag =0;
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				if (i==j) {
					continue;
				}
				for (int k = 1; k <= 4; k++) {
					if (k == i||k == i) {
						continue;
					}
					int num = i * 100 + j * 10 + k;
					flag++;
					System.out.print(num + " ");
					
				}
			}
		}
		System.out.println("\n " + flag);

	}

}
