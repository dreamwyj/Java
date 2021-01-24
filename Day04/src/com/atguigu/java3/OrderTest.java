package com.atguigu.java3;

public class OrderTest {
	public static void main(String[] args) {
		Order order = new Order();
		
		order.orderDefault = 1;
		order.orderProtected = 2;
		order.orderPublic = 3;
		
		order.methodDefault();
		order.methodProtected();
		order.methodPublic();
		
//		// 同一个包中的其他类不能调用Order类的私有属性
//		order.orderPrivate = 9;
//		order.methodPrivate();
	}

}
