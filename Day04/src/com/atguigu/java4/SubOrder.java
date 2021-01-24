package com.atguigu.java4;

import com.atguigu.java3.Order;

public class SubOrder extends Order {
	
	public void method() {
		orderProtected = 1;
		orderPublic = 2;
		
		methodProtected();
		methodPublic();
		
		// 在不同包的子类中，不能调用Order类中声明为private和确性权限的结构
//		orderDefault = 3;
//		orderPrivate = 4;
//		
//		methodDefault();
//		methodPrivate();
	}

}
