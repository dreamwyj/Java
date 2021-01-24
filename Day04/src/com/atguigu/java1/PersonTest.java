package com.atguigu.java1;
/*
 * 方法的重写（override / overwrite）
 * 1.重写：子类继承父类以后，可以对父类方法中同名同参数的方法，进行覆盖操作
 * 
 * 2.重写以后，当创建子类对象以后，通过子类对象调用子父类中的同名同参数方法时，实际执行是子类重写父类的方法。
 * 
 * 3.重写的规定：
 * 		方法的声明: 权限修饰符 返回值类型 方法名(形参列表) throw 异常类型{
 *      			// 方法体
 * 				}
 * 		约定俗成：子类中的叫重写的方法，父类中的叫被重写的方法
 * 		1.子类重写的方法的方法名和形参列表与父类被重写的方法名和形参列表相同
 * 		2.子类重写方法的权限修饰符不小于父类被重写的方法的权限修饰符
 * 			> 特殊情况：子类不能重写父类中声明为private权限的方法
 * 		3.返回值类型：
 * 			>父类被重写的方法的返回值类型是void,则子类重写的方法返回值类型只能是void
 * 			>父类被重写的方法的返回值类型是A型，则子类重写的方法的返回值类型可以是A类或者A类的子类。
 * 			>父类被重写的方法的返回值类型是基本数据类型（比如：double），则子类重写的方法的返回值类型必须是相同的基本数据类型（必须double）。
 *
 * 		4.子类重写的方法抛出的异常类型不大于父类被重写的方法抛出的异常类型。
 * ******************************
 * 		子类和父类中的同名同参数的方法要么都声明为非static的（考虑重写），要么都声明为static的（不考虑重写）
 * 		static方法不能被覆盖
 * 
 * 
 * ,
 *  面试题：区分方法的重载与重写
 */
public class PersonTest {
	public static void main(String[] args) {
		Student student = new Student("计算机科学与技术");
		student.eat();
		student.walk(10);
		System.out.println("******");
		
		student.study();
		
		Person p1 = new Person();
		p1.eat();
		
	}

}
