package chapter4;

public class Monkey43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 10; i++) {
			int num = Peach(i);
			System.out.print(num + " ");
		}
		int num2 =Peach(10);
		System.out.print("\n" + num2 + " ");

	}
	// 吃了1/2的前一天桃子数 + 1
	// 剩下1/2的前一天桃子数 - 1
	static int Peach(double n) {
		if (n == 1) {
			return 1;
		}else {
			return (Peach(n - 1) + 1) * 2;
		}
	}

}
