package com.atguigu.java1;

import java.util.Date;

/*
 * 面试题： == 和 equals()区别
 * 一，回顾 == 的使用：
 * ==：运算符
 * 1.可以使用在基本数据类型变量和引用数据类型变量中
 * 2.如果比较的是基本数据变量，比较两个变量保存的数据是否相等。（不一定类型要相同）
 * 	如果比较的是引用数据类型变量，比较两个对象的地址值是否相同。即两个引用是否指向同一个对象实体。
 * 二，equals()方法的使用
 * 1.是一个方法，而非运算符
 * 2.只能适用于引用数据类型
 * 3.Object类中equals()定义：
 *  public boolean equals(Object obj) {
        return (this == obj);
    }
 * 	说明：Object类中定义的equals()和==的作用是相同的。
 * 比较两个对象的地址值是否相同。即两个引用是否指向同一个对象实体。
 * 
 * 4.像String,Data,File,包装类等都重写了Object类中的equals()方法。
 * 重写以后，比较的不是两个引用的地址是否相同，而是比较两个对象的"实体内容"是否相同。
 * 
 * 5.自定义类如果使用equals()，通常比较两个对象的“实体内容”是否相同，
 * 则需要对Object类中的equals()方法进行重写。
 * 重写的原则：比较两个对象的实体内容是否相同。
 */
public class EqualsTest {
	public static void main(String[] args) {
		// 基本数据类型
		int i = 10;
		int j = 10;
		double d = 10.0;
		System.out.println(i == j);
		System.out.println(i == d);
		boolean b = true;
//		System.out.println(i == b);
		
		char c = 10;
		System.out.println(i == c);//true
		
		char c1 = 'A';
		char c2 = 65;
		System.out.println(c1 == c2);
		
		Customer customer1 = new Customer("Tome",21);
		Customer customer2 = new Customer("Tome",21);
		System.out.println(customer1 == customer2);// false
		
		String str1 = new String("atguigu");
		String str2 = new String("atguigu");
		System.out.println(str1 == str2);// false
		System.out.println("**********");
		System.out.println(customer1.equals(customer2));//false
		System.out.println(str1.equals(str2));//true
		
		Date date1 = new Date(32432525324L);
		Date date2 = new Date(32432525324L);
		System.out.println(date1.equals(date2));//true
	}

}
