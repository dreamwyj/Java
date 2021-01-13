package com.atguigu.java;
/*
 * 面向对象的特征一：封装与隐藏
 * 一·问题的引入
 * 创建一个类的对象以后，通过“对象.属性”的方式，
 * 对对象的属性进行赋值。赋值操作受到属性的数据类型和存储范围的制约。
 * 除此之外，没有其他制约条件。
 * 但是实际问题中，往往需要给属性赋值加入额外的限制条件，
 * 这个条件不能在属性声明时体现，只能通过方法进行限制条件的添加。(比如setlegs)
 * 同时避免用户再使用“对象.属性”的方式对属性进行赋值，则需要将属性声明为私有的(private)
 * --->此时，针对于属性就体现了封装性。
 * 
 * 二·封装性的体现:
 * 将类的属性XXX私有化(private),同时，
 * 提供公共的public方法获取(getXXX)和设置(setXXX)
 * 
 * 三·封装的体现，需要权限修饰符来配合
 * 1.Java规定的4种权限（从小到大排列）:private,缺省,protected,public
 * 2.4种权限可以用来修饰类及类的内部结构：属性，方法，构造器，内部类
 * 3.具体的，4种权限可以用来修饰类的内部结构；属性，方法，构造器，内部类
 * 			修饰类的话，只能使用：缺省,public
 * 总结封装性：Java提供了4种权限修饰符来修饰类及类的内部结构，
 * 体现类及类的内部结构在被调用时的可见性的大小
 */
public class AnimalTest {
	public static void main(String[] args) {
		
		Animal a = new Animal();
		a.name = "大黄";
		//a.age  = 1;
		//a.legs = 4;
		a.show();
		
		// a.legs = -4;
		a.setLegs(6);
		a.show();
		
	}

}
class Animal{
	String name;
	private int age;
	private int legs;
	
	//对属性的设置
	public void setLegs(int l) {
		if(l >= 0 && l % 2 == 0) {
			legs = l;
		}else {
			legs = 0;
			// 抛异常
		}
	}
	//对属性的获取
	public int getLegs(){
		return legs;
		
	}
	// 关于age属性age的get和set方法
	public void setAge(int a) {
		if(a >= 0 && a <= 100) {
			age = a;
		}else {
			age = 0;
			//抛异常
		}
	}
	public int getAge() {
		return age;
	}
	public void eat(){
		System.out.println("动物进食");
	}
	public void show(){
		System.out.println("name = " + name + ", age = " + age +",legs = " + legs);
		
	}
}
