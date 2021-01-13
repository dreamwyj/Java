package com.atguigu.exer;

import java.util.Arrays;

public class Demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[]{34,5,22,-98,6,-76,0,31};
		// 冒泡排序
//		for(int i = 0;i < arr.length;i++)
//			for(int j = 0;j < arr.length-1-i;j++) {
//				int temp;
//				if(arr[j]>arr[j+1]){
//					temp = arr[j];
//					arr[j] = arr[j+1];
//					arr[j+1] = temp;
//					
//				}
//			}
//		System.out.println(Arrays.toString(arr));
		// 反转
//		System.out.println("反转后");
//		for(int i = 0;i < arr.length/2;i++)
//		{
//			int temp;
//			temp = arr[i];
//			arr[i] = arr[arr.length - 1-i];
//			arr[arr.length - 1 - i] = temp;
//		}
//		System.out.println(Arrays.toString(arr));
		// 复制上面的数组得到一个新数组
		int[] arr2 = new int[arr.length];
		for(int i = 0;i < arr2.length;i++) {
			arr2[i] = arr [i];
		}
		System.out.println(Arrays.toString(arr2));
		// 用线性查找，从上诉数组中查找22是否存在，若存在，返回索引值，若不存在，输出提示信息
		int desc = 22,index = -1;
		for(int i = 0;i < arr.length;i++) {
			if(arr[i] == desc)
			{
				index = i;
				break;
			}
		}
//		int index = Arrays.binarySearch(arr, desc);
		if(index >= 0)
			System.out.println(index);
		else
			System.out.println("没有找到");
				

	}

}
