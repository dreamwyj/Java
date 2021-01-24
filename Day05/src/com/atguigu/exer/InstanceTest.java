package com.atguigu.exer;
/*
 * 建立InstanceTest 类，在类中定义方法
method(Person e);
在method中:
(1)根据e的类型调用相应类的getInfo()方法。
(2)根据e的类型执行：
如果e为Person类的对象，输出： “a person”;
如果e为Student类的对象，输出：
“a student”
“a person ” 
如果e为Graduate类的对象，输出：
“a graduated student”
“a student”
“a person”
 */

public class InstanceTest {
	public static void main(String[] args) {
		InstanceTest instanceTest = new InstanceTest();
//		System.out.println("*****1*****");
//		instanceTest.method(new Person());
//		System.out.println("*****2*****");
//		instanceTest.method(new Student());
//		System.out.println("*****3*****");
		instanceTest.method(new Graduate());
		

	}
	public void method(Person e) {
		System.out.println(e.getInfo());
		
//		if (e instanceof Graduate) {
//			System.out.println("a graduated student");
//			System.out.println("a student");
//			System.out.println("a person");
//		}else if(e instanceof Student) {
//			System.out.println("a student");
//			System.out.println("a person");
//		}else {
//			System.out.println("a person");
//		}
		// 方式二
		if (e instanceof Graduate) {
			System.out.println("a graduated student");
		}
		if(e instanceof Student) {
			System.out.println("a student");
		}
		if (e instanceof Person) {
			System.out.println("a person");
		}
	}

}
