package com.atguigu.exer;
/*
 * 1. 数组元素的赋值(杨辉三角、回形数等)
 * 2. 求数值型数组中元素的最大值、最小值、平均数、总和等 
 * 3. 数组的复制、反转、查找(线性查找、二分法查找)
 * 4. 数组元素的排序算法
 */
public class Demo2 {
//	int yanghui(int[][] num) {
//		
//		for(int i = 0;)
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] num = new int [10][10];
		
		for(int i = 0;i < num.length;i++) {
			for(int j=0;j < num[i].length;j++) {
				if(j>i)
					break;
				if(j == 0||j == i) {  
					num[i][j] = 1;
					
					
				}
				if(j > 0 && j < i)
					num[i][j] = num[i-1][j-1] + num[i-1][j];
				System.out.print(num[i][j]+"\t");
			}
		System.out.print("\n");
		}
		
		
		

	}

}
