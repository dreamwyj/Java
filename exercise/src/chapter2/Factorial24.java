package chapter2;

public class Factorial24 {

	public static void main(String[] args) {
		long sum = 0;
		for (int i = 1; i < 20; i++) {
			long k = num(i);
			System.out.print(k + " ");
			sum += k;
		}
		System.out.println();
		System.out.println(sum);

	}
	static long num(int x) {
		long factorial = 1;
		if (x != 1) {
			return factorial = x * num(x - 1);
		}else {
			return 1;
		}
	}

}
