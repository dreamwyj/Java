package com.atguigu.java2;
/*
 * this 关键字的使用
 * 1.this可以用来修饰，调用属性，方法，构造器
 * 2.this修饰属性和方法：
 * 	this理解为：当前对象 或 当前正在创建的对象
 * 
 * 	2.1 在类的方法中，可以使用“this.属性”或"this.方法"的方式，调用当前对象属性或方法。
 * 但是，通常情况省略"this.".特殊情况下，如果方法的形参和类的属性同名时，必须显示的
 * 使用“this.变量”的方式，表明变量是属性，而非形参。
 * 
 * 	2.2 在类的构造器中，可以使用“this.属性”或"this.方法"的方式，调用当前正在创建的对象属性或方法。
 * 但是，通常情况省略"this.".特殊情况下，如果构造器的形参和类的属性同名时，必须显示的
 * 使用“this.变量”的方式，表明变量是属性，而非形参
 * 
 * 3. this构造器
 * 		1.在类构造器中，可以显示的使用"this(形参列表)"方式，调用本类中指定的其他构造器
 * 		2.构造器中不能通过"this(形参列表)"方式调用自己
 * 		3.如果一个类中有n个构造器，则最多有n-1个构造器使用了"this(形参列表)"
 * 		4.规定："this(形参列表)"必须声明当前构造器的首行
 * 		5.构造器内部:最多只能声明一个"this(形参列表)"，用来调用其他的构造器
 */
public class PersonTest {
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Person p1 = new Person("Jerry",20);
//		p1.setAge(15);
//		p1.setName("李四");
		System.out.println("名字：" + p1.getName() + " 年龄：" + p1.getAge());
		//p1.eat();
		
	}	
}
class Person{
	private String name;
	private int age;
	
	public Person() {
		this.eat();
		String info = "Person初始化时，需要考虑如下1，2，3.。。（共40行代码）";
		System.out.println(info);
		
	}
	public Person(String name) {
		this();
		this.name = name;
	}
	public Person(int age) {
		this();
		this.age = age;
	}
	public Person(String name,int age) {
		this(age);
		this.name = name;
		//this.age = age;
	}
	public void setName(String name){
		
		this.name = name;  
		//
	}
	public String getName() {
		return name;
	}
	public void setAge(int a) {
		age = a;
	}
	public int getAge() {
		return age;
	}
	public void eat() {
		System.out.println("人吃饭");
		study();
	}
	public void study() {
		System.out.println("人学习");
	}
	
	
}