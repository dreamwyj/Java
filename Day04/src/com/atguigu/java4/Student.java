package com.atguigu.java4;

public class Student extends Person{
	
	String major;
	int id = 1002;
	
	public Student() {
		
	}
	public Student(String major) {
		this.major = major;
	}
	public Student(String name, int age,String major) {
		super(name, age);
		this.major = major;
	}
	public void eat() {
		System.out.println("学生，多吃有营养的饭");
	}
	public void study() {
		System.out.println("学习");
		this.eat();
		super.eat();
		walk();
	}
	public void show() {
		System.out.println("name = " + this.name + ",age = " + super.age);
		System.out.println("id = " + this.id);
		System.out.println("id = " + super.id);
	}
	

}
