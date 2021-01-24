package com.atguigu.java;
/*
 * abstract关键字的使用
 * 1. abstrct可以用来修饰的结构：类，方法
 * 2. abstract修饰类:抽象类
 * 		>此类不能实例化
 * 		>抽象类中一定有构造器，便于子类实例化调用（涉及，子类对象实例化的全过程）
 * 		>开发中，都会提供抽象类的子类，让子类对象实例化，完成相关的操作
 * 
 * 3. abstract修饰方法：抽象方法
 * 		> 抽象方法只有方法的声明，没有方法体
 * 		> 包含抽象方法的类一定是抽象类。反之，抽象类中是可以没有抽象方法的。
 * 		> 若子类重写了父类中的所有的抽象方法，此类方可实例化
 * 		> 若子类没有重写父类中的所有的抽象方法，则此类也是一个抽象类，需要使用abstract修饰。
 */

public class AbstractTest {
	public static void main(String[] args) {
		// 一旦Person类抽象了，就不可实例化。
//		Person p1 = new Person();
//		p1.eat();
	}

}
abstract class Creature{
	public abstract void breath();
}
abstract class Person extends Creature{
	String name;
	int age;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		
	}
//	public void eat() {
//		System.out.println("人吃饭");
//	}
	// 抽象方法
	public abstract void eat();
	public void walk() {
		System.out.println("人走路");
	}
}

 class Student extends Person{
	 public Student() {
		 
	 }
	public Student(String name,int age) {
		super(name, age);
	}
	public void eat() {
		System.out.println("学生多吃有营养的事物");
	}
	@Override
	public void breath() {
		// TODO Auto-generated method stub
		System.out.println("学生呼吸新鲜的空气");
	}
	
}
