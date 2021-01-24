package chapter4;

public class Age46 {

	public static void main(String[] args) {
		
		int num = fn(5);
//		for (int i = 1; i < 5; i++) {
//			int num2 = fn(i);
//			System.out.println(num2);
//		}
		System.out.println(num);

	}
	static int fn(int num) {
		if (num == 1) {
			return 10;
		}
		else {
			return fn(num - 1) + 2;
		}
	}

}
