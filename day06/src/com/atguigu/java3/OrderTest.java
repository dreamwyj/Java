package com.atguigu.java3;
/*
 *  对属性可以赋值的位置：
 *  1.默认初始化
 *  2.显式初始化
 *  3.构造器中的初始化
 *  4.有了对象以后，可以通过“对象.属性”或“对象.方法”的方式，进行赋值
 *  5.在代码块中赋值。
 *   执行的先后顺序：1- 2/5 - 3 - 4
 */
public class OrderTest {
	public static void main(String[] args) {
		Order order = new Order();
		System.out.println(order.orderId);
	}
}
class Order{
	int orderId = 3;
	{
		orderId = 4;
	}
}
