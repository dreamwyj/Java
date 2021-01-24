package chapter2;


public class SumTest23 {
	public static void main(String[] args) {
		
		int[] num1 = new int[21];
		int[] num2 = new int[21];
		num1[0] = 1;
		num1[1] = 2;
		num2[0] = 1;
		num2[1] = 1;
		for (int i = 2; i < num1.length ; i++) {
//			int j = i - 1;
			num1[i] = num1[i - 1] + num1[i - 2];
			num2[i] = num2[i - 1] + num2[i - 2];
			
			
		}
		double sum = 0;
		for (int i = 1; i < num1.length; i++) {
			sum = sum + num1[i]/num2[i];
		}
		System.out.println(sum);
//		for (int i = 1; i < num2.length; i++) {
//			System.out.print(num2[i] + " ");
//		}
	}
	

}
