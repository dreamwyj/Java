package chapter4;

public class Factorial45 {

	public static void main(String[] args) {
		int num = fn(5);
		System.out.println(num);

	}
	static int fn(int n) {
		if (n == 1) {
			return 1;
		}else {
			return fn(n - 1) * n;
		}
	}

}
