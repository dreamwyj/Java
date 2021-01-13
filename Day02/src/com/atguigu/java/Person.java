package com.atguigu.java;
/*
 * 面向对象思想的三条主线
 * 1.类及类的成员：属性，方法，构造器，代码块，内部块
 * 2.面向对象的三大特征：封装，继承，多态
 * 3.其他关键字 this super abstract interface static final package import
 * 类和对象的创建和执行操作有哪三步？
 * 1.创建类，设计类的成员
 * 2.创建类的对象
 * 3.调用对象的结构
 * 对象的赋值
 * Person p3 = p1 将p1变量保存的对象地址赋给p3,导致p1和p3指向了同一个对象实体。
 * 堆 存放对象实例
 * 栈 存储局部变量
 * 方法区 存储被虚拟机加载的类信息，常量，静态变量，即时编译器编译后的代码等数据
 * command + option + 左 回到调用的地方 + 右 函数详情
 * 
 * 
 */
public class Person {
	String name;
	int age;
	int sex;
	public void study() {
		System.out.println("Studying");
	}
	public void showAge() {
		
		System.out.println(age);
	}
	public int addAge(int i){
		age += i;
		return age;
		
	}

	

}
