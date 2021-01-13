package com.atguigu.java;
/*
 * 类的构造之三：构造器(或构造方法,constructor)的使用
 * construct:建设，建造 constructor:建设者
 * 一，构造器的作用
 * 1.创建对象
 * 2.初始化对象的信息
 * 
 * 二，说明
 * 1.如果没有显示的定义类的构造器，则系统默认提供一个空参的构造器
 * 2.定义构造器的格式，权限修饰符 类名(形参列表){}
 * 3.一个类中定义的多个构造器，彼此构成重载
 * 4.一旦显示定义了类的构造器之后，系统就不再提构默认的空参构造器
 * 5.一个类中至少有一个构造器
 */
public class PersonTest {
	public static void main(String[] args) {
		// 创建类的对象：new + 构造器
		Person p = new Person();
		p.eat();
		Person p1 = new Person("Tom");
		System.out.println(p1.name);
	}

}
class Person{
	// 属性
	String name;
	int age;
	//构造器
	public Person(){
		System.out.println("Person().....");
		
	}
	public Person(String n) {
		name = n;
	}
	public Person(String n,int a) {
		name = n;
		age = a; 
	}
	// 方法
	public void eat(){
		System.out.println("人吃饭");
		
	}
}