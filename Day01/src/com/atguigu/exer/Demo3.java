package com.atguigu.exer;
/*
 * 定义一个int型的一维数组，包含10个元素，分别赋一些随机整数， 
 * 然后求出所有元素的最大值，最小值，和值，平均值，并输出出来。
 * 要求:所有随机数都是两位数。
 * [10,99]
 * 公式：(int)(Math.random()*(99-10+1)+10)
 */
public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[10];
		int max = 0,min = 99,sum = 0;
		double average=0;
		System.out.println("产生的随机数为：");
		for(int i =0 ;i < arr.length;i++){
			arr[i] = (int)(Math.random()*(99-10+1)+10);
			if(max < arr[i])
				max = arr[i];
			if(min > arr[i])
				min = arr[i];
			sum += arr[i];
			System.out.print(arr[i]+" ");
			
		}
		average = sum/arr.length;
		System.out.println("Max = "+ max + 
				" Min = " + min + 
				" Sum = " + sum + 
				" Average = "+average);
		
		

	}

}
