package com.atguigu.exer;

import java.util.Arrays;

public class ArryTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1.boolean equals(int[] a,int[] b):判断两个数组是否相等
		int[] arr1 = new int[]{1,2,3,4};
		int[] arr2 = new int[]{1,3,2,4};
		boolean isEquals = Arrays.equals(arr1,arr2);
		System.out.println(isEquals);
		// 2.String toString(int[] a): 输出数组信息
		System.out.println(Arrays.toString(arr1)+ "\t"); 
		// 3.void fill(int[] a,int val) 将指定值填充到数组中
		Arrays.fill(arr1, 8);
		System.out.println(Arrays.toString(arr1) + "\t");
		// 4.void sort(int[] a)
		Arrays.sort(arr2);
		System.out.println("排序后"+Arrays.toString(arr2));
		// 5.int binarySearch(int[] a,int key)
		int[] arr3 = new int[]{-98,-34,2,34,54,66,79,105,210,333};
		int index = Arrays.binarySearch(arr3, 20);
		if(index >= 0)
		System.out.println(index);
		else
			System.out.println("没找到");

	}

}
