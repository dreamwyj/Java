package com.atguigu.java2;

import org.junit.Test;

public class InterviewTest {

	@Test
	public void test1() {
		Object o1 = true ? new Integer(1) : new Double(2.0);
		// 三木运算符，后面两个条件需要类型统一
		System.out.println(o1);// 1.0
	}
	
	@Test
	public void test2() {
		Object o2;
		if (true)
		o2 = new Integer(1);
		else
		o2 = new Double(2.0);
		System.out.println(o2);//1
	}
	
	@Test
	public void method1() {
		Integer i = new Integer(1);
		Integer j = new Integer(1);
		System.out.println(i == j);//false == 比较的引用类型，比的是地址。
		// Integer内部定义了IntegerCache结构，
		//IntegerCahche中定义了Integer[],保存了-128～127范围的整数。
		//如果使用自动装箱的方式，给Integer赋值的范围在-128～127内时，
		//可以直接使用数组中的元素，不用再去new了。目的：提高效率
		Integer m = 1;
		Integer n = 1;
		System.out.println(m == n);//true 自动装箱，
		Integer x = 128;//相当于new了一个Integer对象
		Integer y = 128;
		System.out.println(x == y);//false 
		}
}
