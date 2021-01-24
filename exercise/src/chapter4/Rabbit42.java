package chapter4;

import com.sun.jdi.Method;

public class Rabbit42 {
	static final int N = 30;

	public static void main(String[] args) {

		for (int i = 0; i < N; i++) {
			int num = Method(i);
			if (i != 0) {
				System.out.print(num + " ");
			}
			
		}

	}

	static int Method(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			return Method(n - 1) + Method(n - 2);
		}
	}

}
