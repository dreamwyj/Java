package chapter2;

public class PerfectNumber18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 1; i <= 1000; i++) {
			int sum = 0;
			for (int j = 1; j < i; j++) {
				if (i %j == 0) {
					sum += j;
				}
				
			}
			if (i == sum) {
				System.out.print(i + " ");
			}
		}

	}

}
