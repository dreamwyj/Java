package com.atguigu.exer;
/*
 * 冒泡排序
 */
public class BubbleSortTest {
	public static void main(String[] args) {
		int[] num = new int[] {43,32,76,-98,0,64,33,-21,32,99};
		for(int i = 0;i < num.length;i++) {
			System.out.print(num[i] + "\t");
		}
		for(int i = 0;i < num.length - 1;i++) {
			for(int j = 0;j < num.length - 1 - i;j++) {
				int temp;
				if(num[j] > num[j+1]) {
					temp = num[j];
					num[j] = num[j+1];
					num[j+1] = temp;
					
				}
			}
		}
		System.out.println();
		for(int i = 0;i < num.length;i++) {
			System.out.print(num[i]+"\t");
		}
		
	}

}
