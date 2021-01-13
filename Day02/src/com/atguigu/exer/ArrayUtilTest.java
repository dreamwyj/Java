package com.atguigu.exer;

public class ArrayUtilTest {
	public static void main(String[] args) {
		ArrayUtil util = new ArrayUtil();
		int[] arr = new int[]{32,34,32,5,3,54,654,-98,0,-53,5};
		int max = util.getMax(arr);
		int min = util.getMin(arr);
		System.out.println("Max:" + max +" Min:" + min);
		System.out.println("排序前:");
		util.print(arr);
		util.sort(arr);
		System.out.println("\n排序后:");
		util.print(arr);
//		System.out.println("查找:");
//		int index = util.getIndex(arr, -3);
//		if(index >= 0)
//			System.out.println("找到了,索引地址为:" + index);
//		else
//			System.out.println("未找到");
		
		
		
	}

}
