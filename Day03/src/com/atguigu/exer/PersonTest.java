package com.atguigu.exer;

public class PersonTest {
	public static void main(String[] args) {
		Person b = new Person();
		//b.setAge(10);
		System.out.println("年龄为："+b.getAge());
		Person p2 = new Person("Tom",21);
		System.out.println("name = " + p2.getName() + ",age = " + p2.getAge());
		
	}

}
