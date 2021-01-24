package com.gtguigu.exer1;
/*
 * java.lang.Object类
 * 1.Object类是所有Java类的根父类
 * 2.如果在类的声明中未使用extends关键字指明其父类，则默认父类为java.lang.Object类
 * command + t 查看结构
 * 3.object类中的功能（属性，方法）具有通用型
 * 4.Object类只声明一个空参构造器
 */
public class ObjectTest {
	public static void main(String[] args) {
		Order order = new Order();
		System.out.println(order.getClass().getSuperclass());
		
	}

}

class Order{
	
}
