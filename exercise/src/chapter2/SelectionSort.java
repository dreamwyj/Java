package chapter2;

public class SelectionSort {

	public static void main(String[] args) {
		
		int[] num = {67,56,87,56,90,36,77,62,44,32};
		for (int i = 0; i < num.length - 2; i++) {
			// 存后面一堆数字的第一个数字
			int min = num[i + 1];
			int k = i + 1;
			for (int j = i + 2; j < num.length; j++) {
				if (min > num[j]) {
					min = num[j];
					k = j;
				}
			}
			int temp = num[k];
			num[k] = num[i];
			num[i] = temp;
		}
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}

	}

}
