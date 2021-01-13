package com.atguigu.java;

public class OrderTest {
	public static void main(String[] args) {
		Order order = new Order();
		
		order.orderDefault = 1;
		order.orderPublic = 2;
		//出了Order类型，私有的属性就不可以调用了
		//order.orderPrivate = 3;
		//The field Order.orderPrivate is not visible
		
		order.methodDefault();
		order.methodPublic();
		////出了Order类型，私有的结构就不可以调用了
		//order.methodPrivate();
		//The field Order.orderPrivate is not visible
	}
	

}
