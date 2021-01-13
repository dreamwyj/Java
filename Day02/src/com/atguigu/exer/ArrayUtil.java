package com.atguigu.exer;
/*
 * 自定义数组的工具类
 */
public class ArrayUtil {
	//求数组的最大值
	public int getMax(int[] arr){
		int max = arr[0];
		for(int i = 1;i < arr.length;i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
		
	}
	
	//求数组的最小值
	public int getMin(int[] arr){
		int min = arr[0];
		for(int i = 1;i < arr.length;i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		return min;
		
	}
	//求数组的总和
	public int getSum(int[] arr){
		int sum = 0;
		for(int i = 0;i < arr.length;i++) {
			sum += arr[i];
		}
		return sum;
		
		
	}
	//求数组的平均值
	public double getAvg(int[] arr){
		
		return getSum(arr) / arr.length;
		
		
		
	}
	//反转数组
	public void reverse(int[] arr){
		for(int i = 0,j = arr.length-1;i < j;i++,j--) {
			int temp;
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		
		
	}
	//复制数组
	public int[] copy(int[] arr){
		int[] arr2 = new int[arr.length];
		for(int i = 0;i < arr.length;i++) {
			arr2[i] = arr[i];
		}
		return arr2;
		
	}
	//数组排序
	public void sort(int[] arr){
		for(int i = 0;i < arr.length-1;i++) {
			for(int j = 0;j < arr.length-i-1;j++) {
				int temp;
				if(arr[j] > arr[j+1]) {
					swap(arr,j,j+1);
				}
			}
		}
	}
	public void swap(int[] arr,int i,int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	//遍历数组
	public void print(int[] arr){
		for(int i = 0;i < arr.length;i++) {
			if(i==0)
				System.out.print("["+ arr[i]+",");
			else if(i == arr.length-1)
				System.out.print(arr[i]+"]");
			else 
				System.out.print(arr[i] + ",");
		}
			
		
		
	}
	//查找指定元素
	public int getIndex(int[] arr,int value){
		int index = -1;
		for(int i = 0;i<arr.length;i++) {
			if(arr[i] == value) {
				return i;
			}
				
		}
		return -1; //返回一个负数表示没有找到
		
		
		
	}

}
