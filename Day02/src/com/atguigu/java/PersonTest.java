package com.atguigu.java;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person();
		p1.name = "张三";
		p1.age = 18;
		p1.sex = 1;
		p1.study();
		p1.showAge();
		p1.age = p1.addAge(2);
		System.out.println("age被修改后的值为：");
		p1.showAge();
		System.out.println("这是第二个对象：");
		

	}

}
