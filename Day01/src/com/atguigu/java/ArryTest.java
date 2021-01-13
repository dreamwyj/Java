package com.atguigu.java;
//main+option+/ 自动代码补全方法
//command+o 搜索
/*
 * 1.数组的特点，数组是有序的
 * 2.数组属于数据的引用类型，数组的元素可以是任何数据类型
 * 3.数组的长度一旦确定了就不能修改
 * 要点：
 * 1.声明和初始化，一旦初始化完成，数组长度确定了
 * 2.数组元素默认初始化值
 * 	> 数组元素是整型：0
 *  > 浮点型：0.0
 *  > char型：0或'\u0000',是数字0
 *  > boolean型：false
 *  数组元素是引用数据类型时
 *  > String:null
 *  二维数组元素默认的初始化值
 *  > 初始化方式一：int[][] arr = new int[4][3];
 *  > 		外层元素初始化值为：地址值
 *  > 		内层元素初始化值为：与一维数组初始化情况相同
 *  > 初始化方式二：int[][] arr = new int[4][];
 *  		外层元素初始化值为：null
 *  		内层元素初始化值为：不能调用
 * 3.数组内存解析
 *  > 栈（stack）：局部变量
 *  > 堆（heap）：new出来的结构，对象，数组
 *  > 方法区：静态域，常量池
 *  
 */

public class ArryTest {
	public static void main(String[] args) {
		//1.1静态初始化:数组初始化和数组元素的赋值操作同时进行
		int[] ids;
		ids = new int[]{1001,1002};
		int[][] arr1 = new int[][] {{1,2,3},{4,5},{6,7,8}};
		//1.2动态初始化：分开进行
		String[] names = new String[5];
		String[][] arr2 = new String[3][2];
		String[][] arr3 = new String[3][];
		//2.获取长度
		System.out.println(arr1.length);//3 第一层长度
		System.out.println(arr1[0].length);//3 第二层长度
		//3.遍历二维数组
		for(int i = 0;i < arr1.length;i++) {
			for(int j = 0;j < arr1[i].length;j++) {
				System.out.println(arr1[i][j]);
			}
		}
	}

}
